package quagliato.prog2.lista01.exe17;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.text.NumberFormatter;
import quagliato.prog2.interfaces.Exercicio;
import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class Principal implements Exercicio {

    @Override
    public void execute() {

        ListaDeCompras lista = new ListaDeCompras();

        Item item1 = new Item("Sabonete", 1.26, 2);
        Item item2 = new Item("Shampoo", 4.20, 2);
        Item item3 = new Item("Brooklin Monster Ale", 9.40, 6);
        Item item4 = new Item("Chocolate Nestlé Meio Amargo", 3.86, 2);

        lista.adicionarItem(item1);
        lista.adicionarItem(item2);
        lista.adicionarItem(item3);
        lista.adicionarItem(item4);

        Principal.imprimirLista(lista);

    }

    private static void imprimirLista(ListaDeCompras listaDeCompras) {
        NumberFormat numberFormatter = new DecimalFormat();
        numberFormatter.setMaximumFractionDigits(2);
        numberFormatter.setMinimumFractionDigits(2);

        System.out.println(StringUtils.repeat('-', 80));
        System.out.println('|' + StringUtils.fillWithSpaces("NOME", 50, StringUtils.RIGHT)
                + "|VALOR UNITARIO"
                + "|" + StringUtils.fillWithSpaces("QTDE", 12, StringUtils.LEFT) + "|");
        System.out.println(StringUtils.repeat('-', 80));

        for (Item item : listaDeCompras.getListItem()) {
            System.out.println("|" + StringUtils.fillWithSpaces(item.getNome(), 50, StringUtils.RIGHT)
                    + "|" + StringUtils.fillWithSpaces(numberFormatter.format(item.getVlUnitario()), 14, StringUtils.LEFT)
                    + "|" + StringUtils.fillWithSpaces(String.valueOf(item.getQtde()), 12, StringUtils.LEFT) + "|");

        }
        System.out.println(StringUtils.repeat('-', 80));
        System.out.println("|VALOR TOTAL: R$ "
                + StringUtils.fillWithSpaces(numberFormatter.format(listaDeCompras.getValorTotal()), 62, StringUtils.RIGHT) + "|");
        System.out.println(StringUtils.repeat('-', 80));

    }
}
