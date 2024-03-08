import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite um numero");
        int numero = input.nextInt();

        if(numero > 0){
                int contador = 0;
                //System.out.println("CONTAGEM ATÉ O NUMERO INSERIDO");  
                while (contador < numero) {
                    contador ++;  
                    int parOuImpar = contador % 2;
                    if(parOuImpar == 0){
                        System.out.println("o numero " + contador + " é par");
                    }
                    //System.out.println("numero: " + contador);  
                }
                System.out.println("");  
        }else{
            System.out.println("digite um numero positivo");
        }
        
        input.close();
    }
}