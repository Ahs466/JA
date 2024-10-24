import java.util.Scanner;

public class Conditionals {
    public static void main(String[] params) {

        //Task 1
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("First number");
        float firstNumber = Float.parseFloat(sc.nextLine());
        System.out.println("Second number");
        float secondNumber = Float.parseFloat(sc.nextLine());
        System.out.println("The max between those two numbers is " + Math.max(firstNumber, secondNumber));

        System.out.println("Third number");
        float thirdNumber = Float.parseFloat(sc.nextLine());
        System.out.println("Your number is " + ( (thirdNumber % 2)==0 ? "even" : "odd" ) );

        System.out.println("Give me a traffic light colour");
        String lightColour = sc.nextLine();

        switch(lightColour.toLowerCase()) {
            case "green":
                System.out.println("green means go");
                break;
            case "yellow":
                System.out.println("yellow means prepare to go");
                break;
            case "red":
                System.out.println("red means stop");
                break;
        }
        */

        //Task 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number between 1 and 12");
        int numberX = Integer.parseInt(sc.nextLine());
        switch(numberX) {
            case 12: case 1: case 2:
                System.out.printf("Winter");
                break;
            case 3: case 4: case 5:
                System.out.printf("Spring");
                break;
            case 6: case 7: case 8:
                System.out.printf("Summer");
                break;
            case 9: case 10: case 11:
                System.out.printf("Autumn");
                break;
            default:
                System.out.printf("The number that you submitted is not between 1 and 12");
        }
    }
}
