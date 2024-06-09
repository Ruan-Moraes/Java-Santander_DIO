package edu.ruan.etapa2.poo.pilates_poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456");
        jeep.ligar();

        Moto honda = new Moto();
        honda.setChassi("654321");
        honda.ligar();

        Veiculo veiculo = honda;
        System.out.println(veiculo.getChassi());
    }
}

