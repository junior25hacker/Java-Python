import java.util.Scanner;   
public class starmain {
   public static void main(String[] args) {
    boolean isrunning=true;
    Scanner sc=new Scanner(System.in);
    System.out.println("*************************");
    System.out.println("  A program to print stars  ");
    System.out.println("*************************"); 
    star s=new star();


        // Shape 1: Line of stars
        System.out.printf("Shape 1:\n");
        System.out.printf("* * * * *\n\n");

        // Shape 2: Square
        System.out.printf("Shape 2:\n");
        System.out.printf("* * * * *\n");
        System.out.printf("* * * * *\n");
        System.out.printf("* * * * *\n");
        System.out.printf("* * * * *\n");
        System.out.printf("* * * * *\n\n");

        // Shape 3: Right Triangle
        System.out.printf("Shape 3:\n");
        System.out.printf("*\n");
        System.out.printf("* *\n");
        System.out.printf("* * *\n");
        System.out.printf("* * * *\n");
        System.out.printf("* * * * *\n\n");

        // Shape 4: Pyramid
        System.out.printf("Shape 4:\n");
        System.out.printf("    *\n");
        System.out.printf("   *\n");
        System.out.printf("  ***\n");
        System.out.printf(" ***\n");
        System.out.printf("*\n\n");

        // Shape 5: Diamond
        System.out.printf("Shape 5:\n");
        System.out.printf("    *\n");
        System.out.printf("   ***\n");
        System.out.printf("  *****\n");
        System.out.printf(" *******\n");
        System.out.printf("*********\n");
        System.out.printf(" *******\n");
        System.out.printf("  *****\n");
        System.out.printf("   ***\n");
        System.out.printf("    *\n");

        int choice=0;
        do{
        System.out.println("choose a star;");
        choice=sc.nextInt();
        if(choice==1){
            s.lineOfStars();
        }
        else if(choice==2){
            s.squareofstars();
        }
        else if(choice==3){
            s.rightTriangle();
        }
        else if(choice==4){
            s.pyramidOfStars();
        }
        else if(choice==5){
            s.diamondOfStars();
        }
        else if(choice==6){
            System.out.println("Exited successfully.");
            //isrunning=false;
            sc.close();
        }
        else{
            System.out.println("Enter the right number.");
        }
          System.out.println("Do you want to continue to print stars? If yes, choose a star (1-5) or press 6 to exit.");

    }while(choice!=6);



    }
}
    

