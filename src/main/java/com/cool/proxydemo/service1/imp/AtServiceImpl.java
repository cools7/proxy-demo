package com.cool.proxydemo.service1.imp;

import com.cool.proxydemo.service1.AtService;

/**
 * @author cool
 * @version V1.0
 * @className AtServiceImpl
 * @description 委托类
 * @createDate 2019年05月27日
 */
public class AtServiceImpl implements AtService {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
    @Override
    public int min(int a, int b) {
        int result = a - b;
        return result;
    }
    @Override
    public int mul(int a, int b) {
        int result = a * b;
        return result;
    }
    @Override
    public int div(int a, int b) {
        int result = a / b;
        return result;
    }
    @Override
    public int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
}
