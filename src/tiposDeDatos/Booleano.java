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
}
