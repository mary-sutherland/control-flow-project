package com.tts;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");     // type a word and hit enter
        String someString = scanner.nextLine();
        System.out.println(someString);

        System.out.println("Enter an integer: "); //type a word and hit enter
        Integer someInt = scanner.nextInt();
        System.out.println(someInt);

        scanner.nextLine();
        System.out.println("Please enter your name: "); //type your name and hit enter
        String yourName = scanner.nextLine();
        System.out.println("Hello " + yourName);




        System.out.println("DO you want to continue to interactive portion? (y/n) : ");
        String answer = scanner.next();


        if (answer.equals("yes") || answer.equals("y")) {
            System.out.println("Yes");


            System.out.println("Do you want to go again?");
            answer = scanner.next();
            if (answer.equals("y") || answer.equals("yes"))
            {

            } else if(answer.equals("n") || answer.equals("no")) {
                System.out.println("OK, Have a nice day.");
            }
        } else {
            System.out.println("Ok, please come back when convenient to finish survey.");
        }

        System.out.println("Do you have a red car? (y/n) : ");
        answer = scanner.next();

        if (answer.equals("yes") || answer.equals("y")) {
            System.out.println("Cool color!");
        } else if(answer.equals("n") || answer.equals("no")) {
            System.out.println("That's too bad");
        }

        System.out.println("What is the name of your favorite pet?");
        String favPet = scanner.next();

        System.out.println("What is your lucky number?");
        int luckyNumber = scanner.nextInt();

        System.out.println("Who is your favorite quarterback?");
        String favQB = scanner.next();

        System.out.println("What is their jersey number?");
        int jerseyNumber = scanner.nextInt();

        System.out.println("What is the two digit model year of your car?");
        int modelYear = scanner.nextInt();

        System.out.println("Who is your favorite actor?");
        String favActor = scanner.next();

        System.out.println("Enter a random number between 1 and 50.");
        int ranNumber = scanner.nextInt();

        System.out.println("Thanks for taking our survey.");

    int magicBall = luckyNumber * ranNumber;
    while (magicBall > 75) {
        magicBall -= 75;
    }


    char charOne = favPet.charAt(2);
    int Num1 = (int) charOne;
    while (Num1 > 65) {
        Num1 -= 65;
    }

    int Num2 = modelYear + luckyNumber;
    while (Num2 > 65) {
        Num2 -= 65;
    }

    int Num3 = Math.abs(ranNumber - Num2);
    while (Num3 > 65) {
        Num3 -= 65;
    }

    int Num4 = 42;
    while (Num4 > 65) {
        Num4 -= 65;
    }

    int Num5 = jerseyNumber + luckyNumber;
    while (Num5 > 65) {
        Num5 -= 65;
        }

    System.out.println("Your magic ball number is " + magicBall + ".");
    System.out.println("Your lottery numbers are " + Num1 + ", " + Num2 + ", " + Num3 + ", " + Num4 + ", " + Num5 +".");


    System.out.println("Would you like to go again?");



// EXAMPLES FOR DEFINING AND ASSIGNING INTEGERS TO NUMBERS
//        String petName = "Luna";
//
//        char charOne = petName.charAt(2);
//        int numOne = (int) randomChar;
//
//        int numTwo = 42;
//
//        int numThree = petAge + modelYear;





   }

//    private static void askQuestions() {
//        Scanner scanner = new Scanner(System.in);
//
//        String petName;
//        int petAge;
//        int luckyNumber;
//        int jerseyNumber;
//        int carYear;
//        String favoriteActivity;
//        int randomNum;
//
//        do {
//            System.out.println("Do you have a red car?");
//            reply = scanner.nextLine(); //wait for input
//
//        } while (reply.equals("y", "Y", "yes", "Yes"))
//        System.out.println("Cool color!"));
//
//        do {
//            System.out.println("What is the name of your favorite pet?");
//
//        }
//
//    }
}


















//DO WHILE LOOP FROM STACK OVERFLOW
//        do
//        {
//            System.out.print("Do you wish to proceed to interactive portion? : ");
//            num = scan.nextInt();
//            for(int i=2; i <= (num/2); i++)
//            {
//                if((num % i) == 0)
//                {
//                    count++;
//                    break;
//                }
//            }
//            if((count==0) && (num!= 1))
//                System.out.println( num + " is a prime number.");
//            else
//                System.out.println( num + " is not a prime number.");
//            System.out.println("Continue(Y/N)");
//            char a = scan.next();
//
//        } while(a=='Y'|| a=='y')



//SWITCH CASE ANSWER FROM STACK OVERFLOW
//        switch (answer)
//        {
//            case "yes":
//            case "Yes":
//            case "Y":
//            case "y": //WRITE YOUR CODE HERE
//                break;
//            case "no":
//            case "No":
//            case "N":
//            case "n"://exit from program;
//                break;
//
//            default :
//                System.out.println("invalid choice")   ;
//                break;
//        }