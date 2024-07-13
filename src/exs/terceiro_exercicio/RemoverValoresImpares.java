package exs.terceiro_exercicio;

import java.util.List;

public class RemoverValoresImpares {
    public static void removerValoresImpares(List<Integer> numeros) {
        List<Integer> valoresPares = numeros.stream().filter(numero -> numero % 2 == 0).toList();

        System.out.println(STR."Números sem valores ímpares: \{valoresPares}");
    }
}