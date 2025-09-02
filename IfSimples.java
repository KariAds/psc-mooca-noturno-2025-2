import javax.swing.JOptionPane;

public class IfSimples{
public static void main(String[] args){

    int numero = Integer.parseInt(
     JOptionPane.showInputDialog("Digite um número"));

     if (numero / 2 == 0){
        JOptionPane.showMessageDialog(null,
         "O numero " + numero + " é par");
    
     } else {
        JOptionPane.showMessageDialog(null, "e impar", null, numero);
     };

}
}