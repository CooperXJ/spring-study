import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;


import javax.annotation.Resource;

public class Person {
    //@Resource(name = "cat")
    @Autowired
    private Cat cat;

    @Autowired
    //@Resource
    private Dog dog2;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog2;
    }

    public void setDog(Dog dog) {
        this.dog2 = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog2 +
                ", name='" + name + '\'' +
                '}';
    }
}
