package expresiones;

import java.util.ArrayList;

public class ManejadorExpresiones {

    private static int contadorVariablesTemporales = 0;
    public static ArrayList<ExpresionAsignacion> expresiones = new ArrayList<>();

    static public void agregarExpresion(ExpresionAsignacion expresion){
        expresiones.add(expresion);
    }


    static public void calcular(){
        for (int i = 0;i<expresiones.size();i++){
            ExpresionAsignacion expresion = expresiones.get(i);
            System.out.println("Imprimiendo expresion");
            expresion.ejectuar();
            System.out.println();
        }
    }

    static public String construirNombreTemp(){
        return "temp"+(contadorVariablesTemporales);
    }
    static public void aumentarContador(){
        contadorVariablesTemporales ++;
    }
    static public void resetContador(){
        contadorVariablesTemporales = 0;
    }

    static public void print(){
        calcular();
    }



}
