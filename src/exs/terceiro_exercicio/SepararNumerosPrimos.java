package exs.terceiro_exercicio;

import java.util.List;

public class SepararNumerosPrimos {
    public static void separarNumerosPrimos(List<Integer> numeros) {
        List<Integer> numerosPrimos = numeros.stream().filter(n -> {
            if (n < 2) {
                return false;
            }

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }).toList();


        System.out.println(numerosPrimos);
    }
}