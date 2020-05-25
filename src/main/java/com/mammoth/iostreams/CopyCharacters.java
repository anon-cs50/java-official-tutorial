package com.mammoth.iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

    private static final String PATH = "C:\\Users\\tanma\\Developer\\java\\javatutorial\\src\\main\\java\\com\\mammoth\\iostreams\\";

    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(PATH + "xanadu.txt");
            outputStream = new FileWriter(PATH + "characteroutput.txt");
            int c;

            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
