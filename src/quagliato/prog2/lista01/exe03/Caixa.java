package quagliato.prog2.lista01.exe03;

/**
 *
 * @author eduardo
 */
public class Caixa {

    private int caixaID;
    private Double largura;
    private Double altura;
    private Double profundidade;

    public Caixa(int caixaID) {
        this.caixaID = caixaID;
    }

    public int getCaixaID() {
        return caixaID;
    }

    public void setCaixaID(int caixaID) {
        this.caixaID = caixaID;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    /*
     * Método utilizado para cálculo da área externa
     */
    public double calculaAreaExt() {
        if (getLargura() != null
            && getAltura() != null
            && getProfundidade() != null) { // valida se nenhum dos dados é nulo
            return ((getLargura() * getAltura())
                    + (getLargura() * getProfundidade())
                    + (getAltura() * getProfundidade())) * 2; // retorna área
        } else { // se um dos dados é nulo, dispara uma exceção
            throw new RuntimeException("Nenhum dos valores pode ser nulo!");
        }

    }

    public double calculaVolume() {
        if (getLargura() != null
            && getAltura() != null
            && getProfundidade() != null) { // valida se nenhum dos dados é nulo
            return getLargura()
                   * getAltura()
                   * getProfundidade(); // retorna volume
        } else { // se um dos dados é nulo, dispara uma exceção
            throw new RuntimeException("Nenhum dos valores pode ser nulo!");
        }

    }
}
