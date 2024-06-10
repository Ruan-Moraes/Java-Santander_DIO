package edu.ruan.etapa2.enums.estados;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadosBrasileiros estado : EstadosBrasileiros.values()) {
            System.out.println("Sigla: " + estado.getSigla() + " - Nome: " + estado.getNome());
        }

        EstadosBrasileiros estado = EstadosBrasileiros.SAO_PAULO;

        System.out.println("Estado: " + estado.getNome());
        System.out.println("Sigla: " + estado.getSigla());
        System.out.println("Nome em maiúsculo: " + estado.getNomeMaiusculo());
        System.out.println("IBGE: " + estado.getIbge());
    }
}
