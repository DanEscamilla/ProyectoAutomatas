package tiposDeDatos;

import errores.SemanticError;

public class Cadena implements TipoDeDato<String> {

    @Override
    public String parseDato(String stringDato) {
        return stringDato;
    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.STRING;
    }
}
