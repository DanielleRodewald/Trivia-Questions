import java.util.Scanner;
public class trivia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many feet are giraffes necks?");
        int length = sc.nextInt();

        if (length == 6) {
            System.out.println("Congrats! You got it!");
        } else if (length == 5 || length == 7) {
            System.out.println("Good guess!");
        } else {
            System.out.println("Not even close :(");
        }

        System.out.println("On average how long do sea turtles live?");
        int age = sc.nextInt();
        if (age >= 20 && age <= 35) {
            System.out.println("Congrats! You got it!");
        } else if (age >= 15 && age <= 19 || age >= 36 && age <= 40) {
            System.out.println("Good guess!");
        } else {
            System.out.println("Not even close :(");
        }
 
        System.out.println("What are Porcupines self defense?");
        String defense = sc.nextLine();
        if (defense.equals("quills")) {
            System.out.println("Congrats! You got it!");
        } else {
            System.out.println("Wrong answer :(");
        }

    }
}
