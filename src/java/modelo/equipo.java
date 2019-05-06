/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LabingI5
 */
public class equipo {
    
    private String nombre;
    private int marcador;

    public equipo(String nombre, int marcador) {
        this.nombre = nombre;
        this.marcador = marcador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMarcador() {
        return marcador;
    }

    public void setMarcador(int marcador) {
        this.marcador = marcador;
    }
    
    
}
