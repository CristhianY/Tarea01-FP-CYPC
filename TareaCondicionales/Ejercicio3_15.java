package TareaCondicionales;

import java.util.Scanner;

/**
 * ejercicio315
 */
public class Ejercicio3_15 {
    static Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {
        //defifnir variables 
        int numero;
        String dia;
        //datos de entrada
        System.out.println("ingrese el numero :");
        numero=lt.nextInt();
        //proceso
        if (numero==1) {
            dia="el dia es domingo";
        }else if(numero==2) {
            dia="el dia es lunes ";
        }else if(numero==3) {
            dia="el dia es martes ";
        }else if(numero==4) {
            dia="el dia es miercoles ";
        }else if(numero==5) {
            dia="el dia es jueves ";
        }else if(numero==6) {
            dia="el dia es viernes ";
        }else if(numero==7) {
            dia="el dia es sabado ";
        }else {
            dia="no existe el dia ";
        }
        //Datos de salida 
        System.out.println(dia);
    }

}