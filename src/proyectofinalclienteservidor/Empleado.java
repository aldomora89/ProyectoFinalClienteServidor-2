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

    Double salario;

    public Empleado(String name, String password, int age, int nivelDeUsuario, int id, Double salario) {
        super(name, password, age, nivelDeUsuario, id);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    

}
