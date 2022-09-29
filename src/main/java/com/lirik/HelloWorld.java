package com.lirik;

import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world from Java-class");

        List<Integer> myList = List.of(1, 5, -3, 7);

        List<Integer> collect = myList.stream().map(Math::abs).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println(StringUtils.capitalize("hello world"));


    }


}
