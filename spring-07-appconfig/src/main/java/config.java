import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration底层也是@Component 因此这个也会被Spring容器托管，因为他本身就是一个@Conponent
//@Configuration代表这是一个配置类，就和我们之前的beans.xml作用是一样的

@Configuration
//既然他像@Component一样，那么我就可以使用 和xml中的Scan方法作用一样
@ComponentScan("User.class")//此处如果不写包扫描的话  会自动默认扫描config所在的包
//如果需要和其他配置类融合可以使用 相当于获取其他的bean  将多个类融合成一个类
@Import(config_2.class)
public class config {
    //注册一个bean，就相当于万平米之前写的一个bean标签
    //这个方法的名字就相当于是bean标签中的id属性
    //这个方法的返回值，就相当于是bean标签中的class标签
    //这里注册了bean因此就不需要在User类中重新声明@Conpoment标签

    @Bean
    public User user()
    {
        return new User();//返回的就是要注入到bean的对象
    }
}
