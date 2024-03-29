package quagliato.prog2.lista01.exe07;

import quagliato.prog2.interfaces.Exercicio;

/**
 *
 * @author eduardo
 */
public class ExTesteCarro implements Exercicio {

    @Override
    public void execute() {
        Carro gol = new Carro(12, 45); //12 km/L de combustível, 
                                       //capacidade do tanque é 45 L
        gol.abastecer(20); //abastece com 20 L de combustível.

        Carro uno = new Carro(14, 40);
        uno.abastecer(25);

        int sobra;
        
        uno.andar(150); //anda 150 km.
        sobra = uno.getCombustivel(); //exibe o combustível que resta no tanque.
        System.out.println("Litros restantes no Uno: " + sobra);

        gol.andar(80);
        sobra = gol.getCombustivel();
        System.out.println("Litros restantes no Gol: " + sobra);
    }
}
