public class Apple extends Fruit implements SeedRemovable{
    private boolean hasSeeds;

    public Apple(double weight, double sugarContent, double waterContent, FruitColor color) {
        super(weight, sugarContent, waterContent, color);
        this.hasSeeds = true;
    }

    @Override
    public boolean hasSeeds() {
        return hasSeeds;
    }

    @Override
    public void removeSeeds() {
        if (hasSeeds) {
            hasSeeds = false;
        }
    }
}
