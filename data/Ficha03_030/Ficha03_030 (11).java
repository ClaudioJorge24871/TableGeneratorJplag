import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real 	: " );
        double valor = Double.valueOf(keyb.nextLine());
        int parteinteira = Integer.valueOf( valor ) ;
        double partedecimal = valor - Integer.valueOf( valor ) ;
        System.out.print("Parte inteira 	= " + parteinteira );
        System.out.print("\nParte decimal 	= " + partedecimal );
    }

}