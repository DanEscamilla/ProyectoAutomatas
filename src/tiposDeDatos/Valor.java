package tiposDeDatos;

import errores.ManejadorErrores;
import errores.SemanticError;
import parser.Token;

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

    private boolean validarTipoDeDatos(Valor operando2,String operacion,Token token){
      if (operando2.getTipoDeDato().getEnum() != tipoDeDato.getEnum()){
        ManejadorErrores.agregarError(new SemanticError(token,"Operandos incompatibles, no se puede "+operacion+" "+tipoDeDato+" con "+operando2.getTipoDeDato()));
        return false;
      }
      return true;
    }

    public Valor suma(Valor operando2,Token tokenOperador){
        if (!validarTipoDeDatos(operando2,"sumar",tokenOperador)){
          return generarErrorValor();
        }
        try {
          Object resultado = tipoDeDato.suma(objectValor,operando2.getObjectValor());
          return new Valor(resultado,tipoDeDato);
        } catch (SemanticError e){
          ManejadorErrores.agregarError( new SemanticError(tokenOperador,e.getMessage()));
        } catch (Error error){
          ManejadorErrores.agregarError(error);
        } catch (Exception exception){
          ManejadorErrores.agregarError(new SemanticError(exception.getMessage()));
        }
        return generarErrorValor();
    }

    public Valor resta(Valor operando2,Token tokenOperador){
        if (!validarTipoDeDatos(operando2,"restar",tokenOperador)){
          return generarErrorValor();
        }
        try {
          Object resultado = tipoDeDato.resta(objectValor,operando2.getObjectValor());
          return new Valor(resultado,tipoDeDato);
        } catch (SemanticError e) {
            ManejadorErrores.agregarError( new SemanticError(tokenOperador,e.getMessage()));
        } catch (Error error){
          ManejadorErrores.agregarError(error);
        } catch (Exception exception){
          ManejadorErrores.agregarError(new SemanticError(exception.getMessage()));
        }
        return generarErrorValor();
    }

    public Valor division(Valor operando2,Token tokenOperador){
      if (!validarTipoDeDatos(operando2,"dividir",tokenOperador)){
        return generarErrorValor();
      }
      try {
          Object resultado = tipoDeDato.division(objectValor,operando2.getObjectValor());
          return new Valor(resultado,tipoDeDato);
        } catch (SemanticError e){
          ManejadorErrores.agregarError( new SemanticError(tokenOperador,e.getMessage()));
        } catch (Error error){
          ManejadorErrores.agregarError(error);
        } catch (Exception exception){
          ManejadorErrores.agregarError(new SemanticError(exception.getMessage()));
        }
        return generarErrorValor();
    }

    public Valor multiplicacion(Valor operando2,Token tokenOperador){
        if (!validarTipoDeDatos(operando2,"multiplicar",tokenOperador)){
          return generarErrorValor();
        }
        try {
          Object resultado = tipoDeDato.multiplicacion(objectValor,operando2.getObjectValor());
          return new Valor(resultado,tipoDeDato);
        } catch (SemanticError e){
          ManejadorErrores.agregarError( new SemanticError(tokenOperador,e.getMessage()));
        } catch (Error error){
          ManejadorErrores.agregarError(error);
        } catch (Exception exception){
          ManejadorErrores.agregarError(new SemanticError(exception.getMessage()));
        }
        return generarErrorValor();
    }

    public static Valor generarErrorValor(String str){
      TipoDeDato tipoErr = TiposDeDatos.getTipoDeDato("ERROR");
      return new Valor(tipoErr.parseDato(str),tipoErr);
    }

    public static Valor generarErrorValor(){
        return generarErrorValor("Error");
    }

    @Override
    public String toString() {
        return objectValor.toString();
    }
}
