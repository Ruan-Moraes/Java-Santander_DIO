package edu.ruan.sintaxe.tipos_e_variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Tipos primitivos
        // Estudem a classe String que representa texto na aplicação

        String meuNome = "Ruan Moraes";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
