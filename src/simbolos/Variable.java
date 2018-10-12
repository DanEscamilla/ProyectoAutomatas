package simbolos;
import errores.SemanticError;
import parser.Token;
import tiposDeDatos.Valor;

public class Variable extends Identificador{

    private Valor valor;
    private Token aparicionMasReciente;

    public Variable(Token token, Token tipoDeDato) {
        super(token,tipoDeDato);
        this.setAparicionMasReciente(token);
    }

    public Valor getValor() {
        if (valor==null){
            throw new SemanticError(this.getToken(),"La variable "+this.getToken().image+" no ha sido inicializada");
        }
        return valor;
    }

    public void setValor(Valor valor) {
        if (valor.getTipoDeDato().getEnum() == this.getTipoDeDatoEnum()){
            this.valor = valor;
        } else {
          throw new SemanticError(this.getToken(),"Tipo de dato incompatible, variable es de tipo "+this.getTipoDeDato()+" y se le esta tratando de asignar un valor "+valor.getTipoDeDato());
        }

    }

    public Token getAparicionMasReciente() {
        return aparicionMasReciente;
    }

    public void setAparicionMasReciente(Token aparicionMasReciente) {
        this.aparicionMasReciente = aparicionMasReciente;
    }

}
