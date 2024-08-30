package PilaresPOO.ExemploMSN;

public class ComputadorDaSoso {
    public static void main(String[] args) {
        MSNmessenger msn = new MSNmessenger();
        FacebookMessenger fbm = new FacebookMessenger();
        Telegram tlg = new Telegram();

        msn.enviarMensagem();
        msn.receberMensagem();

        fbm.enviarMensagem();
        fbm.receberMensagem();


        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
