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
    private String password;
    private int age; 
//    private int nivelDeUsuario; //Generamos un identificador para los accesos de usuario. El usuario nivel 0 es el administrador. Puede modificar atributos, tarifas, ingresar usuarios, 
//    //eliminar usuarios y demás funcionalidades. El usuario nivel 1 puede realizar todas las funciones de ingreso de datos, menos modificaciones y eliminaciones, el usuario nivel 2 solo tiene modo vista.
    private NivelDePermisos nivel;
    private String id; 

    public Persona(String name, String password, int age, NivelDePermisos nivel, String id) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.nivel = nivel;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public NivelDePermisos getNivel() {
        return nivel;
    }

    public void setNivel(NivelDePermisos nivel) {
        this.nivel = nivel;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "**** Name: " + name + ", age: " + age + ", id: " + id+"*****";
    }
    
    
    
    
}
