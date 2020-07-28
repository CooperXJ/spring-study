import mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
//        User user = (User) context.getBean("user");
//
//        System.out.println(user.toString());
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for(User user1 :userMapper.selectUser())
        {
            System.out.println(user1.toString());
        }

//        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
//        for(User user1 :userMapper.selectUser())
//        {
//            System.out.println(user1.toString());
//        }
    }
}
