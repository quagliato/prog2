package quagliato.prog2.lista01.exe17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class ListaDeCompras {
    
    private List<Item> listItem;
    
    /*
     * Método que adiciona um item na lista
     */
    public void adicionarItem(Item item) {
        if (this.listItem == null) // se a lista for nula
            this.listItem = new ArrayList<Item>(); // cria uma nova lista
        
        this.listItem.add(item);
    }
    
    /*
     * Método que remove um item da lista
     */
    public void removerItem(Item item) {
        if (this.listItem != null)  // se a lista não for nula
            this.listItem.remove(item); // remove o item
    }
    
    
    /*
     * Método que calcula o valor total da lista
     */
    public double getValorTotal() {
        double total = 0;
        
        for (Item item : this.listItem) { // itera os itens da lista
            total += item.getValorTotal(); // soma o valor total deles
        }
        
        return total;
    }

    public List<Item> getListItem() {
        return listItem;
    }

}
