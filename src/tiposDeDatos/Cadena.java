package tiposDeDatos;

import errores.SemanticError;

public class Cadena implements TipoDeDato<String> {

    @Override
    public String parseDato(String stringDato) {
        String regexParaRemoverComillas = "(?<!\\\\)['\"]";
        return stringDato.replaceAll(regexParaRemoverComillas,"");
    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.STRING;
    }

    @Override
    public String suma(Object operando1, Object operando2) {
        return (String)operando1 + (String)operando2;
    }

    @Override
    public String resta(Object operando1, Object operando2) {
        throw new SemanticError("No se permite restar cadenas");
    }

    @Override
    public String multiplicacion(Object operando1, Object operando2) {
        throw new SemanticError("No se permite multiplicar cadenas");
    }

    @Override
    public String division(Object operando1, Object operando2) {
        throw new SemanticError("No se permite divir cadenas");
    }

    @Override
    public String toString() {
        return "Cadena";
    }
}
