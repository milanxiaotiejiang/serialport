package com.example.port.serial;

import java.io.File;
import java.io.Serializable;

public class Device implements Serializable {

    private String name;
    private String root;
    private File file;

    public Device(String name, String root, File file) {
        this.name = name;
        this.root = root;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File path) {
        this.file = file;
    }
}
