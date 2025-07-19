package com.example.parent_root.controller;

import com.example.add.Add;
import com.example.multiply.Multiplier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        int sum = Add.add(a, b, c); // using 3-arg method from JAR
        int product = Multiplier.multiply(a, b, c); // using 3-arg method from JAR

        return "Sum = " + sum + ", Product = " + product;
    }
}
