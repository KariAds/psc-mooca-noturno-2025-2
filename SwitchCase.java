import java.text.StringCharacterIterator;

import javax.swing.JOptionPane;

public class SwitchCase {
public static void main(String[] args){
    String operador  =  JOptionPane.showInputDialog("digite operador");
    char o = operador.charAt(0);
    int num1 = 10, num = 5;
    int resultado;
    switch (o) {
        case '+':
            resultado = num1 + num;
            JOptionPane.showMessageDialog(null,"SOMA" + resultado);
            break;
            case '-':
            resultado = num1 - num;
            JOptionPane.showMessageDialog(null,"Subtração" + resultado);
            break;
            case '*':
            resultado = num1 * num;
            JOptionPane.showMessageDialog(null,"Multiplicação" + resultado);
            break;
            case '/':
            if(num != 0){
            resultado = num1 / num;
            JOptionPane.showMessageDialog(null,"Divisão" + resultado);
            } else{
                System.err.println("Erro: Divisão por zero");
            }
            break;
        default:
            break;
    }
    
}
    
}
