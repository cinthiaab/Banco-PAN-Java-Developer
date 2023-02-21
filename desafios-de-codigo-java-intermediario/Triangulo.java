import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        boolean triangulo = eTriangulo(A, B, C);

        if(triangulo==true){
            double perimetro = A + B + C;
            System.out.println("Perimetro = "+ String.format("%.1f", perimetro));
        }else{
            double area = (A+B)*C/2;
            System.out.println("Area = "+ String.format("%.1f", area));
        }
        
    }
    public static boolean eTriangulo(double A, double B, double C){
        boolean triangulo = false;

        if((A+B)>C & (B+C)>A & (A+C)>B){
            triangulo = true;
        }
        return triangulo;
    }
}
