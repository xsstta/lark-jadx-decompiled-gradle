package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: a */
    protected boolean f54639a;

    /* renamed from: b */
    boolean f54640b;

    /* renamed from: c */
    private Drawable f54641c;

    /* renamed from: d */
    private final Rect f54642d;

    /* renamed from: e */
    private final Rect f54643e;

    /* renamed from: f */
    private int f54644f;

    public Drawable getForeground() {
        return this.f54641c;
    }

    public int getForegroundGravity() {
        return this.f54644f;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f54641c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f54641c;
        if (drawable != null && drawable.isStateful()) {
            this.f54641c.setState(getDrawableState());
        }
    }

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f54641c) {
            return true;
        }
        return false;
    }

    public void setForegroundGravity(int i) {
        if (this.f54644f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & SmEvents.EVENT_NE_RR) == 0) {
                i |= 48;
            }
            this.f54644f = i;
            if (i == 119 && this.f54641c != null) {
                this.f54641c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f54641c;
        if (drawable != null) {
            if (this.f54640b) {
                this.f54640b = false;
                Rect rect = this.f54642d;
                Rect rect2 = this.f54643e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f54639a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f54644f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f54641c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f54641c);
            }
            this.f54641c = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f54644f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f54641c;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54642d = new Rect();
        this.f54643e = new Rect();
        this.f54644f = 119;
        this.f54639a = true;
        this.f54640b = false;
        TypedArray a = C22358l.m80999a(context, attributeSet, new int[]{16843017, 16843264, R.attr.foregroundInsidePadding}, i, 0, new int[0]);
        this.f54644f = a.getInt(1, this.f54644f);
        Drawable drawable = a.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f54639a = a.getBoolean(2, true);
        a.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f54640b = true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f54640b = z | this.f54640b;
    }
}
