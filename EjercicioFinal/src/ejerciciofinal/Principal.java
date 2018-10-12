/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal;

/**
 *
 * @author ediso
 */
public class Principal {

    public static void main(String[] args) {

        Equipo e = new Equipo();
        System.out.printf("Equipos:\nNombre: %s - Numero de jugadores: %s - Ciudad: %s\n", e.ObtenerNombre(), e.ObtenerNum_jugadores(), e.ObtenerCiudad());

        Equipo e2 = new Equipo("Liga de Loja");
        e2.AgregarCiudad("Loja");
        e2.AgregarNum_jugadores(20);
        System.out.printf("Nombre: %s - Numero de jugadores: %s - Ciudad: %s\n", e2.ObtenerNombre(), e2.ObtenerNum_jugadores(), e2.ObtenerCiudad());

        Equipo e3 = new Equipo("Emelec", 12);
        e3.AgregarCiudad("Guayaquil");
        e3.AgregarNum_jugadores(15);
        System.out.printf("Nombre: %s - Numero de jugadores: %s - Ciudad: %s\n", e3.ObtenerNombre(), e3.ObtenerNum_jugadores(), e3.ObtenerCiudad());

        Equipo e4 = new Equipo("Aucas", 10, "Quito");
        e4.AgregarCiudad("Quito");
        e4.AgregarNum_jugadores(0);
        System.out.printf("Nombre: %s - Numero de jugadores: %s - Ciudad: %s\n", e4.ObtenerNombre(), e4.ObtenerNum_jugadores(), e4.ObtenerCiudad());

    }

}
