import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real\t : " );
        double n1 = Double.valueOf(keyb.nextLine());
        int i1 = Integer.valueOf( n1 ) ;
        double d1 = 0 ;
        System.out.print("Parte inteira = " + i1 );
        if(n1 < 0 ){
            d1 = n1 + ( - 1 * i1 ) ;
            System.out.print("\nParte decimal = " + d1 * ( - 1 ) );
        }else{
            d1 = n1 - i1 ;
            System.out.print("\nParte decimal = " + d1 );
        }
    }

}