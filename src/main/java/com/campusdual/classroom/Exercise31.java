package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {
        String cadena;
        String archivo = "src/main/resources/lorem.txt";

        FileReader f = null;
        try {
            f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);

            while((cadena = b.readLine())!=null) {
                System.out.println(cadena);
            }
            b.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
