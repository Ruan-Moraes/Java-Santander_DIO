package exs.terceiro_exercicio;

import java.util.List;

public class VerificarSeTodosOsNumerosEIguais {
    public static void verificarSeTodosOsNumeroEIguais(List<Integer> numeros) {
        int primeiroNumero = numeros.get(0);

        boolean saoIguais = numeros.stream().allMatch(n -> n.equals(primeiroNumero));

        System.out.println(STR."Todos os números são iguas? \{saoIguais == true ? "São iguais" : "Não são iguais"}");
    }
}