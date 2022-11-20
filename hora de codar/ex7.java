import java.util.Scanner;
public class ex7{
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      System.out.println("Informe um número fazendo favor:");
      int num1=in.nextInt();
      System.out.println("Mais um:");
      int num2=in.nextInt();
      System.out.println("O último:");
      int num3=in.nextInt();
      int soma;
      if(num1>num2 && num1>num3){
        if(num2>num3){
          soma=num1+num2;
          System.out.println(num1+"+"+num2+"="+soma);
        }else{
          soma=num1+num3;
          System.out.println(num1+"+"+num3+"="+soma);
        }
      }else if(num2>num3&&num2>num1){
        if(num1>num3){
          soma=num2+num1;
          System.out.println(num2+"+"+num1+"="+soma);
        }else{
          soma=num2+num3;
          System.out.println(num2+"+"+num3+"="+soma);
        }
      }else{
        if(num1>num2){
          soma=num3+num1;
          System.out.println(num3+"+"+num1+"="+soma);
        }else{
          soma=num3+num1;
          System.out.println(num3+"+"+num2+"="+soma);
        }
      }
    }
}