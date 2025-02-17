package javaioexamples;

import java.io.*;
import java.util.Scanner;

public class CopyingAFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a file name:");
        String newFileName = scanner.nextLine();

        try {
            Reader reader = new FileReader("/Users/mehmet/Documents/input-output/oak academy.txt");
            Writer writer = new FileWriter("/Users/mehmet/Documents/input-output/" + newFileName + ".txt");

            if (reader.ready()){
                System.out.println("Data is reading...");

                int characterRead;

                do {
                    characterRead = reader.read();
                    if (characterRead != -1){
                        writer.write(characterRead);
                    }
                }while (characterRead != -1);

                System.out.println("The file copied.");

            }
            reader.close();
            writer.close();
            scanner.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
