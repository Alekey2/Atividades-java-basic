import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o valor de A:");
	    int A = sc.nextInt();
	    System.out.println("Digite o valor de B:");
	    int B = sc.nextInt();
	    int Result;
	    Result = (A*A)+(B*B);
	    System.out.println("O quadrado de A+B é :" +Result);
	}
}
