package puzzlers.example1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class Parent {
    @PostConstruct
    private void init(){
        System.out.println("Папа");
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Son.class);
        Son son = (Son) context.getBean("son");

    }
}
@Component
class Son extends Parent{
    @PostConstruct
    public void init(){
        System.out.println("Сын");
    }
}
