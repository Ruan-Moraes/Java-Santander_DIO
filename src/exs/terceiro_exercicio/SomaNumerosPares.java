package exs.terceiro_exercicio;

import java.util.List;

public class SomaNumerosPares {
    public static void somaNumerosPares(List<Integer> numeros) {
        int somaNumerosPares = numeros.stream().filter(numero -> numero % 2 == 0).reduce(0,
                (numero, soma) -> numero + soma);

        System.out.println(STR."A soma total do numeros pares é: \{somaNumerosPares}");
    }
}