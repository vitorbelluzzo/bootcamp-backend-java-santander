package CursosintaxeJava.modulos.anatomiaClasse;
public class Myclass { // --> classe

    // metodo
    public static void main(String[] args) {

        // tipo //nomevariavel //valor

        String primeiroNome = "Vitor";
        String segundoNome = "Belluzzo";

        // nomevariavel //valoralterado

        System.out.println(nomeCompleto(primeiroNome, segundoNome));
        // print de int

    }

    // método
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}

// "final" antes da variavel faz com que ela nunca possa ter seu valor alterado
// variaveis nao podem ter espaço, começar com numero ou ter simbolos que nao
// sejam underline ou $ cifrão, tambem nao podem ter palavras reservadas
