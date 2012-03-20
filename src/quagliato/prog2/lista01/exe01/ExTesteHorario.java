package quagliato.prog2.lista01.exe01;

import java.util.Scanner;
import quagliato.prog2.interfaces.Exercicio;

/**
 *
 * @author eduardo
 */
public class ExTesteHorario implements Exercicio {

    @Override
    public void execute() {

        Horario hora1 = new Horario();
        Horario hora2 = new Horario();

        Scanner s = new Scanner(System.in);

        boolean valido;
        
        
        // INICIO - Entrada dos valores
        valido = false;
        while (!valido) {
            System.out.print("Horario 1, hora....: ");
            valido = hora1.setHora(s.nextInt());
        }
        
        valido = false;
        while (!valido) {
            System.out.print("Horario 1, minuto..: ");
            valido = hora1.setMin(s.nextInt());
        }
        
        valido = false;
        while (!valido) {
            System.out.print("Horario 2, hora....: ");
            valido = hora2.setHora(s.nextInt());
            if (hora2.getHora() < hora1.getHora()) valido = false;
            
        }
        
        valido = false;
        while (!valido) {
            System.out.print("Horario 2, minuto..: ");
            valido = hora2.setMin(s.nextInt());
            if ((hora2.getHora() == hora1.getHora()) && (hora2.getMin() > hora1.getMin())) valido = false;
        }
        // FIM - Entrada dos valores
        
        int difHora, difMin, difTotal;
        
        difHora = hora2.getHora() - hora1.getHora(); // calcula a diferenca nas horas
        
        if (hora2.getHora() == hora1.getHora())
            difMin = hora2.getMin() - hora1.getMin(); // se a hora for a mesma, a diferença dos minutos e simples
        else {
            difMin = (60 - hora1.getMin()) + hora2.getMin();  // senao deve ser calculo os minutos acima da hora final 
                                                              // e acima da hora inicial, e depois verificado se tem 
                                                              // hora extra
            if (difMin > 60) difMin -= 60;
            else difHora--;
        }
        
        difTotal = (difHora * 60) + difMin; // converte tudo para minutos
        
        double valor = 0;
       
        if (difTotal < 180) valor = 4.50; // se menos de 3 horas, 4.50
        else if (difTotal >= 180 && difTotal <= 720) valor = (4.50 + (((difTotal - 180)/15)*0.75)); // se entre 3h e 12h, 0.75/15min
                                                                                                    // acima de 3h
        else if (difTotal > 720) valor = 33; // se maior que 12h, 33.00
        
        System.out.println("Valor final: R$ " + valor);
        
    }
}
