package soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.config.CDPlayerConfig;

/**
 * @author Lance
 * @version 1.0.0
 * @date 2019/11/10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final SystemOutRule outRule = new SystemOutRule();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void play() {
        outRule.enableLog();
        player.loadCompactDisc(cd);
        // 坑爹,换行默认为\r\n,必须完全一致
        Assert.assertEquals("Load CompactDisc...\r\n" +
                        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n",
                outRule.getLog());
    }


}
