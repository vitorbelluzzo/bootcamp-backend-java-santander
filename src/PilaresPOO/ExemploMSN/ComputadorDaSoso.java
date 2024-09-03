package PilaresPOO.ExemploMSN;

import PilaresPOO.ExemploMSN.apps.FacebookMessenger;
import PilaresPOO.ExemploMSN.apps.MSNmessenger;
import PilaresPOO.ExemploMSN.apps.Telegram;

public class ComputadorDaSoso {
    public static void main(String[] args) {
        MSNmessenger msn = new MSNmessenger();
        FacebookMessenger fbm = new FacebookMessenger();
        Telegram tlg = new Telegram();

        msn.enviarMensagem();
        msn.receberMensagem();

        msn.validarConexaoInternet();


        fbm.enviarMensagem();
        fbm.receberMensagem();


        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}
