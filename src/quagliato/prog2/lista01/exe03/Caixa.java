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

    public Double calculaAreaExt() {
        if (getLargura() != null && getAltura() != null && getProfundidade() != null) {
            return ((getLargura() * getAltura()) + (getLargura() * getProfundidade()) + (getAltura() * getProfundidade())) * 2;
        } else {
            throw new RuntimeException("Nenhum dos valores pode ser nulo!");
        }

    }

    public Double calculaVolume() {
        if (getLargura() != null && getAltura() != null && getProfundidade() != null) {
            return getLargura() * getAltura() * getProfundidade();
        } else {
            throw new RuntimeException("Nenhum dos valores pode ser nulo!");
        }

    }
}
