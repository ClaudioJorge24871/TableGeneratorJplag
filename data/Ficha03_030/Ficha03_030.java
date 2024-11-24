import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real\t: " );
        double nr = Double.valueOf(keyb.nextLine());
        System.out.print("Parte inteira = " + Integer.valueOf( nr ) );
        System.out.print("\nParte decimal = " + Math.abs( ( nr - Integer.valueOf( nr ) ) ) );
    }

}