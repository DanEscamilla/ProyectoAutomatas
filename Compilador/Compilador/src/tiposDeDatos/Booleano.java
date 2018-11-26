package tiposDeDatos;

import errores.SemanticError;

public class Booleano implements TipoDeDato<Boolean> {

    @Override
    public Boolean parseDato(String stringDato) {
        try {
            return Boolean.parseBoolean(stringDato);
        } catch (Error e){
            throw new SemanticError("Tipo de dato incompatible");
        }

    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.BOOLEAN;
    }

    @Override
    public Boolean suma(Object operando1, Object operando2) {
        throw new SemanticError("No se permite sumar valores Booleanos");
    }

    @Override
    public Boolean resta(Object operando1, Object operando2) {
        throw new SemanticError("No se permite restar valores Booleanos");
    }

    @Override
    public Boolean multiplicacion(Object operando1, Object operando2) {
        throw new SemanticError("No se permite multiplicar valores Booleanos");
    }

    @Override
    public Boolean division(Object operando1, Object operando2) {
        throw new SemanticError("No se permite dividir valores Booleanos");
    }

    @Override
    public String toString() {
        return "Booleano";
    }
}
