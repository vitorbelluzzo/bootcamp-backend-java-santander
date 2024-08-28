package JavaBasico.modulos.metodos;

public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        // System.out.println("TV ligada: " + smartTv.ligada);

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligarTV();

        System.out.println("Canal alterado para:");
        smartTv.aumentarCanal();

        System.out.println("Canal alterado para:");
        smartTv.diminuirCanal();

        System.out.println("Volume alterado para:");
        smartTv.aumentarVolume();

        System.out.println("volume alterado para:");
        smartTv.diminuirVolume();

        System.out.println("Canal alterado para:");
        smartTv.mudarCanal(3);

        smartTv.desligarTv();

    }
}
