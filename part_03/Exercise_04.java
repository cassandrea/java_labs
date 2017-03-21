package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    public static void main(String[] strings)
            throws java.io.IOException {

        // generate a random number >= 0 and <= 3
        // use this as the computer's hand
        int computerHand = (int) (Math.random() * 2 + 1);


        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
        int playerHand = input.nextInt();

        // call getHand(int hand) to determine the computers hand
        String computerResult = getHand(computerHand);

        // call getHand(int hand) to determine the players hand
        String playerResult = getHand(playerHand);

        // call determineWinner(int computerHand, int playerHand) to determine who won
        String winner = determineWinner(computerHand, playerHand);


        // print out a message to the console stating which hand the computer had, which hand
        // the player had and who won.
        System.out.println("You: "+ playerResult);
        System.out.println("Computer: "+ computerResult);
        System.out.println(winner);

    }

    public static String getHand(int hand) {
        String handName = "";
        // use a switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper
        switch (hand) {
            case 0:
                handName = "scissor";
                break;
            case 1:
                handName = "rock";
                break;
            case 2:
                handName = "paper";
                break;
        }

        // return hand
        return handName;
    }

        public static String determineWinner(int computer, int player) {

        String status = "";

        if (player == computer) {
            status = "The result is a tie";
        }
        else
            switch (player) {
                // use conditional ("?") operator
                case 0:
                    status = (computer != 1) ? "You won!" : "You lost :(";
                    break;
                // implement the two remaining cases
                case 1:
                    status = (computer != 2) ? "You won!" : "You lost :(";
                    break;
                case 2:
                    status = (computer != 0) ? "You won!" : "You lost :(";
                    break;
            }
        // return status
        return status;

    }
}