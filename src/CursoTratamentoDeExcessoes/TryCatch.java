package CursoTratamentoDeExcessoes;


import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
//        TryCatch();
        try {
            String cepFormatado = FormatarCEP("23765063");
            System.out.println(cepFormatado);
        } catch (CepInvalidoExeption e) {
            System.err.println("Valor inválido, por favor insira o CEP corretamente");
            e.printStackTrace();
        }

    }

    public static void TryCatch() {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Tenho " + altura + " de altura.");
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura devem ser numéricos!");
        }
    }

    static String FormatarCEP(String cep) throws CepInvalidoExeption {
        if (cep.length() != 8)
            throw new CepInvalidoExeption();

        return "22.222-222";
    }


}
