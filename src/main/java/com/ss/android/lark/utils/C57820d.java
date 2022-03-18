package com.ss.android.lark.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.media.ExifInterface;
import android.os.Build;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;

/* renamed from: com.ss.android.lark.utils.d */
public class C57820d {
    /* renamed from: a */
    public static C57821a m224434a(String str) {
        int c = m224437c(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr = {options.outWidth, options.outHeight};
        if (Math.abs(c) == 90 || Math.abs(c) == 270) {
            int i = iArr[0];
            iArr[0] = iArr[1];
            iArr[1] = i;
        }
        return new C57821a(iArr[0], iArr[1], options.outMimeType);
    }

    /* renamed from: a */
    public static Bitmap m224433a(String str, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m224427a(options, -1, i);
        options.inJustDecodeBounds = false;
        try {
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            Log.m165383e("BitmapUtils", "Error: OOM file path " + str);
            return null;
        }
    }

    /* renamed from: com.ss.android.lark.utils.d$a */
    public static class C57821a {

        /* renamed from: a */
        public final int f142420a;

        /* renamed from: b */
        public final int f142421b;

        /* renamed from: c */
        public final String f142422c;

        /* renamed from: a */
        public boolean mo196168a() {
            return "image/gif".equals(this.f142422c);
        }

        public C57821a(int i, int i2, String str) {
            this.f142420a = i;
            this.f142421b = i2;
            this.f142422c = str;
        }
    }

    /* renamed from: b */
    public static int[] m224436b(String str) {
        C57821a a = m224434a(str);
        return new int[]{a.f142420a, a.f142421b};
    }

    /* renamed from: a */
    public static int m224426a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: c */
    public static int m224437c(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static Bitmap m224430a(Drawable drawable) {
        Bitmap.Config config;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (drawable.getOpacity() != -1) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    private static Bitmap m224431a(VectorDrawable vectorDrawable) {
        Bitmap createBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        vectorDrawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m224432a(View view) {
        Bitmap bitmap;
        if (view == null) {
            return null;
        }
        view.setDrawingCacheEnabled(true);
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            bitmap = Bitmap.createBitmap(view.getDrawingCache());
        } else {
            bitmap = Bitmap.createBitmap(drawingCache);
        }
        view.setDrawingCacheEnabled(false);
        return bitmap;
    }

    /* renamed from: a */
    public static Bitmap m224428a(Context context, int i) {
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable instanceof VectorDrawable) {
            return m224431a((VectorDrawable) drawable);
        }
        return BitmapFactory.decodeResource(context.getResources(), i);
    }

    /* renamed from: a */
    public static Bitmap m224429a(Bitmap bitmap, int i) {
        float a = (((float) i) * 1024.0f) / ((float) m224426a(bitmap));
        Matrix matrix = new Matrix();
        matrix.setScale(a, a);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public static int m224427a(BitmapFactory.Options options, int i, int i2) {
        int b = m224435b(options, i, i2);
        if (b > 8) {
            return ((b + 7) / 8) * 8;
        }
        int i3 = 1;
        while (i3 < b) {
            i3 <<= 1;
        }
        return i3;
    }

    /* renamed from: b */
    private static int m224435b(BitmapFactory.Options options, int i, int i2) {
        int i3;
        int i4;
        double d = (double) options.outWidth;
        double d2 = (double) options.outHeight;
        if (i2 == -1) {
            i3 = 1;
        } else {
            i3 = (int) Math.ceil(Math.sqrt((d * d2) / ((double) i2)));
        }
        if (i == -1) {
            i4 = SmActions.ACTION_ONTHECALL_EXIT;
        } else {
            double d3 = (double) i;
            i4 = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (i4 < i3) {
            return i3;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        if (i == -1) {
            return i3;
        }
        return i4;
    }
}
