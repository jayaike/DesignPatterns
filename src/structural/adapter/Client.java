package structural.adapter;

public class Client {
    public static void main(String[] args) {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter coffeeTouchscreen = new CoffeeTouchscreenAdapter(oldCoffeeMachine);

        coffeeTouchscreen.chooseFirstSelection();
        coffeeTouchscreen.chooseSecondSelection();
    }
}
