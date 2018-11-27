
package operadores;

import simbolos.Valor;

public interface OperadorUnario{

  Valor operar(Valor op1);
  Integer operar(Integer op1) throws Exception;
  Boolean operar(Boolean op1) throws Exception;
  String operar(String op1) throws Exception;
  Double operar(Double op1) throws Exception;
  int getPrecedencia();
  String getNombre();
}
