import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int num = sc.nextInt();

        if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0)) {
            System.out.println("The given year is leap year");
        } else {
            System.out.println("The given year is not leap year");
        }
    }
}

