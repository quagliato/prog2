package quagliato.prog2.lista01.exe17;

/**
 *
 * @author eduardo
 */
public class Item {

    private String nome;
    private double vlUnitario;
    private int qtde;

    public Item(String nome, double vlUnitario, int qtde) {
        this.nome = nome;
        this.vlUnitario = vlUnitario;
        this.qtde = qtde;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValorTotal() {
        return this.qtde * this.vlUnitario;
    }

    public int getQtde() {
        return qtde;
    }

    public double getVlUnitario() {
        return vlUnitario;
    }

}
