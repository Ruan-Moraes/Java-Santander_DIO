package exs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class terceiro_exercicio {
    private static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
//        exibirNumeros(numeros);
//        somaNumerosPares(numeros);
//        allIsPositive(numeros);
//        removerValoresImpares(numeros);
//        mediaNumerosMaioresQue5(numeros);
//        numerosMaioresQue10(numeros);
//        exibirSegundoMaiorNumero(numeros);
//        somarDigitos(numeros);
//        verificarSeExisteNumerosRepetidos(numeros);
//        imprimirNumerosImparesMultiploDe3e5(numeros);
//        somaDosQuadrados(numeros);
//        produtoDosItems(numeros);
//        filtarPorIntervalo(numeros);
//        encontrarMaiorNumeroPrimo(numeros);
        haNumerosNegativos(numeros);
    }

    public static void exibirNumeros(List<Integer> numeros) {
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        System.out.println(STR."Números ordenados: \{numerosOrdenados}");
    }

    public static void somaNumerosPares(List<Integer> numeros) {
        int somaNumerosPares = numeros.stream().filter(numero -> numero % 2 == 0).reduce(0,
                (numero, soma) -> numero + soma);

        System.out.println(STR."A soma total do numeros pares é: \{somaNumerosPares}");
    }

    public static void allIsPositive(List<Integer> numeros) {
        boolean allIsPositive = numeros.stream().allMatch(numero -> numero >= 0);

        System.out.println(STR."Todos os números são positivo? \{allIsPositive}");
    }

    public static void removerValoresImpares(List<Integer> numeros) {
        List<Integer> valoresPares = numeros.stream().filter(numero -> numero % 2 == 0).toList();

        System.out.println(STR."Números sem valores ímpares: \{valoresPares}");
    }


    public static void mediaNumerosMaioresQue5(List<Integer> numeros) {
        double media =
                (double) numeros.stream().filter(numero -> numero > 5).reduce(0, Integer::sum) / numeros.stream().filter(numero -> numero > 5).toList().size();

        System.out.println(STR."A média é: \{media}");
    }

    public static void numerosMaioresQue10(List<Integer> numeros) {
        List<Integer> numerosMaioresQue10 = numeros.stream().filter(numero -> numero > 10).toList();

        System.out.println(STR."Os numeros maiores que 10 são: \{numerosMaioresQue10}");
    }

    public static void exibirSegundoMaiorNumero(List<Integer> numeros) {
        List<Integer> segundoMaiorNumero =
                numeros.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).toList();

        System.out.println(segundoMaiorNumero.get(1));
    }

    public static void somarDigitos(List<Integer> numeros) {
        int somaDigitos = numeros.stream()
                .mapToInt(num -> String.valueOf(num).chars().map(Character::getNumericValue).sum())
                .sum();

        System.out.println(STR."A soma dos dígitos de todos os números é: \{somaDigitos}");
    }

    public static void verificarSeExisteNumerosRepetidos(List<Integer> numeros) {
        boolean hasRepeated = numeros.stream().distinct().count() != numeros.size();

        System.out.println(STR."Existem números repetidos? \{hasRepeated}");
    }

    public static void imprimirNumerosImparesMultiploDe3e5(List<Integer> numeros) {
        List<Integer> numerosImparesMultiploDe3e5 = numeros.stream()
                .filter(n -> n % 2 != 0 && n % 3 == 0 && n % 5 == 0)
                .toList();

        System.out.println(STR."Os números ímpares múltiplos de 3 e 5 são: \{numerosImparesMultiploDe3e5}");
    }

    public static void somaDosQuadrados(List<Integer> numeros) {
        int somaDosQuadrados = numeros.stream().map(n1 -> (int) Math.pow(n1, 2)).reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(STR."A soma dos quadrados é: \{somaDosQuadrados}");
    }

    public static void produtoDosItems(List<Integer> numeros) {
        List<Integer> produtoDosItem = numeros.stream().map(n1 -> n1 * n1).toList();

        System.out.println(STR."O produtos dos items é: \{produtoDosItem}");
    }

    public static void filtarPorIntervalo(List<Integer> numeros) {
        List<Integer> numerosPorIntervalo = numeros.stream().filter(n -> n >= 5 && n <= 10).toList();

        System.out.println(STR."Os números entre 5 e 10 são: \{numerosPorIntervalo}");
    }

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

    public static void haNumerosNegativos(List<Integer> numeros) {
        boolean haNumerosNegativos = numeros.stream().anyMatch(n -> n < 0);

        System.out.println(STR."Há números negativos? \{haNumerosNegativos}");
    }
}
