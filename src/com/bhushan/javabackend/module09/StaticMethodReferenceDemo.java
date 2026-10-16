package com.bhushan.javabackend.module09;

@FunctionalInterface
interface NumberOperation {
    int calculate(int number);
}

class NumberUtil {

    public static int square(int number) {
        return number * number;
    }
}

public class StaticMethodReferenceDemo {

    public static void main(String[] args) {

        NumberOperation operation =
                NumberUtil::square;

        System.out.println(
                "Square: "
                        + operation.calculate(5)
        );
    }
}