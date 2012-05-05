package quagliato.prog2.lista01.exe07;

/**
 *
 * @author eduardo
 */
public class Carro {
    
    protected int combustivel;
    protected int capacidadeMaxima;
    protected int mediaConsumo;

    public Carro(int mediaConsumo, int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.mediaConsumo = mediaConsumo;
        this.combustivel = 0;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public boolean andar(int km) {
        int consumido = km/this.mediaConsumo;
        if (consumido > this.combustivel) 
            return false;
        this.combustivel =- consumido;
        return true;
    }
    
    public boolean abastecer(int litros) {
        if (litros <= (this.capacidadeMaxima - this.combustivel)) {
            this.combustivel =+ litros;
            return true;
        }
        return false;
    }   
}