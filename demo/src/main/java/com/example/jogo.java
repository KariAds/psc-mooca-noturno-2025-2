package com.example;

public class jogo {

    public static void main(String[] args) throws InterruptedException{
        Personagem cacador = new Personagem();
        while (true) {
            
        
        cacador.nome = "Karina";
        cacador.cacar();
        System.out.println("Energia atual: "+ cacador.energia + " Fome atual: "+ cacador.fome +" Sono atual: " + cacador.sono);
        cacador.comer();
        System.out.println("Energia atual: "+ cacador.energia + " Fome atual: "+ cacador.fome + " Sono atual: " + cacador.sono);
        cacador.dormi();
        System.out.println("Energia atual: "+ cacador.energia + " Fome atual: "+ cacador.fome + " Sono atual: " + cacador.sono);
        Thread.sleep(2000);
    }
}}
