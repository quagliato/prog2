/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagliato.prog2.lista01;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import quagliato.prog2.exceptions.StringException;
import quagliato.prog2.lista01.exe03.ExTestadorDeCaixa;
import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class Main {

    public static void main(String args[]) {
        boolean exit = false;

        while (!exit) {
            System.out.print("Escolha o exercicio da lista 1 (0 para sair): ");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            switch (a) {
                case 0:
                    exit = true;
                    break;
                case 3:
                    (new ExTestadorDeCaixa()).execute();
                    break;
            }
            try {
                System.out.println(StringUtils.repeat('+', 80));
            } catch (StringException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}