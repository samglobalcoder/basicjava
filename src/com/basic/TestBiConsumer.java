package com.basic;

import java.util.function.BiConsumer;

/**
 * This is the class helps to understand the BiConsumer interface
 * how it works.
 *
 * @author Rosan.Thangadurai
 */
class TestBiConsumer {

    public static void main(String[] args) {
        System.out.println("Test Bi Consumer");
        BiConsumer<String, String> biConsumer = (one, two) -> System.out.println(one + "" + two);
        biConsumer.accept("Beaky", "Bird");
    }

}
