import java.util.Scanner;
/*Dado um número, verificar se ele é maior que 100. Se for, o algoritmo
deve somar 150 a esse número. No final, imprimir o resultado da soma.*/
public class ExCondicional1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Escreva um número inteiro: ");
        num = input.nextInt();
        
        if(num >= 100){
            System.out.println("O número que você digitou foi: " + num);
            System.out.println("O resultado da soma de " + num + " + 150 é: " + (num+150));
        }else{
            System.out.println("O número que você digitou foi: " + num);
        }
        input.close();
    }
}
