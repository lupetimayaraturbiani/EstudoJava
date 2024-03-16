import java.util.Scanner;
/*Dados dois números, verificar se a divisão do primeiro número pelo
segundo é exata (o resto da divisão deve ser igual a 0). Se for, o
algoritmo deve imprimir a mensagem “A divisão de (número 1) por
(número 2) é exata”.*/
public class ExCondicional2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva o primeiro número para divisão: ");
        num1 = input.nextInt();
        System.out.println("Escreva o segundo número para divisão: ");
        num2 = input.nextInt();
        
        if(num1 % num2 == 0){
            System.out.println("A divisão de " + num1 + " por " + num2 + " é exata!");
        }else{
            System.out.println("A divisão de " + num1 + " por " + num2 + " não é exata");
        }
        
    }
}
