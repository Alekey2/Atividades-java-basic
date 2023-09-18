import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de L:");
		int L = sc.nextInt();
		int C = (L*L); 
		System.out.println("O Valor da Área é de: " + C +"cm");
	}
}
