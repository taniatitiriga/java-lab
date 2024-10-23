import java.util.Random;

public class InputDevice {
    private Fruit[] fruits;

    public Fruit[] readFruit() {
        fruits = new Fruit[] {
                new Banana(120, 15, 75),
                new Apple(150, 12, 85, Fruit.FruitColor.red),
                new Mango(137, 52, 85.5),
                new Apple(160, 11, 80, Fruit.FruitColor.green),
                new Banana(130, 14, 73),
                new Mango(140, 46, 83.5),
                new Strawberry(12, 5.1, 98),
                new Strawberry(15, 4.78, 96),
        };
        return fruits;
    }
}

