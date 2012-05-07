package quagliato.prog2.lista01;

import java.util.Scanner;
import quagliato.prog2.lista01.exe01.ExTesteHorario;
import quagliato.prog2.lista01.exe03.ExTestadorDeCaixa;
import quagliato.prog2.lista01.exe07.ExTesteCarro;
import quagliato.prog2.lista01.exe09.ExTesteColaborador;
import quagliato.prog2.lista01.exe14.ExTesteEmail;
import quagliato.prog2.lista01.exe17.Principal17;
import quagliato.prog2.lista01.exe19.Principal19;
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
                case 1:
                    (new ExTesteHorario()).execute();
                    break;
                case 3:
                    (new ExTestadorDeCaixa()).execute();
                    break;
                case 7:
                    (new ExTesteCarro()).execute();
                    break;
                case 9:
                    (new ExTesteColaborador()).execute();
                    break;
                case 14:
                    (new ExTesteEmail()).execute();
                    break;
                case 17:
                    (new Principal17()).execute();
                    break;
                case 19:
                    (new Principal19()).execute();
                    break;
            }

            System.out.println(StringUtils.repeat('+', 80));

        }
    }
}
