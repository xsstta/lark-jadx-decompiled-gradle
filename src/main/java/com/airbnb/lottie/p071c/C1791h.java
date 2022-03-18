package com.airbnb.lottie.p071c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import com.airbnb.lottie.C1783c;
import com.airbnb.lottie.p067a.p068a.C1757s;
import com.airbnb.lottie.p067a.p069b.C1766c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: com.airbnb.lottie.c.h */
public final class C1791h {

    /* renamed from: a */
    private static final PathMeasure f6126a = new PathMeasure();

    /* renamed from: b */
    private static final Path f6127b = new Path();

    /* renamed from: c */
    private static final Path f6128c = new Path();

    /* renamed from: d */
    private static final float[] f6129d = new float[4];

    /* renamed from: e */
    private static final float f6130e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f */
    private static float f6131f = -1.0f;

    /* renamed from: a */
    public static int m8014a(float f, float f2, float f3, float f4) {
        int i = f != BitmapDescriptorFactory.HUE_RED ? (int) (((float) 527) * f) : 17;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != BitmapDescriptorFactory.HUE_RED ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static boolean m8022a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: a */
    public static void m8020a(Path path, C1757s sVar) {
        if (sVar != null && !sVar.mo8949g()) {
            m8019a(path, ((C1766c) sVar.mo8946d()).mo8970i() / 100.0f, ((C1766c) sVar.mo8947e()).mo8970i() / 100.0f, ((C1766c) sVar.mo8948f()).mo8970i() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m8019a(Path path, float f, float f2, float f3) {
        C1783c.m7956a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f6126a;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == BitmapDescriptorFactory.HUE_RED) {
            C1783c.m7957b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C1783c.m7957b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C1790g.m8001a(min, length);
                max = (float) C1790g.m8001a(max, length);
            }
            if (min < BitmapDescriptorFactory.HUE_RED) {
                min = (float) C1790g.m8001a(min, length);
            }
            if (max < BitmapDescriptorFactory.HUE_RED) {
                max = (float) C1790g.m8001a(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C1783c.m7957b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            Path path2 = f6127b;
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                Path path3 = f6128c;
                path3.reset();
                pathMeasure.getSegment(BitmapDescriptorFactory.HUE_RED, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < BitmapDescriptorFactory.HUE_RED) {
                Path path4 = f6128c;
                path4.reset();
                pathMeasure.getSegment(min + length, length, path4, true);
                path2.addPath(path4);
            }
            path.set(path2);
            C1783c.m7957b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: a */
    public static boolean m8023a(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: a */
    public static float m8011a() {
        if (f6131f == -1.0f) {
            f6131f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f6131f;
    }

    /* renamed from: a */
    public static void m8021a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m8012a(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: b */
    public static boolean m8024b(Matrix matrix) {
        float[] fArr = f6129d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static float m8013a(Matrix matrix) {
        float[] fArr = f6129d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f6130e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: a */
    public static void m8017a(Canvas canvas, RectF rectF, Paint paint) {
        m8018a(canvas, rectF, paint, 31);
    }

    /* renamed from: a */
    public static Bitmap m8015a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: a */
    public static Path m8016a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == BitmapDescriptorFactory.HUE_RED && pointF4.length() == BitmapDescriptorFactory.HUE_RED)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: a */
    public static void m8018a(Canvas canvas, RectF rectF, Paint paint, int i) {
        C1783c.m7956a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C1783c.m7957b("Utils#saveLayer");
    }
}
