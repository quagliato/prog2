package quagliato.prog2.lista01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import quagliato.prog2.interfaces.Exercicio;
import quagliato.prog2.lista01.exe01.ExTesteHorario;
import quagliato.prog2.lista01.exe03.ExTestadorDeCaixa;
import quagliato.prog2.lista01.exe07.ExTesteCarro;
import quagliato.prog2.lista01.exe09.ExTesteColaborador;
import quagliato.prog2.lista01.exe14.ExTesteEmail;
import quagliato.prog2.lista01.exe17.Principal17;
import quagliato.prog2.lista01.exe19.Principal19;
import quagliato.prog2.lista01.exe22.Principal22;
import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class Main {

    public static void main(String args[]) {

        /*
         * Instancia um Map onde a chave é o número do exerício e a classe
         * é o valor utilizado na execução
         */
        Map<Integer, Class> exercicios = new HashMap<Integer, Class>();
        exercicios.put(1, ExTesteHorario.class);
        exercicios.put(3, ExTestadorDeCaixa.class);
        exercicios.put(7, ExTesteCarro.class);
        exercicios.put(9, ExTesteColaborador.class);
        exercicios.put(14, ExTesteEmail.class);
        exercicios.put(17, Principal17.class);
        exercicios.put(19, Principal19.class);
        exercicios.put(22, Principal22.class);

        boolean exit = false; // declara e inicia um boolean pra tratar o fim

        while (!exit) {
            System.out.print("Escolha o exercicio da lista 1 (0 para sair): ");
            Scanner s = new Scanner(System.in);
            int a = s.nextInt(); // recebe o valor

            if (a == 0) { // se for 0, ele encerra o programa
                exit = true;
            } else {
                if (exercicios.containsKey(a)) { // se o map conter a chave
                    try {
                        /*
                         * Faz o cast para a interface Exercicio e executa
                         * o método execute();
                         */
                        ((Exercicio) exercicios.get(a).newInstance()).execute();
                    } catch (InstantiationException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else { // se o map não conter a chave, mostra a mensagem
                    System.out.println("Exercício ainda não realizado.");
                }

            }

            System.out.println(StringUtils.repeat('+', 80));

        }
    }
}
