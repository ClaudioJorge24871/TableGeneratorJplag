import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n\n" );
        System.out.print("Quilómetros iniciais (km) 	 :" );
        double ki = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km) 	 :" );
        double kf = Double.valueOf(keyb.nextLine());
        double p = Math.random( ) * 0.5 + 1 ;
        System.out.print("Preço do combutível (€/l) 	 :" + p );
        double g = Math.random( ) * 6.8 + 3.1 ;
        System.out.print("\nConsumo médio (l/100 km)	 :" + g );
        double k = kf - ki ;
        double custo = p * g * k / 100 ;
        System.out.print("\nCusto da Viagem\n" );
        int Euros = Integer.valueOf( custo ) ;
        int Cêntimos = Integer.valueOf( custo * 100 ) % 100 ;
        System.out.print("\nEuros 				:" + Euros );
        System.out.print("\nCêntimos 	 		:" + Cêntimos );
    }

}