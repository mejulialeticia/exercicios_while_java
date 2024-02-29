import java.util.Scanner;
import java.util.Random;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("adivinhe o numero");
        int numero = input.nextInt();
        int sorteio = random.nextInt(100);
        
        while(!(numero == sorteio)){
            System.out.println("eu sorteei: " + sorteio);
            System.out.println("errou .. vamos novamente");
            System.out.println("adivinhe o numero");
            numero = input.nextInt();
            sorteio = random.nextInt(100);
        }
        
        System.out.println("acertou");
        input.close();
    }
}
