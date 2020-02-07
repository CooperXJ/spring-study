package DIY;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标注这个类是一个切面  这个不能忘记
public class zhujie_AOP {
    @Before("execution(* service.UserServiceImp.*(..))")
    public void before()
    {
        System.out.println("----------执行前----------");
    }

    @After("execution(* service.UserServiceImp.*(..))")
    public void after()
    {
        System.out.println("----------执行后----------");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* service.UserServiceImp.*(..))")
    //参数是连接点，与切入点匹配的执行点  可以在切入点中拿到一些东西
    public void around(ProceedingJoinPoint jp) throws Throwable
    {
        System.out.println("环绕前");

        //执行方法  此处是需要执行的方法
        //如果不写就不会调用这个方法
        Object proceed = jp.proceed();


        System.out.println("环绕后");
    }
}
