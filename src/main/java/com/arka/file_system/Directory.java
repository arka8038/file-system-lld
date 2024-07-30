package com.arka.file_system;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private final String directoryName;
    private final List<FileSystem> components;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return directoryName;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + directoryName + "/");
        for(FileSystem component : components) {
            component.print(structure + "   ");
        }
    }

    @Override
    public void add(FileSystem component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystem component) {
        components.remove(component);
    }

    @Override
    public List<FileSystem> getChildren() {
        return components;
    }

}
