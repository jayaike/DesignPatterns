package creational.factory;

public abstract class KnifeStore {
    public Knife orderKnife(String knifeType) {
        Knife knife;

        knife = createKnife(knifeType);

        return knife;
    }

    public abstract Knife createKnife(String knifeType);
}
