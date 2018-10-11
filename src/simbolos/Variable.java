package simbolos;
import errores.SemanticError;
import parser.Token;
import tiposDeDatos.Valor;

public class Variable extends Identificador{

    private Valor valor;

    public Variable(Token token, Token tipoDeDato) {
        super(token,tipoDeDato);
    }

    public Valor getValor() {
//        if (valor==null){
//            throw new SemanticError("La variable no tiene un valor");
//        }
        return valor;
    }

    public void setValor(Valor valor) {
        if (valor.getTipoDeDato().getEnum() == this.getTipoDeDatoEnum()){
            this.valor = valor;
        } else {
            throw new SemanticError("Tipo de dato incompatible");
        }

    }
}
