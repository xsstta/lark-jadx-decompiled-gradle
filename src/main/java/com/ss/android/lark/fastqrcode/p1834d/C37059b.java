package com.ss.android.lark.fastqrcode.p1834d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.C23211b;
import com.google.zxing.qrcode.C23223b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.fastqrcode.C37051b;
import com.ss.android.lark.fastqrcode.EnigmaQRCode;
import com.ss.android.lark.fastqrcode.p1832b.C37054a;
import com.ss.android.lark.fastqrcode.p1833c.C37056a;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.lark.fastqrcode.d.b */
public class C37059b {
    /* renamed from: a */
    public static C37054a m146190a(Bitmap bitmap) {
        long j;
        Throwable th;
        Exception e;
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        if (copy == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(copy.getByteCount());
        copy.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        byte[] bArr = new byte[4096];
        int[] iArr = new int[1];
        int width = copy.getWidth() * 4;
        long _createHandler = EnigmaQRCode._createHandler();
        EnigmaQRCode._setDecodeHint(_createHandler, 8, 1);
        try {
            long currentTimeMillis2 = System.currentTimeMillis();
            j = _createHandler;
            try {
                int _decode = EnigmaQRCode._decode(_createHandler, array, EnigmaQRCode.f95160b, copy.getWidth(), copy.getHeight(), 0, 0, copy.getWidth(), copy.getHeight(), width, 0, bArr, iArr, null);
                long currentTimeMillis3 = System.currentTimeMillis();
                if (_decode == 0) {
                    C37056a.m146166d(currentTimeMillis3 - currentTimeMillis2);
                    C37056a.m146165c(currentTimeMillis3 - currentTimeMillis);
                    C37054a aVar = new C37054a(new String(bArr).trim(), m146188a(iArr[0]));
                    EnigmaQRCode._releaseHandle(j);
                    return aVar;
                }
                C37051b.m146150a("QRCodeUtil", "decodeUseEnigma failed ret = " + _decode);
                EnigmaQRCode._releaseHandle(j);
                return null;
            } catch (Exception e2) {
                e = e2;
                try {
                    C37051b.m146152c("QRCodeUtil", "decodeUseEnigma failed : " + e.getMessage());
                    EnigmaQRCode._releaseHandle(j);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    EnigmaQRCode._releaseHandle(j);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            j = _createHandler;
            C37051b.m146152c("QRCodeUtil", "decodeUseEnigma failed : " + e.getMessage());
            EnigmaQRCode._releaseHandle(j);
            return null;
        } catch (Throwable th3) {
            th = th3;
            j = _createHandler;
            EnigmaQRCode._releaseHandle(j);
            throw th;
        }
    }

    /* renamed from: a */
    private static BarcodeFormat m146188a(int i) {
        if (i == 1) {
            return BarcodeFormat.QR_CODE;
        }
        if (i == 16) {
            return BarcodeFormat.EAN_8;
        }
        if (i == 32) {
            return BarcodeFormat.EAN_13;
        }
        if (i == 64) {
            return BarcodeFormat.CODE_39;
        }
        if (i != 128) {
            return null;
        }
        return BarcodeFormat.CODE_128;
    }

    /* renamed from: a */
    public static C37054a m146191a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Bitmap b = m146195b(str, i, i2);
            if (b != null) {
                return m146190a(b);
            }
            C37051b.m146152c("QRCodeUtil", "bitmap null");
            return null;
        } catch (Throwable th) {
            C37051b.m146152c("QRCodeUtil", th.getMessage());
        }
    }

    /* renamed from: a */
    private static C23211b m146189a(C23211b bVar, int i) {
        int i2 = i * 2;
        int[] b = bVar.mo80498b();
        int i3 = b[2] + i2;
        int i4 = b[3] + i2;
        C23211b bVar2 = new C23211b(i3, i4);
        bVar2.mo80494a();
        for (int i5 = i; i5 < i3 - i; i5++) {
            for (int i6 = i; i6 < i4 - i; i6++) {
                if (bVar.mo80496a((i5 - i) + b[0], (i6 - i) + b[1])) {
                    bVar2.mo80497b(i5, i6);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: b */
    public static int m146192b(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: c */
    public static int m146196c(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: a */
    public static Point m146187a(Context context) {
        if (context == null) {
            return null;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        } else {
            point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        return point;
    }

    /* renamed from: a */
    public static int m146181a(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static int m146193b(Context context, float f) {
        if (context == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public static Bitmap m146194b(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m146184a(Bitmap bitmap, int i) {
        float f;
        float f2;
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        if (i == 90) {
            f = (float) bitmap.getHeight();
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = (float) bitmap.getHeight();
            f2 = (float) bitmap.getWidth();
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        matrix.postTranslate(f - fArr[2], f2 - fArr[5]);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint());
        return createBitmap;
    }

    /* renamed from: a */
    public static int m146182a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        while ((options.outWidth * options.outHeight) / (i3 * i3) > i * i2) {
            i3++;
        }
        return i3;
    }

    /* renamed from: a */
    private static Bitmap m146183a(int i, int i2, int[] iArr) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    /* renamed from: b */
    private static Bitmap m146195b(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        BitmapFactory.decodeFile(str, options);
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        int i3 = max * max2 * 4;
        if (i3 > 16000000 || i3 <= 0) {
            max = 2000;
            max2 = 2000;
            i3 = 16000000;
        }
        if (options.outWidth * options.outHeight * 4 <= i3) {
            C37051b.m146150a("Enigma", "no scale, go parse ： " + options.outWidth + " x " + options.outHeight);
            return BitmapFactory.decodeFile(str);
        }
        options.inSampleSize = m146182a(options, max, max2);
        options.inJustDecodeBounds = false;
        C37051b.m146150a("Enigma", "first scale，second parse ： " + options.outWidth + " x " + options.outHeight + " ，inSampleSize=" + options.inSampleSize);
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    private static Bitmap m146185a(C23211b bVar, int i, int i2) {
        int i3;
        int c = bVar.mo80499c();
        int d = bVar.mo80501d();
        int[] iArr = new int[(c * d)];
        for (int i4 = 0; i4 < d; i4++) {
            int i5 = i4 * c;
            for (int i6 = 0; i6 < c; i6++) {
                int i7 = i5 + i6;
                if (bVar.mo80496a(i6, i4)) {
                    i3 = i;
                } else {
                    i3 = i2;
                }
                iArr[i7] = i3;
            }
        }
        return m146183a(c, d, iArr);
    }

    /* renamed from: a */
    public static Bitmap m146186a(String str, int i, int i2, int i3) {
        try {
            return m146185a(m146189a(new C23223b().mo80542a(str, BarcodeFormat.QR_CODE, i, i2), i3), -16777216, -1);
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }
}
