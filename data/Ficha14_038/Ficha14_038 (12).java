import java.util.Scanner;

public class Ficha14_038 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("termos : " );
        int n = Integer.valueOf(keyb.nextLine());
        System.out.print("pi( " + n + ") = " + ( 4 / ( 1 + 1 / e(2 , n ) ) ) );
        System.out.print("\n_PI = " + Math.PI );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double e( int n , int l){
        if(n >= l ){
            return n ;
        }else{
            return ( 2 * n - 1 ) + Math.pow( n , 2 ) / e(n + 1 , l ) ;
        }
    }

}