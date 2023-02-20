import java.util.Scanner;

public class SomaNTermos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double h = 0;

        for (int i = 1; i <= n; i++) {
            h = h + (1.0/i);
        }
        System.out.println(String.format("%.0f", h));
    }
}

