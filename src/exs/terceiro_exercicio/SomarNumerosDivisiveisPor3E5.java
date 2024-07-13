package exs.terceiro_exercicio;

import java.util.List;

public class SomarNumerosDivisiveisPor3E5 {
    public static void somarNumerosDivisiveisPor3E5(List<Integer> numeros) {
        int somaDosNumerosDivisiveisPor3E5 = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(Integer::sum).orElse(0);

        System.out.println(STR."A soma dos numeros divisivéis por 3 e 5 é: \{somaDosNumerosDivisiveisPor3E5}");
    }
}