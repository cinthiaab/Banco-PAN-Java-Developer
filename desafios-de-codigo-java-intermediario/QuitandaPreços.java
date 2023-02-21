import java.util.Scanner;

public class QuitandaPreços {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double preco = 0;

        if(morangos<=5){
            preco += (morangos*2.5);
        }else{
            preco += (morangos*2.2);
        }

        if(macas<=5){
            preco += (macas*1.8);
        }else{
            preco += (macas*1.5);
        }

        if((macas+morangos)>8 | preco>25.0){
            preco *= 0.9;
        }

        System.out.println(preco);
    }
}
