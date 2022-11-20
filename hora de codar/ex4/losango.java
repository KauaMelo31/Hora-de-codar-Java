import java.util.Scanner;
public class losango {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor da diagonal maior: ");
        double maior = in.nextDouble();
        System.out.println("Informe o valor da diagonal menor: ");
        double menor = in.nextDouble();
        System.out.println("O valor da area é " + maior*menor/2);
        in.close();
    }
}