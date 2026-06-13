/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import data.GestordeDatos;
import java.util.ArrayList;
import model.Tours;

/**
 * Clase principal del proyecto LlanquihueTourApp, cuyas funciones son las siguientes:
 * 1) Inicializar el programa
 * 2) Instanciar el objeto "gestor"
 * 3) Cargar un ArrayList del tipo "Tours", con los datos guardados en tours.txt
 * 4) Imprimir el listado total de tours y el resultado de filtro por tipo de tour "Gastronomico"
 * 
 * @author Francisco
 */
public class LlanquihueTourApp {


    public static void main(String[] args) {
       
        //Ruta del archivo de texto
        String rutaArchivo = "resources/tours.txt";
        
        //Creacion del objeto "gestor" de la clase "GestordeDatos"
        GestordeDatos gestor = new GestordeDatos();
        
        //Creacion de lista de tours a partir de archivo tours.txt
        ArrayList<Tours> tours = gestor.cargarTours(rutaArchivo);
        
        // Ahora se imprime el listado total de todos los tours disponibles en la empresa.
        System.out.println("=== LISTADO COMPLETO DE TOURS DISPONIBLES ===");
        
        for(Tours tour:tours){
            System.out.println(tour);
        }
        
        //Se filtra e imprimen solo tours gastronómicos
        System.out.println("\n=== OPCIONES GASTRONOMICAS ===");
        
        for(Tours tour:tours){
            if(tour.getTipoDeTour().contains("Gastronomico")){
                System.out.println(tour);
            }
        }
        
        //Se filtran e imprimen los tours que cuesten menos de $150.000.-
        
        System.out.println("\n=== OPCIONES DE TOURS POR MENOS DE $150.000.- ===");
        for(Tours tour:tours){
            if((tour.getPrecio()) < 150000){
                System.out.println(tour);
            }
        }
    }

}
