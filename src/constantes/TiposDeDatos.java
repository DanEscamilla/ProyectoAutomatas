package constantes;

import java.util.HashMap;
import java.util.Map;

public enum TiposDeDatos {
    BOOLEAN,
    INT,
    DOUBLE,
    STRING;

    public static TiposDeDatos getEnumerator(String tipoDeDatoString){
        return TiposDeDatos.valueOf(tipoDeDatoString.toUpperCase());
    }

}
