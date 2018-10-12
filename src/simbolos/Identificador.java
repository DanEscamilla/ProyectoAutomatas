package simbolos;

import tiposDeDatos.TipoDeDato;
import tiposDeDatos.TiposDeDatos;
import parser.Token;


public abstract class Identificador {

    private Token token;
    private TiposDeDatos tipoDeDatos;
    private TipoDeDato tipoDeDato;

    public Identificador(Token token, Token tipoDeDato){
        this.token = token;
        this.tipoDeDatos = TiposDeDatos.getEnumerator(tipoDeDato.image);
        this.tipoDeDato = TiposDeDatos.getTipoDeDato(this.getTipoDeDatoEnum());
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


    public TipoDeDato getTipoDeDato() {
        return tipoDeDato;
    }

    public void setTipoDeDato(TipoDeDato tipoDeDato) {
        this.tipoDeDato = tipoDeDato;
    }
}
