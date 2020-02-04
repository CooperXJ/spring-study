package dynamic_proxy;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色:现在没有
        ProxyInovcationHandler pih = new ProxyInovcationHandler();
        //通过调用程序处理角色来处理我们需要调用的接口对象
        pih.setRent(host);

        //获取动态生成的代理类
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
