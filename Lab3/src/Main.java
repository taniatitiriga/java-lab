public class Main {
    public static void main(String[] args) {
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();

        Application app = new Application(inputDevice, outputDevice);

        Fruit[] fruits = inputDevice.readFruit();

        double weight = 0;
        double sugar = 0;

        outputDevice.writeMessage("I bought you some fruits:");
        StringBuilder fruitMessage = new StringBuilder();

        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                fruitMessage.append("a ").append(fruit.getColor()).append(" apple, ");
            } else if (fruit instanceof Mango) {
                fruitMessage.append("a mango, ");
            } else if (fruit instanceof Banana) {
                fruitMessage.append("a banana, ");
            } else {
                fruitMessage.append("a strawberry, ");
            }
        }

        if (fruitMessage.length() > 0) {
            fruitMessage.setLength(fruitMessage.length() - 2);
        }

        outputDevice.writeMessage(fruitMessage.toString());
        outputDevice.writeMessage("Hungry?");
        outputDevice.writeMessage("\n");

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                outputDevice.writeMessage(args[i]);

                if (args[i].equals("howMuch")) {
                    weight = app.computeWeight(fruits);
                    outputDevice.writeMessage("Just enough; "+ weight + " grams!");
                    outputDevice.writeMessage("\n");
                }
                else if (args[i].equals("howSweet")) {
                    sugar = app.computeSugarContent(fruits);
                    outputDevice.writeMessage("Thank you!:3 But really, it's just "+ sugar + " grams of sugar!");
                    outputDevice.writeMessage("\n");
                }
                else if (args[i].equals("cook")) {
                    app.prepareFruit(fruits);
                    outputDevice.writeMessage("\n");
                }
                else if (args[i].equals("seeFruits")) {
                    if(outputDevice.printFruits(fruits)){
                        outputDevice.writeMessage("Sharpen your cooking knife maybe?");
                        outputDevice.writeMessage("\n");
                    }
                    else{
                        outputDevice.writeMessage("Yum!<3");
                        outputDevice.writeMessage("\n");
                    }
                }
                else{
                    outputDevice.writeMessage("Error: Invalid command line argument. Try <cook>!");
                }
            }
        } else {
            outputDevice.writeMessage("Aren't you going to do anything with them??:(");
        }

    }
}
