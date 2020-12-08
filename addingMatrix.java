import java.util.Scanner;

public class addingMatrix {
    public static void main(String[] args){

        int m,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st Matrix Size \n(Exp. For 3x4 matrix type 3 4 ):");
        m = s.nextInt();
        n = s.nextInt();
        System.out.println("Enter the 1st Matrix Elements:");

        // getting first matrix elements
        int array1_2d[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array1_2d[i][j] = s.nextInt();
            }

        }
        System.out.println("Enter the 2nd Matrix Elements:");


        // getting first matrix elements
        int array2_2d[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                array2_2d[i][j] = s.nextInt();
            }

        }
        //adding two matrices
       System.out.println("The addition of the matrices is:\n");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array1_2d[i][j] + array2_2d[i][j]+" ");
            }

        }



    }
}
