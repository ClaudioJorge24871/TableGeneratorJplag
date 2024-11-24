import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n" );
        System.out.print("\nQuilómetros iniciais (km)     : " );
        double iniciais = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km)     : " );
        double finais = Double.valueOf(keyb.nextLine());
        double precocombustivel = ( Math.random( ) * 0.5 + 1 ) ;
        System.out.print("Preço do combutível (€/l)     : " + precocombustivel );
        double consumo = ( Math.random( ) * 6.8 + 3.1 ) ;
        System.out.print("\nConsumo médio (l/100 km)    : " + consumo );
        double quilo = finais - iniciais ;
        double medio = precocombustivel * consumo * quilo / 100 ;
        int euros = Integer.valueOf( medio ) ;
        int centimos = Integer.valueOf( medio * 100 ) % 100 ;
        System.out.print("\n\nCusto da viagem" );
        System.out.print("\nEuros                 : " + euros );
        System.out.print("\nCêntimos             : " + centimos );
    }

}