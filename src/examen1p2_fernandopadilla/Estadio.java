
package examen1p2_fernandopadilla;


public class Estadio {
    private String nombre;
    private String ciudad;
    private int capacidad;
    private Equipo equipoP;

    public Estadio() {
    }

    public Estadio(String nombre, String ciudad, int capacidad, Equipo equipoP) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.equipoP = equipoP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Equipo getEquipoP() {
        return equipoP;
    }

    public void setEquipoP(Equipo equipoP) {
        this.equipoP = equipoP;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
}
