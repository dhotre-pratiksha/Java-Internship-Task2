import java.util.Scanner;

public class Task2Calculator {

    static String company = "Elevate Labs";

    int instanceValue = 100;

    public static void main(String[] args) {

        int localValue = 50;

        Scanner sc = new Scanner(System.in);

        byte b = 10;
        short s = 200;
        int i = 1000;
        long l = 50000L;
        float f = 12.5f;
        double d = 25.75;
        char c = 'A';
        boolean flag = true;

        System.out.println("Primitive Data Types:");
        System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + c + " " + flag);

        System.out.print("Enter 1st number : ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd number : ");
        double num2 = sc.nextDouble();

        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        System.out.printf("Addition : %.2f\n", add);
        System.out.printf("Subtraction : %.2f\n", sub);
        System.out.printf("Multiplication : %.2f\n", mul);
        System.out.printf("Division : %.2f\n", div);

        int castedValue = (int) d;
        System.out.println("Type Casting double to int : " + castedValue);

        if(num2 == 0){
            System.out.println("Division by zero is not allowed!");
        }

        Task2Calculator obj = new Task2Calculator();

        System.out.println("Static variable : " + company);
        System.out.println("Instance variable : " + obj.instanceValue);
        System.out.println("Local variable : " + localValue);

        sc.close();
    }
}

