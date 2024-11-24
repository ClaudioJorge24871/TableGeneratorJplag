import java.util.Scanner;

public class Ficha14_038 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("termos : " );
        int tm = Integer.valueOf(keyb.nextLine());
        System.out.print("pi( " + tm + ") = " + ( 4 / ( 1 + 1 / pi(2 , tm ) ) ) );
        System.out.print("\n_PI = " + Math.PI );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double pi( int n , int tm){
        if(n >= tm ){
            return n ;
        }else{
            return ( n * 2 - 1 ) + Integer.valueOf( Math.pow( n , 2 ) ) / pi(n + 1 , tm ) ;
        }
    }

}