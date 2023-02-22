package se.johannes;

public class Main {
    public static void main(String[] args) {
        printHelloWorld();
        LoopTheLoop loopTheLoop = new LoopTheLoop();
        loopTheLoop.run();
    }

    private static void printHelloWorld() {
        MessageUtil messageUtil = new MessageUtil("Hello world!");
        messageUtil.printMessage();
    }
}