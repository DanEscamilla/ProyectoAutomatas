package tiposDeDatos;


public interface TipoDeDato <T>{


    public T parseDato(String stringDato);

    public TiposDeDatos getEnum();

    public T suma(Object operando1,Object operando2);

    public T resta(Object operando1,Object operando2);

    public T multiplicacion(Object operando1,Object operando2);

    public T division(Object operando1,Object operando2);

}
