package com.ahelord.examen;

import java.nio.file.Path;

public class Path36 {
    public static void main(String[] args) {
        Path someFile = Path.of("/","users","joe","docs","some.txt");
        Path justSomeFile = someFile.getFileName();
        Path docsFolder = someFile.getParent();
        Path currentFolder = docsFolder.relativize(someFile);
        System.out.println(currentFolder);
    }
}
