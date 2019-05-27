package com.cool.proxydemo.service1;

import com.cool.proxydemo.service1.imp.AtServiceImpl;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cool
 * @version V1.0
 * @className MyBeanFactory
 * @description 工厂（生成代理）
 * 动态代理可理解为：我们只在代理类写了一个方法就可以操纵委托类的所有方法。
 * 动态代理是在运行时，通过反射机制实现动态代理，并且能够代理各种类型的对象
 * @createDate 2019年05月27日
 */
@Slf4j
public class MyBeanFactory {
    public static AtService createService() {

        // 1 目标类
        final AtService atService = new AtServiceImpl();

        // 2切面类
        final MyAspect myAspect = new MyAspect();

        // 3 代理类：将目标类和切面类结合
        AtService proxService = (AtService) Proxy.newProxyInstance(
                // 动态代理类是在运行时创建的，其之前内存中是没有的，必须通过类加载器加载到内存。
                // 我们通过 当前类.class.getClassLoader() 来获取类加载器。
                MyBeanFactory.class.getClassLoader(),
                //  代理类需要实现的所有接口
                // 我们通过 目标类实例.getClass().getInterfaces() 来获取当前目标类的所有接口，
                // 但是此方式没办法获取到父元素的接口。
                atService.getClass().getInterfaces(),
                //处理类
                new InvocationHandler() {
                    /**
                     * 在代理类的每一个方法执行时都会调用一次invoke()方法
                     * @param proxy  代理对象
                     * @param method 代理对象当前执行的方法的描述对象
                     * @param args   方法的实际参数
                     * @return
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前执行
                        myAspect.before(args);
                        //执行目标类的方法
                        Object obj = method.invoke(atService, args);
                        //后执行
                        myAspect.after(args);
                        return obj;
                    }
                });
        return proxService;
    }
}
