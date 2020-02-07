package log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class After_log implements AfterReturningAdvice {

    //与before不同的地方就在于执行了之后可以有返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println("执行了"+method.getName()+"返回结果为:"+returnValue);
    }
}
