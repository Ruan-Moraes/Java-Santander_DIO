package estrutura_de_repeticao.break_e_continue;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("BREAK - Estou no índice " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("CONTINUE - Estou no índice " + i);
        }
    }
}
