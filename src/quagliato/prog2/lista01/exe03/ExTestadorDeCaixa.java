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

        List<Caixa> listCaixa = new ArrayList<Caixa>();
        listCaixa.add(new Caixa(1));
        listCaixa.add(new Caixa(2));

        Scanner s = new Scanner(System.in);

        for (Caixa cx : listCaixa) {

            System.out.println("Caixa " + cx.getCaixaID());
            System.out.print("Largura     : ");
            cx.setLargura(s.nextDouble());
            System.out.print("Altura      : ");
            cx.setAltura(s.nextDouble());
            System.out.print("Profundidade: ");
            cx.setProfundidade(s.nextDouble());
            System.out.println();

        }

        System.out.println(StringUtils.repeat('-', 80));


        for (Caixa cx : listCaixa) {
            System.out.println("Caixa " + cx.getCaixaID());
            System.out.println("Area Externa: " + cx.calculaAreaExt());
            System.out.println("Volume      : " + cx.calculaVolume());
            System.out.println();
        }
    }
}
