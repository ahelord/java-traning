package com.ahelord.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        try (InputStream in = new FileInputStream(System.getProperty("user.dir") + "/src/some.txt");
             OutputStream out = new FileOutputStream(System.getProperty("user.dir") + "/src/other.txt");
        ) {
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }

        } catch (IOException e) {
            System.out.println("error " + e);
        }


        // Lectura y escritura de caracteres
        Charset utf8 = Charset.forName("UTF-8");

        try (Reader in = new FileReader(System.getProperty("user.dir") + "/src/some.txt",utf8);
             Writer out = new FileWriter(System.getProperty("user.dir") + "/src/other.txt",utf8);
        ) {
            char[] buffer = new char[1024];
            int length = 0;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }

        } catch (IOException e) {
            System.out.println("error " + e);
        }

        // Filesystem
        FileSystem fs = FileSystems.getDefault();
        fs.getFileStores().forEach(fileStore -> System.out.println(fileStore.type()+" "+fileStore.name()));
        fs.getRootDirectories().forEach(path -> System.out.println(path));
        // Path
        Path ioPath = Path.of("src","com","ahelord","io");
        for (int i = 0; i < ioPath.getNameCount(); i++) {
            Path path = ioPath.getName(i);
            System.out.println(path);
        }
        Files.list(ioPath).forEach(path -> System.out.println(path));

    }
}
