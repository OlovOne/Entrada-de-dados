
package dever;
import javax.swing.JOptionPane;

public class num9 {
    public static void main(String[] args){
        String sc = JOptionPane.showInputDialog("Informe a idade em anus");
        int x = Integer.parseInt(sc);
        String sc1 = JOptionPane.showInputDialog("Informe a idade em meses");
        int y = Integer.parseInt(sc1);
        String sc2 = JOptionPane.showInputDialog("Informe a idade em dias");
        int z = Integer.parseInt(sc2);
        int idade = (x*365)+(y*30)+(z*1);
        JOptionPane.showMessageDialog(null, "Dias de vida"+ idade);
    }
}
