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
    
        public static ArrayList <Persona> users = new ArrayList<Persona>(); 
    
    
    public void print(){
        System.out.println("Usuarios: "+ users.toString());
    }
    
}
