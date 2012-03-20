package quagliato.prog2.lista01.exe01;

/**
 *
 * @author eduardo
 */
public class Horario {

    private int hora;
    private int min;

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMin(int min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
            return true;
        }
        return false;
    }
}
