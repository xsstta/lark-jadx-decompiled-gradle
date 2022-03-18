package com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.p1478b;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.component.ui.p1151c.C25633a;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.ao;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.drag.dragdrop.b.a */
public abstract class AbstractC30757a extends View {

    /* renamed from: a */
    protected int f77254a;

    /* renamed from: b */
    protected int f77255b;

    /* renamed from: c */
    protected int f77256c = 5;

    /* renamed from: d */
    protected int f77257d = 7;

    /* renamed from: e */
    private int f77258e = 2;

    /* renamed from: f */
    private int f77259f = 4;

    /* renamed from: g */
    private Drawable f77260g;

    /* renamed from: h */
    private Drawable f77261h;

    /* renamed from: i */
    private int f77262i;

    /* renamed from: j */
    private int f77263j;

    /* renamed from: k */
    private Rect f77264k = new Rect();

    /* renamed from: l */
    private boolean f77265l;

    /* renamed from: m */
    private boolean f77266m;

    /* renamed from: a */
    public abstract FrameLayout.LayoutParams mo111211a();

    /* access modifiers changed from: protected */
    public abstract int getCircleLeft();

    public int getDragCircleRadius() {
        return this.f77257d;
    }

    /* renamed from: b */
    public void mo111212b() {
        this.f77265l = true;
        invalidate();
    }

    /* renamed from: c */
    public void mo111213c() {
        this.f77265l = false;
        invalidate();
    }

    /* renamed from: d */
    public void mo111214d() {
        this.f77266m = true;
        invalidate();
    }

    /* renamed from: e */
    public void mo111215e() {
        this.f77266m = false;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public int getCircleRadius() {
        if (this.f77265l) {
            return this.f77257d;
        }
        return this.f77256c;
    }

    public void setEventColor(int i) {
        this.f77263j = i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m114610a(canvas, this.f77263j);
    }

    public AbstractC30757a(Context context) {
        super(context);
        this.f77256c = UIUtils.dp2px(context, (float) this.f77256c);
        this.f77257d = UIUtils.dp2px(context, (float) this.f77257d);
        this.f77258e = UIUtils.dp2px(context, (float) this.f77258e);
        this.f77259f = UIUtils.dp2px(context, (float) this.f77259f);
    }

    /* renamed from: a */
    private void m114609a(int i, int i2) {
        this.f77254a = i;
        this.f77255b = i2;
    }

    /* renamed from: a */
    private void m114610a(Canvas canvas, int i) {
        if (this.f77265l) {
            m114613c(canvas, i);
        } else {
            m114612b(canvas, i);
        }
    }

    /* renamed from: b */
    private void m114612b(Canvas canvas, int i) {
        if (this.f77260g == null || this.f77262i != i) {
            this.f77260g = ao.m125221a(-1, this.f77258e, i);
            this.f77262i = i;
        }
        int i2 = this.f77256c * 2;
        m114611a(canvas, this.f77260g, getCircleLeft(), this.f77257d - this.f77256c, i2);
    }

    /* renamed from: c */
    private void m114613c(Canvas canvas, int i) {
        if (this.f77261h == null || i != this.f77262i) {
            this.f77261h = ao.m125221a(-1, this.f77259f, i);
            this.f77262i = i;
        }
        int circleLeft = getCircleLeft();
        m114611a(canvas, this.f77261h, circleLeft, 0, this.f77257d * 2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m114609a(i, i2);
    }

    /* renamed from: a */
    private void m114611a(Canvas canvas, Drawable drawable, int i, int i2, int i3) {
        int save = canvas.save();
        this.f77264k.set(i, i2, i + i3, i3 + i2);
        drawable.setBounds(this.f77264k);
        drawable.draw(canvas);
        if (this.f77266m) {
            GradientDrawable a = ao.m125221a(-1, this.f77258e, C25633a.m91708b(C32634ae.m125178a(R.color.lkui_N00), 0.8f));
            a.setBounds(this.f77264k);
            a.draw(canvas);
        }
        canvas.restoreToCount(save);
    }
}
