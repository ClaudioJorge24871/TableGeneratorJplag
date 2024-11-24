import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real \t: " );
        double x = Double.valueOf(keyb.nextLine());
        int pint = Integer.valueOf( x ) ;
        double pdec = Double.valueOf( x ) - pint ;
        System.out.print("Parte inteira \t= " + pint );
        System.out.print("\nParte decimal \t= " + Math.abs( pdec ) );
    }

}