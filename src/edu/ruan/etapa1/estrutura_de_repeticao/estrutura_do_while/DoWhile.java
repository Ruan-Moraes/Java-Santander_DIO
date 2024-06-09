package edu.ruan.etapa1.estrutura_de_repeticao.estrutura_do_while;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            // Executando repetidas vezes até algueém atender

            System.out.println("Tentando ligar...");
        } while (tocando());

        System.out.println("Alguém atendeu");
    }

    private static boolean tocando() {
        return Math.random() < 0.5 && Math.random() > 0.1;
    }
}
