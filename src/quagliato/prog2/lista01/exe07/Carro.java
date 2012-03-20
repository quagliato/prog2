/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagliato.prog2.lista01.exe07;

/**
 *
 * @author eduardo
 */
public class Carro {
    
    private int combustivel;
    private int capacidadeMaxima;
    private int mediaConsumo;

    public Carro(int mediaConsumo, int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.mediaConsumo = mediaConsumo;
        this.combustivel = 0;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public boolean andar(int km) {
        int consumido = km/this.mediaConsumo;
        if ((consumido) > this.combustivel) {
            return false;
        }
        this.combustivel = consumido;
        return true;
    }
    
    public boolean abastecer(int litros) {
        if (litros < (this.capacidadeMaxima + this.combustivel)) {
            this.combustivel=+ litros;
            return true;
        }
        return false;
    }
    
    
    
    
   
    
}
