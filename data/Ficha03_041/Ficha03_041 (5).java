import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n\n" );
        System.out.print("Quilómetros iniciais (km)\t: " );
        double qi = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km)\t: " );
        double qf = Double.valueOf(keyb.nextLine());
        double kmf = qf - qi ;
        double pre = ( Math.random( ) / 2 ) + 1.0 ;
        double consumo = ( Math.random( ) * 6.8 ) + 3.1 ;
        System.out.print("Preço do combutível (€/l)    : " + pre + "\n" );
        System.out.print("Consumo médio (l/100 km)     : " + consumo + "\n" );
        double euros = ( pre * consumo ) * ( kmf / 100.0 ) ;
        System.out.print("\nCusto da viagem\nEuros\t\t\t: " + Integer.valueOf( euros ) + "\nCêntimos\t\t\t: " + Integer.valueOf( Math.abs( ( ( euros - Integer.valueOf( euros ) ) * 100.0 ) ) ) );
    }

}