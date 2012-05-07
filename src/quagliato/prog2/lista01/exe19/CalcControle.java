package quagliato.prog2.lista01.exe19;

/**
 *
 * @author eduardo
 */
public class CalcControle {

    private CalcInterface calcInterface;
    private CalcDados calcDados;

    public void executar() {
        if (calcInterface == null) {
            calcInterface = new CalcInterface();
        }

        if (calcDados == null) {
            calcDados = new CalcDados();
        }

        double resultado = 0;

        calcDados.setOperando(CalcDados.PRIMEIRO_OPERANDO, calcInterface.recebeOperando(CalcDados.PRIMEIRO_OPERANDO));

        while (true) {
            calcDados.setOperando(CalcDados.SEGUNDO_OPERANDO, calcInterface.recebeOperando(CalcDados.SEGUNDO_OPERANDO));

            calcDados.setOperador(calcInterface.recebeOperador());
            if (calcDados.getOperador() == 'S') {
                System.exit(0);
            }

            resultado = opera(calcDados.getOperando(CalcDados.PRIMEIRO_OPERANDO),
                    calcDados.getOperando(CalcDados.SEGUNDO_OPERANDO),
                    calcDados.getOperador());
            System.out.println("resultado: " + resultado);
            calcDados.setOperando(CalcDados.PRIMEIRO_OPERANDO, resultado);
        }
    }

    private double opera(double vl1, double vl2, char op) {
        //TODO: Pergunta pro Robson 'Por que não passar uma instância de CalcDados?'                                                            
        double resultado = 0;

        switch (op) {
            case CalcDados.ADICAO:
                resultado = vl1 + vl2;
                break;
            case CalcDados.DIVISAO:
                resultado = vl1 / vl2;
                break;
            case CalcDados.MULTIPLICACAO:
                resultado = vl1 * vl2;
                break;
            case CalcDados.SUBTRACAO:
                resultado = vl1 - vl2;
                break;
        }

        return resultado;
    }
}
