import java.util.Scanner;
public class paralelogramo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do lado da base: ");
        double base = in.nextDouble();
        System.out.println("Informe o valor da altura: ");
        double altura = in.nextDouble();
        System.out.println("O valor da area é " + base*altura);
        in.close();
    }
}