package exemplosaula1;
import java.util.Scanner;

/*Escreva um algoritmo capaz de calcular o salário de um trabalhador com
base na quantidade de horas trabalhadas e o valor de cada hora*/
class ExemplosAula1 {
    public static void main(String[] args) {
        float salario, valorHora, qtdHoras;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe o valor da hora de trabalho: ");
        valorHora = input.nextFloat();
        
        System.out.print("Agora informe a quantidade de horas trabalhadas: ");
        qtdHoras = input.nextFloat();
        
        salario = valorHora * qtdHoras;
        
        System.out.println("Com essas o informações o valor do salário é de: R$ " + salario);
    }
    
}
