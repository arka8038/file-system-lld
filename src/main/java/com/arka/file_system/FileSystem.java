package com.arka.file_system;

import java.util.List;

public interface FileSystem {
    String getName();
    void print(String structure);
    void add(FileSystem component);
    void remove(FileSystem component);
    List<FileSystem> getChildren();
}
