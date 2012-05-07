package quagliato.prog2.lista01.exe19;

/**
 *
 * @author eduardo
 */
public class CalcDados {

    public static final int PRIMEIRO_OPERANDO = 1;
    public static final int SEGUNDO_OPERANDO = 2;
    public static final char ADICAO = '+';
    public static final char SUBTRACAO = '-';
    public static final char MULTIPLICACAO = '*';
    public static final char DIVISAO = '/';
    private double operando[];
    private char operador;

    public void setOperando(int i, double valor) {
        if (this.operando == null) {
            this.operando = new double[2];
        }
        this.operando[i - 1] = valor;
    }

    public double getOperando(int i) {
        if (this.operando != null) {
            return operando[i - 1];
        }
        return 3550; //TODO: Criar exception
    }

    public void setOperador(char op) {
        if (CalcDados.operadorValido(op)) {
            this.operador = op;
        }

    }

    public char getOperador() {
        return this.operador;
    }

    public static boolean operadorValido(char op) {
        if (op != CalcDados.ADICAO
                && op != CalcDados.SUBTRACAO
                && op != CalcDados.MULTIPLICACAO
                && op != CalcDados.DIVISAO
                && op != 'S') {
            return false;
        }
        return true;
    }
}
