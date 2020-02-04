package static_proxy;

public class Proxy implements Rent {
    private Host host;
    public  Proxy(Host host)
    {
        this.host = host;
    }


    @Override
    public void Rent() {
        host.Rent();
    }
}
