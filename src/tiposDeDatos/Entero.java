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

}
