package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.common.util.a */
public class C21804a {

    /* renamed from: a */
    private static volatile int f53201a = -1;

    /* renamed from: a */
    public static byte[] m79076a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest a;
        PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (a = m79075a("SHA1")) == null) {
            return null;
        }
        return a.digest(packageInfo.signatures[0].toByteArray());
    }

    /* renamed from: a */
    public static MessageDigest m79075a(String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
