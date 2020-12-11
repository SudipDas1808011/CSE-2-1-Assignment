import java.util.Scanner;

public class enhancedForLoop {
    public static void main(String[] args){
        int numberOfNames;
        Scanner s = new Scanner(System.in);

        System.out.print ("How many names will be Entered? : ");
        numberOfNames = s.nextInt();

        System.out.println ("Please Enter "+numberOfNames+" names : ");

        String[] strArray = new String[numberOfNames];
        // using enhanced for loop to print the array elements
        for(int i =0 ;i<numberOfNames;i++){
            strArray[i] = s.next();
        }

        for(String name:strArray){
            System.out.println(name);
        }
    }
}
