package com.ss.android.lark.mediapicker.utils;

import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.ss.android.lark.mediapicker.utils.h */
public class C44753h {
    /* renamed from: b */
    public static boolean m177495b(String str) {
        try {
            if (!new File(str).exists()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m177494a(String str) {
        if (str.lastIndexOf(".") > 0) {
            return str.substring(str.lastIndexOf("."), str.length());
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: java.io.FileInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static long m177493a(File file) {
        Throwable th;
        FileChannel fileChannel;
        IOException e;
        FileChannel fileChannel2;
        FileChannel fileChannel3 = null;
        long j = 0;
        try {
            if (!file.exists() || !file.isFile()) {
                Log.m165389i("FileUtils", "file doesn't exist or is not a file");
                fileChannel2 = null;
            } else {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileChannel3 = fileInputStream.getChannel();
                    j = fileChannel3.size();
                    fileChannel2 = fileChannel3;
                    fileChannel3 = fileInputStream;
                } catch (IOException e2) {
                    e = e2;
                    fileChannel = fileChannel3;
                    fileChannel3 = fileInputStream;
                    try {
                        Log.m165383e("FileUtils", e.getMessage());
                        C44744c.m177485a(fileChannel3, fileChannel);
                        return j;
                    } catch (Throwable th2) {
                        th = th2;
                        C44744c.m177485a(fileChannel3, fileChannel);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = fileChannel3;
                    fileChannel3 = fileInputStream;
                    C44744c.m177485a(fileChannel3, fileChannel);
                    throw th;
                }
            }
            C44744c.m177485a(fileChannel3, fileChannel2);
        } catch (IOException e3) {
            e = e3;
            fileChannel = null;
            Log.m165383e("FileUtils", e.getMessage());
            C44744c.m177485a(fileChannel3, fileChannel);
            return j;
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
            C44744c.m177485a(fileChannel3, fileChannel);
            throw th;
        }
        return j;
    }
}
