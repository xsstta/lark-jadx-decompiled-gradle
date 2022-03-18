package com.bytedance.apm6.util;

import android.os.Build;
import android.os.StatFs;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.bytedance.apm6.util.c */
public class C3352c {
    /* renamed from: b */
    public static void m13947b(File file) {
        if (file != null && file.exists()) {
            try {
                file.delete();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m13944a(String str) {
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getAvailableBytes();
        }
        return (long) (statFs.getAvailableBlocks() * statFs.getBlockSize());
    }

    /* renamed from: b */
    public static long m13946b(String str) {
        StatFs statFs = new StatFs(str);
        if (Build.VERSION.SDK_INT >= 18) {
            return statFs.getTotalBytes();
        }
        return (long) (statFs.getBlockCount() * statFs.getBlockSize());
    }

    /* renamed from: a */
    public static byte[] m13945a(File file) {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        FileNotFoundException e;
        IOException e2;
        BufferedInputStream bufferedInputStream2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
                C3354d.m13949a(bufferedInputStream);
                return bArr;
            } catch (FileNotFoundException e3) {
                e = e3;
                e.printStackTrace();
                C3354d.m13949a(bufferedInputStream);
                return null;
            } catch (IOException e4) {
                e2 = e4;
                e2.printStackTrace();
                C3354d.m13949a(bufferedInputStream);
                return null;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
            bufferedInputStream = null;
            e.printStackTrace();
            C3354d.m13949a(bufferedInputStream);
            return null;
        } catch (IOException e6) {
            e2 = e6;
            bufferedInputStream = null;
            e2.printStackTrace();
            C3354d.m13949a(bufferedInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream2 = bufferedInputStream;
            C3354d.m13949a(bufferedInputStream2);
            throw th;
        }
    }
}
