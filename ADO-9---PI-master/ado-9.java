import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Máximo: ");
        double valorMax = sc.nextDouble();
        System.out.print("Mínimo: ");
        double valorMin = sc.nextDouble();
       

        double a = Math.random() * ((valorMax - valorMin + 1) + valorMin);
        double b = Math.random() * ((valorMax - valorMin + 1 ) + valorMin);
        
        a = Math.floor(a);
        b = Math.floor(b);
        double x = - b / a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.format("x = %.2f", x);
    }
}