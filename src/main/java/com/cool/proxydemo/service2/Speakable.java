package com.cool.proxydemo.service2;

/**
 * @author cool
 * @version V1.0
 * @className Speakable
 * @description 讲解Spring AOP：JDK动态代理和CGLIB动态代理
 * 1、JDK动态代理通过反射来接收被代理的类，并且要求被代理的类必须实现一个接口。JDK动态代理的核心是InvocationHandler接口和Proxy类。
 * 2、如果目标类没有实现接口，那么Spring AOP会选择使用CGLIB来动态代理目标类。CGLIB（Code Generation Library），
 * 是一个代码生成的类库，可以在运行时动态的生成某个类的子类，注意，CGLIB是通过继承的方式做的动态代理，因此如果某个类被标记为final，
 * 那么它是无法使用CGLIB做动态代理的，诸如private的方法也是不可以作为切面的。
 *
 * 学习地址：https://mp.weixin.qq.com/s/u3RrZgwgJSiSYXjhijYyAw
 * @createDate 2019年05月27日
 */
public interface Speakable {
    void sayHi();
    void sayBye();
}
