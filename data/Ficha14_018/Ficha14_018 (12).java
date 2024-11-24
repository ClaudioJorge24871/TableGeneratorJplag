import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz" );
        System.out.print("\nNúmero de termos : " );
        int n = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + p(n ) );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double p( int n){
        double produto = 1 ;
        for( int i = 1; i < n + 1; i = i + 1 ) {
            double t1 = ( 2.0 * i ) / ( 2.0 * i - 1.0 ) ;
            double t2 = ( 2.0 * i ) / ( 2.0 * i + 1.0 ) ;
            produto = produto * ( t1 * t2 ) ;
        }
        return 2 * produto ;
    }

}