import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real \t: " );
        double x = Double.valueOf(keyb.nextLine());
        int pInt = Integer.valueOf( x ) ;
        System.out.print("Parte inteira\t = " + pInt );
        System.out.print("\nParte decimal\t = " + Math.abs( x - pInt ) );
    }

}