package service;

public class UserServiceImp implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void sub() {
        System.out.println("sub");
    }

    @Override
    public void query() {
        System.out.println("query");
    }

    @Override
    public void change() {
        System.out.println("change");
    }
}
