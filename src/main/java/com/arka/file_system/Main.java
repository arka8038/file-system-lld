package com.arka.file_system;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileSystem file1 = new File("file1.txt");
        FileSystem file2 = new File("file2.txt");
        FileSystem file3 = new File("file3.txt");

        FileSystem dir1 = new Directory("dir1");
        FileSystem dir2 = new Directory("dir2");

        try {
            dir1.add(file1);
            dir1.add(file2);

            dir2.add(file3);
            dir2.add(dir1);

            dir2.print("");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }
    }
}