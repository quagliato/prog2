package quagliato.prog2.lista01.exe19;

/**
 *
 * @author eduardo
 */
public class CalcControle {

    private CalcInterface calcInterface;
    private CalcDados calcDados;

    public void executar() {
        /*
         * Verifica e instancia a CalcInterface e a CalcDados
         */
        if (calcInterface == null) {
            calcInterface = new CalcInterface();
        }

        if (calcDados == null) {
            calcDados = new CalcDados();
        }

        double resultado = 0;

        /*
         * Recebe o primeiro operando usando a CalcInterface e seta ele na
         * Calc Dados
         */
        calcDados.setOperando(CalcDados.PRIMEIRO_OPERANDO,
                              calcInterface.recebeOperando(CalcDados.PRIMEIRO_OPERANDO));

        /*
         * Loop para manter a calculadora funcionando
         */
        while (true) {
            /*
             * Recebe o segundo operando
             */
            calcDados.setOperando(CalcDados.SEGUNDO_OPERANDO,
                                  calcInterface.recebeOperando(CalcDados.SEGUNDO_OPERANDO));

            /*
             * Recebe o operador
             */
            calcDados.setOperador(calcInterface.recebeOperador());
            if (calcDados.getOperador() == 'S') { // se o operador por 'S'
                System.exit(0); // finaliza o programa
            }

            /*
             * Calcula o resultado usando o método opera
             */
            resultado = opera(calcDados.getOperando(CalcDados.PRIMEIRO_OPERANDO),
                              calcDados.getOperando(CalcDados.SEGUNDO_OPERANDO),
                              calcDados.getOperador());

            System.out.println("resultado: " + resultado); // mostra

            /*
             * Seta o resultado como primeiro operando da próxima operação
             */
            calcDados.setOperando(CalcDados.PRIMEIRO_OPERANDO,
                                  resultado);
        }
    }

    /*
     * Método que executa a operação
     */
    private double opera(double vl1, double vl2, char op) {
        //TODO: Perguntar pro Robson 'Por que não passar uma instância de CalcDados?'                                                            
        double resultado = 0;

        switch (op) { // faz o switch da operação a ser executada
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
