import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n" );
        System.out.print("\nQuilómetros iniciais (km)\t : " );
        double ki = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km)\t : " );
        double kf = Double.valueOf(keyb.nextLine());
        double p = 0 ;
        double consumomedio = 0 ;
        p = Math.random( ) / 2 + 1 ;
        consumomedio = Math.random( ) * 6.8 + 3.1 ;
        double kmtotal = kf - ki ;
        double custofinal = ( ( ( consumomedio * kmtotal ) / 100 ) ) * p ;
        int inteira = Integer.valueOf( custofinal ) ;
        double decimal = custofinal - inteira ;
        System.out.print("Preço do combutível (€/l)\t : " + p );
        System.out.print("\nConsumo médio (l/100 km)\t : " + consumomedio );
        System.out.print("\n\nCusto da viagem" );
        System.out.print("\nEuros\t : " + Integer.valueOf( custofinal ) );
        System.out.print("\nCêntimos\t : " + Integer.valueOf( ( decimal * 100 ) ) );
    }

}