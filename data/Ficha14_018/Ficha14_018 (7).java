import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz" );
        System.out.print("\nNúmero de termos : " );
        int termos = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + wallis(termos ) );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double wallis( int termos){
        double fin = 1 ;
        for( int i = 1; i < termos + 1; i = i + 1 ) {
            double c1 = ( 2.0 * i ) / ( 2.0 * i - 1.0 ) ;
            double c2 = ( 2.0 * i ) / ( 2.0 * i + 1 ) ;
            fin = fin * c1 * c2 ;
        }
        return fin * 2 ;
    }

}