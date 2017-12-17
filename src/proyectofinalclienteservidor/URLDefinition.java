/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

/**
 *
 * @author ulacit
 */
public enum URLDefinition {

    Cliente("Cliente"), message("Message"), Inicio("Inicio"), NormalUser("NormalUser"), Rutina("Rutina"),
    Login("Login"), Empleado("Empleado");

    private String url;
    private String baseURL = "http://localhost:8080/ServidorRest/webresources/";

    private URLDefinition(final String url) {
        this.url = url;
    }

    public String getUrl() {
        return baseURL + url;
    }

}
