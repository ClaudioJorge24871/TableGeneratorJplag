import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n" );
        System.out.print("\nQuilómetros iniciais (km) 	: " );
        double kmI = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km) 	: " );
        double kmF = Double.valueOf(keyb.nextLine());
        double kmT = kmF - kmI ;
        double pC = Math.random( ) * 0.5 + 1 ;
        double cons = Math.random( ) * 6.8 + 3.1 ;
        System.out.print("Preço do combutível (€/l) 	: " + pC );
        System.out.print("\nConsumo médio (l/100 km)	: " + cons + "\n" );
        System.out.print("\nCusto da viagem\n" );
        double custo = ( pC * cons * kmT ) / 100 ;
        int e = Integer.valueOf( custo ) ;
        int c = Integer.valueOf( custo * 100 ) % 100 ;
        System.out.print("Euros 				: " + e );
        System.out.print("\nCêntimos 			: " + c );
    }

}