package puzzlers.DPandAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PayInformatorAspect {
    @Pointcut("execution(* puzzlers.DPandAspect.*.pay(..))")
    public void allPayMethods(){}

    @After("allPayMethods()")
    public void sendMailToFedorov(){
        System.out.println("Еще билет продали");
    }
}
