package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.f */
public final class C7333f {

    /* renamed from: a */
    private static final char[] f19622a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f19623b = new char[64];

    /* renamed from: c */
    private static final char[] f19624c = new char[40];

    /* renamed from: b */
    private static boolean m29299b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static boolean m29298b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.f$1 */
    public static /* synthetic */ class C73341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f19625a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f.C73341.f19625a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f.C73341.f19625a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f.C73341.f19625a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f.C73341.f19625a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d.C7333f.C73341.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m29296a() {
        if (!m29298b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static <T> Queue<T> m29295a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    private static int m29293a(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C73341.f19625a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return 4;
    }

    /* renamed from: a */
    public static int m29294a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* renamed from: a */
    public static boolean m29297a(int i, int i2) {
        if (!m29299b(i) || !m29299b(i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m29292a(int i, int i2, Bitmap.Config config) {
        return i * i2 * m29293a(config);
    }
}
