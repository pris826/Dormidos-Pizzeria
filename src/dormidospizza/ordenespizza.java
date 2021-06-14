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
public class ordenespizza {
    
    String Descripcion, Numero, Sucursal, pizza;
    

    public ordenespizza(String Descripcion, String Numero, String Sucursal, String pizza) {
        this.Descripcion = Descripcion;
        this.Numero = Numero;
        this.Sucursal = Sucursal;
        this.pizza = pizza;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    
}
