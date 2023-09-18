import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Nome Do Vendedor :");
		String name= sc.nextLine();
		System.out.println();
		System.out.print("Digite o Valor do Salário:\nR$");
		float S = sc.nextInt();
		System.out.println();
		System.out.print("Digite o Total de Vendas em:\nR$");
		float TV = sc.nextInt();
		System.out.println();
		double cal;
		cal = TV*0.15+S;
	    System.out.println("O Salário de "+ name +" Referente a esté mês é de: R$"+ cal);
	}
}

