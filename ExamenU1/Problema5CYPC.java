package ExamenU1;

import java.util.Scanner;

public class Problema5CYPC{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    //definir vareables
    int algoritmos = 0;
    //datos de entrada
    System.out.println("para poder acceder a los algoritmos anteriores tiene las siguientes opciones:");    
    System.out.println("ingrese 1 para acceder al algoritmo de ingreso de postulante.");
    System.out.println("ingrese 2 para acceder al algoritmo de compra de un artefacto.");
    System.out.println("ingrese 3 para acceder al algoritmo de operaciones matematicas.");
    System.out.print("ingrese el algoritmo que desse: ");
    algoritmos = in.nextInt();
    if(algoritmos == 1){
      double nota =0, exaC =0, exaE=0, exaT =0;
    //datos de entrada
    System.out.print("cual es la nota del postulante: ");
    nota = in.nextInt();
    if(nota>=17 && nota<=20){
      exaC = nota * 0.40;
      exaE = nota * 0.35;
      exaT = nota * 0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante obtiene la vacante y el nivel del estudiante es 4");
;
    }else if(nota<17 && nota>=14){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante obtiene la vacante y el nivel del estudiante es 3");
    }else if(nota<14 && nota >=11){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante obtiene la vacante y el nivel del estudiante es 2");
    }else if(nota<11){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("el examen de conocimiento vale el 40%, y el postulando obtuvo de puntaje :"+exaC);
      System.out.println("la entrevista personal vale el 35%, y el postulante obtuvo de puntaje: "+exaE);
      System.out.println("el test psicologico vale el 25%, y el postulante obtuvo de puntaje: "+exaT);
      System.out.println("la suma total del puntaje del estudiante es: "+nota);
      System.out.print("el postulante no obtiene la vacante y el nivel del estudiante es 1");
      
    }else{
      System.out.print("Error, la nota no debe pasar de 20.");
    }
  }else if(algoritmos ==2){
      double Mbase = 0, igv = 0, descuento = 0, Mtotal = 0;

    //datos de entrada..
    System.out.print("dame el precio de tu artefacto: ");
    Mbase = in.nextDouble();
    
    //estructura condicional
    if(Mbase >2000 ){
      descuento = Mbase*0.10;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("el descuento de tu artefacto es: "+descuento);
      System.out.println("el monto total de pagar es: "+ Mtotal);
      System.out.print("el igv es: "+igv);
    }else if(Mbase <= 2000 && Mbase>1000){
      descuento = Mbase*0.05;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("el descuento de tu artefacto es: "+descuento);
      System.out.println("el monto total de pagar es: "+Mtotal);
      System.out.print("el igv de tu artefacto es: "+igv);
    }else if(Mbase <=1000 && Mbase>500){
      descuento = Mbase*0.02;
      Mtotal = Mbase-descuento;
      igv = Mtotal*0.18;
      System.out.println("el descuento de tu artefacto es: "+descuento);
      System.out.println("el monto total de pagar es: "+Mtotal);
      System.out.print("el igv de tu artefacto es: "+igv);
    }
  }else if(algoritmos ==3){
      double valor1 = 0, valor2 = 0, resultado = 0, raiz = 0, modulo = 0;
    String operacion = "";
      System.out.print("¿que operacion desees realizar?");
    operacion = in.next();
    //operaciones
    if("+".equals(operacion)){
      System.out.print("dame el primer valor de tu suma: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu suma: ");
      valor2 = in.nextDouble();
      resultado = valor1 + valor2;      
    }else if("-".equals(operacion)){
      System.out.print("dame el primer valor de tu resta es: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu resta es: ");
      valor2 = in.nextDouble();
      resultado = valor1 - valor2;
      System.out.print("el resultado de tu resta es "+resultado);
      
    }else if("*".equals(operacion)){
      System.out.print("dame el primer valor de tu multiplicacion: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu multiplicacion: ");
      valor2 = in.nextDouble();
      resultado = valor1 * valor2;
      System.out.print("el resultado de tu multiplicacion es: "+ resultado);
      
    }else if("/".equals(operacion)){
      System.out.print("dame el primer valor de tu division: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu division: ");
      valor2 = in.nextDouble();
      resultado = valor1/valor2;
      System.out.print("el resultado de tu division es "+resultado);
      
    }else if("v".equals(operacion)){
      System.out.print("dame la base de tu potencia: ");
      valor1 = in.nextDouble();
      System.out.print("dame el exponente de tu potencia: ");
      valor2 = in.nextDouble();
      System.out.print("el resultado de tu potencia es "+ 
      Math.pow(valor1,valor2));
    }else if("R".equals(operacion)){
      System.out.print("dame el valor: ");
      valor1 = in.nextDouble();
      raiz = Math.sqrt(valor1);
      System.out.print("la raiz cuadrada de "+valor1+ " es " + raiz);
    }else if("%".equals(operacion)){
      System.out.print("dame el primer valor de tu modulo: ");
      valor1 = in.nextDouble();
      System.out.print("dame el segundo valor de tu modulo: ");
      valor2 = in.nextDouble();
      resultado = valor1%valor2;
      System.out.print("el resultado de tu modulo es: "+resultado);
    }
  }else{
      System.out.print("el algoritmo que ingresaste no existe. Solo puedes acceder a los algoritmos: 1,2,3. gracias :3");
  }
}
    
}