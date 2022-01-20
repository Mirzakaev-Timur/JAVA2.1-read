public class Main {
    public static void main(String[] args) {
        int amount = 200000;
        boolean calcMiles = (amount >= 20);
        int bonusMiles;
        if (calcMiles) {
            bonusMiles = amount / 20;
        } else {
            bonusMiles = 0;
        }
        System.out.println("Ваши бонусные мили за покупку: " + bonusMiles + " мили (ей)");

    }
}
