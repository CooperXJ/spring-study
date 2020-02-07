import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        //动态代理的是接口 而不是实现类
        //此处是生成的代理-由Spting Aop为目标方法所在的bean生成的一个代理对象
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
//        userService.sub();
    }

}
