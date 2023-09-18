import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do Funcionário:");
		int ID = sc.nextInt();
		System.out.println("Digite o Total de Horas Trabalhadas Pelo Funcionário:");
		int HT = sc.nextInt();
		System.out.println("Digite o Valor da Hora Trablhada Pelo Funcionário:");
		double VHT = sc.nextDouble();
		double Salario;
		Salario = HT*VHT;
		System.out.println("O Funcionário "+ ID +" Receberá o Total de: R$" + Salario + " Pelo mês Trablhado!");
	}
}
