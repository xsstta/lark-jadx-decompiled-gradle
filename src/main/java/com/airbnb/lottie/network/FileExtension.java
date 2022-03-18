package com.airbnb.lottie.network;

import com.airbnb.lottie.p071c.C1787d;

public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    public String toString() {
        return this.extension;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    public static FileExtension forFile(String str) {
        FileExtension[] values = values();
        for (FileExtension fileExtension : values) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        C1787d.m7973b("Unable to find correct extension for " + str);
        return JSON;
    }

    private FileExtension(String str) {
        this.extension = str;
    }
}
