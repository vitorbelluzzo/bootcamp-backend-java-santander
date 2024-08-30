package PilaresPOO.ExemploMSN;

public class Telegram extends /*herança*/ ServicoMensagemInstantanea{
    @Override
    public void enviarMensagem() {
        SalvarHistoricoDeMensagem();
        System.out.println("Enviando mensagem pelo telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    }

    private /*Encapsulamento*/ void SalvarHistoricoDeMensagem() {
        System.out.println("Mensagem Salva");
    }
}
