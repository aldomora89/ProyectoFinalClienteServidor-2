/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

/**
 *
 * @author Santiago
 */
public enum NivelDePermisos {
    
    Administrador("Administrador"), Empleado("Empleado"), Cliente("Cliente");
    
    private String name;
    
    private NivelDePermisos(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
}
