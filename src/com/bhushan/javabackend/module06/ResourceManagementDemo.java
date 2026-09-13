package com.bhushan.javabackend.module06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagementDemo {

    public static void main(String[] args) {

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader("products.txt"))) {

            String firstLine = reader.readLine();

            System.out.println(firstLine);

        } catch (IOException e) {

            System.out.println(
                    "Unable to read product file"
            );
        }
    }
}