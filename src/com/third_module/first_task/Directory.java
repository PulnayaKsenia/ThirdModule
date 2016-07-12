package com.third_module.first_task;

import java.util.List;

public class Directory {
    private List<File> files;

    public Directory(List<File> files) {
        this.files = files;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void add(File file) {
        files.add(file);
    }

    public void delete(File file) {
        files.remove(file);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "files=" + files +
                '}';
    }

}
