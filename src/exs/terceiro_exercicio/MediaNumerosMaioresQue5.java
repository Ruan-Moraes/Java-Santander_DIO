package exs.terceiro_exercicio;

import java.util.List;

public class MediaNumerosMaioresQue5 {
    public static void mediaNumerosMaioresQue5(List<Integer> numeros) {
        double media =
                (double) numeros.stream().filter(numero -> numero > 5).reduce(0, Integer::sum) / numeros.stream().filter(numero -> numero > 5).toList().size();

        System.out.println(STR."A média é: \{media}");
    }
}