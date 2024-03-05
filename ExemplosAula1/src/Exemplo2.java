import java.util.Scanner;

/*Escreva um algoritmo para calcular o estoque médio de uma peça, sendo
que: estoque médio = (quantidade mínima + quantidade máxima) / 2*/
public class Exemplo2 {
    public static void main(String[] args) {
        int qtdMin, qtdMax, estoqueMed;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade mínima de estoque: ");
        qtdMin = input.nextInt();
        
        System.out.print("Digite a quantidade máxima de estoque: ");
        qtdMax = input.nextInt();
        
        estoqueMed = (qtdMin + qtdMax)/2;
        
        System.out.println("Com essas informações, a peça tem um estoque médio de " + estoqueMed);
    }
}
