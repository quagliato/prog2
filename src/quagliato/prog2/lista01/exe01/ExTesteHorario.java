package quagliato.prog2.lista01.exe01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import quagliato.prog2.interfaces.Exercicio;

/**
 *
 * @author eduardo
 */
public class ExTesteHorario implements Exercicio {

    @Override
    public void execute() {

        Horario hora1 = new Horario(); // instanciando primeiro horário
        Horario hora2 = new Horario(); // instanciando segundo horário

        Scanner s = new Scanner(System.in);

        boolean valido; // variável boolean utilizada para validar os horários

        // INICIO - Entrada dos valores
        valido = false;
        while (!valido) {
            System.out.print("Horario 1, hora....: ");
            valido = hora1.setHora(s.nextInt()); // recebe horas do horário 1
        }

        valido = false;
        while (!valido) {
            System.out.print("Horario 1, minuto..: ");
            valido = hora1.setMin(s.nextInt()); // recebe minutos do horário 1
        }

        valido = false;
        while (!valido) {
            System.out.print("Horario 2, hora....: ");
            valido = hora2.setHora(s.nextInt()); // recebe horas do horário 2
            /*
             * valida se a segunda hora é maior do que a primeira
             */
            if (hora2.getHora() < hora1.getHora()) {
                valido = false;
            }
        }

        valido = false;
        while (!valido) {
            System.out.print("Horario 2, minuto..: ");
            valido = hora2.setMin(s.nextInt());  // recebe minutos do horário 2
            /*
             * valida se a os minutos da segunda hora são maiores que os da
             * primeira horário se as horas forem iguais
             */
            if ((hora2.getHora() == hora1.getHora())
                && (hora2.getMin() > hora1.getMin())) {
                valido = false;
            }
        }
        // FIM - Entrada dos valores

        double valor = calculaValor(getIntervalo(hora1, hora2));

        /*
         * formata o número para ter no máximo 2 casas decimais
         */
        NumberFormat numberFormatter = new DecimalFormat();
        numberFormatter.setMaximumFractionDigits(3);
        numberFormatter.setMinimumFractionDigits(2);

        System.out.println("Valor final: R$ " + numberFormatter.format(valor));

    }

    /*
     * Metodo que recebe duas instancia de Horario e calcula o intervalo entre
     * eles.
     */
    private int getIntervalo(Horario hora1, Horario hora2) {

        int difHora, difMin, difTotal;

        difHora = hora2.getHora() - hora1.getHora(); // calcula a diferenca nas horas
        difMin = hora2.getMin() - hora1.getMin();

        return (difHora * 60) + difMin;
    }

    /*
     * Metodo que recebe a quantidade total de minutos e calcula o valor.
     */
    private double calculaValor(int totalMinutos) {

        double valor = 0;

        if (totalMinutos < 180) {
            valor = 4.50; // se menos de 3 horas, 4.50
        } else if (totalMinutos >= 180 && totalMinutos <= 720) {
            valor = (4.50 + (((totalMinutos - 180) / 15) * 0.75)); // se entre 3h e 12h, 0.75/15min
        } // acima de 3h
        else if (totalMinutos > 720) {
            valor = 33; // se maior que 12h, 33.00
        }
        return valor;

    }
}
