package EstRepetivivas;

/**
 * Ejercicio
 */
public class Ejercicio {

    public static void imprimirWhileN1_10() {
        int numInit=1;
        while (numInit>=20) {
            System.out.println(numInit);
            numInit=numInit+1;
            
        }
        
    }
    public static void imprimirWhileN1_20() {
        int numInit=1;
        do {
            System.out.println(numInit);
        } while (numInit<=20);
        
    }

    public static void main(String[] args) {
        System.out.println("Imprime While:"); imprimirWhileN1_10();
        System.out.println("Imprime Do While:"); imprimirWhileN1_10();
    }

}