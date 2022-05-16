
package dever;
import javax.swing.JOptionPane;

public class Num8 {
    public static void main(String[] args){
    String sc = JOptionPane.showInputDialog("Informe o salario.");
    String sc1 = JOptionPane.showInputDialog("Informe o desconto");
    float salario = Float.parseFloat(sc);
    float des = Float.parseFloat(sc1);
    des = salario+(salario*des/100);
    JOptionPane.showMessageDialog(null, "O seu salario atual é."+ des);
    }
}
