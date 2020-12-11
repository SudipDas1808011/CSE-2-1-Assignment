import java.util.Scanner;
class AscendingDecsending {
    public Integer inputTaking() {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number:  ");
        n = s.nextInt();
        return n;
    }
    public void ascending(int n) {
        System.out.println("Ascending Order: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + "  ");
        }
    }
    public void dcending(int n) {
        System.out.println("\nDescending Order: ");
        for (int i = n; i >= 0; i--) {
            System.out.print(i + "  ");
        }
    }

}
class mainClass{
    public static void main(String[] args) {
        int n;
        AscendingDecsending ascDec = new AscendingDecsending();
        n = ascDec.inputTaking();
        ascDec.ascending(n);
        ascDec.dcending(n);
    }
}