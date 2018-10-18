package simbolos;
import errores.ManejadorErrores;
import errores.SemanticError;
import parser.Token;
import tiposDeDatos.Valor;

public class Variable extends Identificador{

    private Valor valor;
    private Token aparicionMasReciente;

    public Variable(Token token, Token tipoDeDato,Token tokenAlcance) {
        super(token,tipoDeDato,tokenAlcance);
        this.setAparicionMasReciente(token);
    }

    public Valor getValor() {
        if (valor==null){
            ManejadorErrores.agregarError(new SemanticError(this.getToken(),"La variable "+this.getToken().image+" no ha sido inicializada"));
            return Valor.generarErrorValor();
        } else {
            return valor;
        }
    }

    public void setValor(Valor valor) {
        if (valor.getTipoDeDato().getEnum() == this.getTipoDeDatoEnum()){
            this.valor = valor;
        } else {
            ManejadorErrores.agregarError(new SemanticError(this.getAparicionMasReciente(),"Tipo de dato incompatible, variable es de tipo "+this.getTipoDeDato()+" y se le esta tratando de asignar un valor "+valor.getTipoDeDato()));
        }

    }

    public Token getAparicionMasReciente() {
        return aparicionMasReciente;
    }

    public void setAparicionMasReciente(Token aparicionMasReciente) {
        this.aparicionMasReciente = aparicionMasReciente;
    }

}
