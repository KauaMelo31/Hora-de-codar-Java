import java.util.Scanner;
public class ex5{
    public static void main(String[] args) {
        System.out.println("Digite um numero inteiro: ");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        if (num>0){
            System.out.println("Numero Positivo.");
        } else if (num==0){
            System.out.println("Numero Neutro.");
        } else {
            System.out.println("Numero Negativo.");
        }
  }
}