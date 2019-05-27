package com.cool.proxydemo.service2.imp;

import com.cool.proxydemo.service2.Speakable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author cool
 * @version V1.0
 * @className SpeakableImpl
 * @description Code Is Poetry.
 * @createDate 2019年05月27日
 */
@Service
@Slf4j
public class SpeakableImpl implements Speakable {
    @Override
    public void sayHi() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        log.info("Hi!!");
    }
    @Override
    public void sayBye() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        log.info("Bye!!");
    }
}
