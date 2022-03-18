package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.passport.infra.util.z */
public class C49229z {

    /* renamed from: a */
    private static final char[] f123559a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m194068a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr = new char[32];
            int i = 0;
            for (int i2 = 0; i2 < 16; i2++) {
                byte b = digest[i2];
                int i3 = i + 1;
                char[] cArr2 = f123559a;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i = i3 + 1;
                cArr[i3] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static List<String> m194069a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList();
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                for (Signature signature : signatureArr) {
                    arrayList.add(m194068a(signature.toByteArray()));
                }
                return arrayList;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m194070a(Context context, String str, String str2) {
        List<String> a;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && context != null && (a = m194069a(context, str)) != null && a.size() > 0) {
            for (String str3 : a) {
                if (str2.equalsIgnoreCase(str3)) {
                    return true;
                }
            }
        }
        return false;
    }
}
