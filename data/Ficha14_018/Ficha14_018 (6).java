import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz" );
        System.out.print("\nNúmero de termos : " );
        int N = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + ( Produtorio(N ) ) );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double Produtorio( int count){
        double pi = 1 ;
        for( int n = 1; n < count + 1; n = n + 1 ) {
            pi = pi * ( ( 2.0 * n ) / ( 2.0 * n - 1.0 ) ) * ( ( 2.0 * n ) / ( 2.0 * n + 1.0 ) ) ;
        }
        return pi * 2 ;
    }

}