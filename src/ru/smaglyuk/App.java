package ru.smaglyuk;
import java.util.Scanner;


public class App 
{

    public int someNumber = 23;
    
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        int y = 2;
        int result = x*y;
        System.out.println("Ваше число умноженное на 2: " + result);
        scan.close();
    }
}
