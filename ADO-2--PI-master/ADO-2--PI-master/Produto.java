import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        double x = sc.nextDouble();
        System.out.println("Digite o valor de y: ");
        double y = sc.nextDouble();
        System.out.println("Digite o valor de z: ");
        double z = sc.nextDouble();
        
        System.out.println("O valor do Produto dos 3 números é "+x*y*z);
    }
}

