import java.util.Scanner;

public class ascendingDecsending {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //to print ascending order
        System.out.println("Ascending Order:");
        for(int i=0;i<=n;i++)
            System.out.print(i+" ");
        System.out.print("\n");
        System.out.println("Descending Order:");
        for(int i=n;i>=0;i--)
            System.out.print(i+" ");
    }
}
