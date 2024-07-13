package exs.terceiro_exercicio;

import java.util.List;

public class SepararParesEImpares {
    public static void separarParesEImpares(List<Integer> numeros) {
        List<Integer> listaPares = numeros.stream().filter(n -> n % 2 == 0).toList();
        List<Integer> listaImpares = numeros.stream().filter(n -> n % 2 != 0).toList();

        System.out.println(STR."Os números pares são: \{listaPares}");
        System.out.println(STR."Os números ímpares são: \{listaImpares}");
    }
}