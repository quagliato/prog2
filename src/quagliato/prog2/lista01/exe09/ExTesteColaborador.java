package quagliato.prog2.lista01.exe09;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import quagliato.prog2.interfaces.Exercicio;
import quagliato.prog2.util.StringUtils;

/**
 *
 * @author eduardo
 */
public class ExTesteColaborador implements Exercicio {

    private static int QTDE_COLABORADORES = 3;

    @Override
    public void execute() {

        String nome;
        int anosServico;
        TipoVinculo tipoVinculo;
        double vlHora;
        double qtdeHorasMes;

        Scanner s = new Scanner(System.in);

        String nomeMaiorRendimento = "";
        double maiorRendimento = 0;

        String nomeMaiorCusto = "";
        double maiorCusto = 0;

        for (int i = 0; i < QTDE_COLABORADORES; i++) {

            System.out.println(StringUtils.repeat('-', 80));

            System.out.println("COLABORADOR " + (i + 1));

            System.out.print("NOME...............: ");
            nome = s.next();

            System.out.print("ANOS DE SERVICO....: ");
            anosServico = s.nextInt();

            System.out.print("TIPO VINCULO.......: ");
            tipoVinculo = TipoVinculo.valueOf(s.next());

            System.out.print("VALOR HORA.........: ");
            vlHora = s.nextDouble();

            System.out.print("QTDE HORAS.........: ");
            qtdeHorasMes = s.nextDouble();

            Colaborador colaborador = new Colaborador(nome, tipoVinculo);

            double rendimentos = colaborador.calcularRendimento(anosServico, vlHora, qtdeHorasMes);

            double custo = colaborador.calculaCusto(rendimentos);

            if (rendimentos > maiorRendimento) {
                maiorRendimento = rendimentos;
                nomeMaiorRendimento = colaborador.getNome();
            }

            if (custo > maiorCusto) {
                maiorCusto = custo;
                nomeMaiorCusto = colaborador.getNome();
            }

        }

        System.out.println(StringUtils.repeat('*', 80));
        
        NumberFormat numberFormatter = new DecimalFormat();
        numberFormatter.setMaximumFractionDigits(2);
        numberFormatter.setMinimumFractionDigits(2);

        System.out.println("RESULTADOS");
        System.out.println("MAIOR RENDIMENTO...: " + nomeMaiorRendimento + "(R$ " + numberFormatter.format(maiorRendimento) + ")");
        System.out.println("MAIOR CUSTO........: " + nomeMaiorCusto + "(R$ " + numberFormatter.format(maiorCusto) + ")");

    }
}
