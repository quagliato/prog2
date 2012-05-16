package quagliato.prog2.lista01.exe14;

import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class Email {
    
    private Assunto assunto;
    private Texto texto;
    
    /*
     * Método que seta o Assunto do email
     */
    public void setAssunto(String assunto) {
        if (this.assunto == null) // se o assunto não estiver instanciado
            this.assunto = new Assunto(); // cria uma nova instacia
        this.assunto.setAssunto(assunto);
    }
    
    /*
     * Método que adiciona texto ao email
     */
    public void addTexto(String texto) {
        if (this.texto == null) // se texto não estiver instanciado
            this.texto = new Texto(); // cria uma nova instancia
        this.texto.addTexto(texto);
    }
    
    /*
     * Método que mostra os dados daquele email
     */
    public void mostrarDados() {
        System.out.println(StringUtils.repeat('*', 80));
        
        System.out.println("Assunto: " + this.assunto.getAssunto());
        System.out.println("Mensagem:");
        System.out.println(texto.getTexto());
    }
}
