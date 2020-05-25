package com.mammoth.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

    private static final String PATH = "C:\\Users\\tanma\\Developer\\java\\javatutorial\\src\\main\\java\\com\\mammoth\\iostreams\\";

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(PATH + "xanadu.txt");
            out = new FileOutputStream(PATH + "outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
