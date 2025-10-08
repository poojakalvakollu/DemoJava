package com.tnsif.lambdaexpressions;

@FunctionalInterface
interface GreetingWithParam {
    void sayHello(String name);
}

public class LambdaWithParameter {
    public static void main(String[] args) {

        GreetingWithParam greet = (name) -> {
            System.out.println("Hello, " + name + "! Welcome to Java Lambda Expressions 😊");
        };

        greet.sayHello("Pooja");
    }
}


