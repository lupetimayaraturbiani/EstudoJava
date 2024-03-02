package estudojava;

import java.util.Scanner;

public class Exemplos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float desconto;
        int prcntDesconto;
        System.out.print("Informe o valor da compra: ");
        float valorCompra = input.nextFloat();

        if (valorCompra >= 300) {
            desconto = valorCompra * 0.2f;
            prcntDesconto = 20;
        } else {
            desconto = valorCompra * 0.15f;
            prcntDesconto = 15;
        }

        System.out.println("O valor da sua compra foi de R$ " + valorCompra + "\n" + "Com esse valor você obteve " + prcntDesconto + "% de desconto, sendo descontado R$ " + desconto + "\n" + "O valor final da sua compra é de R$ " + (valorCompra - desconto));
    }
}
