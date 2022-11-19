import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AssignmentTemperatureConverter {

    public static void main(String[] args) {
        //display the first two lines
        System.out.println("-----------------------------------Welcome------------------------------------------");
        System.out.println("---Celsius-Fahrenheit/Fahrenheit-Celsius converter---");
        //initialize boolean variable con to false
        boolean convertyes = false;
        do {
            //give to user the choice of conversion (celsius-fahrenheit or fahrenheit-celsius)
            Scanner sc = new Scanner(System.in);
            System.out.println("choose the conversion mode:  \n1- Celsius-Fahrenheit\n2- Fahrenheit-Celsius\n");
            String choice = sc.nextLine();
            //if the user chooses celsius-fahrenheit he must type 1
            boolean wrongchoice = true;
            do{
                if (choice.equals("1")) {
                    wrongchoice = false;
                    try {
                        System.out.println("Enter the temperature to convert:");
                        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                        double c = scanner.nextDouble();
                        double f = (c * 9 / 5) + 32;
                        System.out.println(c + "C ------------------> " + f + "F");
                    }
                     catch (InputMismatchException ex) {
                        System.out.println("input is not with in double range "+ ex);
                    }
                }
                //if the user chooses fahrenheit-celsius he must type 2
                else if (choice.equals("2")) {
                    wrongchoice = false;
                    try {
                        System.out.println("Enter the temperature to convert:");
                        Scanner scanner1 = new Scanner(System.in).useLocale(Locale.US);
                        double f = scanner1.nextDouble();
                        double c = (f - 32) * 5 / 9;
                        System.out.println(f + "F ------------------> " + c + "C");
                    }
                      catch (InputMismatchException ex) {
                        System.out.println("input is not with in double range "+ ex);
                    }
                }
                //if the user does not choose the correct number
                else {
                    System.out.println("choose a correct number (1 OR 2):");
                    choice = sc.nextLine();
                    wrongchoice = true;
                }
            }while (wrongchoice == true);

            Scanner scanner1 = new Scanner(System.in);
            //ask the user if he wants to convert other temperatures
            System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");

            String convert = scanner1.nextLine();
            //if yes repeat the loop to make another conversion
            if (convert.equals("yes")||convert.equals("YES")||convert.equals("Yes")){
                convertyes = true;
                //if "no" exit the loop and display "Good bye, see you soon"
            } else if (convert.equals("no")||convert.equals("NO")||convert.equals("No")) {
                convertyes = false;
                System.out.println("-------------------------------Good bye, see you soon---------------------------");
            }
            //if the user is wrong display "The input value is not valid, please write (Yes OR No)" until he makes the right choice
            else{
                boolean inputinvalid = true;
                while (inputinvalid){
                    System.out.println("The input value is not valid, please write (Yes OR No)");
                    convert = scanner1.nextLine();
                    switch (convert)
                    {
                        case "yes":
                        case "YES":
                        case "Yes":
                            convertyes = true;
                            inputinvalid = false;
                            break;
                        case "no":
                        case "No":
                        case "NO":
                            convertyes = false;
                            inputinvalid = false;
                            System.out.println("-------------------------------Good bye, see you soon---------------------------");
                            break;
                        default:
                            inputinvalid = true;
                    }
                }
            }

        } while (convertyes == true);
    }
}
