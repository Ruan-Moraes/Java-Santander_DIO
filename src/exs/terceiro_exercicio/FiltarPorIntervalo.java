package exs.terceiro_exercicio;

import java.util.List;

public class FiltarPorIntervalo {
    public static void filtarPorIntervalo(List<Integer> numeros) {
        List<Integer> numerosPorIntervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).toList();

        System.out.println(STR."Os números entre 5 e 10 são: \{numerosPorIntervalo}");
    }
}