package JavaBasico.cursoEstruturaDeRepeticao;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
//        For();
//        ForEmArray();
//        BreakContinue();
//        While();
        DoWhile();
    }

    public static void For() {
        for (int carneiros = 0; carneiros < 5; carneiros++) {
            System.out.println(carneiros);
        }
    }

    public static void ForEmArray() {
        String alunos[] = {"Vitor", "Sophia", "Eduardo", "Luciene", "Laura"};

        for (int indice = 0; indice < alunos.length; indice++) {
            System.out.println(alunos[indice]);
        }

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void BreakContinue() {
        for (int i = 0; i <= 10; i++) {
            if (i == 2) continue;
            else if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void While() {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) valorDoce = mesada;

            System.out.println("Doce de: " + valorDoce + " Foi adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("A criança gastou toda a sua mesada");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    public static void DoWhile() {
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando");
        } while (Ringing());
        System.out.println("Alô!");


    }

    private static boolean Ringing() {
        boolean answer = new Random().nextInt(3) == 1;
        System.out.println("answer? " + answer);
        return !answer;
    }


}
