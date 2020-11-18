import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What colour is a Polar Bear? ";
        String choiceOne = "blue";
        String choiceTwo = "white";
        String choiceThree = "brown";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);
        // Write a print statement giving the answer choices
        System.out.println("Please choose from the 3 opstions below: ");
        System.out.println(choiceOne + "\n" + choiceTwo + "\n" + choiceThree);

        // Have the user input an answer
        Scanner input = new Scanner(System.in);
        // Retrieve the user's input
        String userInput = input.next();
        // If the user's input matches the correctAnswer...
        if(correctAnswer.equals(input)) {
        // then the user is correct and we want to print out a congrats message to the user.
            System.out.println("Congrats you got the correct answer");
        }
        // If the user's input does not match the correctAnswer...
        else if(userInput != correctAnswer) {
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.
            System.out.println("Incorrect. The correct answer is" + " " + choiceTwo);
        }
    }

}