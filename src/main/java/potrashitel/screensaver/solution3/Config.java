package potrashitel.screensaver.solution3;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "potrashitel.screensaver.solution3")
public class Config {
    @Bean
    @Scope("prototype")
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
    @Bean
    public ColorFrame1 frame1(){
        return new ColorFrame1() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while (true){
            context.getBean(ColorFrame1.class).showOnRandomPlace();
            Thread.sleep(100);

        }
    }
}
