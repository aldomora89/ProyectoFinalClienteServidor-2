/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import GUI.LogIn;

/**
 *
 * @author ADNDC\jcortes
 */
public class ProyectoFinalClienteServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LogIn login = new LogIn();
        
        Administrador juanca = new Administrador("JuanCa","..!..", 23, NivelDePermisos.Administrador, 115790553);
        Empleado erick = new Empleado("Erick", "epass", 22, NivelDePermisos.Empleado, 0, 1555.0);
        Empleado Chris = new Empleado("Chris","123456", 25, NivelDePermisos.Empleado, 18023092,0.0);
        Cliente David = new Cliente("David",40,"123456", NivelDePermisos.Cliente, 401020102, 12, Tarifas.Nacional);
        
        Utils.users.add(erick);
        Utils.users.add(juanca);
        Utils.users.add(Chris);
        Utils.users.add(David);
        
        login.setVisible(true);
       
        
    }

    
}
