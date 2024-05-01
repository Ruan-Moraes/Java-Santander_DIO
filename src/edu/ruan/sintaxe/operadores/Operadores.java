package edu.ruan.sintaxe.operadores;

public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        concatenacao = 1 + "1" + 1 + 1;
        concatenacao = 1 + "1" + 1 + "1";
        concatenacao = "1" + 1 + 1 + 1;
        concatenacao = "1" + (1 + 1 + 1);

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = +numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        System.out.println(numero++); // numero = 5

        System.out.println(numero);

        System.out.println(++numero); // numero = 7

        System.out.println(numero--); // numero = 7

        System.out.println(numero);

        System.out.println(--numero); // numero = 5

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 6;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condicações é verdadeira");
        }


        System.out.println("FIM");
    }
}
