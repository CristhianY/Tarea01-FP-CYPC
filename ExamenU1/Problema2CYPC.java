package ExamenU1;

import java.util.Scanner;

public class Problema2CYPC{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    //definir vareables
    double Mbase = 0, igv = 0, descuento = 0, Mtotal = 0;

    //datos de entrada..
    System.out.print("Dame el precio del artefacto: ");
    Mbase = in.nextDouble();
    
    //estructura condicional
    if(Mbase >2000 ){
      descuento = Mbase*0.10;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("El descuento de tu artefacto es: "+descuento);
      System.out.println("El monto total de pagar es: "+ Mtotal);
      System.out.print("El igv es de: "+igv);
    }else if(Mbase <= 2000 && Mbase>1000){
      descuento = Mbase*0.05;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("El descuento de tu artefacto es: "+descuento);
      System.out.println("El monto total de pagar es: "+Mtotal);
      System.out.print("El igv de tu artefacto es: "+igv);
    }else if(Mbase <=1000 && Mbase>500){
      descuento = Mbase*0.02;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("El descuento de tu artefacto es: "+descuento);
      System.out.println("El monto total de pagar es: "+Mtotal);
      System.out.print("El igv de tu artefacto es de: "+igv);
    }
  }
}