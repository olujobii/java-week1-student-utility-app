import java.util.Scanner;

public class StudentUtilityApp {
    static Scanner scanner = new Scanner(System.in);

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
                //ADDING TWO NUMBERS
                case "1":
                    boolean isFirstIntValid = false;
                    int a  = 0 , b = 0;
                    do{
                    System.out.print("Enter first number: ");
                    if(scanner.hasNextInt()){
                       a = scanner.nextInt();
                       scanner.nextLine();
                       isFirstIntValid = true;
                    }
                    else{
                        System.out.println("Not a valid integer");
                        scanner.nextLine();
                    }
                    } while(!isFirstIntValid);

                    boolean isSecondIntValid = false;
                    do{
                        System.out.print("Enter second number: ");
                        if(scanner.hasNextInt()){
                            b = scanner.nextInt();
                            scanner.nextLine();
                            isSecondIntValid = true;
                        }
                        else{
                            System.out.println("Not a valid integer");
                            scanner.nextLine();
                        }
                    } while(!isSecondIntValid);

                    int result = addTwoNumbers(a,b);
                    System.out.println("Result: "+result);
                    break;
                //CHECKING IF NUMBER IS EVEN OR ODD
                case "2":
                    boolean isNumberValid = false;
                    do{
                        System.out.print("Enter a number: ");
                        if(scanner.hasNextInt()){
                            int userInput = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println(isEvenOrOdd(userInput));
                            isNumberValid = true;
                        }else{
                            System.out.println("Not a valid integer");
                            scanner.nextLine();
                        }
                    }while (!isNumberValid);
                    break;
                //PRINT NUMBER FROM 1 TO N
                case "3":
                    boolean isNumberPrinted = false;
                    do{
                        System.out.print("Enter a number: ");
                        if(!scanner.hasNextInt()){
                            System.out.println("Not a valid integer, try again");
                            scanner.nextLine();
                            continue;
                        }

                        int num = scanner.nextInt();
                        scanner.nextLine();
                        if(num <= 1){
                            System.out.println("Your value cannot be less than or equal to 1");
                        }else{
                            printNumbers(num);
                            isNumberPrinted = true;
                        }
                    }while(!isNumberPrinted);
                    break;
                //DISPLAYING DAYS OF THE WEEK
                case "4":
                    boolean isDaysOfWeekPrinted = false;
                    do {
                        System.out.print("Enter a number to display the corresponding day of the week: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Not a valid integer, try again");
                            scanner.nextLine();
                            continue;
                        }

                        int num = scanner.nextInt();
                        scanner.nextLine();
                        isDaysOfWeekPrinted = printDayOfWeek(num);

                    }while (!isDaysOfWeekPrinted);
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

    private static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    static String isEvenOrOdd(int num){
        return num % 2 == 0 ? "EVEN" : "ODD";
    }

    static void printNumbers(int num){
        for(int i = 1 ; i <= num ; i++){
            System.out.println(i);
        }
    }

    static boolean printDayOfWeek(int num){
        switch(num){
            case 1:
                System.out.println("SUNDAY");
                return true;
            case 2:
                System.out.println("MONDAY");
                return true;
            case 3:
                System.out.println("TUESDAY");
                return true;
            case 4:
                System.out.println("WEDNESDAY");
                return true;
            case 5:
                System.out.println("THURSDAY");
                return true;
            case 6:
                System.out.println("FRIDAY");
                return true;
            case 7:
                System.out.println("SATURDAY");
                return true;
            default:
                System.out.println("Invalid number entered");
                return false;
        }
    }

    static void exitApplication(){
        System.out.println("Thank you for using the application");
        scanner.close();
    }
}
