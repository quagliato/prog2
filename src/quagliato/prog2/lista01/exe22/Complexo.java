package quagliato.prog2.lista01.exe22;

/**
 *
 * @author eduardo
 */
public class Complexo {

    protected double real;
    private double img;

    public Complexo(double real, double img) {
        this.real = real;
        this.img = img;
    }
    
    public double modulo() {
        return Math.sqrt((this.img * this.img) + (this.real * this.real));
    }

    public double angulo() {
        double angulo;
        angulo = Math.toDegrees(Math.atan(this.img/this.real));
        
        if (this.real < 0)
            if (this.img < 0)
                return 180 + angulo;
            else
                return 180 - angulo;
        else if (this.img >= 0)
            return angulo;
        return 360 - angulo;  
    }
}
