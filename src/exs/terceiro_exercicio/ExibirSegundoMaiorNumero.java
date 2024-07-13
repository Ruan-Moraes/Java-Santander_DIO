package exs.terceiro_exercicio;

import java.util.Comparator;
import java.util.List;

public class ExibirSegundoMaiorNumero {
    public static void exibirSegundoMaiorNumero(List<Integer> numeros) {
        List<Integer> segundoMaiorNumero =
                numeros.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).toList();

        System.out.println(segundoMaiorNumero.get(1));
    }
}