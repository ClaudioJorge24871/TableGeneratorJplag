import java.util.Scanner;

public class Ficha14_038 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("termos : " );
        int n = Integer.valueOf(keyb.nextLine());
        System.out.print("pi( " + n + ") = " + ( 4 / ( 1 + 1 / piw(2 , n ) ) ) );
        System.out.print("\n_PI = " + Math.PI );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double piw( int n , int limite){
        if(n >= limite ){
            return n ;
        }else{
            return ( 2 * n - 1 ) + Integer.valueOf( Math.pow( n , 2 ) ) / piw(n + 1 , limite ) ;
        }
    }

}