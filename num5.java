
package dever;
import javax.swing.JOptionPane;

public class Dever {

   
    public static void main(String[] args) {
       float nota1,nota2,nota3,nota4;
       String sc = JOptionPane.showInputDialog("Infome a Nota: ");
       nota1  = Float.parseFloat(sc);
       String sc1 = JOptionPane.showInputDialog("Infome a Nota: ");
       nota2  = Float.parseFloat(sc1);
       String sc2 = JOptionPane.showInputDialog("Infome a Nota: ");
       nota3  = Float.parseFloat(sc2);
       String sc3 = JOptionPane.showInputDialog("Infome a Nota: ");
       nota4  = Float.parseFloat(sc3);
       JOptionPane.showMessageDialog(null, "A media é: " + ((nota1+nota2+nota3+nota4)/4);
    
    }
}
