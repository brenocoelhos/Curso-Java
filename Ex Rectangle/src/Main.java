import java.util.Locale;
import java.util.Scanner;

import Utilities.Rectangle;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("digite o tamanho: ");
        rectangle.height = sc.nextDouble();

        System.out.println("digite a altura: ");
        rectangle.width = sc.nextDouble();

        double aux = rectangle.Area();
        System.out.println("Area: "+ aux);

        aux = rectangle.Perimeter();
        System.out.println("Perimeter: "+ aux);

        aux = rectangle.Diagonal();
        System.out.println("Diagonal: "+ aux);

        sc.close();
    }
}
