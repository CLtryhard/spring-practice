package soundsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * //@ComponentScan 不指定基础包时,则只扫描本类所在包及其子包
 * //@ComponentScan(basePackageClasses = SgePeppers.class)
 */
/**
 * @author Lance
 * @version 1.0.0
 * @date 2019/11/10
 */
@Configuration
@ComponentScan(basePackages = "soundsystem")
public class CDPlayerConfig {
}


