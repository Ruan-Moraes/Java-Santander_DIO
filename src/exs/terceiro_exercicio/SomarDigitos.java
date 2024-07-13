package exs.terceiro_exercicio;

import java.util.List;

public class SomarDigitos {
    public static void somarDigitos(List<Integer> numeros) {
        int somaDigitos = numeros.stream()
                .mapToInt(num -> String.valueOf(num).chars().map(Character::getNumericValue).sum())
                .sum();

        System.out.println(STR."A soma dos dígitos de todos os números é: \{somaDigitos}");
    }
}