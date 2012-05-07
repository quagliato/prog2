package quagliato.prog2.lista01.exe19;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class CalcInterface {

    private CalcDados dados;
    private Scanner s;

    public CalcInterface() {
        this.s = new Scanner(System.in);
    }

    public double recebeOperando(int i) {
        inicializaCalcDados();

        if (i != CalcDados.PRIMEIRO_OPERANDO
                && i != CalcDados.SEGUNDO_OPERANDO) {
            return 3550; //TODO: Criar exception
        }

        double valor;
        System.out.print("valor: ");
        valor = s.nextDouble();

        return valor;
    }

    private void inicializaCalcDados() {
        if (this.dados == null) {
            this.dados = new CalcDados();
        }
    }

    public char recebeOperador() {
        inicializaCalcDados();

        char op = 0;
        while (!CalcDados.operadorValido(op)) {
            System.out.print("operacao: ");
            op = s.next().toUpperCase().charAt(0);
        }

        return op;
    }

    public void mostraResultado(double res) {
        System.out.println("resultado: " + res);
    }
}
