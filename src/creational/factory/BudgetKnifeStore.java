package creational.factory;

public class BudgetKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(String knifeType) {
        switch(knifeType) {
            case "chefs":
                return new BudgetChefsKnife();
        }
        return null;
    }
}
