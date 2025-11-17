//////// Varaible, Data Types,Operators and input/output in Java ////////

/*
 * write a java program to calcualte the area of shapes like circle,rectangle and triangle
 * using switch case the user will choose the shape and provide the necessary input to calculate the area.
 * the switch case should be inside the while loop so that the user can calculate the area of multiple shapes until they choose to exit.
 * Use appropriate data types and operators to perform the calculations.
 * use different classes and methods to organize the code. like Shape, Circle, Rectangle, Triangle etc.
 * should all be in a class called shapes and the methods eg circleArea(), rectangleArea(), triangleArea() etc.should be inside the class shapes.
 * the class should be define in the main class of the program so the methods can be called from the main method.
 * 
 */
import java.util.Scanner;
 public class Java1{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        java1_operation oop=new java1_operation();
        int L, W, reactangle;
        double r, circle;
        int b, h, triangle;
        System.out.println("Area Of Different Shapes");
        System.out.println("*******************************");
        System.out.printf("1.reactangle\n2.circle\n3.triangle\n4.exit\n5");
        System.out.println("*******************************");
        int choice;
        System.out.println("Enter the choice: ");
        choice=input.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Enter the first number: ");
            L=input.nextInt();
            System.out.println("Enter the second number: ");
            W=input.nextInt();
            reactangle=oop.reactangle(W, L);
            System.out.println(reactangle);

            break;
        case 2:
         System.out.println("Enter the first number: ");
            r=input.nextDouble();
            circle= oop.circle(r);
            System.out.println(circle);
            break;
        case 3:
         System.out.println("Enter the first number: ");
            b=input.nextInt();
            System.out.println("Enter the second number: ");
            h=input.nextInt();
            triangle=oop.triangle(b, h);
            System.out.println(triangle);
        case 4:
         System.out.println("Thank you for using this code.");
         break;
         default:
         System.out.println("Enter the right number.");

        }
        input.close();


    }
    




}

