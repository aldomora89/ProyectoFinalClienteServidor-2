/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

/**
 *
 * @author ADNDC\jcortes
 */
public class Ejercicios {
    
    private double pesos; //En kilogramos, 0 si es cardio
    private int numeroDeMaquina; 
    private String nombreDeEjercicio; 
    private String categoría; //Cardio, peso, funcional, etc. 

    public Ejercicios(double pesos, int numeroDeMaquina, String nombreDeEjercicio, String categoría) {
        this.pesos = pesos;
        this.numeroDeMaquina = numeroDeMaquina;
        this.nombreDeEjercicio = nombreDeEjercicio;
        this.categoría = categoría;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public int getNumeroDeMaquina() {
        return numeroDeMaquina;
    }

    public void setNumeroDeMaquina(int numeroDeMaquina) {
        this.numeroDeMaquina = numeroDeMaquina;
    }

    public String getNombreDeEjercicio() {
        return nombreDeEjercicio;
    }

    public void setNombreDeEjercicio(String nombreDeEjercicio) {
        this.nombreDeEjercicio = nombreDeEjercicio;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    
    
    
    
    
}
