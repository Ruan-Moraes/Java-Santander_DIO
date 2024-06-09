package edu.ruan.etapa1.estrutura_de_repeticao.estrutura_while;

public class While {
    public static void main(String[] args) {
        double mesada = 50;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (mesada < valorDoce) {
                System.out.println("Não é possível comprar o doce de R$" + valorDoce + " com a mesada de R$" + mesada);
                break;
            }

            mesada -= valorDoce;

            System.out.println("Doce de R$" + valorDoce + " comprado com sucesso! Mesada atual: R$" + mesada);
        }

        System.out.println("Mesada acabou!");


    }

    private static double valorAleatorio() {
        return Math.random() * 10;
    }
}
