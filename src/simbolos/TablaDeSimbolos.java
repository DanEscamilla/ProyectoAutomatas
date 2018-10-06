package simbolos;

import errores.SemanticError;
import java.util.HashMap;

public class TablaDeSimbolos {

    HashMap<String,Identificador> simbolos = new HashMap();

    public void agregarIdentificador(Identificador identificador){
        simbolos.put(identificador.getToken().image,identificador);
    }

    public String toString(){
        String str = "";
        for (String key: simbolos.keySet()){
            Variable var = (Variable) simbolos.get(key);
            String valor = (var.getValor() == null)?"null":var.getValor().toString();
            str += (key + " = " + valor + "\n");
        }
        return str;
    }
    
}
