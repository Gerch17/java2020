package ru.gerch.ex19;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileWorker fw = new FileWorker();
        // Запись в файл (также заменяет информацию, которая имеется в файлейцу)
        fw.writeToFile();
        // Чтение
        fw.readerFile();
        // Добавление текста в конец файла
        fw.addTextToFile();
    }
}
