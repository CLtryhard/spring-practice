package com.springinaction.quests;

import java.io.PrintStream;

/**
 * @author Chen Long
 * @version 1.0.0
 * @date 2019/11/3
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream stream) {
        this.printStream = stream;
    }

    public void embark() {
        printStream.println("Embarking on quest to saly the dragon!");
    }
}
