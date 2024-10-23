public class OutputDevice {
    public void writeMessage(String mess) {
        System.out.println(mess);
    }

    public boolean printFruits(Fruit[] fruits) {
        boolean flag = false;

        for (Fruit fruit : fruits) {
            StringBuilder output = new StringBuilder("a ");

            if (fruit instanceof Peelable) {
                Peelable peelableFruit = (Peelable) fruit;
                if (peelableFruit.hasPeel()) {
                    output.setLength(output.length() - 1);
                    output.append("n unpeeled ");
                } else {
                    output.append("peeled ");
                }
            }
            if (fruit instanceof SeedRemovable) {
                SeedRemovable seedRemovableFruit = (SeedRemovable) fruit;
                output.append(seedRemovableFruit.hasSeeds() ? "seeds unremoved " : "seeds removed ");
            }
            output.append(fruit.getClass().getSimpleName());

            writeMessage(output.toString());

            if (fruit instanceof Peelable) {
                Peelable peelableFruit = (Peelable) fruit;
                if (peelableFruit.hasPeel()) {
                    flag = true;
                }
            }
            if (fruit instanceof SeedRemovable) {
                SeedRemovable seedRemovableFruit = (SeedRemovable) fruit;
                if (seedRemovableFruit.hasSeeds()) {
                    flag = true;
                }
            }
            if(flag){
                writeMessage("Oops! You forgot this one >:)");
            }
        }
        return flag;
    }
}