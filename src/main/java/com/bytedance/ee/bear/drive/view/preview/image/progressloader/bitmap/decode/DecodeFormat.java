package com.bytedance.ee.bear.drive.view.preview.image.progressloader.bitmap.decode;

public enum DecodeFormat {
    ALWAYS_ARGB_8888,
    PREFER_ARGB_8888,
    PREFER_RGB_565;
    
    public static final DecodeFormat DEFAULT;

    static {
        DecodeFormat decodeFormat;
        DEFAULT = decodeFormat;
    }
}
