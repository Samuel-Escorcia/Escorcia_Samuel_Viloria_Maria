/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author sescorciaj
 */
public abstract class Usuario {
    protected String celular;
     protected boolean covid;

    public Usuario(String celular, boolean covid) {
        this.celular = celular;
        this.covid = covid;
    }
    protected void getRegistro(Registro reg){
    
    }
}
