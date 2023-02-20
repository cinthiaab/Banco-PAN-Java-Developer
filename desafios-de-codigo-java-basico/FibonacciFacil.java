import java.util.Scanner;

public class FibonacciFacil {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= N; i++) {
            if(i==1) {System.out.print(anterior+ " ");}
            else if (i==2) {
                System.out.print(atual + " ");
            }else{
                proximo = atual + anterior;
                System.out.print(proximo+ " ");
                anterior = atual;
                atual = proximo;
            }
        }
    }
}
