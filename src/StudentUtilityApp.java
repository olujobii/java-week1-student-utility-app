import java.util.Scanner;

public class StudentUtilityApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isProgramRunning = true;

        while(isProgramRunning) {
            System.out.println(" ");
            System.out.println("==== STUDENT UTILITY APP ====");
            System.out.println("1. Add two numbers");
            System.out.println("2. Check if a number is EVEN or ODD");
            System.out.println("3. Print numbers from 1 to N");
            System.out.println("4. Display day of the week");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String userOption = scanner.nextLine();
            //SWITCH STATEMENT TO EXECUTE BLOCK OF CODE BASED ON USER'S SELECTION.
            switch(userOption){
                //ADDING TWO NUMBERS
                case "1":
                   addingTwoNumbers();
                    break;
                //CHECKING IF NUMBER IS EVEN OR ODD
                case "2":
                   checkIfNumberIsEvenOrOdd();
                    break;
                //PRINT NUMBER FROM 1 TO N
                case "3":
                    printNumbersFrom1ToN();
                    break;
                //DISPLAYING DAYS OF THE WEEK
                case "4":
                    printDayOfWeek();
                    break;
                //EXIT PROGRAM
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

    //OPTION TO ADD TWO NUMBERS
    static void addingTwoNumbers(){
        boolean isUserInputValid = false;
        int a  = 0 , b = 0;
        do{
            System.out.print("Enter first number: ");
            if(scanner.hasNextInt()){ //Checking if user's input is a valid integer
                a = scanner.nextInt();
                scanner.nextLine();
                isUserInputValid = true;
            }
            else{
                System.out.println("Not a valid number. The number entered must be a whole number");
                scanner.nextLine();
            }
        } while(!isUserInputValid);

         isUserInputValid = false;
        do{
            System.out.print("Enter second number: ");
            if(scanner.hasNextInt()){ //Checking if user's input is a valid integer
                b = scanner.nextInt();
                scanner.nextLine();
                isUserInputValid = true;
            }
            else{
                System.out.println("Not a valid number. The number entered must be a whole number");
                scanner.nextLine();
            }
        } while(!isUserInputValid);

        int result = addTwoNumbers(a,b);
        System.out.println("Result: "+result);
    }

    //PERFORMING ARITHMETIC OPERATION
    private static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    //OPTION TO CHECK IF USER INPUT IS EVEN OR ODD
    static void checkIfNumberIsEvenOrOdd(){
        boolean isNumberValid = false;
        do{
            System.out.print("Enter a number: ");
            if(scanner.hasNextInt()){ //Checking if user's input is a valid integer
                int userInput = scanner.nextInt();
                scanner.nextLine();
                String result = isEvenOrOdd(userInput);
                System.out.println(result);
                isNumberValid = true;
            }else{
                System.out.println("Not a valid number. The number entered must be a whole number");
                scanner.nextLine();
            }
        }while (!isNumberValid);
    }

    //CONDITIONAL CHECK TO SEE IF NUMBER IS EVEN OR ODD
   private static String isEvenOrOdd(int num){
        return num % 2 == 0 ? "EVEN" : "ODD";
    }

    //OPTION TO PRINT NUMBERS FROM 1 TO N
    static void printNumbersFrom1ToN(){
        boolean isNumberPrinted = false;
        do{
            System.out.print("Enter a number to print from 1 to N: ");
            if(!scanner.hasNextInt()){ //Checking if user's input is a valid integer
                System.out.println("Not a valid number. The number entered must be a whole number");
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
    }

    //PRINT NUMBERS FROM 1 TO N
    private static void printNumbers(int num){
        for(int i = 1 ; i <= num ; i++){
            System.out.println(i);
        }
    }

    //OPTION TO PRINT DAY OF THE WEEK BASED ON USER'S INPUT
    static void printDayOfWeek(){
        boolean isDaysOfWeekPrinted = false;
        do {
            System.out.print("Enter a number (1-7) for day of the week: ");
            if (!scanner.hasNextInt()) { //Checking if user's input is a valid integer
                System.out.println("Not a valid number. The number entered must be a whole number");
                scanner.nextLine();
                continue;
            }

            int num = scanner.nextInt();
            scanner.nextLine();
            isDaysOfWeekPrinted = isDayOfWeekValid(num);

        }while (!isDaysOfWeekPrinted);
    }

    //CONDITIONAL CHECK TO SEE IF USER'S INPUT IS VALID FOR DAY OF THE WEEK
   private  static boolean isDayOfWeekValid(int num){
        switch(num){
            case 1:
                System.out.println("Monday");
                return true;
            case 2:
                System.out.println("Tuesday");
                return true;
            case 3:
                System.out.println("Wednesday");
                return true;
            case 4:
                System.out.println("Thursday");
                return true;
            case 5:
                System.out.println("Friday");
                return true;
            case 6:
                System.out.println("Saturday");
                return true;
            case 7:
                System.out.println("Sunday");
                return true;
            default:
                System.out.println("Invalid day");
                return false;
        }
    }

    //EXITING APPLICATION AND CLOSING SCANNER
    static void exitApplication(){
        System.out.println("Thank you for using the app");
        scanner.close();
    }
}
