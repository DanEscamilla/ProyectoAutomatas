package simbolos;

import tiposDeDatos.TipoDeDato;
import tiposDeDatos.TiposDeDatos;
import parser.Token;


public abstract class Identificador {

    private Token token;
    private TiposDeDatos tipoDeDatos;
    private TipoDeDato tipoDeDato;
    private Token tokenAlcance;

    public Identificador(Token token, Token tipoDeDato, Token tokenAlcance){
        this.token = token;
        this.tokenAlcance = tokenAlcance;
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

    public Token getAlcance() {
        return tokenAlcance;
    }

    public void setAlcance(Token alcance) {
        this.tokenAlcance = alcance;
    }
}
