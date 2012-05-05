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
                rendimentos = ((this.vlHora * (1 + (0.10 * this.anosServico))) * this.qtdeHorasMes)
                        * (this.qtdeHorasMes > 144 ? 1.5 : 1);
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
