package se.johannes;

public class Main {
    public static void main(String[] args) {
        LoopTheLoop loopTheLoop = new LoopTheLoop();
        loopTheLoop.run();


    }

    private static void printHelloWorld(int i) {
        MessageUtil messageUtil = new MessageUtil("Hello world! " + i);
        messageUtil.printMessage();
    }
}