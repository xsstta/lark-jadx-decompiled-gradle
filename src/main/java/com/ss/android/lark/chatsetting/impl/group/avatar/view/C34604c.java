package com.ss.android.lark.chatsetting.impl.group.avatar.view;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.avatar.view.c */
public class C34604c extends Drawable {

    /* renamed from: a */
    private int f89354a;

    /* renamed from: b */
    private Paint f89355b;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void draw(Canvas canvas) {
        float dp2px = ((float) UIHelper.dp2px(28.0f)) / 2.0f;
        canvas.drawCircle(dp2px, dp2px, dp2px, this.f89355b);
    }

    public C34604c(int i) {
        Paint paint = new Paint();
        this.f89355b = paint;
        this.f89354a = i;
        paint.setDither(true);
        this.f89355b.setAntiAlias(true);
        this.f89355b.setColor(UIHelper.getResources().getColor(this.f89354a));
        this.f89355b.setStyle(Paint.Style.FILL);
    }
}
