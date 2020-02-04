import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
//        Student student = context.getBean("student",Student.class);
//        System.out.println(student.toString());

        ApplicationContext context =new ClassPathXmlApplicationContext("User.xml");
       User user = context.getBean("user",User.class);
        //System.out.println(user.toString());
        User user1 = context.getBean("user",User.class);
        System.out.println(user1==user);
    }



}


