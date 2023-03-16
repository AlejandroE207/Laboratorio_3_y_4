
package laboratorio4_polimorfismo;
import javax.swing.JOptionPane;
public class ClienteCalculadoraEspecial {

 
    public static void main(String[] args) {
       CalculadoraEspecial cel=new CalculadoraEspecial();
  double numero1;
  double numero2;
 
          
  numero1=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del primer numero"));
  numero2=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del segundo numero"));
      JOptionPane.showMessageDialog(null,"La suma es " +cel.suma(numero1, numero2));
      JOptionPane.showMessageDialog(null,"La resta es "+cel.resta(numero1, numero2));
      JOptionPane.showMessageDialog(null,"El producto es "+cel.multiplicacion(numero1, numero2));
      JOptionPane.showMessageDialog(null,"La division es "+cel.division(numero1, numero2));
      JOptionPane.showMessageDialog(null,"La raiz cuadrada es "+cel.raizCuad(numero1));
    }
    
}