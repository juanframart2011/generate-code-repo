/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generate_code_obejct;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author francoj
 */
public class Generate_Code_Obejct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Un texto cualquiera guardado en una variable
        String saludo="Hola";

        try
        {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File archivo=new File("texto.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escribir=new FileWriter(archivo,true);

            //Escribimos en el archivo con el metodo write 
            escribir.write(saludo);

            //Cerramos la conexion
            escribir.close();
        }

        //Si existe un problema al escribir cae aqui
        catch(Exception e)
        {
            System.out.println("Error al escribir");
        }
    }
    
    public static void escribir(String arg[]){
        //Creamos un String que va a contener todo el texto del archivo
        String texto="";

        try
        {
            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader lector=new FileReader("texto_escrito.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((texto=contenido.readLine())!=null)
            {
                System.out.println(texto);
            }
        }

        //Si se causa un error al leer cae aqui
        catch(Exception e)
        {
            System.out.println("Error al leer");
        }
    }
}