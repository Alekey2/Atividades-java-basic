import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um número para n1: ");
	    int n1 = sc.nextInt();
	    System.out.println("Digite um número para n2: ");
	    int n2 = sc.nextInt();
	    System.out.println("Digite um número para n3: ");
	    int n3 = sc.nextInt();
	    if((n1>n2) && (n1>n3)){
	        System.out.println(n1 + " É o maior número!");
	    }
	    else if ((n2>n1) && (n2>n3)){
	        System.out.println(n2 +" É o maior número!");
	    }
	    else
	        System.out.println(n3 +" É o maior número!");
	}
}