package operadores;

//import operadores.Operador;
//import tiposDeDatos.Valor;

import simbolos.Valor;
import tiposDeDatos.TipoDeDato;

public class Negacion extends OperadorUnarioCA {

    public Negacion (String nombreOperacion) {
        super(nombreOperacion);
    }

    @Override
    public Integer operar(Integer op1) {
        return -op1;
    }

    @Override
    public Double operar(Double op1) {
        return -op1;
    }

    @Override
    public String toString() {
        return "-";
    }
}
