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

 //HUELA

 //CODE
 import java.util.Scanner;
 public class Java1{
    public static void main(String[] args){
        System.out.println("--------------------------------");
        System.out.println("------SHAPE CALCULATOR----------");
        System.out.println("--------------------------------");
        
        System.out.println("Choose shape");
        System.out.println("1. Rectangle" );
        System.out.println("2. Circle" );
        System.out.println("3. Triangle" );

        java1_operation opp = new java1_operation();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        do{
        switch (choice) {
         case 1: 
            System.out.println("Enter length: ");
            double x = sc.nextDouble();
            System.out.println("Enter width: ");
            double y = sc.nextDouble(); 
            double A= opp.rectangleArea(x,y);
            System.out.println("The area of the rectangle is: " + A);
                break;
         case 2: 
            System.out.println("Enter radius: ");
            double r = sc.nextDouble();
            double B= opp.circleArea(r);
            System.out.print("The area of the circle is: " + B);
                break;
         case 3: 
            System.out.println("Enter base: ");
            double b = sc.nextDouble();
            System.out.println("Enter hieght: ");
            double h = sc.nextDouble(); 
            double C= opp.traingleArea(b,h);
            System.out.println("The area of the triangle is: " + C);
            break;
         case 4:
             System.out.println(" Thanks ");
        default:
            System.out.println("Enter a number ");
                break;
            }
        }while(choice != 4);
       sc.close();
    }
 }