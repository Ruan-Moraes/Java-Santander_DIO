package edu.ruan.etapa2.lachonete.atendimento;

public class Atendente {
    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("SERVINDO A MESA");
    }

    private void pegarLancheCozinha() {
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }
}
