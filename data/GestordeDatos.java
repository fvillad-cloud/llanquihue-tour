/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Tours;

/**
 * Clase encargada de leer archivo de texto que será cargado en clase principal "LlanquihueTourApp", 
 * una vez leido el archivo procede a separar los datos mediante la funcion .split(";") y los almacena en un array tipo string,
 * finalmente todos estos datos son utilizados para crear un obtjeto de la clase Tours y que a su vez serán almacenados
 * en un ArrayList de tipo "Tour".
 */
public class GestordeDatos {
    
    //Metodo que recibe la ruta de un archivo y retorna un ArrayList tipo "Tours" o lista de tours.
    public ArrayList<Tours> cargarTours(String rutaArchivo){
       
        //Crea lista del tipo "Tours" en donde se almacenaran los distintos tours contenidos en el archivo tours.txt
        ArrayList<Tours> listadoTours = new ArrayList<>();
        
        try {
            //Se abre archivo tours.txt para su procesamiento.
            BufferedReader scan = new BufferedReader(new FileReader(rutaArchivo));
            //Variable donde se almacenará una linea de texto.
            String linea;
            //Lectura del archivo tours.txt linea por linea
            while((linea = scan.readLine())!=null){
                //Separacion de la linea utilizando como marcador punto y coma.
                String[] partes = linea.split(";");
                //se verifica que el array contenga 5 datos
                if(partes.length == 5){
                    //conversion y almacenamiento de los datos contenidos en una linea de texto.
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    String tipo = partes[2];
                    String transporte = partes[3];
                    int precio = Integer.parseInt(partes[4]);
                   
                    //Se crea objeto del tipo "Tours" con los parametros extraidos del archivo de texto.
                   Tours tour = new Tours(id, nombre, tipo, transporte, precio);
                   //Se añade el objeto creado tipo tour al listado de tours. 
                   listadoTours.add(tour);
                }
            }
            //Cierra el scan.
            scan.close();
            
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: "+e.getMessage());
        }
        //Se devuelve el listado de tours cargados a partir del arcivo de texto.
        return listadoTours;
    }
    
}
