package simbolos;
import parser.Token;

public class Variable extends Identificador{

    private Object valor;

    public Variable(Token token, Token tipoDeDato) {
        super(token,tipoDeDato);
    }

    public Variable(Token token, Token tipoDeDato,Token valor) {
        super(token,tipoDeDato);
        this.valor =  valor.image;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
}
