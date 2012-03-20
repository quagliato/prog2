package quagliato.prog2.lista01.exe07;

/**
 *
 * @author eduardo
 */
public class CarroEsporte extends Carro {

    private int tamanhoSpoiler;
    private int numeroAdesivos;
    private int potenciaExtraTurbo;

    public CarroEsporte(int mediaConsumo, int capacidadeMaxima) {
        super(mediaConsumo, capacidadeMaxima);
    }

    @Override
    public boolean andar(int km) {
        int consumido = km / (this.mediaConsumo / 2);
        if (consumido > this.combustivel) {
            return false;
        }
        this.combustivel -= consumido;
        return true;
    }
    
    public boolean acelerar() {
        if (this.combustivel >= 1) {
            this.combustivel--;
            return true;
        }
        return false;
    }
}