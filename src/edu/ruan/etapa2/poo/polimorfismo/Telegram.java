package edu.ruan.etapa2.poo.polimorfismo;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        verificarConexao();
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistorico();
    }
}