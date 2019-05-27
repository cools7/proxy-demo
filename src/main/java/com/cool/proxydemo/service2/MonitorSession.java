package com.cool.proxydemo.service2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cool
 * @version V1.0
 * @className MonitorSession
 * @description Code Is Poetry.
 * @createDate 2019年05月27日
 */
@Slf4j
public class MonitorSession {
    private static ThreadLocal<MethodMonitor> monitorThreadLocal = new ThreadLocal<>();
    public static void begin(String method) {
        MethodMonitor logger = new MethodMonitor(method);
        monitorThreadLocal.set(logger);
    }
    public static void end() {
        MethodMonitor logger = monitorThreadLocal.get();
        logger.log();
    }
}