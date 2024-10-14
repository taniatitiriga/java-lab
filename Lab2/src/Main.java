public class Main {
    public static void main(String[] args) {
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();

        Application app = new Application(inputDevice, outputDevice);

        if (args.length > 0) {
            outputDevice.writeMessage("args:");
            for (String arg : args) {
                outputDevice.writeMessage(arg);
            }
        } else {
            outputDevice.writeMessage("no args provided.");
        }

        //app.run();
        //app.randomArraySort();
        app.exampleHistogram();
    }
}
