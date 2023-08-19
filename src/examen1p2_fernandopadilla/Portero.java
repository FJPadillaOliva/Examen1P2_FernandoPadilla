
package examen1p2_fernandopadilla;

import java.util.Random;


public class Portero extends Jugador{

    public Portero(String nombre, int edad, String nacionalidad, String PieH, Equipo equipo) {
        super(nombre, edad, nacionalidad, PieH, equipo);
        setAtributos();
        setRating();
    }

   
    public void setAtributos() {
        Random random = new Random();
        this.agarre = (1+random.nextInt(12))*12;
        this.lanzamiento = (1+random.nextInt(12))*12;
        this.passing = (1+random.nextInt(12))*12;
        this.fisico= (1+random.nextInt(5))*13;
        this.ritmo = (1+random.nextInt(5))*13;
        this.entrada= (1+random.nextInt(5))*13;
        this.vision= (1+random.nextInt(5))*13;
        this.regate = (1+random.nextInt(5))*13;
        this.disparo = (1+random.nextInt(5))*13;
    }

     public void setRating(){
        int r = (passing + agarre + lanzamiento) / 3;
        this.rating = r;
    }
    
    
}
