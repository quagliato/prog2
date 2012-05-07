package quagliato.prog2.lista01.exe19;

import quagliato.prog2.interfaces.Exercicio;

/**
 *
 * @author eduardo
 */
public class Principal19 implements Exercicio{

    @Override
    public void execute() {
        new CalcControle().executar();
    }
    
}
