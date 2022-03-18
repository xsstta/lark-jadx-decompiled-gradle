package com.ss.android.bytedcert.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import android.media.ThumbnailUtils;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.bytedcert.p1304b.C28317a;

/* renamed from: com.ss.android.bytedcert.utils.a */
public class C28431a {
    /* renamed from: a */
    public static Bitmap m104203a(Bitmap bitmap, int i) {
        return m104204a(bitmap, i, (int) (((float) bitmap.getHeight()) * ((((float) i) / 1.0f) / ((float) bitmap.getWidth()))));
    }

    /* renamed from: a */
    public static Bitmap m104201a(int i, Bitmap bitmap) {
        float f;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int max = Math.max(height, width);
        Math.min(height, width);
        if (max > i) {
            f = (float) (max / i);
        } else {
            f = 1.0f;
        }
        double d = (double) f;
        return ThumbnailUtils.extractThumbnail(bitmap, (int) ((((double) width) / 1.0d) / d), (int) ((((double) height) / 1.0d) / d));
    }

    /* renamed from: a */
    private static int m104200a(BitmapFactory.Options options, float f, float f2) {
        float min = Math.min(f, f2);
        float max = Math.max(f, f2);
        float max2 = (float) Math.max(options.outHeight, options.outWidth);
        float min2 = (float) Math.min(options.outHeight, options.outWidth);
        int i = 1;
        while (max2 > max && min2 > min) {
            max2 /= 2.0f;
            min2 /= 2.0f;
            i *= 2;
        }
        return i;
    }

    /* renamed from: a */
    public static Bitmap m104202a(Bitmap bitmap, float f, float f2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f3 = ((float) height) * f2;
        int i = (int) (((float) (height / 2)) - (f3 / 2.0f));
        int i2 = (int) f3;
        int i3 = (int) (((double) i2) * 1.577d);
        int i4 = (width / 2) - (i3 / 2);
        int i5 = 0;
        if (i <= 0) {
            i = 0;
        }
        if (i + i2 > height) {
            i = 0;
        } else {
            height = i2;
        }
        if (i4 <= 0) {
            i4 = 0;
        }
        if (i4 + i3 <= width) {
            width = i3;
            i5 = i4;
        }
        return Bitmap.createBitmap(bitmap, i5, i, width, height);
    }

    /* renamed from: a */
    public static Bitmap m104204a(Bitmap bitmap, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.setScale(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        canvas.drawBitmap(bitmap, matrix, new Paint(6));
        return createBitmap;
    }

    /* renamed from: a */
    public static Bitmap m104205a(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i <= 0 || i2 <= 0) {
            return BitmapFactory.decodeFile(str);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        if (options.outHeight == -1 || options.outWidth == -1) {
            try {
                ExifInterface exifInterface = new ExifInterface(str);
                int attributeInt = exifInterface.getAttributeInt("ImageLength", 1);
                options.outWidth = exifInterface.getAttributeInt("ImageWidth", 1);
                options.outHeight = attributeInt;
            } catch (Exception e) {
                e.printStackTrace();
                C28432b.m104210a(e, C28317a.m103908b(e));
                return null;
            }
        }
        Logger.m15167d("decodeBitmapFromFile", options.outHeight + "," + options.outWidth);
        options.inSampleSize = m104200a(options, (float) i, (float) i2);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        Logger.m15167d("decodeBitmapFromFile: ", options.inSampleSize + "");
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        if (decodeFile != null) {
            Logger.m15167d("decodeBitmapFromFile: ", decodeFile.getHeight() + "," + decodeFile.getWidth());
        }
        return decodeFile;
    }
}
