import java.util.Scanner;
public class circulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do lado do raio: ");
        double raio = in.nextDouble();
        System.out.println("O valor da area do circulo é " + 3.14*(raio*2));
        in.close();
    }
}