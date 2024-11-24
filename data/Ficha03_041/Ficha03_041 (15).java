import java.util.Scanner;

public class Ficha03_041 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Custo da viagem de automóvel\n\n" );
        System.out.print("Quilómetros iniciais (km) \t: " );
        double kmi = Double.valueOf(keyb.nextLine());
        System.out.print("Quilómetros finais (km) \t: " );
        double kmf = Double.valueOf(keyb.nextLine());
        double dist = kmf - kmi ;
        double preço = Math.random( ) * 0.5 + 1 ;
        double consumo = Math.random( ) * 6.8 + 3.1 ;
        System.out.print("Preço do combutível (€/l) \t: " + preço );
        System.out.print("\nConsumo médio (l/100 km)\t: " + consumo );
        System.out.print("\n\nCusto da viagem" );
        double custo = dist * preço * consumo / 100.0 ;
        System.out.print("\nEuros \t\t\t\t: " + Integer.valueOf( custo ) );
        System.out.print("\nCêntimos \t\t\t: " + ( Integer.valueOf( custo * 100 ) % 100 ) );
    }

}