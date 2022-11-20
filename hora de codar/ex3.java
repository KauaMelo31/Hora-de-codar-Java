import java.util.Scanner;
public class ex3{
    public static void main(String[] args) {
        System.out.println("Informe um seu nome: ");
        Scanner in = new Scanner (System.in);
        String nome = in.next();
        System.out.println("Informe sua idade: ");
        int idade = in.nextInt();
        System.out.println("Olá "+nome+" sua idade é "+idade);
    }
}