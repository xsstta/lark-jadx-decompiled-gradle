package com.ss.android.photoeditor.ve.p3018e;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.ss.android.photoeditor.ve.e.c */
public final class C59898c {

    /* renamed from: a */
    public static final Rect f149201a = new Rect();

    /* renamed from: b */
    public static final RectF f149202b = new RectF();

    /* renamed from: c */
    public static final RectF f149203c = new RectF();

    /* renamed from: d */
    public static final float[] f149204d = new float[6];

    /* renamed from: e */
    public static final float[] f149205e = new float[6];

    /* renamed from: f */
    private static int f149206f;

    /* renamed from: a */
    public static C59899a m232456a(Context context, Uri uri, int i, int i2) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            BitmapFactory.Options a = m232454a(contentResolver, uri);
            if (a.outWidth == -1) {
                if (a.outHeight == -1) {
                    throw new RuntimeException("File is not a picture");
                }
            }
            a.inSampleSize = Math.max(m232451a(a.outWidth, a.outHeight, i, i2), m232450a(a.outWidth, a.outHeight));
            return new C59899a(m232452a(contentResolver, uri, a), a.inSampleSize);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load sampled bitmap: " + uri + "\r\n" + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    private static void m232457a(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    /* renamed from: a */
    private static int m232449a() {
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
            EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
            egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
            int[] iArr2 = new int[1];
            int i = 0;
            for (int i2 = 0; i2 < iArr[0]; i2++) {
                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12332, iArr2);
                if (i < iArr2[0]) {
                    i = iArr2[0];
                }
            }
            egl10.eglTerminate(eglGetDisplay);
            return Math.max(i, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    /* renamed from: a */
    private static void m232458a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    public static float m232462e(float[] fArr) {
        return m232460c(fArr) - m232448a(fArr);
    }

    /* renamed from: f */
    public static float m232463f(float[] fArr) {
        return m232461d(fArr) - m232459b(fArr);
    }

    /* renamed from: g */
    public static float m232464g(float[] fArr) {
        return (m232460c(fArr) + m232448a(fArr)) / 2.0f;
    }

    /* renamed from: h */
    public static float m232465h(float[] fArr) {
        return (m232461d(fArr) + m232459b(fArr)) / 2.0f;
    }

    /* renamed from: a */
    public static float m232448a(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: b */
    public static float m232459b(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: c */
    public static float m232460c(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    /* renamed from: d */
    public static float m232461d(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    /* renamed from: a */
    public static Bitmap m232453a(View view) {
        view.clearFocus();
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: com.ss.android.photoeditor.ve.e.c$a */
    public static final class C59899a {

        /* renamed from: a */
        public final Bitmap f149207a;

        /* renamed from: b */
        public final int f149208b;

        C59899a(Bitmap bitmap, int i) {
            this.f149207a = bitmap;
            this.f149208b = i;
        }
    }

    /* renamed from: a */
    private static int m232450a(int i, int i2) {
        if (f149206f == 0) {
            f149206f = m232449a();
        }
        int i3 = 1;
        if (f149206f > 0) {
            while (true) {
                int i4 = i2 / i3;
                int i5 = f149206f;
                if (i4 <= i5 && i / i3 <= i5) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    /* renamed from: a */
    private static BitmapFactory.Options m232454a(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = contentResolver.openInputStream(uri);
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, f149201a, options);
                options.inJustDecodeBounds = false;
                m232458a(inputStream);
                return options;
            } catch (Throwable th2) {
                th = th2;
                m232458a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            m232458a(inputStream);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0001 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.ContentResolver */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.graphics.Bitmap] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        m232458a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        return r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m232452a(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
        L_0x0000:
            r0 = 0
            java.io.InputStream r0 = r2.openInputStream(r3)     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Rect r1 = com.ss.android.photoeditor.ve.p3018e.C59898c.f149201a     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r1, r4)     // Catch:{ OutOfMemoryError -> 0x0011 }
            m232458a(r0)
            return r2
        L_0x000f:
            r2 = move-exception
            goto L_0x0038
        L_0x0011:
            int r1 = r4.inSampleSize     // Catch:{ all -> 0x000f }
            int r1 = r1 * 2
            r4.inSampleSize = r1     // Catch:{ all -> 0x000f }
            m232458a(r0)
            int r0 = r4.inSampleSize
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L_0x0021
            goto L_0x0000
        L_0x0021:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Failed to decode image: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L_0x0038:
            m232458a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.photoeditor.ve.p3018e.C59898c.m232452a(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static int m232451a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static Rect m232455a(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max((float) BitmapDescriptorFactory.HUE_RED, m232448a(fArr))), Math.round(Math.max((float) BitmapDescriptorFactory.HUE_RED, m232459b(fArr))), Math.round(Math.min((float) i, m232460c(fArr))), Math.round(Math.min((float) i2, m232461d(fArr))));
        if (z) {
            m232457a(rect, i3, i4);
        }
        return rect;
    }
}
