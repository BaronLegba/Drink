import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HotDrink tea = new HotDrink("Tea", 200, 90);
        HotDrink coffee = new HotDrink("Coffee", 250, 80);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine(tea, coffee);

        Random random = new Random();

        // Генерируем случайный индекс для выбора напитка
        int randomIndex = random.nextInt(vendingMachine.getDrinks().length);
        HotDrink randomDrink = vendingMachine.getDrinks()[randomIndex];

        System.out.println("Случайно выбранный напиток: " + randomDrink.getName() +
                ", объем: " + randomDrink.getVolume() +
                " мл, температура: " + randomDrink.getTemperature());
    }
}
