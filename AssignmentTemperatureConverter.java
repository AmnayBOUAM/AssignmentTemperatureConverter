import java.util.Scanner;

public class AssignmentTemperatureConverter {

    public static void main(String[] args) {
        //display the first two lines
        System.out.println("-----------------------------------Welcome------------------------------------------");
        System.out.println("---Celsius-Fahrenheit/Fahrenheit-Celsius converter---");
        //initialize boolean variable con to false
        boolean con = false;
        do {
            //give to user the choice of conversion (celsius-fahrenheit or fahrenheit-celsius)
            Scanner sc = new Scanner(System.in);
            System.out.println("choose the conversion mode:  \n1- Celsius-Fahrenheit\n2- Fahrenheit-Celsius\n");
            int choice = sc.nextInt();
            //if the user chooses celsius-fahrenheit he must type 1
            if (choice == 1) {

                System.out.println("Enter the temperature to convert:");

                Scanner scanner = new Scanner(System.in);

                double c = scanner.nextDouble();
                double f;

                f = (c * 9 / 5) + 32;

                System.out.println(c + "C ------------------> " + f + "F");
            }
            //if the user chooses fahrenheit-celsius he must type 2
            else if (choice == 2) {

                System.out.println("Enter the temperature to convert:");

                Scanner scanner1 = new Scanner(System.in);

                double f = scanner1.nextDouble();
                double c;

                c = (f - 32) * 5 / 9;

                System.out.println(f + "F ------------------> " + c + "C");
            }
            //if the user does not choose the correct number
            else {
                boolean choix = true;
                while(choix) {
                    System.out.println("choose a correct number (1 OR 2):");
                    choice = sc.nextInt();
                    if (choice == 1 || choice ==2){
                        choix=false;
                    }
                    else{
                        choix=true;
                    }
                }
            }

            Scanner scanner1 = new Scanner(System.in);
            //ask the user if he wants to convert other temperatures
            System.out.println("do you want to convert other temperatures ? 1- Yes/2- No");

            String convert = scanner1.nextLine();
            //if yes repeat the loop to make another conversion
            if (convert.equals("yes")||convert.equals("YES")||convert.equals("Yes")){
                con = true;
                //if "no" exit the loop and display "Good bye, see you soon"
            } else if (convert.equals("no")||convert.equals("NO")||convert.equals("No")) {
                con = false;
                System.out.println("-------------------------------Good bye, see you soon---------------------------");
            }
            //if the user is wrong display "The input value is not valid, please write (Yes OR No)" until he makes the right choice
            else{
                boolean invalid = true;

                while (invalid){
                    System.out.println("The input value is not valid, please write (Yes OR No)");
                    convert = scanner1.nextLine();
                    switch (convert)
                    {
                        case "yes":
                            con = true;
                            invalid = false;
                            break;
                        case "YES":
                            con = true;
                            invalid = false;
                            break;
                        case "Yes":
                            con = true;
                            invalid = false;
                            break;
                        case "no":
                            con = false;
                            invalid = false;
                            System.out.println("-------------------------------Good bye, see you soon---------------------------");
                            break;
                        case "No":
                            con = false;
                            invalid = false;
                            System.out.println("-------------------------------Good bye, see you soon---------------------------");
                            break;
                        case "NO":
                            con = false;
                            invalid = false;
                            System.out.println("-------------------------------Good bye, see you soon---------------------------");
                            break;
                        default:
                            invalid = true;
                    }
                }
            }

        } while (con == true);
    }
}
