package com.lamda;
import java.util.Arrays;
import java.util.List;

public class DemoForEach {
    public static void main(String[] args) {
        List<String> values=Arrays.asList("Srilanka","India","USA");
      //  for(String i : values)
       // {
         //   System.out.println(i);
      //  }
        values.forEach(i -> System.out.println(i));
    }

}
