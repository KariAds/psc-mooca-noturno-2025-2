package condicional;
import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
 do{
        System.out.println("Digite o numero zero para sair");
        numero = sc.nextInt();
        System.out.println("Voce digitou"+ numero);
 }
        while(numero != 0);
            
            System.out.println("Digite 0 para sair");
            numero = sc.nextInt();

        System.out.println("Programa encerrado");
        sc.close();
}}