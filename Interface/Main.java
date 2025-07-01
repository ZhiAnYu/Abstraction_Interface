public class Main {
    public static void main(String[] args) {

        Logger logger1 = new SimpleLogger();
        Logger logger2 = new SmartLogger();

        logger1.log("One potato");
        logger1.log("two potatoes");
        logger1.log("three potatoes");
        logger1.log("four!");

        logger2.log("Five potatoes");
        logger2.log("Six potatoes");
        logger2.log("Ten potatoes.error");
        logger2.log("Eigth");
    }
}
