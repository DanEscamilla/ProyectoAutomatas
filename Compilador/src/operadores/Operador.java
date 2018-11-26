
package operadores;

import simbolos.Valor;

public interface Operador{

  Valor operar(Valor op1,Valor op2);
  Integer operar(Integer op1, Integer op2) throws Exception;
  Boolean operar(Boolean op1, Boolean op2) throws Exception;
  String operar(String op1, String op2) throws Exception;
  Double operar(Double op1, Double op2) throws Exception;
  int getPrecedencia();
  String getNombre();
}
