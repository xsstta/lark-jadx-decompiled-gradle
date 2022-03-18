package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.engine.p087a.AbstractC2283e;
import com.bumptech.glide.util.C2567j;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.y */
public final class C2455y {

    /* renamed from: a */
    private static final Paint f8034a = new Paint(6);

    /* renamed from: b */
    private static final Paint f8035b = new Paint(7);

    /* renamed from: c */
    private static final Paint f8036c;

    /* renamed from: d */
    private static final Set<String> f8037d;

    /* renamed from: e */
    private static final Lock f8038e;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.resource.bitmap.y$a */
    public interface AbstractC2457a {
        /* renamed from: a */
        void mo10981a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* renamed from: a */
    public static int m10363a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static boolean m10377b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.y$b  reason: invalid class name */
    private static final class locksLockC2458b implements Lock {
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }

        locksLockC2458b() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    /* renamed from: a */
    public static Lock m10369a() {
        return f8038e;
    }

    /* renamed from: a */
    private static void m10372a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f8038e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f8034a);
            m10373a(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f8038e.unlock();
            throw th;
        }
    }

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f8037d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new locksLockC2458b();
        }
        f8038e = lock;
        Paint paint = new Paint(7);
        f8036c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m10373a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: b */
    private static Bitmap.Config m10374b(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: a */
    private static Bitmap.Config m10364a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: a */
    public static void m10371a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    private static Bitmap m10365a(AbstractC2283e eVar, Bitmap bitmap) {
        Bitmap.Config a = m10364a(bitmap);
        if (a.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap a2 = eVar.mo10690a(bitmap.getWidth(), bitmap.getHeight(), a);
        new Canvas(a2).drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        return a2;
    }

    /* renamed from: a */
    static void m10370a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public static Bitmap m10375b(AbstractC2283e eVar, Bitmap bitmap, final int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C2567j.m10898a(z, "roundingRadius must be greater than 0.");
        return m10368a(eVar, bitmap, new AbstractC2457a() {
            /* class com.bumptech.glide.load.resource.bitmap.C2455y.C24561 */

            @Override // com.bumptech.glide.load.resource.bitmap.C2455y.AbstractC2457a
            /* renamed from: a */
            public void mo10981a(Canvas canvas, Paint paint, RectF rectF) {
                int i = i;
                canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
            }
        });
    }

    /* renamed from: a */
    public static Bitmap m10366a(AbstractC2283e eVar, Bitmap bitmap, int i) {
        if (!m10377b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m10370a(i, matrix);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = eVar.mo10690a(Math.round(rectF.width()), Math.round(rectF.height()), m10374b(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        a.setHasAlpha(bitmap.hasAlpha());
        m10372a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    private static Bitmap m10368a(AbstractC2283e eVar, Bitmap bitmap, AbstractC2457a aVar) {
        Bitmap.Config a = m10364a(bitmap);
        Bitmap a2 = m10365a(eVar, bitmap);
        Bitmap a3 = eVar.mo10690a(a2.getWidth(), a2.getHeight(), a);
        a3.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(a2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) a3.getWidth(), (float) a3.getHeight());
        Lock lock = f8038e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(a3);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            aVar.mo10981a(canvas, paint, rectF);
            m10373a(canvas);
            lock.unlock();
            if (!a2.equals(bitmap)) {
                eVar.mo10693a(a2);
            }
            return a3;
        } catch (Throwable th) {
            f8038e.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    public static Bitmap m10378c(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m10376b(eVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m10379d(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap a = m10365a(eVar, bitmap);
        Bitmap a2 = eVar.mo10690a(min, min, m10364a(bitmap));
        a2.setHasAlpha(true);
        Lock lock = f8038e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawCircle(f2, f2, f2, f8035b);
            canvas.drawBitmap(a, (Rect) null, rectF, f8036c);
            m10373a(canvas);
            lock.unlock();
            if (!a.equals(bitmap)) {
                eVar.mo10693a(a);
            }
            return a2;
        } catch (Throwable th) {
            f8038e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m10376b(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = eVar.mo10690a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m10374b(bitmap));
        m10371a(bitmap, a);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + a.getWidth() + "x" + a.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m10372a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    public static Bitmap m10367a(AbstractC2283e eVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth() * i2;
        int height = bitmap.getHeight() * i;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (width > height) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = eVar.mo10690a(i, i2, m10374b(bitmap));
        m10371a(bitmap, a);
        m10372a(bitmap, a, matrix);
        return a;
    }
}
