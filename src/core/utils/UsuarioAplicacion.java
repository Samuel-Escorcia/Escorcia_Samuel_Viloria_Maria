/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author sescorciaj
 */
public class UsuarioAplicacion extends Usuario{
    private String nombre;
    private String cedula;
    private String direccion;
    private ArrayList<Registro> historial = new ArrayList<>();

    public UsuarioAplicacion(String celular, boolean covid, String nombre, String cedula, String direccion) {
        super(celular, covid);
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    
    public void getRegistro(Registro tem){
        historial.add(tem);
    }

    public ArrayList<Registro> getHistorial() {
        return historial;
    }
    
}
