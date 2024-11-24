import java.util.Scanner;

public class Ficha03_030 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("Número real    : " );
        double xval = Double.valueOf(keyb.nextLine());
        int intp = Integer.valueOf( xval ) ;
        System.out.print("Parte inteira  = " + intp );
        double decp = xval - intp ;
        double dob = ( decp * ( - 1 ) ) * 2 ;
        if(decp < 0 ){
            decp +=dob;
        }
        System.out.print("\nParte decimal  = " + decp );
    }

}