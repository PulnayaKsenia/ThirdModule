package com.third_module.first_task;

public class File {
    private String name;

    private Directory directory;

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
        this.directory.add(this);
        this.directory.delete(this);
    }
}
