package PilaresPOO.ExemploVeiculos;

public abstract class Veiculo {
       /*abstract = abstração, toda classe que quiser ser herdada da classe um veiculo,
       deverá criar seu metodo abstrato, por exemplo o metodo ligar();

    * */

    public abstract void ligar();

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCambio() {
        return Cambio;
    }

    public void setCambio(String cambio) {
        Cambio = cambio;
    }

    public int getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(int combustivel) {
        Combustivel = combustivel;
    }

    private String chassi;
    private String Cambio;
    private int Combustivel;


}
