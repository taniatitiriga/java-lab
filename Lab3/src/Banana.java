public class Banana extends Fruit implements Peelable{
    private boolean hasPeel;

    public Banana(double weight, double sugarContent, double waterContent) {
        super(weight, sugarContent, waterContent, FruitColor.yellow);
        this.hasPeel = true;
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