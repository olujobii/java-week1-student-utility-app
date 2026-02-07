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
                case "2":
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

    private static int addTwoNumbers(int a, int b) {
        return a + b;
    }


    static void exitApplication(){
        System.out.println("Thank you for using the application");
        scanner.close();
    }
}
