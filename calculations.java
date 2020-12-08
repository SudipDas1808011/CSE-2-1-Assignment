import java.util.Scanner;

public class calculations {
    public static void main(String[] args){
        double num1,num2,result=0.0;
        char operator;

        Scanner s = new Scanner(System.in);
        System.out.print ("Enter a number: ");
        num1 = s.nextDouble();
        System.out.print ("Enter operation (+, -, *, / and 0 to exit) : ");

        operator = s.next().charAt(0);
        System.out.print ("Enter another number: ");
        num2 = s.nextDouble();
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                try{
                    result = num1 / num2;
                }catch (Exception e){
                    System.out.print(e);

                 }
                break;
            case '0':
                System.out.println("As 0 is Entered Process is terminating");
                System.exit(0);
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}


