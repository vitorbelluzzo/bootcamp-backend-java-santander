package HandsOn;

import java.util.concurrent.ThreadLocalRandom;

public class CasesPraticos {
    public static void main(String[] args) {
//        controleCandidatos(2000);
        selecaoCandidato();
    }

    static void controleCandidatos(double PretensaoSalarial) {
        float TetoSalarial = 2000;

        String Resultado = (TetoSalarial > PretensaoSalarial) ? "Ligar para candidato " : (TetoSalarial == PretensaoSalarial) ? "Ligar para o candidato com contra proposta" : "Aguardo resultado dos demais\n" + "candidatos";

        System.out.println(Resultado);
    }

    static void selecaoCandidato() {
        String[] candidatos = {"vitor", "sophia", "luciene", "eduardo", "Laura"};
        int candidatoSelecionado = 0;
        double salarioBase = 2000;


        for (int i = 0; i < candidatos.length; i++) {
            double salarioPretendido = valorRandomico();
            String candidato = candidatos[i];

            System.out.println("Pretensão do(a) Candidato(a) " + candidato + " é de " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                candidatoSelecionado++;
                System.out.println("O(a) candidato(a) " + candidato + " foi selecionado(a).");

            }

        }
        System.out.println(candidatoSelecionado + " Candidatos selecionados;");
    }


    static double valorRandomico() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


}
