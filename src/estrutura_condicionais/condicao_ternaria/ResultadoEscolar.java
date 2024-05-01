package estrutura_condicionais.condicao_ternaria;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        String resultado = (nota >= 7) ? "Aprovado" : (nota >= 5) ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
