/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author JK Gzenna
 */

//Serializamos para evitar problemas de concurrencia
public class Categoria implements Serializable {
    
    //Propiedades o Atributos
    private int codigo;
    private String nombre;

    
    //Métodos Constructores    
    //Vacío
    public Categoria() {
        this.codigo = 0;
        this.nombre = "";
    }
    
    //Sobrecargado
    public Categoria(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Métodos Accesores Getter y Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
