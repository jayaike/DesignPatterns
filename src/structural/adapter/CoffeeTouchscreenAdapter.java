package structural.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    OldCoffeeMachine oldCoffeeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine machine) {
        this.oldCoffeeMachine = machine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }
}
