package PilaresPOO.ExemploMSN.apps;

public abstract/* Abstração*/ class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected/*polimorfismo| qualquer filho que herdar a classe acima, terá acesso a esse metodo*/ void validarConexaoInternet() {
        System.out.println("Aplicativo conectado");
    }


}
