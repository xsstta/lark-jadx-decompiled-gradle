package com.google.android.play.core.splitcompat;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.splitcompat.r */
public final class C22679r {

    /* renamed from: a */
    private static ThreadPoolExecutor f56107a;

    /* renamed from: a */
    public static String m82537a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static Executor m82538a() {
        if (f56107a == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC22665d());
            f56107a = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f56107a;
    }

    /* renamed from: a */
    public static <T> void m82539a(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    /* renamed from: a */
    public static void m82540a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
