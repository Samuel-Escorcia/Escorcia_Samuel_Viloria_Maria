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
public class CovidTrack {

    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Registro> registros = new ArrayList<>();
    private ArrayList<Antena> antenas = new ArrayList<>();
    private ArrayList<PuntoInteres> puntosInteres = new ArrayList<>();

    public CovidTrack() {
    }

    public void addAntena(Antena antena) {
        antenas.add(antena);

    }

    public void addPuntoInteres(String hospital_General, String hospital, double d, double d0, double d1) {
        puntosInteres.add(new PuntoInteres(hospital_General, hospital, (float) d, (float) d0, (float) d1));
    }

    public void addUsuario(UsuarioOperador usuarioOperador) {
        usuarios.add(usuarioOperador);
    }

    public void addUsuario(UsuarioAplicacion usuarioOperador) {
        usuarios.add(usuarioOperador);
    }

    public Usuario getUsuario(int i) {
        return usuarios.get(i);
    }

    public Antena getAntena(int i) {
        return antenas.get(i);
    }

    public void addRegistro(Usuario usuario, Antena antena, LocalDateTime of) {
        registros.add(new RegistroOperador(usuario, antena, of));
    }

    public void addRegistro(Usuario usuario, double d, double d0, LocalDateTime of) {
        registros.add(new RegistroAplicacion(0, 0, usuario, of));
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void showResumenPuntosIntesesPorMes() {

        int i = 00;
        for (PuntoInteres punto : puntosInteres) {
            i++;
            System.out.println("Punto Interes: " + i);
            System.out.println(punto);
            System.out.println("Usuarios cercanos: ");
            int j = 0;
            for (ArrayList<Usuario> user : punto.getUsuarios()) {
                ArrayList<Usuario> infectados = new ArrayList<>();
                ArrayList<Usuario> sanos = new ArrayList<>();
                for (Usuario usuario : user) {
                    if (usuario.covid) {
                        infectados.add(usuario);
                    } else {
                        sanos.add(usuario);
                    }

                }
                int h = sanos.size() + infectados.size();
                System.out.println("- Cantidad de usuarios cercanos: ");
                System.out.println(punto.getFechas(j).getMonth() + ": " + h);
                System.out.println("- Cantidad de usuarios infectados: ");
                System.out.println(punto.getFechas(j).getMonth() + ": " + infectados.size());

                j++;

            }
        }
    }

    public PuntoInteres getPuntoInteres(int place) {
        return puntosInteres.get(place);
    }

}
