package edu.ruan.etapa2.poo.polimorfismo;

public class MSNMessenger extends ServicoMensagemInstantanea {
    @Override
    public void enviarMensagem() {
        verificarConexao();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        verificarConexao();
        System.out.println("Recebendo mensagem pelo MSN");
        salvarHistorico();
    }
}
