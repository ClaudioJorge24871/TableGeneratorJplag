import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real 	: " );
        double n = Double.valueOf(keyb.nextLine());
        int n1 = Integer.valueOf( n ) ;
        double n2 = n - n1 ;
        if(n2 < 0 ){
            n2 = n2 * - 1 ;
        }
        System.out.print("Parte inteira 	= " + n1 );
        System.out.print("\nParte decimal 	= " + n2 );
    }

}