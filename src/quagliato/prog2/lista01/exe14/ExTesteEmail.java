package quagliato.prog2.lista01.exe14;

import quagliato.prog2.interfaces.Exercicio;

/**
 *
 * @author eduardo
 */
public class ExTesteEmail implements Exercicio{

    @Override
    public void execute() {
        
        Email email = new Email();
        
        email.setAssunto("Esse é o assunto de um email de teste.");
        
        email.addTexto("Esse é o corpo da mensagem.");
        email.addTexto("Para cada chamada do método addTexto(String), ele adiciona uma");
        email.addTexto("quebra de linha que ajuda muito na hora de digitar um texto.");
        email.addTexto("Até a próxima.");
        
        email.mostrarDados();
    }
    
}
