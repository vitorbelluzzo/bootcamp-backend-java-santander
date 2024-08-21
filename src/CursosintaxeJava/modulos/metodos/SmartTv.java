package cursoSintaxeJava.modulos.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // crie o metodo ligar para alterar o atributo ligada

    public void ligarTV() {
        ligada = true;
        System.out.println("TV ligada");
    }
    // faça o mesmo metodo para desligar

    public void desligarTv() {
        ligada = false;
        System.out.println("TV desligada");
    }

    // crie o metodo aumentarVolume sem parametro que nao retorna nada,

    public void aumentarVolume() {
        volume++;
        System.out.println(volume);
    }

    // faça o mesmo para diminuir volume;

    public void diminuirVolume() {
        volume--;
        System.out.println(volume);
    }

    // crie um semelhante ao de cima para aumentarCanal e DiminuirCanal

    public void aumentarCanal() {
        canal++;
        System.out.println(canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println(canal);
    }
    // crie um metodo para mudar canal esse ira receber um parametro int novoCanal

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println(canal);
    }

}
