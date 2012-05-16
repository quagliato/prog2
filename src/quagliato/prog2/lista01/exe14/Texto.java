package quagliato.prog2.lista01.exe14;

/**
 *
 * @author eduardo
 */
public class Texto {
    
    private String texto = "";

    public String getTexto() {
        return texto;
    }
    
    /*
     * Método que adiciona texto ao já existente
     */
    public void addTexto(String texto) {
        this.texto += ("".equals(this.texto) ? "" : "\n") + texto;
    }
    
}
