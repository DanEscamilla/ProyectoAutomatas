package operadores;

import java.util.Map;
import java.util.HashMap;

public class Operadores {

    private static final Map<String, Operador> mapaOperadores;
    static {
        mapaOperadores = new HashMap<>();
        mapaOperadores.put("+",new Suma("sumar"));
        mapaOperadores.put("-",new Resta("restar"));
        mapaOperadores.put("*",new Multiplicacion("multiplicar"));
        mapaOperadores.put("/",new Division("dividir"));
//        mapaOperadores.put(">",new Suma("sumar"));
//        mapaOperadores.put("<",new Suma("sumar"));
//        mapaOperadores.put("==",new Suma("sumar"));
    }

    public static Operador getOperador(String operador){
        return mapaOperadores.get(operador);
    }

}
