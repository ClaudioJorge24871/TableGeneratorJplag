import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n" );
        System.out.print("\nQuilómetros iniciais (km) 	: " );
        double kmini = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km)     : " );
        double kmfin = Double.valueOf(keyb.nextLine());
        //calculo
        double km = kmfin - kmini ;
        double custo = Math.random( ) * 0.5 + 1 ;
        double cons = Math.random( ) * 6.8 + 3.1 ;
        double consfinal = ( km * cons / 100 ) ;
        double custofinal = ( consfinal * custo ) ;
        int euros = Integer.valueOf( custofinal ) ;
        int centi = Integer.valueOf( custofinal * 100 ) % 100 ;
        System.out.print("Preço do combutível (€/l)     : " + custo );
        System.out.print("\nConsumo médio (l/100 km)    : " + cons );
        System.out.print("\n\nCusto da viagem" );
        System.out.print("\nEuros 				: " + euros );
        System.out.print("\nCêntimos 			: " + centi );
    }

}