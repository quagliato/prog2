package quagliato.prog2.lista01.exe09;

/**
 *
 * @author eduardo
 */
public class Colaborador {

    private String nome;
    private int anosServico;
    private TipoVinculo tipoVinculo;
    private double vlHora;
    private double qtdeHorasMes;

    public Colaborador(String nome, TipoVinculo tipoVinculo) {
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
    }

    public double calcularRendimento(int anosServico, double vlHora, double qtdeHorasMes) {
        this.anosServico = anosServico;
        this.vlHora = vlHora;
        this.qtdeHorasMes = qtdeHorasMes;

        double rendimentos = 0;

        if (this.tipoVinculo == null)
            return -1;

        switch (this.tipoVinculo) {
            case EST:
                rendimentos = this.vlHora * 80;
                break;
            case EMP:
                double vlBaseHora = this.vlHora * (1 + (0.10 * this.anosServico));
                
                if (this.qtdeHorasMes > 144)
                    rendimentos = (vlBaseHora * 144) + (vlBaseHora * 1.5 * (this.qtdeHorasMes - 144));
                else
                    rendimentos = vlBaseHora * this.qtdeHorasMes;
                
                break;
            case SOC:
                rendimentos = this.vlHora * this.qtdeHorasMes;
                break;
        }


        return rendimentos;
    }
    
    public double calculaCusto(double rendimentos) {
        double custos = 0;
        
        if (this.tipoVinculo == null)
            return -1;
        
        switch (this.tipoVinculo) {
            case EMP:
                custos = rendimentos * 1.8;
                break;
            case EST:
            case SOC:
                custos = rendimentos;
                break;
        }
        
        return custos;
    }

    public String getNome() {
        return nome;
    }

    public void setAnosServico(int anosServico) {
        this.anosServico = anosServico;
    }

    public void setQtdeHorasMes(double qtdeHorasMes) {
        this.qtdeHorasMes = qtdeHorasMes;
    }

    public void setVlHora(double vlHora) {
        this.vlHora = vlHora;
    }

}
