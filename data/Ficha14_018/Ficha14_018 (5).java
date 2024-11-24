import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz\n" );
        System.out.print("Número de termos : " );
        int n = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + tobirama(n ) );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double tobirama( int n){
        double produto = 1.0 ;
        for( int i = 1; i < n + 1; i = i + 1 ) {
            produto = produto * ( ( ( 2.0 * i ) / ( 2.0 * i - 1.0 ) ) * ( ( 2.0 * i ) / ( 2.0 * i + 1.0 ) ) ) ;
        }
        return produto * 2.0 ;
    }

}