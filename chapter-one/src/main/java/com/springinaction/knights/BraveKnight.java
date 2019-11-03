package com.springinaction.knights;

import com.springinaction.quests.Quest;

/**
 * @author Chen Long
 * @version 1.0.0
 * @date 2019/11/3
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
