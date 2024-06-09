package edu.ruan.etapa2.poo.abstracao;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();

        Telegram telegram = new Telegram();

        MSN msn = new MSN();

        facebook.enviarMensagem();
        facebook.receberMensagem();

        telegram.enviarMensagem();
        telegram.receberMensagem();

        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
