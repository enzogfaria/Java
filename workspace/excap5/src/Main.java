import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number:");

<<<<<<< HEAD
        int x = sc.nextInt();
        String day = switch (x) {
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            case 7 -> "sunday";
            default -> "Invalid day";
        };
=======
        int min = sc.nextInt();jn
>>>>>>> 489a066f4c920304b867c536704c5b03f3a19b9d

        System.out.printf("Today is %s!", day);
    }
}
