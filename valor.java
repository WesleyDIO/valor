import java.util.Scanner;
public class valorPagamento {

	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int qtdPrestacoes = 0;
	        double valorTotal = 0;

	        while (true) {
	            System.out.println("Informe o valor da prestação (0 para encerrar): ");
	            double valorPrestacao = entrada.nextDouble();
	            if (valorPrestacao == 0) {
	                break;
	            }

	            System.out.println("Informe o número de dias em atraso: ");
	            int diasAtraso = entrada.nextInt();

	            double valorPagamento = valor(valorPrestacao, diasAtraso);
	            System.out.println("Valor a ser pago: R$" + valorPagamento);
	            qtdPrestacoes++;
	            valorTotal += valorPagamento;
	        }

	        System.out.println("Relatório do dia: ");
	        System.out.println("Quantidade de prestações pagas: " + qtdPrestacoes);
	        System.out.println("Valor total de prestações pagas: R$" + valorTotal);
	        
	        entrada.close();
	    }

	    public static double valor(double valorPrestacao, int diasAtraso) {
	        if (diasAtraso == 0) {
	            return valorPrestacao;
	        } else {
	            double multa = valorPrestacao * 0.03;
	            double juros = valorPrestacao * 0.001 * diasAtraso;
	            return valorPrestacao + multa + juros;
	        }
	    }
	}



