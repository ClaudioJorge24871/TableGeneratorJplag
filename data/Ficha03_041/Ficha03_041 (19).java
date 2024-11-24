import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n\n" );
        System.out.print("Quilómetros iniciais (km)     : " );
        double ki = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km)     : " );
        double kf = Double.valueOf(keyb.nextLine());
        //gerar preço do combustível [1.0 , 1.5{
        double p = Math.random( ) * 0.5 + 1 ;
        System.out.print("Preço do combutível (€/l)     : " + p );
        //gerar o consumo do automovel [3.1 , 9.9[
        double g = Math.random( ) * 6.8 + 3.1 ;
        System.out.print("\nConsumo médio (l/100 km)    : " + g );
        //calcular o preço da viagem
        double k = kf - ki ;
        double custo = p * g * k / 100 ;
        System.out.print("\n\nCusto da viagem\n" );
        int euros = Integer.valueOf( custo ) ;
        int cent = Integer.valueOf( custo * 100 ) % 100 ;
        System.out.print("Euros                 : " + euros );
        System.out.print("\nCêntimos             : " + cent );
    }

}