package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import com.bumptech.glide.load.p085b.AbstractC2229l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.util.k */
public final class C2568k {

    /* renamed from: a */
    private static final char[] f8288a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f8289b = new char[64];

    /* renamed from: c */
    private static final char[] f8290c = new char[32];

    /* renamed from: b */
    public static int m10914b(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: c */
    private static boolean m10919c(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static boolean m10911a(int i, int i2) {
        return m10919c(i) && m10919c(i2);
    }

    /* renamed from: a */
    public static void m10910a() {
        if (!m10918c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static <T> Queue<T> m10909a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static <T> List<T> m10908a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m10912a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m10920d() {
        return !m10918c();
    }

    /* renamed from: c */
    public static boolean m10918c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m10916b() {
        if (!m10920d()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.util.k$1 */
    public static /* synthetic */ class C25691 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8291a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.util.C2568k.C25691.f8291a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bumptech.glide.util.C2568k.C25691.f8291a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bumptech.glide.util.C2568k.C25691.f8291a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bumptech.glide.util.C2568k.C25691.f8291a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bumptech.glide.util.C2568k.C25691.f8291a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.util.C2568k.C25691.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m10899a(float f) {
        return m10900a(f, 17);
    }

    /* renamed from: b */
    public static int m10913b(int i) {
        return m10914b(i, 17);
    }

    /* renamed from: b */
    public static String m10915b(byte[] bArr) {
        String a;
        char[] cArr = f8290c;
        synchronized (cArr) {
            a = m10907a(bArr, cArr);
        }
        return a;
    }

    /* renamed from: a */
    private static int m10902a(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C25691.f8291a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    /* renamed from: a */
    public static int m10903a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: a */
    public static String m10906a(byte[] bArr) {
        String a;
        char[] cArr = f8289b;
        synchronized (cArr) {
            a = m10907a(bArr, cArr);
        }
        return a;
    }

    /* renamed from: a */
    public static int m10900a(float f, int i) {
        return m10914b(Float.floatToIntBits(f), i);
    }

    /* renamed from: b */
    public static boolean m10917b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj instanceof AbstractC2229l) {
            return ((AbstractC2229l) obj).mo10594a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: a */
    public static int m10904a(Object obj, int i) {
        int i2;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        return m10914b(i2, i);
    }

    /* renamed from: a */
    public static int m10905a(boolean z, int i) {
        return m10914b(z ? 1 : 0, i);
    }

    /* renamed from: a */
    private static String m10907a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f8288a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static int m10901a(int i, int i2, Bitmap.Config config) {
        return i * i2 * m10902a(config);
    }
}
