package exs.terceiro_exercicio;

import java.util.List;

public class ExibirNumeros {
    public static void exibirNumeros(List<Integer> numeros) {
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        System.out.println(STR."Números ordenados: \{numerosOrdenados}");
    }
}