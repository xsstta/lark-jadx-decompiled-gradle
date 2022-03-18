package com.ss.android.lark.mediapicker.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageUtils {

    public enum ImageType {
        TYPE_JPG("jpg"),
        TYPE_PNG("png"),
        TYPE_GIF("gif"),
        TYPE_TIFF("tiff"),
        TYPE_BMP("bmp"),
        TYPE_WEBP("webp"),
        TYPE_ICO("ico"),
        TYPE_UNKNOWN("unknown");
        
        String value;

        public String getValue() {
            return this.value;
        }

        private ImageType(String str) {
            this.value = str;
        }
    }

    /* renamed from: a */
    public static ImageType m177476a(File file) {
        Throwable th;
        IOException e;
        byte[] bArr = new byte[12];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileInputStream2.read(bArr);
                C44744c.m177485a(fileInputStream2);
            } catch (IOException e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                try {
                    e.printStackTrace();
                    C44744c.m177485a(fileInputStream);
                    return m177477a(bArr);
                } catch (Throwable th2) {
                    th = th2;
                    C44744c.m177485a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                C44744c.m177485a(fileInputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            e.printStackTrace();
            C44744c.m177485a(fileInputStream);
            return m177477a(bArr);
        }
        return m177477a(bArr);
    }

    /* renamed from: a */
    public static ImageType m177477a(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        String upperCase = C44756l.m177505a(bArr2).toUpperCase();
        if (upperCase.contains("FFD8FF")) {
            return ImageType.TYPE_JPG;
        }
        if (upperCase.contains("89504E47")) {
            return ImageType.TYPE_PNG;
        }
        if (upperCase.contains("47494638")) {
            return ImageType.TYPE_GIF;
        }
        if (upperCase.contains("49492A00") || upperCase.contains("4D4D002A")) {
            return ImageType.TYPE_TIFF;
        }
        if (upperCase.contains("424D")) {
            return ImageType.TYPE_BMP;
        }
        if (upperCase.startsWith("52494646") && upperCase.endsWith("57454250")) {
            return ImageType.TYPE_WEBP;
        }
        if (upperCase.contains("00000100") || upperCase.contains("00000200")) {
            return ImageType.TYPE_ICO;
        }
        return ImageType.TYPE_UNKNOWN;
    }
}
