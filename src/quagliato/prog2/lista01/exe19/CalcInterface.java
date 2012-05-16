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

    /*
     * Método que recebe os operandos
     */
    public double recebeOperando(int i) {
        inicializaCalcDados(); // inicializa a CalcDados

        if (i != CalcDados.PRIMEIRO_OPERANDO
                && i != CalcDados.SEGUNDO_OPERANDO) { // verifica ser não vários
            return 3550; //TODO: Criar exception
        }

        double valor;
        System.out.print("valor: "); 
        valor = s.nextDouble(); //recebe o valor

        return valor;
    }

    private void inicializaCalcDados() {
        if (this.dados == null) { // se dados for nulo
            this.dados = new CalcDados(); // cria novo CalcDados
        }
    }

    public char recebeOperador() {
        inicializaCalcDados();

        char op = 0;
        while (!CalcDados.operadorValido(op)) { // valida o operador
            System.out.print("operacao: ");
            op = s.next().toUpperCase().charAt(0); // recebe o operador
        }

        return op;
    }

    public void mostraResultado(double res) {
        System.out.println("resultado: " + res);
    }
}
