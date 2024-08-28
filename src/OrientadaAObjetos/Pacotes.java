package OrientadaAObjetos;

public class Pacotes {
    public static void main(String[] args) {
        String[] tiposDePacotes = {"Comercial", "Governamental", "Codigo aberto"};
        String[] Descricao = {"com.nomeDaEmpresa", "gov.nomeDaEmpresa", "org.nomeDaEmpresa"};

        for (int i = 0; i < tiposDePacotes.length; i++) {

            System.out.println(tiposDePacotes[i] + ": " + Descricao[i]);


            // é possivel e recomendado criar pacotes de classes, por exemplo pacote de classes service, model, util repository, controller etc

        }
    }
}
