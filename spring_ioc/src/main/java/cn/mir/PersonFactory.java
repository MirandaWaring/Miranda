package cn.mir;

public class PersonFactory {
    public Person createPersonFactoryMethod(){
        Child child = new Child();
        child.setName("da儿子");
        return child;
    }
}
