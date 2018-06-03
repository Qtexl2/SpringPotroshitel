package puzzlers.dinamicproxy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
@Service
public class JokerConfServiceImpl implements JokerConfService{
    @Audit
    public void pay(){
        System.out.println("pay");
    }
    @PostConstruct
    public void setup(){
        System.out.println("postConstract");
    }
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("puzzlers.dinamicproxy");
        context.getBean(JokerConfService.class).pay();

    }
}
