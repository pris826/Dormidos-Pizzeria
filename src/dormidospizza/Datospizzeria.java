/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormidospizza;

/**
 *
 * @author HP2021
 */
public class Datospizzeria {
    
    String Nombre,Precio,Descripciones;
    
    public Datospizzeria(  String Nombre, String Precio, String Descripciones) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Descripciones = Descripciones;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return Descripciones;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripciones = Descripcion;
    }
    
    
}

