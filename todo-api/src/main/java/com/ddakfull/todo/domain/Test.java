package com.ddakfull.todo.domain;

import lombok.Getter;

@Getter
public class Test {
    
    private final String message;
    
    public Test(final String message) {
        this.message = message;
    }
}
