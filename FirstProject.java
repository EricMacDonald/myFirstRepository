import java.util.Scanner;

public class FirstProject {

    interface in1{
        String name = "Eric";
        String address = "Nottingham NG7";
        int number = 07777777;
        int age = 22;

        String correctUsername = "Eric MacDonald";
        String correctPassword = "Password";

    }


    public static void main(String [] arg){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();





        if(username.equals(in1.correctUsername)) {
        System.out.println("Your Username is correct!");
            System.out.println("Please enter your password: ");
            String password = scanner.nextLine();

            if(password.equals(in1.correctPassword)){
                System.out.println("Correct, here are your account details: ");
                System.out.println(in1.name);
                System.out.println(in1.age);
                System.out.println(in1.address);
                System.out.println(in1.number);
            }
        } else {System.out.println("Wrong username!");}

    }
























}
