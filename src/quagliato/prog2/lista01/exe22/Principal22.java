package quagliato.prog2.lista01.exe22;

import quagliato.prog2.interfaces.Exercicio;

/**
 *
 * @author eduardo
 */
public class Principal22 implements Exercicio{

    @Override
    public void execute() {
        Real r = new Real(9);
        System.out.println("modulo (m), angulo (a), sinal (s)");
        System.out.println("(m): " + r.modulo());
        System.out.println("(a): " + r.angulo());
        System.out.println("(s): " + (r.sinal() == 1 ? "+" : "-"));
        
        Complexo c = new Complexo(2, 75);
        System.out.println("modulo (m), angulo (a)");
        System.out.println("(m): " + c.modulo());
        System.out.println("(a): " + c.angulo());
    }
    
}
