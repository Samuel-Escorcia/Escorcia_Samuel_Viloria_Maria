/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;

/**
 *
 * @author sescorciaj
 */
public class RegistroAplicacion extends Registro{
    private float latitud;
    private float longitud;
        private Usuario usuario;

    public RegistroAplicacion(int latitud, int longitud, Usuario usuario, LocalDateTime fecha) {
        super(fecha);
        this.latitud = latitud;
        this.longitud = longitud;
        this.usuario = usuario;
    }
        
    
}
