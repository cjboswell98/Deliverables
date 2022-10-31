import java.util.Scanner;
import java.io.*;

public class PowersTable {
    public static void main(String args[]) {
        int num, square, cube;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Learn your squares and cubes!");
        System.out.print("Enter an integer: ");
        num = scnr.nextInt();
        
        System.out.println(" Number          Squared          Cubed");
        System.out.println("========        =========        =======");
        
        for(int i = 1; i <= num; i++) {
            
            square = i * i;
            cube = i * i * i;
            
            System.out.println("   " + i + "               " + square + "                " + cube);
    
        }
    }
}
