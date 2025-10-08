package com.tnsif.lambdaexpressions;
import java.util.*;

public class LambdaWithCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("pooja", "Karthik", "Avi", "lakshmi");

        names.forEach(name -> System.out.println("Name: " + name));
    }
}
