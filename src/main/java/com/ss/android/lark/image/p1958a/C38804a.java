package com.ss.android.lark.image.p1958a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.p1960c.C38821a;

/* renamed from: com.ss.android.lark.image.a.a */
public class C38804a extends BitmapDrawable {

    /* renamed from: a */
    private Resources f99755a;

    /* renamed from: a */
    private boolean m153146a(Bitmap bitmap) {
        Object a = C38821a.m153223a(this, "mBitmapState");
        if (a == null) {
            return false;
        }
        return C38821a.m153224a(a, "mBitmap", bitmap);
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2 = getBitmap();
        if (bitmap2 == null || bitmap2.isRecycled()) {
            ImageLoader.getDependency().mo142149a("CustomBitmapDrawable", "Draw after bitmap recycled");
        } else if (bitmap2.getByteCount() <= 104857600) {
            super.draw(canvas);
        } else {
            ImageLoader.AbstractC38791a dependency = ImageLoader.getDependency();
            dependency.mo142149a("CustomBitmapDrawable", "Try too draw too large bitmap(" + bitmap2.getByteCount() + "), avoid crash");
            int i = this.f99755a.getDisplayMetrics().widthPixels;
            int i2 = this.f99755a.getDisplayMetrics().heightPixels;
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            float f = (((float) width) * 1.0f) / ((float) i);
            float f2 = (((float) height) * 1.0f) / ((float) i2);
            if (f > f2) {
                bitmap = m153145a(bitmap2, 1.0f / f);
            } else {
                bitmap = m153145a(bitmap2, 1.0f / f2);
            }
            if (bitmap == null) {
                ImageLoader.getDependency().mo142149a("CustomBitmapDrawable", "Failed to scale bitmap");
                return;
            }
            Log.i("CustomBitmapDrawable", String.format("originWidth is %s, originHeight is %s, newWidth is %s, newHeight is %s", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())));
            if (m153146a(bitmap)) {
                if (!bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                super.draw(canvas);
                return;
            }
            ImageLoader.getDependency().mo142149a("CustomBitmapDrawable", "Failed to replace bitmap");
        }
    }

    public C38804a(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.f99755a = resources;
    }

    /* renamed from: a */
    private Bitmap m153145a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }
}
