import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();

        int custoConsumidor;
        int distribuidor;
        int valorImpostos;

        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * percentualImpostos) / 100;
        custoConsumidor = custoFabrica + distribuidor + valorImpostos;

        System.out.println(custoConsumidor);
    }
}