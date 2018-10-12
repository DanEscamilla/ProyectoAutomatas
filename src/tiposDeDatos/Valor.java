package tiposDeDatos;

import errores.SemanticError;

public class Valor {

    private TipoDeDato tipoDeDato;
    private Object objectValor;

    public Valor(String stringValor, TipoDeDato tipoDeDato){
        this.objectValor = tipoDeDato.parseDato(stringValor);
        this.tipoDeDato = tipoDeDato;
    }

    public Valor(Object objectValor, TipoDeDato tipoDeDato){
        this.objectValor = objectValor;
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

    private void validarTipoDeDatos(Valor operando2,String operacion){
      if (operando2.getTipoDeDato().getEnum() != tipoDeDato.getEnum()){
        throw new SemanticError("Tipo de dato incompatible no se puede "+operacion+" "+tipoDeDato+" con "+operando2.getTipoDeDato());
      }
    }

    public Valor suma(Valor operando2){
        validarTipoDeDatos(operando2,"sumar");
        Object resultado = tipoDeDato.suma(objectValor,operando2.getObjectValor());
        return new Valor(resultado,tipoDeDato);
    }

    public Valor resta(Valor operando2){
        validarTipoDeDatos(operando2,"restar");
        Object resultado = tipoDeDato.resta(objectValor,operando2.getObjectValor());
        return new Valor(resultado,tipoDeDato);
    }

    public Valor division(Valor operando2){
      validarTipoDeDatos(operando2,"dividir");
        Object resultado = tipoDeDato.division(objectValor,operando2.getObjectValor());
        return new Valor(resultado,tipoDeDato);
    }

    public Valor multiplicacion(Valor operando2){
        validarTipoDeDatos(operando2,"multiplicar");
        Object resultado = tipoDeDato.multiplicacion(objectValor,operando2.getObjectValor());
        return new Valor(resultado,tipoDeDato);
    }

    @Override
    public String toString() {
        return objectValor.toString();
    }
}
