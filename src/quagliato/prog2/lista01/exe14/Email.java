package quagliato.prog2.lista01.exe14;

import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class Email {
    
    private Assunto assunto;
    private Texto texto;
    
    public void setAssunto(String assunto) {
        if (this.assunto == null) 
            this.assunto = new Assunto();
        this.assunto.setAssunto(assunto);
    }
    
    public void addTexto(String texto) {
        if (this.texto == null)
            this.texto = new Texto();
        this.texto.addTexto(texto);
    }
    
    public void mostrarDados() {
        System.out.println(StringUtils.repeat('*', 80));
        
        System.out.println("Assunto: " + this.assunto.getAssunto());
        System.out.println("Mensagem:");
        System.out.println(texto.getTexto());
    }
}
