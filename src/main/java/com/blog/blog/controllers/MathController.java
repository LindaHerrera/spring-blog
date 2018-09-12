package com.blog.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{firstnum}/and/{secondnum}")
    @ResponseBody
    private int add(
            @PathVariable int firstnum,
            @PathVariable int secondnum
    ){
        return firstnum + secondnum;
    }

    @GetMapping("/subtract/{a}/from/{b}")
    @ResponseBody
    private int subtract(
            @PathVariable int a,
            @PathVariable int b
    ){
        return b - a ;
    }


    @GetMapping("/multiply/{first}/and/{second}")
    @ResponseBody
    private int multiply(
            @PathVariable int first,
            @PathVariable int second
    ){
        return first * second;
    }

    @GetMapping("/divide/{one}/by/{two}")
    @ResponseBody
    private int divide(
            @PathVariable int one,
            @PathVariable int two
    ){
        return (one/two);
    }
}

