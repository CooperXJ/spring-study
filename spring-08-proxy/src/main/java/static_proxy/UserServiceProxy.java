package static_proxy;

public class UserServiceProxy implements UserService{
    private UserServiceImp userServiceImp;
    public UserServiceProxy(UserServiceImp userServiceImp)
    {
        this.userServiceImp = userServiceImp;
    }


    @Override
    public void add() {
        log("add");
        userServiceImp.add();
    }

    @Override
    public void delete() {
        userServiceImp.delete();;
    }

    @Override
    public void update() {
        userServiceImp.update();
    }

    @Override
    public void query() {
        userServiceImp.query();
    }

    public void log(String msg)
    {
        System.out.println("使用了"+msg+"方法");
    }
}
