package program;

import java.util.ArrayList;
import java.util.List;

public class ex3 {

    public static void main(String[] args) {
        List<DiaFaturamento> faturamentoMensal = new ArrayList<>();
        faturamentoMensal.add(new DiaFaturamento(1, 22174.1664));
        faturamentoMensal.add(new DiaFaturamento(2, 24537.6698));
        faturamentoMensal.add(new DiaFaturamento(3, 26139.6134));
        faturamentoMensal.add(new DiaFaturamento(4, 0.0));
        faturamentoMensal.add(new DiaFaturamento(5, 0.0));
        faturamentoMensal.add(new DiaFaturamento(6, 26742.6612));
        faturamentoMensal.add(new DiaFaturamento(7, 0.0));
        faturamentoMensal.add(new DiaFaturamento(8, 42889.2258));
        faturamentoMensal.add(new DiaFaturamento(9, 46251.174));
        faturamentoMensal.add(new DiaFaturamento(10, 11191.4722));
        faturamentoMensal.add(new DiaFaturamento(11, 0.0));
        faturamentoMensal.add(new DiaFaturamento(12, 0.0));
        faturamentoMensal.add(new DiaFaturamento(13, 3847.4823));
        faturamentoMensal.add(new DiaFaturamento(14, 373.7838));
        faturamentoMensal.add(new DiaFaturamento(15, 2659.7563));
        faturamentoMensal.add(new DiaFaturamento(16, 48924.2448));
        faturamentoMensal.add(new DiaFaturamento(17, 18419.2614));
        faturamentoMensal.add(new DiaFaturamento(18, 0.0));
        faturamentoMensal.add(new DiaFaturamento(19, 0.0));
        faturamentoMensal.add(new DiaFaturamento(20, 35240.1826));
        faturamentoMensal.add(new DiaFaturamento(21, 43829.1667));
        faturamentoMensal.add(new DiaFaturamento(22, 18235.6852));
        faturamentoMensal.add(new DiaFaturamento(23, 4355.0662));
        faturamentoMensal.add(new DiaFaturamento(24, 13327.1025));
        faturamentoMensal.add(new DiaFaturamento(25, 0.0));
        faturamentoMensal.add(new DiaFaturamento(26, 0.0));
        faturamentoMensal.add(new DiaFaturamento(27, 25681.8318));
        faturamentoMensal.add(new DiaFaturamento(28, 1718.1221));
        faturamentoMensal.add(new DiaFaturamento(29, 13220.495));
        faturamentoMensal.add(new DiaFaturamento(30, 8414.61));

        
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0.0;
        int diasComFaturamento = 0;

       
        for (DiaFaturamento dia : faturamentoMensal) {
            if (dia.getValor() > 0) {
                if (dia.getValor() < menorFaturamento) {
                    menorFaturamento = dia.getValor();
                }
                if (dia.getValor() > maiorFaturamento) {
                    maiorFaturamento = dia.getValor();
                }
                somaFaturamento += dia.getValor();
                diasComFaturamento++;
            }
        }

        
        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        
        int diasAcimaDaMedia = 0;
        for (DiaFaturamento dia : faturamentoMensal) {
            if (dia.getValor() > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }

       
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }

    
    static class DiaFaturamento {
        private int dia;
        private double valor;

        public DiaFaturamento(int dia, double valor) {
            this.dia = dia;
            this.valor = valor;
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }
}
