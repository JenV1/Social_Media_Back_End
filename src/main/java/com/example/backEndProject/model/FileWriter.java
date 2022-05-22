package com.example.backEndProject.model;

import java.io.File;
import java.io.IOException;

public class FileWriter {

    public static void main(String[] args) {
        try {
            File myFile = new File("all_posts_and_post_edits.txt");
            if (myFile.createNewFile()) {
                System.out.println("File " + myFile.getName() + " has been created successfully.");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}
