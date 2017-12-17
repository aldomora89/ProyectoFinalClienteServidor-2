/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.util.Date;

/**
 *
 * @author Santiago
 */
public class ClientePOJO {
    private String name;
    private int age;
    private String id;
    private int mesesEnGym;
    private double precioMensual;
    private Date date;

    public ClientePOJO(String name, int age, String id, int mesesEnGym, double precioMensual, Date date) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.mesesEnGym = mesesEnGym;
        this.precioMensual = precioMensual;
        this.date = date;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMesesEnGym() {
        return mesesEnGym;
    }

    public void setMesesEnGym(int mesesEnGym) {
        this.mesesEnGym = mesesEnGym;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
    
}
