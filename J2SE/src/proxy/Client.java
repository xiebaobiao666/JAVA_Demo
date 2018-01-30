package proxy;

/**
 * 代理模式：
 * 作用：为其他对象提供一种以控制对方的访问。
 * 在某种情况下，
 * 一个客户不想或者不能直接引用另一个对象可以在客户端和目标对象直接起到中介的作用
 *
 * 代理的角色：
 * 第一种：抽象角色、声明真实对象和代理对象的共同接口
 * 第二种：代理角色、代理对象角色内部含有对真实对象的引用，从而可以操纵真实的对象
 *      同时代理对象提供与真实对象相同的接口以便在任何时候都能代替真实对象、同时代理对象
 *      可以在执行真实对象时，附加其他操作，相当于对真实对象的封装
 * 第三种：真实角色，代理所代理的真实角色，是我们要引用的对象
 *
 */
public class Client {
    public static void main(String[] args) {
        HireHouse hireHouse=new HireProxy(new RealHireHouse());
        hireHouse.hire();
    }
}