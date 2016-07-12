package com.third_module.first_task;

public class AudioFile extends File {
    public AudioFile(String name, Directory directory) {
        super(name, directory);
    }

    @Override
    public String toString() {
        return "AudioFile";
    }
}
