package PilaresPOO.ExemploMSN.apps;

public class MSNmessenger extends/*herança*/ ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        validarConexaoInternet();
        SalvarHistoricoDeMensagem();
        System.out.println("Enviando mensagem pelo msn");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo msn");
    }

    private /*Encapsulamento*/ void SalvarHistoricoDeMensagem() {
        System.out.println("Mensagem Salva");
    }
}
