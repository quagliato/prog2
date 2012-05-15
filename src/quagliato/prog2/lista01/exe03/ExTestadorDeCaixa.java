package quagliato.prog2.lista01.exe03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import quagliato.prog2.interfaces.Exercicio;
import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class ExTestadorDeCaixa implements Exercicio {

    @Override
    public void execute() {

        List<Caixa> listCaixa = new ArrayList<Caixa>(); // instancia uma lista
        listCaixa.add(new Caixa(1)); // adiciona uma caixa na lista
        listCaixa.add(new Caixa(2)); // adiciona outra caixa na lista

        Scanner s = new Scanner(System.in);

        for (Caixa cx : listCaixa) { // itera lista de caixa
            System.out.println("Caixa " + cx.getCaixaID());
            
            /*
             * Recebo os valores para as 3 caixas
             */
            System.out.print("Largura........: ");
            cx.setLargura(s.nextDouble());
            
            System.out.print("Altura.........: ");
            cx.setAltura(s.nextDouble());
            
            System.out.print("Profundidade...: ");
            cx.setProfundidade(s.nextDouble());
            
            System.out.println();
        }

        System.out.println(StringUtils.repeat('-', 80));


        for (Caixa cx : listCaixa) { // itera a lista de caixas
            /*
             * Mostra os dados das caixas
             */
            System.out.println("Caixa " + cx.getCaixaID());
            System.out.println("Area Externa...: " + cx.calculaAreaExt());
            System.out.println("Volume.........: " + cx.calculaVolume());
            System.out.println();
        }
    }
}
