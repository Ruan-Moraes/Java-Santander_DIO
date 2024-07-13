package edu.ruan.etapa1.sintaxe.metodos;

public class Usuario {
    public static void main(String[] args) {
        SistemaSmartTv sistemaSmartTv = new SistemaSmartTv();

        System.out.println("TV Ligada?: " + sistemaSmartTv.ligada);
        System.out.println("Canal atual: " + sistemaSmartTv.canal);
        System.out.println("Volume atual: " + sistemaSmartTv.volume);

        sistemaSmartTv.ligar();

        System.out.println("TV Ligada?: " + sistemaSmartTv.ligada);

        sistemaSmartTv.diminuirSom();

        System.out.println("Volume atual: " + sistemaSmartTv.volume);

        sistemaSmartTv.trocarDeCanal(12);

        System.out.println("Canal atual: " + sistemaSmartTv.canal);

        sistemaSmartTv.trocarDeCanalAnterior();

        System.out.println("Canal atual: " + sistemaSmartTv.canal);

        sistemaSmartTv.trocarDeCanalAnterior();
        sistemaSmartTv.trocarDeCanalAnterior();
        sistemaSmartTv.trocarDeCanalAnterior();
        sistemaSmartTv.trocarDeCanalAnterior();

        sistemaSmartTv.trocarDeCanalDepois();

        System.out.println("Canal atual: " + sistemaSmartTv.canal);
    }
}
