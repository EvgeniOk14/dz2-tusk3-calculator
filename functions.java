import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class functions
{ 

    static int sumData(int a, int b) throws IOException
    {
        int sum = a + b;
        String S = String.format("%s + %s = %s", a,b,sum);
        writelog.records(S);
        return a + b;
    }

    static int subData(int a,int b) throws IOException
    {
        int div = a - b;
        String S = String.format("%s - %s = %s", a,b,div);
        writelog.records(S);
        return a - b;
    }

    static int multData(int a, int b) throws IOException
    {
        int mult = a * b;
        String S = String.format("%s * %s = %s", a,b,mult);
        writelog.records(S);
        return a * b;
    }

    static double divData(double a, double b) throws IOException
    {
        double div = a / b;
        String S = String.format("%s + %s = %s", a,b,div);
        writelog.records(S);
        return a / b;
    }

    static int inputData1()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите первое число: ");
        String s = sc.nextLine();
        int number = Integer.parseInt(s);
        return number;
    }

    static int inputData2()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите второе число: ");
        String s = sc.nextLine();
        int number = Integer.parseInt(s);
        return number;

    }

    static int operation_number()
    {
        Scanner sc = new Scanner(System. in, "Cp866");
        System.out.println("Введите номер операции: ");
        String s = sc.nextLine();
        int number = Integer.parseInt(s);
        return number;    
    }


    static void operationList()
    {
        System.out.println("""
            Выберете математическую операцию:
            1 - сумма
            2 - вычитание
            3 - умножение
            4 - деление 
                """);
    }
    
}