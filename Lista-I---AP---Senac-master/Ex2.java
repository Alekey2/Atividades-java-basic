import java.lang.Math;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Primeiro número:");
		double x = Double.parseDouble(sc.nextLine());
		System.out.println("Digite o Segundo número:");
		double y = Double.parseDouble(sc.nextLine());
		double result = Calculatey(x,y);
	    System.out.println(x+"^"+y+"="+result);
        }
        static double Calculatey (double x, double y){
        return Math.pow(x,y);
	}   
}