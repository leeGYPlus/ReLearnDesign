package com.aline.creational.test;

public class Test {
    public static void main(String[] args) {
        new Test().test();
    }


    public void test(){
        int a = 2;

        long startTime = System.currentTimeMillis();
        for (long i = 0; i < 1_000_000_000; i++) {
            long b = a << 2;
        }
        System.out.println(" << " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (long i = 0; i < 1_000_000_000; i++) {
            long c = a * 4;
        }
        System.out.println(" * "  + (System.currentTimeMillis() - startTime));

    }

}
