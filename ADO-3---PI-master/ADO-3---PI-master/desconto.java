import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Double x,valor;
	        System.out.println("Digite o valor de R$");
	        x =  sc.nextDouble();
	        if (x>=300){
	        System.out.println("Você tem direito a 20% de desconto!");
	        valor = x*0.20;
	        System.out.println("Desconto de: R$" +valor);
	        System.out.println("Total a Pagar: R$"+  (x-valor));
	        }
	        else if(x<300){
	        System.out.println("Você tem direito a 15% de desconto");
	        valor = x*0.15;
	        System.out.println("Desconto de R$" +valor);
	        System.out.println("Total a Pagar: R$"+ (x-valor));
	        }
    }
}

