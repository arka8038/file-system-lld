package com.arka.file_system;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class File implements  FileSystem {
    private final String fileName;

    @Override
    public String getName() {
        return fileName;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + fileName);
    }

    @Override
    public void add(FileSystem component) {
        throw new UnsupportedOperationException("Cannot add to a file");
    }

    @Override
    public void remove(FileSystem component) {
        throw new UnsupportedOperationException("Cannot remove from a file");
    }

    @Override
    public List<FileSystem> getChildren() {
        throw new UnsupportedOperationException("File does not have children.");
    }
}
