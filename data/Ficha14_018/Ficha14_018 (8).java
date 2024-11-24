import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz\n" );
        System.out.print("Número de termos : " );
        int t = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + libniz(t ) );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double libniz( int n){
        double pro = 1.0 ;
        for( int i = 1; i < n + 1; i = i + 1 ) {
            double t1 = ( 2.0 * i ) / ( 2.0 * i - 1 ) ;
            double t2 = ( 2.0 * i ) / ( 2.0 * i + 1 ) ;
            pro = pro * t1 * t2 ;
        }
        return 2 * pro ;
    }

}