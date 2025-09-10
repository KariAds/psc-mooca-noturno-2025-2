package com.example;

public class jogo {

    public static void main(String[] args){
        Personagem cacador = new Personagem();
        cacador.nome = "Karina";
        cacador.cacar();
        System.out.println("Energia atual: -"+ cacador.energia + " -Fome atual: "+ cacador.fome +" Sono atual: " + cacador.sono);
        cacador.comer();
        System.out.println("Energia atual: -"+ cacador.energia + "- Fome atual: "+ cacador.fome + " Sono atual: " + cacador.sono);;
        cacador.dormi();
        System.out.println("Energia atual: -"+ cacador.energia + " -Fome atual: "+ cacador.fome + " Sono atual: " + cacador.sono);;
    }
    //
    
}
