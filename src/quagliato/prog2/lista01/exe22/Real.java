package quagliato.prog2.lista01.exe22;

/**
 *
 * @author eduardo
 */
public class Real extends Complexo{

    public Real(double n) {
        super(n, 0);
    }
    
    public int sinal() {
        if (this.real >= 0)
            return 1;
        return 0;
    }
}
