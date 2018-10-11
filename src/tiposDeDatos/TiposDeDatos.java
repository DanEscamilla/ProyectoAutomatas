package tiposDeDatos;

import java.util.Map;

import static java.util.Map.entry;

public enum TiposDeDatos {
    BOOLEAN,
    INT,
    DOUBLE,
    STRING;

    private static final Map<TiposDeDatos, TipoDeDato> mapaDeTipoDeDatos = Map.ofEntries(
            entry(BOOLEAN,new Booleano()),
            entry(DOUBLE,new Doble()),
            entry(STRING,new Cadena()),
            entry(INT, new Entero())
    );

    public static TipoDeDato getTipoDeDato(String tipoDeDatoString){
        return mapaDeTipoDeDatos.get(getEnumerator(tipoDeDatoString));
    }

    public static TiposDeDatos getEnumerator(String tipoDeDatoString){
        return TiposDeDatos.valueOf(tipoDeDatoString.toUpperCase());
    }

}
