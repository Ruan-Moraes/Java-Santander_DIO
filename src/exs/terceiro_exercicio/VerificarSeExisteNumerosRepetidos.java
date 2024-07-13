package exs.terceiro_exercicio;

import java.util.List;

public class VerificarSeExisteNumerosRepetidos {
    public static void verificarSeExisteNumerosRepetidos(List<Integer> numeros) {
        boolean hasRepeated = numeros.stream().distinct().count() != numeros.size();

        System.out.println(STR."Existem números repetidos? \{hasRepeated}");
    }
}