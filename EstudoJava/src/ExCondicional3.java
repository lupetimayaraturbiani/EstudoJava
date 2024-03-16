import java.util.Scanner;
/*Dada a altura e o peso de uma pessoa, determinar seu grau de
obesidade. O grau de obesidade é determinado pelo índice da massa
corpórea (Massa = Peso / Altura2

) através da tabela abaixo:*/
public class ExCondicional3 {
    public static void main(String[] args) {
        float altura, peso, massa;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escreva sua altura: ");
        altura = input.nextFloat();
        System.out.print("Escreva seu peso: ");
        peso = input.nextFloat();
        
        massa = peso / (altura * altura);
        
        if(massa < 26){
            System.out.println("IMC normal");
        }else if(massa >= 26 && massa < 30){
            System.out.println("IMC obeso");
        }else if(massa >= 30){
            System.out.println("IMC obeso mérbido");
        }
    }
}
