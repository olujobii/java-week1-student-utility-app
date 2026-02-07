import java.util.Scanner;

public class StudentUtilityApp {
    static Scanner scanner = new Scanner(System.in);

    static void exitApplication(){
        System.out.println("Thank you for using the application");
        scanner.close();
    }
    public static void main(String[] args) {
        boolean isProgramRunning = true;

        while(isProgramRunning) {
            System.out.println("==== STUDENT UTILITY APP ====");
            System.out.println("1. Add two numbers");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print numbers from 1 to N");
            System.out.println("4. Display day of the week");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String userOption = scanner.nextLine();
            switch(userOption){
                case "1":
                    System.out.println(1);
                    break;
                case "2":
                    System.out.println(2);
                    break;
                case "3":
                    System.out.println(3);
                    break;
                case "4":
                    System.out.println(4);
                    break;
                case "5":
                    exitApplication();
                    isProgramRunning = false;
                    break;
                default:
                    System.out.println("Not a valid option, try again");
                    break;
            }
        }
    }
}
