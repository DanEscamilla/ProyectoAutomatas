package simbolos;

import errores.SemanticError;
import java.util.HashMap;

public class TablaDeSimbolos {

    HashMap<String,Identificador> simbolos = new HashMap();

    public void agregarIdentificador(Identificador identificador){
        if (!simbolos.containsKey(identificador.getToken().image)) {
            simbolos.put(identificador.getToken().image, identificador);
        } else {
            String reason = "La variable \""+identificador.getToken().image+"\" ya esta declarada";
            throw new SemanticError(
                    identificador.getToken().beginLine,
                    identificador.getToken().beginColumn,
                    reason);
        }
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
