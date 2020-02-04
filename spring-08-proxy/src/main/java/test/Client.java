package test;

public class Client {
    public static void main(String[] args) {
        Service service = new Service();
        Proxytest pih = new Proxytest();
        pih.setObject(service);

        Function result = (Function) pih.getProxy();
        result.change();
    }
}
