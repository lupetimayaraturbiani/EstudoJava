import java.util.Scanner;

/*um algoritmo que lê um número e imprime o quadrado deste número*/
public class Exemplo3 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escreva um número: ");
        num = input.nextInt();
        
        int quadrado = num * num;
        
        System.out.println("O quadrado desse número é " + quadrado);
    }
}
