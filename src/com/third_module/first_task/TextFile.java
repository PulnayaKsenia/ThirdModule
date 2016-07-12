package com.third_module.first_task;

public class TextFile extends File {
    public TextFile(String name, Directory directory) {
        super(name, directory);
    }

    @Override
    public String toString() {
        return "TextFile";
    }
}
