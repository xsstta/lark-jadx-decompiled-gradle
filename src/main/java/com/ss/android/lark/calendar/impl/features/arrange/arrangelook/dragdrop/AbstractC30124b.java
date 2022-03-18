package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.calendar.impl.utils.ao;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.b */
public abstract class AbstractC30124b extends View {

    /* renamed from: a */
    protected int f75129a;

    /* renamed from: b */
    protected int f75130b;

    /* renamed from: c */
    protected int f75131c = 5;

    /* renamed from: d */
    protected int f75132d = 7;

    /* renamed from: e */
    private int f75133e = 2;

    /* renamed from: f */
    private int f75134f = 4;

    /* renamed from: g */
    private Drawable f75135g;

    /* renamed from: h */
    private Drawable f75136h;

    /* renamed from: i */
    private int f75137i;

    /* renamed from: j */
    private int f75138j;

    /* renamed from: k */
    private Rect f75139k = new Rect();

    /* renamed from: l */
    private boolean f75140l;

    /* renamed from: a */
    public abstract FrameLayout.LayoutParams mo108615a();

    /* access modifiers changed from: protected */
    public abstract int getCircleLeft();

    public int getDragCircleRadius() {
        return this.f75132d;
    }

    /* renamed from: b */
    public void mo108616b() {
        this.f75140l = true;
        invalidate();
    }

    /* renamed from: c */
    public void mo108617c() {
        this.f75140l = false;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public int getCircleRadius() {
        if (this.f75140l) {
            return this.f75132d;
        }
        return this.f75131c;
    }

    public void setEventColor(int i) {
        this.f75138j = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m111547a(canvas, this.f75138j);
    }

    public AbstractC30124b(Context context) {
        super(context);
        this.f75131c = UIUtils.dp2px(context, (float) this.f75131c);
        this.f75132d = UIUtils.dp2px(context, (float) this.f75132d);
        this.f75133e = UIUtils.dp2px(context, (float) this.f75133e);
        this.f75134f = UIUtils.dp2px(context, (float) this.f75134f);
    }

    /* renamed from: a */
    private void m111546a(int i, int i2) {
        this.f75129a = i;
        this.f75130b = i2;
    }

    /* renamed from: a */
    private void m111547a(Canvas canvas, int i) {
        if (this.f75140l) {
            m111550c(canvas, i);
        } else {
            m111549b(canvas, i);
        }
    }

    /* renamed from: b */
    private void m111549b(Canvas canvas, int i) {
        if (this.f75135g == null || this.f75137i != i) {
            this.f75135g = ao.m125221a(-1, this.f75133e, i);
            this.f75137i = i;
        }
        int i2 = this.f75131c * 2;
        m111548a(canvas, this.f75135g, getCircleLeft(), this.f75132d - this.f75131c, i2);
    }

    /* renamed from: c */
    private void m111550c(Canvas canvas, int i) {
        if (this.f75136h == null || i != this.f75137i) {
            this.f75136h = ao.m125221a(-1, this.f75134f, i);
            this.f75137i = i;
        }
        int circleLeft = getCircleLeft();
        m111548a(canvas, this.f75136h, circleLeft, 0, this.f75132d * 2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m111546a(i, i2);
    }

    /* renamed from: a */
    private void m111548a(Canvas canvas, Drawable drawable, int i, int i2, int i3) {
        int save = canvas.save();
        this.f75139k.set(i, i2, i + i3, i3 + i2);
        drawable.setBounds(this.f75139k);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }
}
