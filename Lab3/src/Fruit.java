public abstract class Fruit {
    private double weight;
    private double sugarContent;
    private double waterContent;
    private FruitColor color;

    public enum FruitColor {
        red, yellow, purple, green, orange
    }

    public Fruit(double weight, double sugarContent, double waterContent, FruitColor color) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;
        this.color = color;
    }
    public FruitColor getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
    public double getSugarContent() {
        return sugarContent;
    }

}
