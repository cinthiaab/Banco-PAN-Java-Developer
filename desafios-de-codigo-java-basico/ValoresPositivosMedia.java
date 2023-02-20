import java.io.IOException;
import java.util.Scanner;

public class ValoresPositivosMedia {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        int valoresPositivos = 0;
        double media = 0;
        double valor;

        for (int i = 0; i<6; i++) {
            valor = leitor.nextDouble();
            if(valor>0){
                media += valor;
                valoresPositivos++;
            }
        }

        media /= valoresPositivos;
        System.out.println(valoresPositivos + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
