package com.cool.proxydemo.service1;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author cool
 * @version V1.0
 * @className MyAspect
 * @description 切面类
 * @createDate 2019年05月27日
 */
@Slf4j
public class MyAspect {
    public void before(Object[] args){
        log.info("执行前:{}", Arrays.toString(args));
    }
    public void after(Object[] args){
        log.info("执行后:{}", Arrays.toString(args));
    }
}
