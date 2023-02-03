package WorkingWithAbstarction.CardsWithPower;

import WorkingWithAbstarction.CardSuit.CardSuits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardSuits cardSuits = CardSuits.valueOf(scanner.nextLine());
        CardRank cardRank = CardRank.valueOf(scanner.nextLine());

        String output = Card.printInformation(cardSuits, cardRank);
        System.out.println(output);
    }
}
