package expresiones;

import operadores.Operador;
import simbolos.Identificador;
import simbolos.Literal;

import java.util.Stack;

public class Expresion {

    private Stack<Nodo> nodos = new Stack<>();
    private int precedenciaBase = 0;
    Nodo raiz;


    public void agregarNodo(Identificador identificador){
        construir(new Nodo(precedenciaBase,new ContenidoOperando(identificador)));
    }
    public void agregarNodo(Literal literal){
        construir(new Nodo(precedenciaBase,new ContenidoLiteral(literal)));
    }
    public  void agregarNodo(Operador operador){
        construir(new Nodo(precedenciaBase,new ContenidoOperador(operador)));
    }

    private void construir(Nodo nodo){
        while (!nodos.isEmpty() && nodo.getPrecedencia() <= nodos.peek().getPrecedencia()) {
            nodo.left = nodos.pop();
        }
        if (!nodos.isEmpty()) {
//            System.out.println("peeking");
//            System.out.println(nodos.peek().contenido + ", " + nodos.peek().getPrecedencia());
//            System.out.println(nodo.contenido + ", "+nodo.getPrecedencia());
            nodos.peek().right = nodo;
        }
        nodos.push(nodo);
    }

    public Nodo obtenerArbol(){
        if (raiz != null){
            return raiz;
        }

        if (nodos.isEmpty()) {
            return null;
        }

        raiz = nodos.pop();
        while (!nodos.isEmpty()) {
            raiz = nodos.pop();
        }
        return raiz;

    }

    public void aumentarPrecedencia(int aumento){
        precedenciaBase += aumento;
    }
}
