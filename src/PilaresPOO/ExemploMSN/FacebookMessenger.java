package PilaresPOO.ExemploMSN;

public class FacebookMessenger extends/*herança*/ ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook");
    }

    private /*Encapsulamento*/ void SalvarHistoricoDeMensagem() {
        System.out.println("Mensagem Salva");
    }
}
