package ejerciciofinal;

/**
 *
 * @author ediso
 */
public class Equipo {

    private String nombre;
    private int num_jugadores;
    private String ciudad;

    public String ObtenerNombre() {
        return nombre;
    }

    public int ObtenerNum_jugadores() {
        return num_jugadores;
    }

    public String ObtenerCiudad() {
        return ciudad;
    }

    public void AgregarNombre(String x) {
        nombre = x;
    }

    public void AgregarNum_jugadores(int y) {
        num_jugadores = y;
    }

    public void AgregarCiudad(String z) {
        ciudad = z;
    }
    
    
 
   

    public Equipo(String x) {
        nombre = x;
    }
    public Equipo(){
        nombre = "Liga de Quito";
        num_jugadores= 14;
        ciudad="Quito";
    }

    public Equipo(String x, int y) {
        nombre = x;
        num_jugadores = y;
    }
    public Equipo(String x, int y, String z){
        nombre = x;
        num_jugadores= y;
        ciudad= z;
    }
    
    
    
    
 
    

    }


