package ejercicios;

import java.util.Scanner;

public class ejercicio3_3 {
    static Scanner lt=new Scanner(System.in);

    public static void main(String[] args) {
        //Declararar la varible 
        int costo;
        String mensaje;
        //Datos de entrada
        System.out.println("ingrese el costo: " );
        costo=lt.nextInt();
        //proceso
        if (costo<=10) {
            mensaje="puede comprarle una tarjeta de "+costo;
            }else if (costo>=11 && costo<=100) {
            mensaje="puede comprarle chocolate de "+costo;    
            }else if (costo>=101 && costo<=250) {
            mensaje="puede comprarle flores de "+costo;    
            }else if(costo>=251) {
            mensaje="puede comprarle un anillo de "+costo;    
            }else{
            mensaje="no le comprara nada";
            }
            //Datos de salida 
            System.out.println(mensaje);
            

    }
}