package tiposDeDatos;

import errores.SemanticError;

public class Doble implements TipoDeDato<Double> {


    @Override
    public Double parseDato(String stringDato) {
        try {
            return Double.parseDouble(stringDato);
        } catch (Error e){
            throw new SemanticError("Tipo de dato incompatible");
        }
    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.DOUBLE;
    }

    @Override
    public Double suma(Object operando1, Object operando2) {
        return (Double)operando1 + (Double)operando2;
    }

    @Override
    public Double resta(Object operando1, Object operando2) {
        return (Double)operando1 - (Double)operando2;
    }

    @Override
    public Double multiplicacion(Object operando1, Object operando2) {
        return (Double)operando1 * (Double)operando2;
    }

    @Override
    public Double division(Object operando1, Object operando2) {
        return (Double)operando1 / (Double)operando2;
    }

    @Override
    public String toString() {
        return "Doble";
    }
}
