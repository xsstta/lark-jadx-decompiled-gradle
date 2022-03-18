package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class mcu extends mck {

    /* renamed from: a */
    private int f58688a;

    /* renamed from: b */
    private Bitmap f58689b;

    public mcu(int i) {
        this.f58688a = i;
    }

    @Override // com.huawei.hms.maps.mck
    /* renamed from: a */
    public final Bitmap mo84271a(Context context) {
        Bitmap bitmap;
        Drawable drawable = context.getResources().getDrawable(this.f58688a);
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = mcn.f58677a.mo84272b(context);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        this.f58689b = bitmap;
        return bitmap;
    }
}
