package com.lamda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 4, 50, 21);
        List<Integer> newlist = list1.stream().filter(i -> i > 30).collect(Collectors.toList());
        System.out.println(newlist);
    }
}





