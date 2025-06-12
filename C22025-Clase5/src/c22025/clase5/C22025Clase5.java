/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad u1 = new Universidad();
        u1.nombreU="Fidelitas"; // Se puede ver pq es publico
        //u1.codigoU="Esto da error pq la variable privada"; 
        //u1.publicidad(2);
        
        Carrera carrera = new Carrera();
        carrera.setNombreCarrera("Ingenieria en Info");
        carrera.setBachillerato(true);
        carrera.setDiplomado(true);
        carrera.setDoctorado(false);
        carrera.setMasteria(false);
        carrera.setLicenciatural(true);
        
        JOptionPane.showMessageDialog(null, "El costo de la carrera es "+carrera.costoCarrera());
        carrera.setCostoCredito(150000);
        carrera.setCreditosCarrera(60);
        
        JOptionPane.showMessageDialog(null, "El costo de la carrera es "+carrera.costoCarrera());
        
        otroEjemploDeCarrera();
        metodo();

        
    }
    
    public static void otroEjemploDeCarrera(){
        Carrera carrera = new Carrera();
        carrera.setNombreCarrera("Topografia");
        carrera.setBachillerato(true);
        carrera.setDiplomado(true);
        carrera.setDoctorado(false);
        carrera.setMasteria(false);
        carrera.setLicenciatural(false);
        carrera.setCostoCredito(50000);
        carrera.setCreditosCarrera(40);
        
        JOptionPane.showMessageDialog(null, "La carrera " + carrera.getNombreCarrera() + "\n" +
                "El costo de la carrera es "+carrera.costoCarrera());

    }
    
    public void metodoSinStaticClaseMain(){
        JOptionPane.showMessageDialog(null, "La asdsaddsaddasads "   );
                 
    }
    
    
    public static void metodo(){
        JOptionPane.showMessageDialog(null, "Se ejecuta de ultimo");
    
    }
    
    
}
