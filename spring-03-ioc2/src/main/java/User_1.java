public class User_1 {
    private String name;
    public User_1(){
        System.out.println("User_1已经被创建！name = "+name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
            System.out.println("name = "+name+"  User_1");
        }
}
