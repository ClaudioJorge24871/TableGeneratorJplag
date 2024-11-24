import java.util.Scanner;

public class Ficha14_038 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("termos : " );
        int t = Integer.valueOf(keyb.nextLine());
        System.out.print("pi(  " + t + ") = " + ( 4 / ( 1 + 1 / pi(2 , t ) ) ) );
        System.out.print("\n_PI = " + Math.PI );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double pi( int n , int t){
        if(n >= t ){
            return n ;
        }else{
            return ( 2 * n - 1 ) + Integer.valueOf( Math.pow( n , 2 ) ) / pi(n + 1 , t ) ;
        }
    }

}