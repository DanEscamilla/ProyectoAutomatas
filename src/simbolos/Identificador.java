package simbolos;

import constantes.TiposDeDatos;
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

    public TiposDeDatos getTipoDeDatos() {
        return tipoDeDatos;
    }

    public void setTipoDeDatos(TiposDeDatos tipoDeDatos) {
        this.tipoDeDatos = tipoDeDatos;
    }

}
