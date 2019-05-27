package com.cool.proxydemo.service2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cool
 * @version V1.0
 * @className MethodMonitor
 * @description Code Is Poetry.
 * @createDate 2019年05月27日
 */
@Slf4j
public class MethodMonitor {
    private long start;
    private String method;
    public MethodMonitor(String method) {
        this.method = method;
        log.info("begin monitor..");
        this.start = System.currentTimeMillis();
    }
    public void log() {
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("end monitor..");
        log.info("Method: " + method + ", execution time: " + elapsedTime + " milliseconds.");
    }
}
