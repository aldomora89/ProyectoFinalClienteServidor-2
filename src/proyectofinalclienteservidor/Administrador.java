/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import javax.swing.JOptionPane;

/**
 *
 * @author ADNDC\jcortes
 */
public class Administrador extends Persona {
    
    public Administrador(String name, String password, int age, NivelDePermisos nivel, int id) {
        super(name, password, age, NivelDePermisos.Administrador, id);
    }
 
    

}
