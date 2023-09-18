import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de A:");
		Float A = sc.nextFloat();
			System.out.println("Digite o valor de B:");
		Float B = sc.nextFloat();
			System.out.println("Digite o valor de C:");
		Float C = sc.nextFloat();
		double cal;
		cal= (A*C)/2;
		System.out.println("O Valor da Área do Triângulo é de: " + cal +"cm");
		System.out.println();
		cal= C*C*Math.PI;
		System.out.println("O Valor da Área do Círculo é de: " + (cal) + "cm");
		System.out.println();
		cal= (A+B)/2*C;
		System.out.println("O Valor da Área do Trapézio é de: " + cal +"cm");
		System.out.println();
		cal= (A*B);
		System.out.println("O Valor da Área do Quadrado é de: " + cal +"cm");
		System.out.println();
		cal= (A*B);
		System.out.println("O Valor da Área do Retângulo é de: " + cal +"cm");
		System.out.println();
		cal= 2*(A+B);
		System.out.println("O Valor da Área do Perímetro do Retângulo é de: " + cal +"cm");
	}
}
