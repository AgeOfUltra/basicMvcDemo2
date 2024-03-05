package com.jarvis;

import org.springframework.stereotype.Service;

@Service
public class AddServices {
    public int add(int a, int b) {
        return a + b;
    }
}
