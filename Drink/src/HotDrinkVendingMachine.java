public class HotDrinkVendingMachine {
    private HotDrink[] drinks;

    public HotDrinkVendingMachine(HotDrink... drinks) {
        this.drinks = drinks;
    }

    public HotDrink[] getDrinks() {
        return drinks;
    }
}
