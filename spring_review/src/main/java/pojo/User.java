package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    @Value("Cooper")
    private String name;
    @Value("18")
    private String password;
    @Value("Cooper@163.com")
    private String email;

    public User(String name,String password,String email)
    {
        this.name = name;
        this.password = password;
        this.email = email;
    }
}
