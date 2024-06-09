package edu.ruan.etapa2.poo.pilates_poo;

public class Carro extends Veiculo {
    public void ligar() {
        confereCambrio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }

    private void confereCambrio() {
        System.out.println("Conferindo câmbio");
    }
}
