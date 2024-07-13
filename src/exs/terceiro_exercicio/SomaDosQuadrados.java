package exs.terceiro_exercicio;

import java.util.List;

public class SomaDosQuadrados {
    public static void somaDosQuadrados(List<Integer> numeros) {
        int somaDosQuadrados = numeros.stream().map(n1 -> (int) Math.pow(n1, 2)).reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(STR."A soma dos quadrados é: \{somaDosQuadrados}");
    }
}