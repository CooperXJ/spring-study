package dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInovcationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

//    public ProxyInovcationHandler(Rent rent){
//        this.rent = rent;
//    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    //第一个参数是loader 加载到类在哪个位置
    //第二个参数表示要代理的接口
    //第三个参数表示 调用本身这个InvocationHandler
    public Object getProxy(){
        //返回一个代理类(接口)
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理实例并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现！
        seehouse();
        Object result = method.invoke(rent,args);
        return result;
    }

    public void seehouse(){
        System.out.println("看房子！");
    }
}
