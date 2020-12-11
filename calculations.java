import java.util.Scanner;

public class calculations {
    static double[] input(){
        Scanner s = new Scanner(System.in);
        double[] db = new double[2];
        System.out.print ("Enter a number: ");
        db[0] = s.nextDouble();
        System.out.print ("Enter another number: ");
        db[1] = s.nextDouble();
        return db;
    }


    public static void main(String[] args){
        double result=0.0;
        double numAr[] = new double[2];
        char menu,operator=' ';

        System.out.print ("Enter 1 for Addition\n\t  2 for Substraction\n\t  3 for Multiplication\n\t  4 for division\n\t  0 for Exit :");
        Scanner s = new Scanner(System.in);
        menu = s.next().charAt(0);
        
        
        switch (menu) {
            case '1':
                numAr = input();
                result = numAr[0] + numAr[1];
                operator = '+';
                break;

            case '2':
                numAr = input();
                result = numAr[0] - numAr[1];
                operator = '-';
                break;

            case '3':
                numAr = input();
                result = numAr[0] * numAr[1];
                operator = 'x';
                break;

            case '4':
                try{
                    numAr = input();
                    result = numAr[0] / numAr[1];
                    operator = '/';
                }catch (Exception e){
                    System.out.print(e);

                 }
                break;
            case '0':
                System.out.println("As 0 is Entered Process is terminating");
                System.exit(0);
                break;

            // menu doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! menu is not correct");
                return;
        }

        System.out.println(numAr[0] + " " + operator + " " + numAr[1] + " = " + result);
    }
}


