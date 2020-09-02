package com.examples.modernjava8.e03_consumer;

import java.util.function.Consumer;

/**
 * @author Kevin Lee
 * @since 2015-08-01
 */
public class ConsumerExamples {

    private static void consumerExamples() {

        /* 이것은 익명클래스, 아래의 람다형식과 같은 값을 도출한다. 람다의 경우 메소드 이름이 생략되며 매개변수와 결과값만 남게 된다.
        final Consumer<String> print = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(value);
            }
        };*/

        final Consumer<String> print = value -> System.out.println(value);
        print.accept("Hello");

        final Consumer<String> greetings = value -> System.out.println("Hello " + value);
        greetings.accept("World");
        greetings.accept("Deokjin");

    }

    public static void main(final String[] args) {
        consumerExamples();
    }

}