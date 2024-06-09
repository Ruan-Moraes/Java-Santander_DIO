package edu.ruan.etapa2.poo.encapsulamento;

public class MSNMessenger {
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensagem para o MSN");
        salvarHistoricoMensagem();
    }

    private void verificarConexao() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
