import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        double price = Math.random( ) * 0.5 + 1 ;
        double consm = Math.random( ) * 6.8 + 3.1 ;
        System.out.print("Custo da viagem de automóvel\n\n" );
        System.out.print("Quilómetros iniciais (km) 	: " );
        double kmi = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km) 	 	: " );
        double kmf = Double.valueOf(keyb.nextLine());
        System.out.print("Preço do combutível (€/l) 	: " + price );
        System.out.print("\nConsumo médio (l/100 km)    : " + consm );
        System.out.print("\n\nCusto da viagem\n" );
        double dist = kmf - kmi ;
        double gast = price * consm * dist / 100 ;
        int eur = Integer.valueOf( gast ) ;
        int cent = Integer.valueOf( gast * 100 ) % 100 ;
        System.out.print("Euros 				: " + eur );
        System.out.print("\nCêntimos 			 : " + cent );
    }

}