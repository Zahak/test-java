package se.johannes;

import java.util.ArrayList;

public class LoopTheLoop {
    private final MessageUtil messageUtil;
    private final String defaultMessage;

    public LoopTheLoop() {
        this.defaultMessage = "Hello world!";
        this.messageUtil = new MessageUtil(defaultMessage);
    }
    public ArrayList<String> run() {
        ArrayList<String> allMessages = new ArrayList<>();

        allMessages.addAll(whileLoop());
        allMessages.addAll(doWhileLoop());
        allMessages.addAll(forLoop());

        return allMessages;
    }

    private ArrayList<String> whileLoop() {
        ArrayList<String> messages = new ArrayList<>();

        System.out.println("While loop");
        int i = 0;
        while (i++ < 20) {
            messageUtil.setMessage(defaultMessage + " " + i);
            messages.add(messageUtil.printMessage());
        }

        return messages;
    }

    private ArrayList<String> doWhileLoop() {
        ArrayList<String> messages = new ArrayList<>();

        System.out.println("Do while loop");
        int i = 1;
        do {
            messageUtil.setMessage(defaultMessage + " " + i);
            messages.add(messageUtil.printMessage());
        } while (i++ < 20);

        return messages;
    }

    private ArrayList<String> forLoop() {
        ArrayList<String> messages = new ArrayList<>();

        System.out.println("For loop");
        for(int i = 1; i <= 20; i++) {
            messageUtil.setMessage(defaultMessage + " " + i);
            messages.add(messageUtil.printMessage());
        }

        return messages;
    }
}
