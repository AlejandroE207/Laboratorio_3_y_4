
package laboratorio4_polimorfismo;

import javax.swing.JOptionPane;

public class ClienteCalculadoraNormal {

    public static void main(String[] args) {
  CalculadoraNormal cal=new CalculadoraNormal();
  double numero1;
  double numero2;
  numero1=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del primer numero"));
  numero2=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del segundo numero"));
 JOptionPane.showMessageDialog(null,"La suma es " +cal.suma(numero1, numero2));
 JOptionPane.showMessageDialog(null,"La resta es "+cal.resta(numero1, numero2));
 JOptionPane.showMessageDialog(null,"El producto es "+cal.multiplicacion(numero1, numero2));
 JOptionPane.showMessageDialog(null,"La division es "+cal.division(numero1, numero2));
 JOptionPane.showMessageDialog(null,"La raiz cuadrada es "+cal.raizCuad(numero1));
    }   
}
