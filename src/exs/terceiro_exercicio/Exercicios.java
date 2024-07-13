package exs.terceiro_exercicio;

import java.util.Arrays;
import java.util.List;

public class Exercicios {
    private static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        ExibirNumeros.exibirNumeros(numeros);
        SomaNumerosPares.somaNumerosPares(numeros);
        MostrarTodosPositivos.mostrarTodosPositivos(numeros);
        RemoverValoresImpares.removerValoresImpares(numeros);
        MediaNumerosMaioresQue5.mediaNumerosMaioresQue5(numeros);
        NumerosMaioresQue10.numerosMaioresQue10(numeros);
        ExibirSegundoMaiorNumero.exibirSegundoMaiorNumero(numeros);
        SomarDigitos.somarDigitos(numeros);
        VerificarSeExisteNumerosRepetidos.verificarSeExisteNumerosRepetidos(numeros);
        ImprimirNumerosImparesMultiploDe3E5.imprimirNumerosImparesMultiploDe3e5(numeros);
        SomaDosQuadrados.somaDosQuadrados(numeros);
        ProdutosDosItem.produtoDosItems(numeros);
        FiltarPorIntervalo.filtarPorIntervalo(numeros);
        EncontrarMaiorNumeroPrimo.encontrarMaiorNumeroPrimo(numeros);
        HaNumerosNegativos.haNumerosNegativos(numeros);
        SepararParesEImpares.separarParesEImpares(numeros);
        SepararNumerosPrimos.separarNumerosPrimos(numeros);
        VerificarSeTodosOsNumerosEIguais.verificarSeTodosOsNumeroEIguais(numeros);
        SomarNumerosDivisiveisPor3E5.somarNumerosDivisiveisPor3E5(numeros);
    }
}


