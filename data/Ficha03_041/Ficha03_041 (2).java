import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n" );
        System.out.print("\nQuilómetros iniciais (km) : " );
        double ki = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km) : " );
        double kf = Double.valueOf(keyb.nextLine());
        double p = ( Math.random( ) * 0.5 + 1 ) ;
        double cm = ( Math.random( ) * 6.8 + 3.1 ) ;
        System.out.print("Preço do combutível (€/l) : " + p );
        System.out.print("\nConsumo médio (l/100 km) : " + cm + "\n" );
        System.out.print("\nCusto da viagem" );
        double kt = kf - ki ;
        double ct = p * cm * kt / 100 ;
        System.out.print("\nEuros : " + Integer.valueOf( ct * 100 ) / 100 );
        System.out.print("\nCêntimos : " + Integer.valueOf( ct * 100 ) % 100 );
    }

}