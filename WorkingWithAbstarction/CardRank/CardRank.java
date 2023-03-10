package WorkingWithAbstarction.CardRank;

public enum CardRank {
    ACE(0),
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12);

    private int value;

    CardRank(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        //Ordinal value: 0; Name value: CLUBS
        return "Ordinal value: " + value + "; Name value: ";
    }

    public static void printAll() {
        System.out.println("Card Ranks:");
        for (CardRank value : CardRank.values()) {
            System.out.println(value + value.name());
        }
    }
}
