import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner opc = new Scanner(System.in);
        double[] elementos = (20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3);
        int op;
        do {
        System.out.println ("Bienvenido, elija una opcion");
        System.out.println ("1. Suma del arreglo");
        System.out.println ("2. Multiplica del arreglo");
        System.out.println ("3. Salir");
        op = opcion.next.Int();
            switch (op){
                case 1:
                    double suma = 0;
                    for (int i = 0; i< elementos.lenght; i++) {
                        suma += elementos[i];
                        System.out.println ("La suma del arreglo es: " + suma);
                    }
                    break;
                case 2: 
                    double multiplicacion = 1.0;
                    for (int i = 0; i< elementos.lenght; i++)  {
                        multiplicacion *= elementos [i];
                        System.out.println ("LA multiplicacion del arreglo es: " + multiplicacion);
                    }
                    break;
                case 3:
                    System.out.println ("Salir");
                    break;
                default:
                       System.out.println ("La opcion no es valida");
                       System.out.println ("Regrese al Menu");
                    break;
            }               
    } while(op != 3);
    }
}