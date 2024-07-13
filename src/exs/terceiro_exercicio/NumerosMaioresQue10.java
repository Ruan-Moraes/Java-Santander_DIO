package exs.terceiro_exercicio;

import java.util.List;

public class NumerosMaioresQue10 {
    public static void numerosMaioresQue10(List<Integer> numeros) {
        List<Integer> numerosMaioresQue10 = numeros.stream().filter(numero -> numero > 10).toList();

        System.out.println(STR."Os numeros maiores que 10 são: \{numerosMaioresQue10}");
    }
}