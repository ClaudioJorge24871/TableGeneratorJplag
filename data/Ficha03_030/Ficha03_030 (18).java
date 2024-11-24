import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real 	: " );
        double n1 = Double.valueOf(keyb.nextLine());
        int part1 = Integer.valueOf( n1 ) ;
        double p1 = n1 - part1 ;
        System.out.print("Parte inteira 	= " + part1 );
        double doubro = ( p1 * ( - 1.0 ) ) * 2.0 ;
        if(p1 < 0 ){
            p1 +=doubro;
        }
        System.out.print("\nParte decimal	= " + p1 );
    }

}