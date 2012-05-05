package quagliato.prog2.lista01.exe17;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class ListaDeCompras {
    
    private List<Item> listItem;
    
    public void adicionarItem(Item item) {
        if (this.listItem == null) 
            this.listItem = new ArrayList<Item>();
        
        this.listItem.add(item);
    }
    
    public void removerItem(Item item) {
        if (this.listItem != null) 
            this.listItem.remove(item);
    }
    
    public double getValorTotal() {
        double total = 0;
        
        for (Item item : this.listItem) {
            total += item.getValorTotal();
        }
        
        return total;
    }

    public List<Item> getListItem() {
        return listItem;
    }

}
