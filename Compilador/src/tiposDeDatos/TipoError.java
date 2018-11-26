package tiposDeDatos;

import operadores.Operador;

public class TipoError implements TipoDeDato<ObjetoError> {

    @Override
    public ObjetoError parseDato(String stringDato) {
        return new ObjetoError(stringDato);
    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.ERROR;
    }

    @Override
    public ObjetoError operar(Operador op, Object op1, Object op2) throws Exception {
        throw new Exception("No se puede operar con errores");
    }


    @Override
    public String toString() {
        return "Error";
    }

    public static ObjetoError generarObjetoError(String str){
        return new ObjetoError(str);
    }

}

class ObjetoError {

    String valor;

    public ObjetoError(String str){
        valor = str;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
