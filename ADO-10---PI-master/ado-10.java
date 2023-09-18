import java.util.Random;
import java.util.Scanner;
 public class Main{
 
    public static void dica(int palpite, int numero, int tentativas){
    if(palpite > numero){
    System.out.println("\nPalpite maior que o número sorteado\n");
    }
    else {
    if(palpite < numero){
    System.out.println("\nPalpite menor que o número sorteado.");
    }
     else {
    System.out.println("\nParabéns, você acertou! O número era " + numero);
    }
   
    }
    
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int palpite=0, sorteado, tentativas=0, tamanho = 6;
    
  
    Random geradorDeAleatorios = new Random();
    sorteado = geradorDeAleatorios.nextInt(100) + 1;
    int quente=0;
    System.out.println("Número entre 1 e 100 sorteado!");

    do{
        if (palpite==sorteado){
            break;
    }
    System.out.println("Qual seu palpite: ");
    palpite = sc.nextInt();
   
    tentativas++;
  

    if(palpite==sorteado-1||palpite==sorteado+1){
    System.out.println("Você está Quente");
    }
     
    if(tentativas<tamanho){
    System.out.println("Você tentou " + tentativas + " vezes ");
    }
    
    else if (tentativas==tamanho){
    System.out.println("Game over!!");
    break;
    }
    
    dica(palpite,sorteado,tentativas);
    }while (tentativas<tamanho || palpite!=sorteado ||palpite==sorteado);
    
}
}