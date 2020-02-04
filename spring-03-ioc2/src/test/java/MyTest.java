import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User)context.getBean("User");
        user.show();
        User_1 user1 = (User_1)context.getBean("User_1");
        user1.show();
        //System.out.println(user1 == user);
    }
}
