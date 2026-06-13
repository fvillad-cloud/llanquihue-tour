/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase Tours sirve para representar los servicios de tours entregados por la empresa Llanquihue Tours.
 * Consta de 5 atributos que describen lo escencial de cada paquete de tours. Imprime la informacion 
 * completa de un tour por medio de toString().
 * 
 */

public class Tours {
    private int id;
    private String nombreDeTour;
    private String tipoDeTour;
    private String transporte;
    private int precio;

    /**
     * 
     * @param id, representa el numero identificador de cada tour.
     * @param nombreDeTour, representa el nombre del tour, entrega informacion sobre de que trata el respectivo tour.
     * @param tipoDeTour, representa el tipo de tour el cual puede ser de tipo Aventura, Gastronomico, Cultural, etc.
     * @param transporte, representa el medio de transporte que se utilizará para realizar el tour.
     * @param precio, representa el costo monetario por persona de cada tour.
     */
    public Tours(int id, String nombreDeTour, String tipoDeTour, String transporte, int precio) {
        this.id = id;
        this.nombreDeTour = nombreDeTour;
        this.tipoDeTour = tipoDeTour;
        this.transporte = transporte;
        this.precio = precio;
    }

    /**
     * 
     * Get's and Set's de cada atributo...
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDeTour() {
        return nombreDeTour;
    }

    public void setNombreDeTour(String nombreDeTour) {
        this.nombreDeTour = nombreDeTour;
    }

    public String getTipoDeTour() {
        return tipoDeTour;
    }

    public void setTipoDeTour(String tipoDeTour) {
        this.tipoDeTour = tipoDeTour;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    //metodo toString para imprimir ordenadamente la informacion completa de un tour.
    @Override
    public String toString(){
        return "\n=== Datos del Tour ===\n"+
               "ID              : "+id+
               "\nNombre del Tour : "+nombreDeTour+
               "\nTipo de Tour    : "+tipoDeTour+
               "\nTransporte      : "+transporte+
               "\nPrecio x persona: "+precio;
    }
    
}
