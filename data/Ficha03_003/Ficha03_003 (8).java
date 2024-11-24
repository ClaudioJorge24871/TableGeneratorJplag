import java.util.Scanner;

public class Ficha03_003 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Valor de X\t: " );
        double x = Double.valueOf(keyb.nextLine());
        System.out.print("Exponencial \t= " + Math.exp( x ) );
        System.out.print("\nPotencia \t= " + Math.pow( Math.E , x ) );
        System.out.print("\nOperador \t= " + Math.pow( Math.E , x ) );
    }

}