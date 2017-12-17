/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import com.google.gson.Gson;
import coolrest.CoolRestRequest;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Santiago
 */
public class CantidadDeUsuarios implements Runnable{
    
    private JLabel label;
    
    public CantidadDeUsuarios(JLabel label){
        this.label = label;
    }

    @Override
    public void run() {
        while(true){
            try {
                CoolRestRequest rest = new CoolRestRequest();
                String resultado = rest.getResource(URLDefinition.Info.getUrl());
                int numero = new Gson().fromJson(resultado, int.class);
                this.label.setText(String.valueOf(numero));
            } catch (InterruptedException ex) {
                Logger.getLogger(CantidadDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(CantidadDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
