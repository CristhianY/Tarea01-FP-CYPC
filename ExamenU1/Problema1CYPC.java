import java.util.Scanner;

public class Problema1CYPC{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    //definir vareables
    double nota =0, exaC =0, exaE=0, exaT =0;
    //datos de entrada
    System.out.print("Cual es la nota que saco el postulante: ");
    nota = in.nextInt();
    if(nota>=17 && nota<=20){
      exaC = nota * 0.40;
      exaE = nota * 0.35;
      exaT = nota * 0.25;
      System.out.println("El examen de conocimiento vale el 40%, y el postulando obtuvo un puntaje de:"+exaC);
      System.out.println("La entrevista personal vale el 35%, y el postulante obtuvo un puntaje de: "+exaE);
      System.out.println("El test psicologico vale el 25%, y el postulante obtuvo un puntaje de: "+exaT);
      System.out.println("La sumatoria total del puntaje del estudiante es de: "+nota);
      System.out.print("El postulante obtiene la vacante y el nivel del estudiante es 4");
;
    }else if(nota<17 && nota>=14){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("El examen de conocimiento vale el 40%, y el postulando obtuvo un puntaje de:"+exaC);
      System.out.println("La entrevista personal vale el 35%, y el postulante obtuvo un puntaje de: "+exaE);
      System.out.println("El test psicologico vale el 25%, y el postulante obtuvo un puntaje de: "+exaT);
      System.out.println("La sumatoria total del puntaje del estudiante es de: "+nota);
      System.out.print("El postulante obtiene la vacante y el nivel del estudiante es 3");
    }else if(nota<14 && nota >=11){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("El examen de conocimiento vale el 40%, y el postulando obtuvo un puntaje de:"+exaC);
      System.out.println("La entrevista personal vale el 35%, y el postulante obtuvo un puntaje de: "+exaE);
      System.out.println("El test psicologico vale el 25%, y el postulante obtuvo un puntaje de: "+exaT);
      System.out.println("La sumatoria total del puntaje del estudiante es de: "+nota);
      System.out.print("El postulante obtiene la vacante y el nivel del estudiante es 2");
    }else if(nota<11){
      exaC = nota*0.40;
      exaE = nota*0.35;
      exaT = nota*0.25;
      System.out.println("El examen de conocimiento vale el 40%, y el postulando obtuvo un puntaje de:"+exaC);
      System.out.println("La entrevista personal vale el 35%, y el postulante obtuvo un puntaje de: "+exaE);
      System.out.println("El test psicologico vale el 25%, y el postulante obtuvo un puntaje de: "+exaT);
      System.out.println("La sumatoria total del puntaje del estudiante es de: "+nota);
      System.out.print("El postulante no obtiene la vacante y el nivel del estudiante es 1");
      
    }else{
      System.out.print("Error, la nota puede pasar de 20.");
    }
  }
}