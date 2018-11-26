package tiposDeDatos;

import errores.SemanticError;
import operadores.Operador;

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
    public Double operar(Operador op, Object op1, Object op2) throws Exception  {
        return op.operar((Double)op1,(Double)op2);
    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.DOUBLE;
    }

    @Override
    public String toString() {
        return "Doble";
    }
}
