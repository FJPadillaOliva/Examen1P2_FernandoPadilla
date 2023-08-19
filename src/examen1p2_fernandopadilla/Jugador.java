
package examen1p2_fernandopadilla;


public abstract class Jugador {
    private String nombre;
    private int edad;
    private String nacionalidad;
    private String PieH;
    private int rating;
    private Equipo equipo;
    private int agarre;
    private int lanzamiento;
    private int fisico;
    private int ritmo;
    private int entrada;
    private int vision;
    private int passing;
    private int regate;
    private int disparo;

    public Jugador() {
    }
    
    
    public Jugador(String nombre, int edad, String nacionalidad, String PieH, Equipo equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.PieH = PieH;
        this.rating = 0;
        this.equipo = equipo;
        this.agarre = 0;
        this.lanzamiento = 0;
        this.fisico = 0;
        this.ritmo = 0;
        this.entrada = 0;
        this.vision = 0;
        this.passing = 0;
        this.regate = 0;
        this.disparo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPieH() {
        return PieH;
    }

    public void setPieH(String PieH) {
        this.PieH = PieH;
    }

    public int getRating() {
        return rating;
    }

    protected void setRating(int rating) {
        this.rating = rating;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public void setAgarre(int agarre) {
        this.agarre = agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getFisico() {
        return fisico;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setDisparo(int disparo) {
        this.disparo = disparo;
    }
    
    public abstract void setAtributos();

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
