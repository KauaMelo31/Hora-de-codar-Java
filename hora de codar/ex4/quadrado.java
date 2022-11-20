import java.util.Scanner;
public class quadrado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado: ");
        int lado = in.nextInt();
        System.out.println("O valor da area é " + lado*lado);
        in.close();
    }
}