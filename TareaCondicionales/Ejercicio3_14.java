package TareaCondicionales;

import java.util.Scanner;

public class Ejercicio3_14 {
static Scanner lt=new Scanner (System.in);
    public static void main(String[] args) {
        //ingresar variable
        int calificacion;
        String letra;
        //datos de entrada
        System.out.println("ingrese la calificacion :");
        calificacion=lt.nextInt();
        //proceso
        if (calificacion>=0 && calificacion<=10) {
            if (calificacion==10) {
                letra="su calificacion es A";
            }else if (calificacion==9) {
                letra="su calificacion es B";
            }else if (calificacion==8) {
                letra="su calificacion es C";
            }else if (calificacion<=7 && calificacion>=6) {
                letra="su calificacion es D";
            }else {
                letra="su calificacion es F";
            }
        } else {
            letra="su clasificacion es F";
        }
        //Datos de salida }
        System.out.println(letra);

    }
}