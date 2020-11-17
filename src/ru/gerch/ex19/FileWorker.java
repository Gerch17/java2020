package ru.gerch.ex19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWorker {
    private File file = new File("D:\\mireaJava\\java2020\\src\\ru\\gerch\\ex19","Example.txt");

    public FileWorker() {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readerFile()
    {
        try{
            System.out.println("Содержание файла: ");
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        } catch (IOException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
    }

    public void writeToFile()
    {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.append(scanner.nextLine());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addTextToFile(){
        try(FileWriter fileWriter = new FileWriter(file, true))
        {
            Scanner scanner = new Scanner(System.in);
            fileWriter.append("\n").append(scanner.nextLine());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
