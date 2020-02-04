package UserDao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component等价于在xml中创建bean
@Component
@Scope("prototype")
public class User {

    public String name;
    public int age;
    @Value("xuejin_haha")//设置属性值
    public void setName(String name) {
        this.name = name;
    }

    @Value("23")
    public void setAge(int age) {
        this.age = age;
    }
}
