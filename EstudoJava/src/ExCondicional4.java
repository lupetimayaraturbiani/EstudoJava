import java.util.Scanner;
/*Calcular a conta de consumo de energia elétrica de um consumidor, dado
o kWh consumido, de acordo com a tabela abaixo:*/
public class ExCondicional4 {
    public static void main(String[] args) {
        int consumo;
        double precoKwh  = 0, contaEnergia;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escreva consumo de energia em kwh: ");
        consumo = input.nextInt();
        
        if(consumo < 150){
            precoKwh = 0.20;
        }else if(consumo >= 150 && consumo < 500){
            precoKwh = 0.25;
        }else if(consumo >= 500){
            precoKwh = 0.30;
        }else{
            System.out.println("O valor da sua conta é R$11,90");
        }
        contaEnergia = consumo * precoKwh;
        
        System.out.println("O valor da sua conta é R$" + contaEnergia);
    }
}
