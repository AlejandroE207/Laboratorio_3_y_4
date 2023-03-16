/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Estudiante extends Persona{
    protected String carnet;
    protected double promedioNotas;
    protected int numeroMaterias;

    public Estudiante() {
    }
    
    public Estudiante(String carnet, double promedioNotas, int numeroMaterias, String nombre, String apellido, int edad, double peso) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.promedioNotas = promedioNotas;
        this.numeroMaterias = numeroMaterias;
    }

    
    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    public Estudiante ingresarDatosEtudiante(){
        Estudiante nuevoEstudiante = new Estudiante();
        String nombre = "";
        String apellido = "";
        int edad = 0;
        double peso = 0.0;
        String carnet = "";
        int numeroMaterias=0;
        double promedioNotas=0.0;
        double sumNotas=0.0;
        
        nombre = nuevoEstudiante.leerDatoTipoCadena("Digite el nombre del estudiante: ");
        apellido= nuevoEstudiante.leerDatoTipoCadena("Digite el apellido del estudiante: ");
        edad = nuevoEstudiante.leerDatoTipoEntero("Digite la edad del estudiante: ");
        peso = nuevoEstudiante.leerDatoTipoReal("Digite el peso del estudiante: ");
        carnet = nuevoEstudiante.leerDatoTipoCadena("Digite el codigo de carnet del estudiante: ");
        numeroMaterias = nuevoEstudiante.leerDatoTipoEntero("Digite la cantidad de materias: ");
        sumNotas = nuevoEstudiante.leerNotasEstudiante(numeroMaterias);
        promedioNotas=nuevoEstudiante.calcularPromedio(sumNotas, numeroMaterias);
        
        nuevoEstudiante.setNombre(nombre);
        nuevoEstudiante.setApellido(apellido);
        nuevoEstudiante.setEdad(edad);
        nuevoEstudiante.setPeso(peso);
        nuevoEstudiante.setCarnet(carnet);
        nuevoEstudiante.setNumeroMaterias(numeroMaterias);
        nuevoEstudiante.setPromedioNotas(promedioNotas);
        
        return(nuevoEstudiante);
    }
    
    public double leerNotasEstudiante(int numeroMaterias){
        double notas=0.0;
        for(int i=0;i<numeroMaterias;i++){
            notas+=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota de la materia #"+(i+1)+" :"));
        }
        return notas;
    }
    
    public double calcularPromedio(double notas,int numeroMaterias){
        double promedio=notas/numeroMaterias;
        return promedio;
    }
    
    public void imprimirReporteNotasEstudiante(){
        imprimirDatosPersona();
        JOptionPane.showMessageDialog(null, "El carnet del estudiante es: "+carnet);
        JOptionPane.showMessageDialog(null, "El numero de materias del estudiante es: "+numeroMaterias);
        JOptionPane.showMessageDialog(null, "El promedio del estudiante es: "+promedioNotas);
        
    }
}
