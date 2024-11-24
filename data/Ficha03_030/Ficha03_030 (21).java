import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real 	: " );
        double numReal = Double.valueOf(keyb.nextLine());
        int partInt = Integer.valueOf( numReal ) ;
        double partDec = numReal - partInt ;
        System.out.print("Parte inteira 	= " + partInt );
        double doubro = ( partDec * ( - 1.0 ) ) * 2.0 ;
        if(partDec < 0 ){
            partDec +=doubro;
        }
        System.out.print("\nParte decimal 	= " + partDec );
    }

}