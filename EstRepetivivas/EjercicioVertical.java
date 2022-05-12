package EstRepetivivas;

import java.util.Scanner;


public class EjercicioVertical {

    public static void nombrevertical() {
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre=lt.next();
        for (int i = 0; i < nombre.length(); i++) {
            System.out.println(nombre.charAt(i));
            
        }

        
    }
        
}