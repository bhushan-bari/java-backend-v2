package com.bhushan.javabackend.module07;

import java.util.ArrayList;
import java.util.List;

public class MemoryTroubleshootingDemo {

    private static final List<String> cache = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Adding data to cache...");

        for (int i = 1; i <= 10_000; i++) {
            cache.add("Product-" + i);
        }

        System.out.println("Cache size: " + cache.size());

        System.out.println(
                "Objects remain reachable through the static collection."
        );

        // Remove unnecessary references
        cache.clear();

        System.out.println(
                "Cache cleared. Current cache size: " + cache.size()
        );

        System.out.println(
                "Objects previously referenced by the cache may now become GC eligible."
        );
    }
}
