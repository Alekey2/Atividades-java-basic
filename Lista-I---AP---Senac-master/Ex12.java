import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um número para L: ");
	    double L = sc.nextDouble();
	    System.out.println("Digite um número para R: ");
	    double R = sc.nextDouble();
	    double calc;
	    double cal;
	    calc = L*L;
	    cal = R*R*Math.PI;
	    if(calc>cal){
	        System.out.println("A área do Quadrado é maior! "+ calc + "cm");
	    }
	    else if (cal>calc){
	        System.out.println("A área do Círculo é maior! "+ cal +"cm");
	    }
	}
}