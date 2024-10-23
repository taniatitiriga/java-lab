public class Mango extends Fruit implements SeedRemovable, Peelable{
    private boolean hasSeeds;
    private boolean hasPeel;

    public Mango(double weight, double sugarContent, double waterContent) {
        super(weight, sugarContent, waterContent, FruitColor.yellow);
        this.hasSeeds = true;
        this.hasPeel = true;
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

    @Override
    public boolean hasPeel() {
        return hasPeel;
    }
    @Override
    public void peelOff() {
        if (hasPeel) {
            hasPeel = false;
        }
    }

}
