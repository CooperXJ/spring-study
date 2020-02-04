package test;

public class Service implements Function{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
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
