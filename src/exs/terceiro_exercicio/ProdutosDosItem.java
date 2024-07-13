package exs.terceiro_exercicio;

import java.util.List;

public class ProdutosDosItem {
    public static void produtoDosItems(List<Integer> numeros) {
        List<Integer> produtoDosItem = numeros.stream().map(n1 -> n1 * n1).toList();

        System.out.println(STR."O produtos dos items é: \{produtoDosItem}");
    }
}