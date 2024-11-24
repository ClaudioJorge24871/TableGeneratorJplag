import java.util.Scanner;

public class Ficha14_003 {

    static Scanner keyb = new Scanner(System.in);//keyboard

    //Main Function
    public static void main( String[] args) {
        System.out.print("x : " );
        double x = Double.valueOf(keyb.nextLine());
        System.out.print("g(" + x + ")= " );
        if(x < 1 ){
            x = - Math.pow( x , 2 ) + 1 ;
        }else{
            x--;
        }
        System.out.print(x );
    }

}