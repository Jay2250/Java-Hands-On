package com.exceptions;

import java.io.File;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            File f = new File("Data.txt");
            if (!f.exists())
                throw new IOException("File is not present in the system!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
