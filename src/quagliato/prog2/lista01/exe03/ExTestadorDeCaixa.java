/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagliato.prog2.lista01.exe03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import quagliato.prog2.exceptions.StringException;
import quagliato.prog2.interfaces.Exercicio;
import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class ExTestadorDeCaixa implements Exercicio {

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
        try {
            System.out.println(StringUtils.repeat('-', 80));
        } catch (StringException ex) {
            Logger.getLogger(ExTestadorDeCaixa.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Caixa cx : listCaixa) {
            System.out.println("Caixa " + cx.getCaixaID());
            System.out.println("Area Externa: " + cx.calculaAreaExt());
            System.out.println("Volume      : " + cx.calculaVolume());
            System.out.println();
        }
    }
}