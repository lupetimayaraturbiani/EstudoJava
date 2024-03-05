import java.util.Scanner;

/*Crie um algoritmo para calcular o pagamento de comissão de vendedores
de peças, levando em consideração que sua comissão será de 5% do total
da venda e que você tem os seguintes dados:
- identificação do vendedor
- código da peça
- preço unitário da peça
- quantidade vendida
O algoritmo deve imprimir a identificação do vendedor, o total vendido pelo
vendedor e o valor da comissão da venda.*/
public class Exemplo6 {
    public static void main(String[] args) {
        int idVendedor, codPeca, qtdVendida;
        double unidadePeca, totalVenda;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a identificação do vendedor: ");
        idVendedor = input.nextInt();
        
        System.out.print("Informe o código da peça: ");
        codPeca = input.nextInt();
        
        System.out.print("Digite o preço unitário da peça: ");
        unidadePeca = input.nextDouble();
        
        System.out.print("Digite a quantidade de peças que foi vendida: ");
        qtdVendida = input.nextInt();
        
        totalVenda = qtdVendida * unidadePeca;
        
        System.out.println("Vendedor: " + idVendedor + "\n" + "Total vendido: " + totalVenda + "\n" + "Comissão: " + totalVenda * 0.5);
    }
}
