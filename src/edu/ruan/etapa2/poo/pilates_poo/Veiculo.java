package edu.ruan.etapa2.poo.pilates_poo;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
