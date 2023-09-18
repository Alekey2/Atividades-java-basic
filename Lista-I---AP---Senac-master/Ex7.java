import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado A:");
		double A = sc.nextDouble();
		System.out.println("Digite o lado B:");
		double B = sc.nextDouble();
	    double cal;
		cal = (A*A)+(B*B);
		double raiz = Math.sqrt(cal);
		System.out.println("O valor da Hipotenusa é:" + raiz);
	}
}
