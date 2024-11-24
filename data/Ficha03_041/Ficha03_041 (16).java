import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n\n" );
        System.out.print("Quilómetros iniciais (km) 	: " );
        double km1 = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km) 	: " );
        double km2 = Double.valueOf(keyb.nextLine());
        double kmfinal = km2 - km1 ;
        double preco = Math.random( ) * 0.5 + 1 ;
        double consumo = Math.random( ) * 6.8 + 3.1 ;
        double precofinal = consumo * 0.01 * preco * kmfinal ;
        System.out.print("Preço do combutível (€/l) 	: " + preco );
        System.out.print("\nConsumo médio (l/100 km)	: " + consumo );
        System.out.print("\n\nCusto da viagem\nEuros 				: " + Integer.valueOf( precofinal ) );
        System.out.print("\nCêntimos 			: " + Integer.valueOf( precofinal * 100 ) % 100 );
    }

}