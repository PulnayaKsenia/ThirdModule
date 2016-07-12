package com.third_module.first_task;

public class File {
    private String name;
    private Directory directory;

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
        directory.add(this);
        directory.delete(this);
    }

    @Override
    public String toString() {
        return "File " + name + "located in the directory " + directory;
    }
}
