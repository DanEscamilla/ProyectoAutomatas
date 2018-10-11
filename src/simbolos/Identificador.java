package simbolos;

import tiposDeDatos.TiposDeDatos;
import parser.Token;


public abstract class Identificador {

    private Token token;
    private TiposDeDatos tipoDeDatos;

    public Identificador(Token token, Token tipoDeDato){
        this.token = token;
        this.tipoDeDatos = TiposDeDatos.getEnumerator(tipoDeDato.image);
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public TiposDeDatos getTipoDeDatoEnum() {
        return tipoDeDatos;
    }

    public void setTipoDeDatoEnum(TiposDeDatos tipoDeDatos) {
        this.tipoDeDatos = tipoDeDatos;
    }

}
