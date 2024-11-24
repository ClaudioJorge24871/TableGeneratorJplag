import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real \t: " );
        double N = Double.valueOf(keyb.nextLine());
        System.out.print("Parte inteira = " + Integer.valueOf( N ) );
        double decimal = N - Integer.valueOf( N ) ;
        if(decimal > 0 ){
            System.out.print("\nParte decimal = " + decimal );
        }else{
            System.out.print("\nParte decimal = " + ( decimal - decimal * 2 ) );
        }
    }

}