import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		float A = sc.nextFloat();
		System.out.println("Digite o valor de B:");
		float B = sc.nextFloat();
		System.out.println("Digite o valor de C:");
		float C = sc.nextFloat();
		float cal = B*B-4*A*C;
		double result = Math.sqrt(cal);
		if(result>0){
		    System.out.println("Resultado da Raiz Abaixo :");
		    System.out.println(result);
		}
		else 
		System.out.println("Impossível Calcular");
	}
}
