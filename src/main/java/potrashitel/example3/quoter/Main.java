package potrashitel.example3.quoter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        context.getBean(Quoter.class).sayQuote();
    }
}
