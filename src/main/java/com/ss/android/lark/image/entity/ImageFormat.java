package com.ss.android.lark.image.entity;

public enum ImageFormat {
    WEBP(1),
    JPEG(2),
    PNG(3);
    
    private int value;

    public int getNumber() {
        return this.value;
    }

    public static ImageFormat valueOf(int i) {
        return forNumber(i);
    }

    public static ImageFormat forNumber(int i) {
        if (i == 1) {
            return WEBP;
        }
        if (i == 2) {
            return JPEG;
        }
        if (i != 3) {
            return PNG;
        }
        return PNG;
    }

    private ImageFormat(int i) {
        this.value = i;
    }
}
