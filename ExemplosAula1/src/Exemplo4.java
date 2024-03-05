import java.util.Scanner;

/*Escreva um algoritmo que lê dois números A e B e imprima o resultado de
A elevado a B*/
public class Exemplo4 {
    public static void main(String[] args) {
        double numA, numB, potencia;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número que será a base da potência: ");
        numA = input.nextDouble();
        
        System.out.print("Digite o número que será o expoente: ");
        numB = input.nextDouble();
        
        potencia = Math.pow(numA, numB);
        
        System.out.println("O resultado de " + numA + " elevado à " + numB + " é " + potencia);
    }
}
