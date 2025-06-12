/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025clase5.pkg2;

/**
 *
 * @author viti
 */
public class Carrera {
    
    private String  nombreCarrera;
    private int vueltas;
    private int distancia;
    private Moto moto1;
    private Moto moto2;
    private Moto moto3;
    private Moto moto4;

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Moto getMoto1() {
        return moto1;
    }

    public void setMoto1(Moto moto1) {
        this.moto1 = moto1;
    }

    public Moto getMoto2() {
        return moto2;
    }

    public void setMoto2(Moto moto2) {
        this.moto2 = moto2;
    }

    public Moto getMoto3() {
        return moto3;
    }

    public void setMoto3(Moto moto3) {
        this.moto3 = moto3;
    }

    public Moto getMoto4() {
        return moto4;
    }

    public void setMoto4(Moto moto4) {
        this.moto4 = moto4;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", vueltas=" + vueltas + ", distancia=" + distancia + ", moto1=" + moto1 + ", moto2=" + moto2 + ", moto3=" + moto3 + ", moto4=" + moto4 + '}';
    }
    
    
    
    
    
}
