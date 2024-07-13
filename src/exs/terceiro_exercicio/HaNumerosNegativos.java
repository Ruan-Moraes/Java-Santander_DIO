package exs.terceiro_exercicio;

import java.util.List;

public class HaNumerosNegativos {
    public static void haNumerosNegativos(List<Integer> numeros) {
        boolean haNumerosNegativos = numeros.stream().anyMatch(n -> n < 0);

        System.out.println(STR."Há números negativos? \{haNumerosNegativos}");
    }
}