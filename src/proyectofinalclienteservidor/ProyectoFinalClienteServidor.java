/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import GUI.LogIn;
import coolrest.CoolRestRequest;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author ADNDC\jcortes
 */
public class ProyectoFinalClienteServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        CoolRestRequest rest = new CoolRestRequest();
        String resultado = rest.getResource(URLDefinition.Inicio.getUrl());
        LogIn login = new LogIn();
        login.setVisible(true);
       
        
    }

    
}
