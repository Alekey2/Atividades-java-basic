import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de a : ");
		    float a = sc.nextFloat();
		System.out.println("Digite o valor de b : ");
		    float b = sc.nextFloat();
		System.out.println("Digite o valor de c : ");
		    float c = sc.nextFloat();
		    float a2 = a*a;
		    float b2 = b*b;
		    float c2 = c*c;
		    float subs;
		        if (b > a && b>c){
		            subs = a;
		            a = b;
		            c = subs;
		        }
		        else if (c>a){
		            subs = a;
		            a = c;
		            c = subs;
		        }
		        if(a>= b+c){
		        System.out.println("Não forma um Triângulo");
		        }else{
		    
		    if(a2==b2+c2){
		        System.out.println("Triângulo Retângulo");
		    }
		    if(a2>b2+c2){
		        System.out.println("Triângulo Obtusângulo");
		    }
		    if(a2<b2+c2){
		        System.out.println("Triângulo Acutângulo");
		    }
		    if(a==b && a==c && b==c){
		        System.out.println("Triângulo Equilátero");
		    }
		    if((a==b && a!=c) || (b==c && b!=a) || (c==a && c != b)){
		        System.out.println("Triângulo Isósceles");
		    }
    }    
    }
}






