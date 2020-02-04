package static_proxy;

public class Client {
    public static void main(String[] args) {
//        static_proxy.Host host = new static_proxy.Host();
//        static_proxy.Proxy proxy = new static_proxy.Proxy(host);
//        proxy.static_proxy.Rent();
        UserServiceImp userServiceImp = new UserServiceImp();
//        userServiceImp.add();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userServiceImp);
        userServiceProxy.add();
    }
}
