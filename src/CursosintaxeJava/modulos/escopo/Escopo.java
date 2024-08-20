package CursosintaxeJava.modulos.escopo;

// O conceito de escopo em Java refere-se à parte do código onde uma variável é visível e pode ser acessada.
//  Em Java, o escopo pode ser local (dentro de um método) ou de classe (variáveis declaradas fora de métodos,
//   mas dentro da classe).

public class Escopo {

   // Variável de classe (escopo de classe)
   int variavelDeClasse = 10;

   public void metodoExemplo() {
      // Variável local (escopo local)
      int variavelLocal = 5;

      System.out.println("Valor da variável local: " + variavelLocal);
      System.out.println("Valor da variável de classe: " + variavelDeClasse);
   }

   public static void main(String[] args) {
      Escopo exemplo = new Escopo();
      exemplo.metodoExemplo();
   }
}