package tiposDeDatos;

import errores.SemanticError;

public class DatoError implements TipoDeDato<ObjetoError> {

    @Override
    public ObjetoError parseDato(String stringDato) {
        return new ObjetoError(stringDato);
    }

    @Override
    public TiposDeDatos getEnum() {
        return TiposDeDatos.BOOLEAN;
    }

    @Override
    public ObjetoError suma(Object operando1, Object operando2) {
        throw new SemanticError("No se permite sumar valores Error");
    }

    @Override
    public ObjetoError resta(Object operando1, Object operando2) {
        throw new SemanticError("No se permite restar valores Error");
    }

    @Override
    public ObjetoError multiplicacion(Object operando1, Object operando2) {
        throw new SemanticError("No se permite multiplicar valores Error");
    }

    @Override
    public ObjetoError division(Object operando1, Object operando2) {
        throw new SemanticError("No se permite dividir valores Error");
    }

    @Override
    public String toString() {
        return "Error";
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
