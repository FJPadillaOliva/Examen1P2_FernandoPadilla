
package examen1p2_fernandopadilla;

import java.util.ArrayList;


public class Equipo {

    private String nombre;
    private String pais;
    private int rating;
    private ArrayList<Jugador> plantilla = new ArrayList();

    public Equipo() {
    }

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.rating = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }
    
    
}
