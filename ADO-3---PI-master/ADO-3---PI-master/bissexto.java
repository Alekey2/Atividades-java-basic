import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um ano com 4 digitos :");
	    int ano = sc.nextInt();
	    if(ano % 400 == 0){
	        System.out.println("Esté ano é bissexto!!");
	    }
	    else if((ano % 4 == 0) && (ano % 100 != 0)){
	        System.out.println("Esté ano é bissexto!!");
	    }
	    else 
	        System.out.println("Esté ano não é bissexto!!");
	}
}
