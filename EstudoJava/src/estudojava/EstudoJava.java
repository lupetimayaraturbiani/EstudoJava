package estudojava;

import java.util.Scanner;

public class EstudoJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Escreva sua idade: ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Você tem " + idade + " anos e é maior de idade!");
        } else {
            System.out.println("Você tem " + idade + " anos e é menor de idade!");
        }

    }

}
