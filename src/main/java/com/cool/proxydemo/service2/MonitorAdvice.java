package com.cool.proxydemo.service2;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @author cool
 * @version V1.0
 * @className WebLogAspect
 * @description 使用切面的方式为每一次请求打印日志。包含访问的完整路径，调用方法，传入参数，返回值，耗时等信息。
 * @createDate 2018年07月02日
 */
@Aspect
@Component
@Slf4j
public class MonitorAdvice {

    @Pointcut("execution (* say* (..))")
    public void pointcut() {
    }
    @Around("pointcut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        log.info("-------------------");
        MonitorSession.begin(pjp.getSignature().getName());
        pjp.proceed();
        MonitorSession.end();
    }
}