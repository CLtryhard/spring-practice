package com.springinaction.minstrel;

import java.io.PrintStream;

/**
 * @author Lance
 * @version 1.0.0
 * @date 2019/11/3
 */
public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream stream) {
        this.printStream = stream;
    }

    public void singBeforeQuest() {
        printStream.println("Fa la la, the knight is so brave!");
    }

    public void singAfterQuest() {
        printStream.println("Tee hee hee, the brave knight " +
                "did embark on a quest!");
    }
}
