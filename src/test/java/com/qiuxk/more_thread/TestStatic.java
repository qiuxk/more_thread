package com.qiuxk.more_thread;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class TestStatic {


    @Test
    public void test(){
        B b = new B();
        b.scan();
    }


    static class  A{
        public void scan(){
            doScan();
        }
        protected void doScan(){
            log.info("A is doing scan");
        }
    }

    static class B extends A{
        @Override
        public void scan() {
            super.scan();
            log.info("B is doing scan");
        }
    }


}