import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real    : " );
        double x = Double.valueOf(keyb.nextLine());
        System.out.print("Parte inteira = " + Integer.valueOf( x ) + "\nParte decimal = " + Math.abs( ( x - Integer.valueOf( x ) ) ) );
    }

}