import java.util.Scanner;
public class Main
{
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o valor de a: ");
            int a = sc.nextInt();
            System.out.println("Digite o valor de b: ");
            int b = sc.nextInt();
            System.out.println("Digite o valor de c: ");
            int c = sc.nextInt();
            System.out.println("Digite o valor de d: ");
            int d = sc.nextInt();
            int soma1 = a+b;
            int soma2 = c+d;
            if(b>c && d>a && soma2>soma1 && c>0 && d>0 && a%2==0){
               System.out.println("Valores Aceitos!"); 
            }
            else{
                System.out.println("Valores não Aceitos!");
            }
            
        
            
            
            
        }
}

