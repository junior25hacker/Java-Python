public class star {
     void lineOfStars(){
        int i;
        int n;
        n=6;
        for(i=0; i<=6; i++){
            System.out.printf("* ");
        }
        System.out.printf("\n");
     }

     void squareofstars(){
        int i;
        int j;
        int n;
        n=10;
        for(i=0; i<=10; i++){
            for(j=0; j<=10; j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
     }

     void rightTriangle(){
        int i;
        int j;
        int n;
        n=9;
        for(i=0; i<=9; i++){
            for(j=0; j<=i; j++){
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
     }


        void pyramidOfStars(){
            int i;
            int j;
            int space;
            int n;
            n=5;
            for(i=0; i<=n; i++){
                for(space=n-i; space>=1; space--){
                    System.out.printf(" ");
                }
                for(j=0; j<=i; j++){
                    System.out.printf("* ");
                }
                System.out.printf("\n");
            }
        }


        void diamondOfStars(){
            int i;
            int j;
            int space;
            int n;
            n=5;
            for(i=0; i<=n; i++){
                for(space=n-i; space>=1; space--){
                    System.out.printf(" ");
                }
                for(j=0; j<=i; j++){
                    System.out.printf("* ");
                }
                System.out.printf("\n");
            }
            for(i=n-1; i>=0; i--){
                for(space=n-i; space>=1; space--){
                    System.out.printf(" ");
                }
                for(j=0; j<=i; j++){
                    System.out.printf("* ");
                }
                System.out.printf("\n");
            }
        } 
}
