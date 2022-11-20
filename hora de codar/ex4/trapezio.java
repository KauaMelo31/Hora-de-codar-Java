import java.util.Scanner;
public class trapezio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do lado da base menor: ");
        double bma = in.nextDouble();
        System.out.println("Informe o valor da base menor: ");
        double bme = in.nextDouble();
        System.out.println("Informe o valor da altura: ");
        double altura = in.nextDouble();
        System.out.println("O valor da area é " + ((bme+bma)*altura)/2 );
        in.close();
    }
}