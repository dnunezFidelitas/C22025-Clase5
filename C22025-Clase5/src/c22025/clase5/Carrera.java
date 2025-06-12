/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.clase5;

/**
 *
 * @author viti
 */
public class Carrera {
    private String nombreCarrera;
    private int creditosCarrera;
    private boolean diplomado;
    private boolean bachillerato;
    private boolean licenciatural;
    private boolean masteria;
    private boolean doctorado;
    private double costoCredito;
    
    
    public double costoCarrera(){
        return costoCredito*creditosCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getCreditosCarrera() {
        return creditosCarrera;
    }

    public void setCreditosCarrera(int creditosCarrera) {
        this.creditosCarrera = creditosCarrera;
    }

    public boolean isDiplomado() {
        return diplomado;
    }

    public void setDiplomado(boolean diplomado) {
        this.diplomado = diplomado;
    }

    public boolean isBachillerato() {
        return bachillerato;
    }

    public void setBachillerato(boolean bachillerato) {
        this.bachillerato = bachillerato;
    }

    public boolean isLicenciatural() {
        return licenciatural;
    }

    public void setLicenciatural(boolean licenciatural) {
        this.licenciatural = licenciatural;
    }

    public boolean isMasteria() {
        return masteria;
    }

    public void setMasteria(boolean masteria) {
        this.masteria = masteria;
    }

    public boolean isDoctorado() {
        return doctorado;
    }

    public void setDoctorado(boolean doctorado) {
        this.doctorado = doctorado;
    }

    public double getCostoCredito() {
        return costoCredito;
    }

    public void setCostoCredito(double costoCredito) {
        this.costoCredito = costoCredito;
    }
    
    
}
