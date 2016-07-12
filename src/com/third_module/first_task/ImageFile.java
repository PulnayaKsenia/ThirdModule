package com.third_module.first_task;

public class ImageFile extends File {
    public ImageFile(String name, Directory directory) {
        super(name, directory);
    }

    @Override
    public String toString() {
        return "ImageFile";
    }
}
