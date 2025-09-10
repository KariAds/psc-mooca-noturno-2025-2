package com.example;

public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    // quando ele caca ele perde 2 pontos de energia
    // ele so pode cacar caso tenha pelo menos 2 pontos de energia, caso contrario ele morre = 0
    //caso ele cacar ele vai ganhar um ponto para sono e um ponto para fome
    // quando ele come ganha um ponto 
    // quando ele dorme um ponto

    public void cacar(){
        if(energia >= 2){
        System.out.println( nome + "\ncaçando");
        energia -=2;
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);

    } else {
        System.out.println("voce esta sem energia");
    }
    }

    public void comer(){
        fome -=1;
        System.out.println(nome + "comendo");
    }

    public void dormi(){ 
        sono -=1; 
        System.out.println(nome + "dormindo");
    }

}