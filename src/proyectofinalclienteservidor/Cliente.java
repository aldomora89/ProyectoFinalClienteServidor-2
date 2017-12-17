/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalclienteservidor;

import java.util.ArrayList;

/**
 *
 * @author ADNDC\jcortes
 */
public class Cliente extends Persona {

    private int mesesEnElGym; //Agregamos un contador del tiempo de la persona en el gimnasio
    private Tarifas tarifa;
    private String fechaDePago; 

    public Cliente(String name, int age, String password, NivelDePermisos nivel, String id, int mesesEnElGym, String fechaDePago, Tarifas tarifa) { //Al inscribir un usuario, necesitamos nombre, edad, privilegio (por defecto)
        super(name, password, age, NivelDePermisos.Cliente, id);
        this.mesesEnElGym = mesesEnElGym;
        this.tarifa = tarifa;
        this.fechaDePago = fechaDePago;

    }

    public int getMesesEnElGym() {
        return mesesEnElGym;
    }

    public void setMesesEnElGym(int mesesEnElGym) {
        this.mesesEnElGym = mesesEnElGym;
    }

    public Tarifas getTarifa() {
        return tarifa;
    }

    public String getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(String fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    
    
}
