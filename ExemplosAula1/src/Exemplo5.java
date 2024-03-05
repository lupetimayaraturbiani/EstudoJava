import java.util.Scanner;

/*Escreva um algoritmo que leia a cotação do dólar e a quantidade de
dólares a ser comprada. Converta o valor para real e mostre o resultado*/
public class Exemplo5 {
    public static void main(String[] args) {
        double cotDolar = 4.95;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite quantos dólares quer comprar: ");
        double qtdDolar = input.nextDouble();
        
        double valorReal = cotDolar * qtdDolar;
        
        System.out.println("O resultado da conversão é de R$ " + valorReal);
    }
}
