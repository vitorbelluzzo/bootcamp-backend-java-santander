package cursoEstruturasCondicionais.modulos.estruturasCondicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        condicionalSimples();
        condicionalComposta();
        condicionalEncadeada();
    }


    public static void condicionalSimples() {
        // controle de fluxo simples - condicional simples.

        double saldo = 28.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo) saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }

    public static void condicionalComposta() {
        // controle de fluxo simples - condicional simples.

        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");

        else
            System.out.println("Reprovado");
    }

    public static void condicionalEncadeada() {
        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota > 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }


}



