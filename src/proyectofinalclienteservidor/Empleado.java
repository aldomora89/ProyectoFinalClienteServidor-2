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

    double salario;

    public Empleado(String name, String password, int age, NivelDePermisos nivel, String id, double salario) {
        super(name, password, age, NivelDePermisos.Empleado, id);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    

}
