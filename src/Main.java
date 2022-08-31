import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int X = s.nextInt();

        double R = Math.sqrt(X);
        System.out.println("La raiz cuadrada de " + X + " es " + R);
    }
}
