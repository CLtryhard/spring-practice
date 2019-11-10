package soundsystem.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soundsystem.CompactDisc;
import soundsystem.MediaPlayer;

/**
 * @author Lance
 * @version 1.0.0
 * @date 2019/11/10
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    /**
     * 方式一:利用构造器注入
     * @param cd
     */
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    /**
     * 方式二:利用成员方法注入
     * @param cd
     */
    @Autowired(required = false)
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void loadCompactDisc(CompactDisc cd) {
        System.out.println("Load CompactDisc...");
        cd.play();
    }

}
