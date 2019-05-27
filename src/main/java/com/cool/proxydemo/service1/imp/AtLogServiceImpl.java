package com.cool.proxydemo.service1.imp;

import com.cool.proxydemo.service1.AtService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author cool
 * @version V1.0
 * @className AtLogServiceImpl
 * @description 静态代理类
 * 静态代理我们解决了在不更改核心业务代码的前题下是实现了日志功能
 * 静态代理还有一些缺点:
 * 1、代理类和委托类实现了相同的接口，代理类通过委托类实现了相同的方法。这样就出现了大量的代码重复
 *
 * @createDate 2019年05月27日
 */
@Slf4j
public class AtLogServiceImpl implements AtService {
    private AtService atService = new AtServiceImpl();
    @Override
    public int add(int a , int b ) {
        int result = atService.add(a , b);
        log.info("你输入的参数为"+a+"和"+b+"；相加结果为"+result);
        return result;
    }

    @Override
    public int min(int a , int b ) {
        int result = atService.min(a , b);
        log.info("你输入的参数为"+a+"和"+b+"；相减结果为"+result);
        return result;
    }

    @Override
    public int mul(int a , int b ) {
        int result = atService.mul(a , b);
        log.info("你输入的参数为"+a+"和"+b+"；相乘结果为"+result);
        return result;
    }

    @Override
    public int div(int a , int b ) {
        int result = atService.div(a , b);
        log.info("你输入的参数为"+a+"和"+b+"；相除结果为"+result);
        return result;
    }
    @Override
    public int add(int a , int b , int c ) {
        int result = add( a,  b,  c);
        log.info("你输入的参数为"+a+"和"+b+"和"+c+"；相加结果为"+result);
        return result;
    }
}