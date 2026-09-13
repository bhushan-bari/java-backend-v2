package com.bhushan.javabackend.module06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {

    public static void main(String[] args) {

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new FileReader("input.txt"));

                BufferedWriter writer =
                        new BufferedWriter(
                                new FileWriter("output.txt"))
        ) {

            String line = reader.readLine();

            writer.write(line);

            System.out.println(
                    "File copied successfully"
            );

        } catch (IOException e) {

            System.out.println(
                    "File operation failed"
            );
        }
    }
}