import java.util.Scanner;

public class TaxaImpostoDeRenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;

        if(renda<=2000.00){
            System.out.println("Isento");
        }else{
            if(renda<=3000.00){
                imposto = (renda-2000.00)*0.08;
            } else if (renda<=4500.00) {
                imposto = 1000*0.08 + (renda-3000.00)*0.18;
            }else{
                imposto = 1000*0.08 + 1500*0.18 + (renda-4500.00)*0.28;
            }
            System.out.println("R$ " + String.format("%.2f", imposto));
        }
    }
}
