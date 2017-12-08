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
public enum Tarifas {
    
    //Se establecen tarifas 
    
    Estudiante("Estudiante",80), AdultoMayor("Adulto Mayor", 60), Parejas("Parejas",70), Nacional("Nacional",100), Extranjero("Extranjero",120);
    
    private final String name;
    private final double price; 
    
    private Tarifas(final String name, final double price)
    {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
    
}
