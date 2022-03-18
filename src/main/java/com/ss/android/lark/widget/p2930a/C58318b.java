package com.ss.android.lark.widget.p2930a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.widget.a.b */
public class C58318b extends Drawable {

    /* renamed from: a */
    private final int f143472a;

    /* renamed from: b */
    private final Paint f143473b;

    /* renamed from: c */
    private final String f143474c;

    /* renamed from: d */
    private final float f143475d;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.f143473b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f143473b.setColorFilter(colorFilter);
    }

    public void draw(Canvas canvas) {
        canvas.drawColor(this.f143472a);
        Drawable drawable = UIHelper.getDrawable(R.drawable.bg_dotted_border);
        drawable.setBounds(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        drawable.draw(canvas);
        canvas.drawText(this.f143474c, getBounds().exactCenterX() - (this.f143475d / 2.0f), ((float) getBounds().top) + (((float) getBounds().height()) * 0.4f), this.f143473b);
    }

    public C58318b(int i, String str, int i2, int i3) {
        this.f143472a = i;
        this.f143474c = str;
        Paint paint = new Paint(1);
        this.f143473b = paint;
        paint.setColor(i2);
        paint.setTextSize((float) i3);
        this.f143475d = paint.measureText(str);
    }
}
