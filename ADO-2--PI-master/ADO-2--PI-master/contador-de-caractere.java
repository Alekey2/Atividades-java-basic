import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva uma palvara:");
        String Exe = sc.nextLine();
        System.out.println(Exe);
        int comprimento = Exe.length();
        System.out.println("Comprimento da String: " + comprimento);
        int comespacos = Exe.replace(" ", "").length();
        System.out.println("Comprimento da string sem contar espaços em branco: " + comespacos);
        
    }
}

