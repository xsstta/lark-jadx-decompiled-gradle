package com.larksuite.tool.image;

import com.C1711a;

public class JPEGTool {
    public static native int getJpegQuality(byte[] bArr);

    public static native int getJpegQualityByPath(String str);

    public static native boolean isJPEG(byte[] bArr);

    static {
        C1711a.m7628a("JPEG-LIB");
    }
}
