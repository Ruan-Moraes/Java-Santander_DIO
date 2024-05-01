package estrutura_de_repeticao.estrutura_for;

public class For {
    public static void main(String[] args) {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Carneirinho " + carneirinhos + " pulou a cerca");
        }

        System.out.println("Todos os carneirinhos pularam a cerca");

        // Exemplo em que o for é utilizado para percorrer um array

        String alunos[] = {"João", "Maria", "José", "Pedro", "Ana"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno: " + alunos[i]);
        }

        // Ou ainda, de forma mais simplificada, utilizando o for-each

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }


}
