package ExamenU1;

import java.util.Scanner;

public class Problema4CYPC{
  public static void main(String args[]){
    //vareables
    int edad =0;
    String sexo = "";
    //datos de entrada
    Scanner in = new Scanner(System.in);
    System.out.print("¿cual es tu edad? ");
    edad = in.nextInt();

    System.out.print("¿cual es tu sexo? ");
    sexo = in.next();
    //condicionales
    if(edad >=70){
      System.out.print("Se le aplica el tipo C");
    }else if(edad>=16 && edad<=69 && "mujer".equalsIgnoreCase(sexo)){
      System.out.print("Se le aplica el tipo B");
    }else if(edad>=16 && edad <=69 && "hombre".equalsIgnoreCase(sexo)){
      System.out.print("Se le aplica el tipo A");
    }else if(edad<16){
      System.out.print("Se le aplica el tipo A");
    }
    
  }
}