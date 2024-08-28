package CursosintaxeJava.modulos.operadores;

public class operadores {

   public static void main(String[] args) {
      operadoresUnarios();
      operadorTernario();
      OperadoresRelacionais();
      OperadoresLogicos();
   }

   public static void operadoresUnarios() {
      int numero = 5;
      boolean variavel = true;

      int incrementar1 = ++numero;
      int decrementar1 = --numero;
      boolean negandoVariavel = !variavel;

      System.out.println(numero);
      System.err.println(incrementar1);
      System.out.println(decrementar1);
      System.out.println(variavel);
      System.out.println(negandoVariavel);

   };

   public static void operadorTernario() {

      int a, b;

      a = 5;
      b = 5;
      String resultado = a == b ? "Verdadeiro" : "Falso";

      System.out.println(resultado);

   };

   public static void OperadoresRelacionais() {
      int a, b;

      a = 2;
      b = 3;
      String resultado;

      resultado = (a == b) ? "É igual" : "Não é igual";
      System.out.println(resultado);

      resultado = (a != b) ? "É diferente" : "Não É diferente";
      System.out.println(resultado);

      resultado = (a > b) ? "A é maior que b" : "b é maior que a";
      System.out.println(resultado);

      resultado = (a >= b) ? "A é maior ou igual a  b" : "b é maior ou igual a A";
      System.out.println(resultado);

      resultado = (a != b) ? "É diferente" : "Não É diferente";
      System.out.println(resultado);
   }

   public static void OperadoresLogicos() {
      boolean a, b;

      a = true;
      b = false;
      String resultado;

      resultado = (a && b) ? "Ambos são verdadeiros" : "alguma variavel é falsa";
      System.out.println(resultado);

      resultado = (a || b) ? "uma das variaveis é verdadeira " : "nenhuma variavel é verdadeira";
      System.out.println(resultado);

   }
}