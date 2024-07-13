package exs.terceiro_exercicio;

import java.util.Comparator;
import java.util.List;

public class EncontrarMaiorNumeroPrimo {
    public static void encontrarMaiorNumeroPrimo(List<Integer> numeros) {
        int maiorNumeroPrimo = numeros.stream().filter(n -> {
            if (n == 1) return false;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) return false;
            }

            return true;
        }).max(Comparator.naturalOrder()).get();

        System.out.println(STR."O maior número primo é: \{maiorNumeroPrimo}");
    }
}