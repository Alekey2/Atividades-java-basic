import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um número: ");
	    int n1 = sc.nextInt();
	    if(n1<0){
	        System.out.println("Número negativo!!");
	    }
	    else
	        System.out.println("Número Incorreto, Tente novamente somente com números negativos!");
	}
}
