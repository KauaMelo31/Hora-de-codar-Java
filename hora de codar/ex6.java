import java.util.Scanner;
public class ex6{
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      System.out.println("Infrome um número fazendo favor:");
      int num1=in.nextInt();
      System.out.println("Mais um:");
      int num2=in.nextInt();
      System.out.println("O último:");
      int num3=in.nextInt();

      if(num1>num2 && num1>num3){
        System.out.println("O número maior é "+num1);
      }else if(num2>num3&&num2>num1){
        System.out.println("O número maior é "+num2);
      }else{
         System.out.println("O número maior é "+num3);
      }  
    }
}