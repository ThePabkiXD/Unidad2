package practica4;

import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Scanner peso = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad en pesos mexicano: ");
        double mxn = peso.nextDouble();
        
        double dolar = (mxn/17.13);
        double euro = (mxn/19.29);
        
        peso.close();
        
        System.out.println("La cantidad en dolares es: " + dolar);
        System.out.println("La cantidad en euros es: " + euro);
        
        
 
    }
    
}
