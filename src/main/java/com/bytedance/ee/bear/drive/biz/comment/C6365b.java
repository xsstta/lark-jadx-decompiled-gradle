package com.bytedance.ee.bear.drive.biz.comment;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.b */
public class C6365b extends View {

    /* renamed from: a */
    public static final int f17622a;

    /* renamed from: b */
    private static final int f17623b;

    /* renamed from: c */
    private int f17624c;

    /* renamed from: d */
    private int f17625d;

    /* renamed from: e */
    private int f17626e;

    /* renamed from: f */
    private int f17627f;

    /* renamed from: g */
    private Paint f17628g = new Paint();

    /* renamed from: h */
    private Paint f17629h = new Paint();

    /* renamed from: i */
    private int f17630i = f17623b;

    public int getSidePadding() {
        return this.f17630i;
    }

    public int getTouchSideSize() {
        return this.f17625d;
    }

    public int getSideOffsetValue() {
        return this.f17630i + this.f17625d;
    }

    static {
        int a = C13749l.m55738a(18);
        f17623b = a;
        f17622a = (a * 2) + C13749l.m55738a(40);
    }

    /* renamed from: a */
    private void m25590a() {
        this.f17624c = getResources().getDimensionPixelSize(R.dimen.drive_area_comment_corner_larger_side_size);
        this.f17625d = getResources().getDimensionPixelSize(R.dimen.drive_area_comment_corner_small_side_size);
        this.f17626e = getResources().getDimensionPixelOffset(R.dimen.drive_area_comment_stroke_width);
        this.f17627f = getResources().getDimensionPixelSize(R.dimen.drive_area_comment_over_corner_size) + 1;
        int color = getResources().getColor(R.color.space_kit_y500);
        this.f17628g.setColor(color);
        this.f17628g.setAntiAlias(true);
        this.f17628g.setStyle(Paint.Style.FILL);
        this.f17629h.setAntiAlias(true);
        this.f17629h.setStyle(Paint.Style.STROKE);
        this.f17629h.setStrokeWidth((float) this.f17626e);
        setRectStrokeColor(color);
    }

    public void setRectStrokeColor(int i) {
        this.f17628g.setColor(i);
        this.f17629h.setColor(i);
        invalidate();
    }

    public C6365b(Context context) {
        super(context);
        m25590a();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) this.f17630i;
        int i = this.f17625d;
        canvas.drawRect(((float) i) + f, ((float) i) + f, ((float) (getWidth() - this.f17625d)) - f, ((float) (getHeight() - this.f17625d)) - f, this.f17629h);
        canvas.drawRect(f, f, ((float) this.f17624c) + f, ((float) this.f17625d) + f, this.f17628g);
        canvas.drawRect(f, f, ((float) this.f17625d) + f, ((float) this.f17624c) + f, this.f17628g);
        canvas.drawRect(f, ((float) (getHeight() - this.f17624c)) - f, ((float) this.f17625d) + f, ((float) getHeight()) - f, this.f17628g);
        canvas.drawRect(f, ((float) (getHeight() - this.f17625d)) - f, ((float) this.f17624c) + f, ((float) getHeight()) - f, this.f17628g);
        canvas.drawRect(((float) (getWidth() - this.f17624c)) - f, f, ((float) getWidth()) - f, ((float) this.f17625d) + f, this.f17628g);
        canvas.drawRect(((float) (getWidth() - this.f17625d)) - f, f, ((float) getWidth()) - f, ((float) this.f17624c) + f, this.f17628g);
        canvas.drawRect(((float) (getWidth() - this.f17624c)) - f, ((float) (getHeight() - this.f17625d)) - f, ((float) getWidth()) - f, ((float) getHeight()) - f, this.f17628g);
        canvas.drawRect(((float) (getWidth() - this.f17625d)) - f, ((float) (getHeight() - this.f17624c)) - f, ((float) getWidth()) - f, ((float) getHeight()) - f, this.f17628g);
    }

    /* renamed from: a */
    public int mo25572a(float f, float f2) {
        int i = this.f17630i * 2;
        float f3 = (float) i;
        int i2 = (f > f3 ? 1 : (f == f3 ? 0 : -1));
        if (i2 <= 0 && f2 <= f3) {
            return 1;
        }
        if (f >= ((float) (getWidth() - i)) && f2 <= f3) {
            return 2;
        }
        if (i2 <= 0 && f2 >= ((float) (getHeight() - i))) {
            return 3;
        }
        if (f < ((float) (getWidth() - i)) || f2 < ((float) (getHeight() - i))) {
            return 0;
        }
        return 4;
    }
}
