package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

            float a, b, res;
            char choice;
            Scanner scan = new Scanner(System.in);

            do
            {
                System.out.print("Calculator demo");
                System.out.print("1. Addition\n");
                System.out.print("2. Subtraction\n");
                System.out.print("3. Multiplication\n");
                System.out.print("4. Division\n");
                System.out.print("5. Exit\n\n");
                System.out.print("Enter Your Choice : ");
                choice = scan.next().charAt(0);
//                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
                switch(choice)
                {
                    case '1' : System.out.print("Enter Two Number : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a + b;
                        System.out.print("Result = " + res);
                        break;
                    case '2' : System.out.print("Enter Two Number : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a - b;
                        System.out.print("Result = " + res);
                        break;

                    case '3' : System.out.print("Enter Two Number : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a * b;
                        System.out.print("Result = " + res);
                        break;

                    case '4' : System.out.print("Enter Two Number : ");
                        a = scan.nextFloat();
                        b = scan.nextFloat();
                        res = a / b;
                        System.out.print("Result = " + res);
                        break;

                    case '5' : System.exit(0);
                        break;

                    default : System.out.print("Wrong Choice!!!");
                        break;
                }
                System.out.print("\n---------------------------------------\n");
            }while(choice != 5);
        }
    }


