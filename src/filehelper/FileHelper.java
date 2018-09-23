/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehelper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian Vanegas
 */
public class FileHelper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File();
        ArrayList lines  = file.File("Bicicletas.txt");
        //String[] bici = new String[4];
        for(Object line : lines){
            //String[] bici = line.split("\\|");
            System.out.println(line);
        }
        
        /*File file = new File();
        ArrayList estaciones  = file.File("Estaciones.txt");
        
        
        for(Object estacion : estaciones){
            System.out.println(estacion);
        }*/
        
        /*int reply = JOptionPane.showConfirmDialog(null, "Deseas ingresar una nueva bicicleta?", "Crear Bicicleta", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            String codigo = JOptionPane.showInputDialog("Escribe el codigo de la bicicleta: ");
            String color = JOptionPane.showInputDialog("Escribe el color de la bicicleta: ");
            String tipoBicicleta = JOptionPane.showInputDialog("Escribe el tipo de la bicicleta: ");
            String estado = JOptionPane.showInputDialog("Escribe el estado de la bicicleta: ");
            
            Bicicleta b = new Bicicleta(codigo, color, tipoBicicleta, estado);
            bicicletas.add(b);
       
            FileOutputStream fout = new FileOutputStream("Bicicletas.txt");
            
            for(Object bici : bicicletas){
                fout.write(bici.toString().getBytes());
                fout.write('\n');
                //System.out.println(bici);
            }
            
            /*for(Object bicicleta : bicicletas){
                bicicleta.write(b.toString().getBytes());
                fout.write('\n');

                System.out.println(prsn.toString());
            }
            
            
            Person newP = new Person(Integer.parseInt(_age), nombre, ciudad);
            list.add(newP);
            JOptionPane.showMessageDialog(null, "Persona registrada con éxito!");*/
        /*}*/

        
        
    }
    
}
