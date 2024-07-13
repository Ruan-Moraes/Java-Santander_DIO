package exs.terceiro_exercicio;

import java.util.List;

public class ImprimirNumerosImparesMultiploDe3E5 {
    public static void imprimirNumerosImparesMultiploDe3e5(List<Integer> numeros) {
        List<Integer> numerosImparesMultiploDe3e5 = numeros.stream()
                .filter(n -> n % 2 != 0 && n % 3 == 0 && n % 5 == 0)
                .toList();

        System.out.println(STR."Os números ímpares múltiplos de 3 e 5 são: \{numerosImparesMultiploDe3e5}");
    }
}