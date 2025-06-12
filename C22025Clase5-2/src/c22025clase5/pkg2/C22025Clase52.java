/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025clase5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase52 {
    
    
    /**
     * Crear un programa que registre la informacion de una carrera de motos se 
     * debe imprimir la informacion de la carrera y de los participantes en la 
     * carrera solo participaran 4 motos 
     * 
     * 
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // registrar informcion de la carrera
        Carrera c1 = new Carrera();
        c1=registraCarrera(c1);
        JOptionPane.showConfirmDialog(null, c1.toString());
        
        /*
        // Ejemplo de otra instancia
        Carrera carrera = new Carrera();
        registraCarrera(carrera);
        JOptionPane.showConfirmDialog(null, carrera.toString());
        */
        registraMoto1(c1);
        registraMoto2(c1);
        registraMoto3(c1);
        registraMoto4(c1);
        
         JOptionPane.showConfirmDialog(null, c1.toString());
        
    }
    
    public static Carrera registraCarrera(Carrera carrera){
        carrera.setNombreCarrera(JOptionPane.showInputDialog("Digite el nombre de la carrera"));
        carrera.setVueltas(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de vueltas")));
        return carrera;
    }
    
    public static void registraMoto1(Carrera carrera){
        Moto moto = new Moto();
        moto.setNombreCoductor(JOptionPane.showInputDialog("Digite el nombre del conductor"));
        moto.setCc(JOptionPane.showInputDialog("Digite el cc"));
        carrera.setMoto1(moto);
    }
    
     public static void registraMoto2(Carrera carrera){
        Moto moto = new Moto();
        moto.setNombreCoductor(JOptionPane.showInputDialog("Digite el nombre del conductor"));
        moto.setCc(JOptionPane.showInputDialog("Digite el cc"));
        carrera.setMoto2(moto);
    }
     
    public static void registraMoto3(Carrera carrera){
        Moto moto = new Moto();
        moto.setNombreCoductor(JOptionPane.showInputDialog("Digite el nombre del conductor"));
        moto.setCc(JOptionPane.showInputDialog("Digite el cc"));
        carrera.setMoto3(moto);
    }
    
    public static void registraMoto4(Carrera carrera){
        Moto moto = new Moto();
        moto.setNombreCoductor(JOptionPane.showInputDialog("Digite el nombre del conductor"));
        moto.setCc(JOptionPane.showInputDialog("Digite el cc"));
        carrera.setMoto4(moto);
    }
    
    
    
    
}
