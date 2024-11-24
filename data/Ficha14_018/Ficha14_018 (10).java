import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz\n" );
        System.out.print("Número de termos : " );
        int termos = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + wallis(termos ) );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double wallis( int termos){
        double produto = 1.0 ;
        for( int n = 1; n < termos + 1; n = n + 1 ) {
            double t1 = ( 2.0 * n ) / ( 2.0 * n - 1 ) ;
            double t2 = ( 2.0 * n ) / ( 2.0 * n + 1 ) ;
            produto = produto * ( t1 * t2 ) ;
        }
        return 2 * produto ;
    }

}