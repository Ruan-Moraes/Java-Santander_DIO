package estrutura_condicionais.switch_case;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "C"; // A, B, C

        switch (plano) {
            case "A": {
                System.out.println("5GB de internet");
            }
            case "B": {
                System.out.println("WhatsApp ilimitado e instagram ilimitado");
            }
            case "C": {
                System.out.println("100 minutos de ligação");
                break;
            }
        }
    }
}
