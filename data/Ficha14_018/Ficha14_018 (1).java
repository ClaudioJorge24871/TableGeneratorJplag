import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz\n" );
        System.out.print("Número de termos : " );
        int n = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + wallis(n ) );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double wallis( int n){
        double p = 2.0 ;
        for( int i = 1; i < n + 1; i = i + 1 ) {
            p = p * f(i ) ;
        }
        return p ;
    }
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double f( double n){
        return ( ( 2 * n ) / ( 2 * n - 1 ) ) * ( ( 2 * n ) / ( 2 * n + 1 ) ) ;
    }

}