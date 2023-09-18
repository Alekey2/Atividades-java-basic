import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	        System.out.println("Digite o valor x:");
	        int x =  sc.nextInt();
	        System.out.println("Digite o valor y:");
	        int y =  sc.nextInt();
	        System.out.println("Digite o valor z:");
	        int z =  sc.nextInt();
	       
	        if (x<y+z && y<x+z && z<x+y){
	        System.out.println("É um Triângulo");
	        }
	        if(x == y && x == z){
	        System.out.println("Triângulo Equilátero");
	        }
	        if(x==y || x==z || y==z){
	        System.out.println("Triângulo Isósceles");
	        }
	        if (x!= y && y !=z) {
	        System.out.println("Triângulo Escaleno");
	        }
	}       
}
	        
	        