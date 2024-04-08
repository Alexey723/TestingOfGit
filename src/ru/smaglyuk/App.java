package ru.smaglyuk;
import java.util.Scanner;


public class App 
{

    public static int someNumber = 23; //добавляем нечто новое, чтобы прошёл ещё один коммит

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in); //добавляем сканнер для ввода данных с консоли
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        int y = 2;
        int result = x*y+someNumber;
        System.out.println("Ваше число умноженное на 2: " + result);
        scan.close(); //закрываем наш сканнер
    }

    //этот комментарий нужнем для очередного коммита

    //проверка связи
}
