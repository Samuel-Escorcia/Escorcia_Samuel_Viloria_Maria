/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author sescorciaj
 */
public class PuntoInteres {
    private String nombre, tipo;
    private float latitud, longitud,rango;
    private ArrayList<LocalDateTime> fechas = new ArrayList<>();
    private ArrayList<ArrayList<Usuario>> usuarios = new ArrayList<>();

    public PuntoInteres(String nombre, String tipo, float latitud, float longitud, float rango) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.rango = rango;
    }

    public void updateUsuariosCercanos(ArrayList<Usuario> usuarios, LocalDateTime of) {
    }
    
   
}
