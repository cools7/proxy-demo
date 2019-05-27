package com.cool.proxydemo.service1;

/**
 * @author cool
 * @version V1.0
 * @className AtService
 * @description 目标类  讲解 jdk 静态和动态代理
 * 学习地址：https://mp.weixin.qq.com/s/u3RrZgwgJSiSYXjhijYyAw
 * @createDate 2019年05月27日
 */
public interface AtService {
    int add(int a, int b);
    int min(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
    int add(int a, int b, int c);
}
