package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.util.Base64;
import com.google.android.play.core.internal.bx;
import com.google.android.play.core.splitinstall.az;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public final class bz {

    /* renamed from: a */
    private static AbstractC22594e f55833a;

    /* renamed from: a */
    static long m82057a(byte[] bArr, int i) {
        return ((long) ((m82062b(bArr, i + 2) << 16) | m82062b(bArr, i))) & 4294967295L;
    }

    /* renamed from: a */
    static synchronized AbstractC22594e m82058a(Context context) {
        AbstractC22594e eVar;
        synchronized (bz.class) {
            if (f55833a == null) {
                C22585at atVar = new C22585at(null);
                atVar.mo78750a(new C22592db(az.m82612a(context)));
                f55833a = atVar.mo78749a();
            }
            eVar = f55833a;
        }
        return eVar;
    }

    /* renamed from: a */
    static String m82059a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File file : list) {
            FileInputStream fileInputStream = new FileInputStream(file);
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    bx.m82371a(th, th);
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    /* renamed from: a */
    public static boolean m82060a(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: a */
    static boolean m82061a(int i, int i2) {
        if (i == 5 && i2 != 5) {
            return true;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: b */
    static int m82062b(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: b */
    public static boolean m82063b(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: c */
    public static boolean m82064c(int i) {
        return i == 2 || i == 7 || i == 3;
    }
}
