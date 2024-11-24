import java.util.Scanner;

public class Ficha14_018 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Fórmula de Leibniz\n" );
        System.out.print("Número de termos : " );
        int termos = Integer.valueOf(keyb.nextLine());
        System.out.print("PI = " + pi(termos ) * 2 );
    }

    //::::::::::::::::::::::::::::::::::::::::::::::::::
    //User Defined Functions Code
    //::::::::::::::::::::::::::::::::::::::::::::::::::
    public static double pi( int termos){
        double multiplicacao = 1 ;
        for( int i = 1; i < termos + 1; i = i + 1 ) {
            multiplicacao = multiplicacao * ( ( 2 * i ) / Double.valueOf( 2 * i - 1 ) ) * ( ( 2 * i ) / Double.valueOf( 2 * i + 1 ) ) ;
        }
        return multiplicacao ;
    }

}