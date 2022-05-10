package TareaCondicionales;

import java.util.Scanner;

public class Ejercicio3_11 {
    static Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {
        //definir variable 
        int años;
        String resbonospe;
        //datos de entrada 
        System.out.println("ingrese los años ");
        años=lt.nextInt();
        //proceso
        if (años==1) {
            resbonospe="se otorgara un bono de 100";
        }else if (años==2) {
            resbonospe="se otorgara un bono de 200";
        }else if (años==3) {
            resbonospe="se otorgara un bono de 300";
        }else if (años==4) {
            resbonospe="se otorgara un bono de 400";
        }else if (años==5) {
            resbonospe="se otorgara un bono de 500";
        }else if (años>5) {
            resbonospe="se otorgara un bono de 1000";
        }else {
            resbonospe="no se otorgara un bono";
        }
        //datos de salida 
        System.out.println(resbonospe);
    }
}