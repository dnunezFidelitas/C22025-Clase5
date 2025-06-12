/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025clase5.pkg2;

/**
 *
 * @author viti
 */
public class Moto {
    private String marca;
    private String cc;
    private double peso;
    private String nombreCoductor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombreCoductor() {
        return nombreCoductor;
    }

    public void setNombreCoductor(String nombreCoductor) {
        this.nombreCoductor = nombreCoductor;
    }

    @Override
    public String toString() {
        return "\n Moto{" + "marca=" + marca + ", cc=" + cc + ", peso=" + peso + ", nombreCoductor=" + nombreCoductor + '}';
    }
    
    
}
