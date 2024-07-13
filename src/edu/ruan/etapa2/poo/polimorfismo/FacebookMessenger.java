package edu.ruan.etapa2.poo.polimorfismo;

public class FacebookMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        verificarConexao();
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistorico();
    }
}
