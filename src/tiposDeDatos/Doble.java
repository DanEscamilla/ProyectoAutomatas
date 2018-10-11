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

}
