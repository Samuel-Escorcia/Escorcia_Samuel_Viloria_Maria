/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author sescorciaj
 */
public class UsuarioOperador extends Usuario{
    private ArrayList<Registro> historial = new ArrayList<>();

    public UsuarioOperador(String celular, boolean covid) {
        super(celular, covid);
    }
    
    public void getRegistro(Registro tem){
        historial.add(tem);
    }

    public ArrayList<Registro> getHistorial() {
        return historial;
    }
    
    

}
