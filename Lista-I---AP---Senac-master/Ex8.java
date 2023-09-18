import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o lado n1:");
		double n1 = sc.nextDouble();
		System.out.println("Digite o lado n2:");
		double n2 = sc.nextDouble();
		System.out.println("Digite o lado n3:");
		double n3 = sc.nextDouble();
		System.out.println("Digite o lado n4:");
		double n4 = sc.nextDouble();
	    double cal;
	    cal = (n1+n2+n3+n4)/4;
	    System.out.println("A média aritmética é de: " + cal);
	}	
}