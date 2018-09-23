/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehelper;

/**
 *
 * @author Brian Vanegas
 */
public class Estacion {
    String codigo;
    String descripcion;
    int cantidad;

    public Estacion(String codigo, String descripcion, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return this.codigo + " | " + this.descripcion + " | " + this.cantidad;
    }
}
