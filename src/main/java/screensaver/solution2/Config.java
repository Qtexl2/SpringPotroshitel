package screensaver.solution2;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "screensaver.solution2")
public class Config {
    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while (true){
            context.getBean(ColorFrame1.class).showOnRandomPlace();
            Thread.sleep(50);

        }
    }
}
