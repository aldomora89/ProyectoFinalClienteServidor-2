/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.util.ArrayList;

/**
 *
 * @author ADNDC\jcortes
 */
public class Utils {
    
   public ArrayList <Persona> users = new ArrayList<Persona>(); 
    
        Administrador juanca = new Administrador("JuanCa", 23, 0, 115790553);
        Empleado erick = new Empleado("Erick", 22, 1, 118907315);
        Empleado Chris = new Empleado("Chris", 25, 1, 18023092);
        Cliente David = new Cliente("David", 40, 2, 401020102, 12, Tarifas.Nacional);
        
    public void AgregarUsuario(){
        users.add(juanca);
        users.add(erick);
        users.add(Chris); 
        users.add(David); 
        
    }
    
    public void print(){
        System.out.println("Usuarios: "+ users.toString());
    }
    
}
