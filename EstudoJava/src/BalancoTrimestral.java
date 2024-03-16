import java.util.Scanner;

public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJ = 1500;
        int gastosF = 23000;
        int gastosM = 17000;
        int gastosTrimestre = gastosJ + gastosF + gastosM;
        
        System.out.println("Os gastos trimestrais foram de R$" + gastosTrimestre);
        
        double mediaTrimestre = gastosTrimestre / 3;
        
        System.out.println("A média de gastos foi de R$" + mediaTrimestre);
    }
}
