package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FailTest {

    @Test
    void mustFail() {
        //test
        assert (1==2);
    }
}
