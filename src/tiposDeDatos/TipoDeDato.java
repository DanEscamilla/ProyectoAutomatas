package tiposDeDatos;


public interface TipoDeDato <T>{


    public T parseDato(String stringDato);

    public TiposDeDatos getEnum();

}
