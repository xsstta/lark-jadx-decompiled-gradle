package com.bytedance.p754g.p755a.p756a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.view.View;

/* renamed from: com.bytedance.g.a.a.a */
public class C14182a implements AbstractC14183b {

    /* renamed from: a */
    protected static final Bitmap.Config f37297a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    protected static Bitmap f37298b;

    /* renamed from: c */
    protected float f37299c = 0.1f;

    @Override // com.bytedance.p754g.p755a.p756a.AbstractC14183b
    /* renamed from: b */
    public void mo52030b(View view) {
    }

    @Override // com.bytedance.p754g.p755a.p756a.AbstractC14183b
    /* renamed from: a */
    public C14184c mo52028a(View view) {
        Bitmap bitmap;
        C14184c cVar = new C14184c();
        int width = (int) ((((float) view.getWidth()) * this.f37299c) + 0.5f);
        int height = (int) ((((float) view.getHeight()) * this.f37299c) + 0.5f);
        if (width <= 0 || height <= 0) {
            width = view.getWidth();
            height = view.getHeight();
        }
        Bitmap bitmap2 = null;
        Bitmap bitmap3 = f37298b;
        boolean z = true;
        if (bitmap3 == null || bitmap3.isRecycled() || f37298b.getWidth() != width || f37298b.getHeight() != height) {
            cVar.f37301b = 2;
        } else {
            Log.i("FastScreenShot", "hit cache");
            bitmap2 = f37298b;
            cVar.f37301b = 1;
            z = false;
        }
        if (bitmap2 == null) {
            bitmap2 = m57276a(view, width, height);
        }
        if (bitmap2 != null) {
            mo52029a(view, bitmap2);
            if (z && (bitmap = f37298b) != null && !bitmap.isRecycled()) {
                f37298b.recycle();
            }
            f37298b = bitmap2;
        }
        cVar.f37300a = bitmap2;
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52029a(View view, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        float f = this.f37299c;
        canvas.scale(f, f);
        view.computeScroll();
        canvas.translate((float) (-view.getScrollX()), (float) (-view.getScrollY()));
        view.draw(canvas);
    }

    /* renamed from: a */
    private Bitmap m57276a(View view, int i, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return Bitmap.createBitmap(view.getContext().getResources().getDisplayMetrics(), i, i2, f37297a);
            }
            return Bitmap.createBitmap(i, i2, f37297a);
        } catch (OutOfMemoryError e) {
            Log.e("FastScreenShot", "OOM", e);
            return null;
        }
    }
}
