package edu.ruan.etapa2.poo.abstracao;

public class Telegram extends ServicoPai {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
