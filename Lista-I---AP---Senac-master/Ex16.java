import java.io.IOException;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)throws IOException{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Hora inicial: ");
		int x = sc.nextInt();
		System.out.println("Hora Final: ");
		int y = sc.nextInt();
		if (x > y) { 
	    System.out.println("O JOGO DUROU " + (24 - (x - y)) + " HORA(S)");
        }       
        else if (y > x) {
	    System.out.println("O JOGO DUROU " + (y - x) + " HORA(S)");
        } 
        else {
	    System.out.println("O JOGO DUROU 24 HORA(S)");
        }   
	}
}
