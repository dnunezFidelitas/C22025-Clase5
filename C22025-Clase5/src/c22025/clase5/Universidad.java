/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase5;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Universidad {
    private String codigoU;
    public String nombreU;
    
    public void publicidad(int cantidad){
        codigoU="ACA547";
        for (int i = 0; i < cantidad; i++) {
            JOptionPane.showMessageDialog(null, "Esta es la publicadad numero "+ i 
                    + "\n codigoU + " + codigoU +"\n nombreU" +nombreU);
        }
    
    }
    
    
    // ejemplos de metodos con el mismo nombre
    
    public void metodo1(){
        System.out.println("nop hace nada");
    }
    /* esto da error pq no se puede tener dos metodos de nombre iguales
    public void metodo1(){
        System.out.println("nop hace nada");
    }*/
    
    
    //si puedo tener dos metodos con el mismo nombre pero con parametros diferentes
    public void metodo1(int parametro1){
        System.out.println("nop hace nada");
    }
    
    
}
