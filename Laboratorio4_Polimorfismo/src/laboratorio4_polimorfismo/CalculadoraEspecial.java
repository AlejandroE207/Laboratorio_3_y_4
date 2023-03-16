
package laboratorio4_polimorfismo;

public class CalculadoraEspecial implements ICalculadora{

    @Override
    public double suma(double numero1, double numero2) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return (numero1+numero2)/2;}

    @Override
    public double resta(double numero1, double numero2) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return (numero1-numero2)/2;}

    @Override
    public double multiplicacion(double numero1, double numero2) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return (numero1*numero2)/2; }

    @Override
    public double division(double numero1, double numero2) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return (numero1/numero2)/2; }

    @Override
    public double raizCuad(double numero1) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return (Math.sqrt(numero1))/2; }
    
}
