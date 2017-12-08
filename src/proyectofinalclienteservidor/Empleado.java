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
public class Empleado extends Persona { //El usuario empleado servirá para recepcion, cajero y entrenador

    String password; //Usado para loggearse al sistema
    Double salario;

    public Empleado(String name, int age, int nivelDeUsuario, int id) {
        super(name, age, nivelDeUsuario, id);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getSalario() {
        return salario;
    }

}
