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
public class Bicicleta {
    String codigo;
    String color;
    String tipoBicicleta;
    String estado;

    public Bicicleta(String codigo, String color, String tipoBicicleta, String estado) {
        this.codigo = codigo;
        this.color = color;
        this.tipoBicicleta = tipoBicicleta;
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return this.codigo + " | " + this.color + " | " + this.tipoBicicleta + " | " + this.estado;
    }
}
