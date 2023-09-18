import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um número para n1: ");
	    float n1 = sc.nextFloat();
	    System.out.println("Digite um número para n2: ");
	    float n2 = sc.nextFloat();
	    if(n1>n2){
	        System.out.println(n1/n2);
	    }
	      else if (n2>n1){
	        System.out.println(n2/n1);
	    }
	  
    }
}