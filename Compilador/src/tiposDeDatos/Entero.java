package tiposDeDatos;

import errores.SemanticError;

public class Entero implements TipoDeDato<Integer> {


    @Override
    public Integer parseDato(String stringDato) {
        try {
            return Integer.parseInt(stringDato);
        } catch (Error e){
            throw new SemanticError("Tipo de dato incompatible");
        }
    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.INT;
    }

    @Override
    public Integer suma(Object operando1, Object operando2) {
        return (Integer)operando1 + (Integer)operando2;
    }

    @Override
    public Integer resta(Object operando1, Object operando2) {
        return (Integer)operando1 - (Integer)operando2;
    }

    @Override
    public Integer multiplicacion(Object operando1, Object operando2) {
        return (Integer)operando1 * (Integer)operando2;
    }

    @Override
    public Integer division(Object operando1, Object operando2) {
        return (Integer)operando1 / (Integer)operando2;
    }

    @Override
    public String toString() {
        return "Entero";
    }
}
