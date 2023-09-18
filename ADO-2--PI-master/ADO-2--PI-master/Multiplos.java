import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        double N = sc.nextDouble();
        System.out.println("Primeiro Multiplo é: \n"+N*1);
        System.out.println("Segundo Multiplo é: \n"+N*2);
        System.out.println("Terceiro Multiplo é: \n"+N*3);
    }
}
