package tiposDeDatos;

public class Valor {

    private TipoDeDato tipoDeDato;
    private Object objectValor;

    public Valor(String stringValor, TipoDeDato tipoDeDato){
        this.objectValor = tipoDeDato.parseDato(stringValor);
        this.tipoDeDato = tipoDeDato;
    }

    public TipoDeDato getTipoDeDato() {
        return tipoDeDato;
    }

    public void setTipoDeDato(TipoDeDato tipoDeDato) {
        this.tipoDeDato = tipoDeDato;
    }

    public Object getObjectValor() {
        return objectValor;
    }

    public void setObjectValor(Object objectValor) {
        this.objectValor = objectValor;
    }

    @Override
    public String toString() {
        return objectValor.toString();
    }
}
