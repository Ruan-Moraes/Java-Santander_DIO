package edu.ruan.etapa1.debugging;

public class main {
    public static void main(String[] args) {
        System.out.println("Iniciou o programa");
        a();
        System.out.println("Finalizou o programa");
    }

    public static void a() {
        System.out.println("Iniciou a");
        b();
        System.out.println("Finalizou a");
    }

    public static void b() {
        System.out.println("Iniciou b");
        c();
        System.out.println("Finalizou b");
    }

    public static void c() {
        System.out.println("Iniciou c");
        System.out.println("Finalizou c");
    }
}
