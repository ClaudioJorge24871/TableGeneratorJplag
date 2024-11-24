import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real \t: " );
        double num = Double.valueOf(keyb.nextLine());
        System.out.print("Parte inteira \t= " + ( Integer.valueOf( num ) ) );
        System.out.print("\nParte decimal \t= " + Math.abs( num - ( Integer.valueOf( num ) ) ) );
    }

}