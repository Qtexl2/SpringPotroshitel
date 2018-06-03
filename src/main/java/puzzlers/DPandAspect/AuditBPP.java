package puzzlers.DPandAspect;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class AuditBPP implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> aClass = bean.getClass();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Audit.class)) {
                return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), ((proxy, method1, args) -> {
                    Object retVal = method1.invoke(bean, args);
                    System.out.println("Метонд прокси объекта");
                    return retVal;
                }
                ));
            }
        }
        return bean;
    }
}
