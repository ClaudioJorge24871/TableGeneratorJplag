import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n" );
        System.out.print("\nQuilómetros iniciais (km) 	: " );
        double km1 = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km) 	: " );
        double km2 = Double.valueOf(keyb.nextLine());
        double p = 1.0 + ( Math.random( ) * 0.5 ) ;
        System.out.print("Preço do combutível (€/l) 	: " + p );
        double c = 3.1 + Math.random( ) * ( 9.9 - 3.1 ) ;
        System.out.print("\nConsumo médio (l/100 km)	: " + c );
        double km = km2 - km1 ;
        double custo = ( c * p * km ) / 100 ;
        int euros = Integer.valueOf( custo ) ;
        int centimos = Integer.valueOf( ( custo - euros ) * 100 ) ;
        System.out.print("\n\nCusto da viagem" );
        System.out.print("\nEuros 				: " + euros );
        System.out.print("\nCêntimos 			: " + centimos );
    }

}