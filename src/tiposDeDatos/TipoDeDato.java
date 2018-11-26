package tiposDeDatos;


import operadores.Operador;

public interface TipoDeDato <T>{

    T parseDato(String stringDato);

    T operar(Operador op,Object op1, Object op2) throws Exception ;

    TiposDeDatos getEnum();

}
