import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Se realiza la declaracion de la matriz
        int matriz[][];
        //Se realiza la declaracion de los espacios de la matriz
        matriz = new int[7][7];

        //Recorremos la matriz para poder encontrar la diagonal principal
        for(int f=0 ; f<7 ; f++){
            for(int c=0 ; c<7 ; c++){
                //Esto va pasar cada que sea la diagonal principal
                if(f == c){
                    matriz[f][c] = 1; //Si son iguales, sera 1
                } else{
                    matriz[f][c] = 0; //Si no es igual, sera 0
                }
            }
        }
        //Mostramos la matriz identidad
        System.out.println("La matriz identidad es: ");
        for(int f=0 ; f<7 ; f++){
            for(int c=0 ; c<7 ; c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println(" ");
        }
    }
}