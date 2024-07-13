package exs.terceiro_exercicio;

import java.util.List;

public class MostrarTodosPositivos {
    public static void mostrarTodosPositivos(List<Integer> numeros) {
        boolean allIsPositive = numeros.stream().allMatch(numero -> numero >= 0);

        System.out.println(STR."Todos os números são positivo? \{allIsPositive}");
    }
}