package com.examples.modernjava8.e02_function;

import java.util.function.Function;

/**
 * @author Kevin Lee
 * @since 2015-08-01
 * 재네릭 메소드를 알게 됨..
 */
public class FunctionExamples {

    private static void functionExamples() {

        /* 아래의 람다함수와 동일한 함수이고 이것이 원형이다.
        Function<String, Integer> toInt = new Function<String, Integer>() {
            @Override
            public Integer apply(final String value) {
                return Integer.parseInt(value);
            }
        }; */

        final Function<String, Integer> toInt = value -> Integer.parseInt(value);

        final Integer number = toInt.apply("100");
        System.out.println(number);


        final Function<Integer, Integer> identity = Function.identity();
        final Function<Integer, Integer> identity2 = t -> t;

        System.out.println(identity.apply(999));
        System.out.println(identity2.apply(999));
    }


    public static void main(final String[] args) {
        functionExamples();
    }

}