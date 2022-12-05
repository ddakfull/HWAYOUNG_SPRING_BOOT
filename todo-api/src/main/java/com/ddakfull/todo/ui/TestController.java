package com.ddakfull.todo.ui;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddakfull.todo.domain.Test;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    @GetMapping
    public ResponseEntity<Test> test() {
        return ResponseEntity.ok(new Test("test message"));
    }
}