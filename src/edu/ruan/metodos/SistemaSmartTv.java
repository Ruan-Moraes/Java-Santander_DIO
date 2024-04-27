package edu.ruan.metodos;

public class SistemaSmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarSom() {
        volume++;
    }

    public void diminuirSom() {
        volume--;
    }

    public void trocarDeCanalAnterior() {
        canal--;
    }

    public void trocarDeCanalDepois() {
        canal++;
    }

    public void trocarDeCanal(int canalPretendido) {
        canal = canalPretendido;
    }
}
