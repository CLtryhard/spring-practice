package soundsystem.impl;

import org.springframework.stereotype.Component;
import soundsystem.CompactDisc;

/**
 * @author Lance
 * @version 1.0.0
 * @date 2019/11/10
 */
@Component
public class SgePeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + "by " + artist);
    }
}
