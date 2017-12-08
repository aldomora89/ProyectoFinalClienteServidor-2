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
public abstract class Persona {
    
    private String name; 
    private int age; 
    private int nivelDeUsuario; //Generamos un identificador para los accesos de usuario. El usuario nivel 0 es el administrador. Puede modificar atributos, tarifas, ingresar usuarios, 
    //eliminar usuarios y demás funcionalidades. El usuario nivel 1 puede realizar todas las funciones de ingreso de datos, menos modificaciones y eliminaciones, el usuario nivel 2 solo tiene modo vista.
    private int id; 

    public Persona(String name, int age, int nivelDeUsuario, int id) {
        this.name = name;
        this.age = age;
        this.nivelDeUsuario = nivelDeUsuario;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNivelDeUsuario() {
        return nivelDeUsuario;
    }

    public void setNivelDeUsuario(int nivelDeUsuario) {
        this.nivelDeUsuario = nivelDeUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "**** Name: " + name + ", age: " + age + ", id: " + id+"*****";
    }
    
    
    
    
}
