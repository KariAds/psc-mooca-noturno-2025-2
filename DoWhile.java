import java.util.Scanner;

public class DoWhile {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero zero para sair");
        numero = sc.nextInt();

        while(numero != 0){
            System.out.println("Voce digitou"+ numero);
            System.out.println("Digite 0 para sair");
            numero = sc.nextInt();
        }

        System.out.println("Programa encerrado");
        sc.close();
    }
}
