import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real \t: " );
        double n = Double.valueOf(keyb.nextLine());
        int i = Integer.valueOf( n ) ;
        System.out.print("Parte inteira \t= " + Integer.valueOf( n ) );
        double d = Math.abs( n - i ) ;
        System.out.print("\nParte decimal \t= " + d );
    }

}