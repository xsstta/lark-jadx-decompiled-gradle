package com.ss.android.appcenter.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;

public class TextViewDrawable extends AppCompatTextView {

    /* renamed from: a */
    private int f70746a;

    /* renamed from: b */
    private int f70747b;

    /* renamed from: c */
    private int f70748c;

    /* renamed from: e */
    private int f70749e;

    /* renamed from: f */
    private int f70750f;

    /* renamed from: g */
    private int f70751g;

    /* renamed from: h */
    private int f70752h;

    /* renamed from: i */
    private int f70753i;

    /* renamed from: j */
    private boolean f70754j;

    /* renamed from: k */
    private int f70755k;

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public TextViewDrawable(Context context) {
        this(context, null);
    }

    public TextViewDrawable(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextViewDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70754j = true;
        m103326a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m103326a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.drawableBottomHeight, R.attr.drawableBottomWidth, R.attr.drawableLeftHeight, R.attr.drawableLeftWidth, R.attr.drawableRightHeight, R.attr.drawableRightWidth, R.attr.drawableTopHeight, R.attr.drawableTopWidth, R.attr.isAliganCenter});
        this.f70746a = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f70747b = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.f70748c = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f70749e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f70750f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f70751g = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        this.f70752h = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f70753i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f70754j = obtainStyledAttributes.getBoolean(8, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f70755k = i;
        Drawable[] compoundDrawables = getCompoundDrawables();
        Drawable drawable = compoundDrawables[0];
        Drawable drawable2 = compoundDrawables[1];
        Drawable drawable3 = compoundDrawables[2];
        Drawable drawable4 = compoundDrawables[3];
        if (drawable != null) {
            m103327a(drawable, 0, this.f70746a, this.f70750f);
        }
        if (drawable2 != null) {
            m103327a(drawable2, 1, this.f70747b, this.f70751g);
        }
        if (drawable3 != null) {
            m103327a(drawable3, 2, this.f70748c, this.f70752h);
        }
        if (drawable4 != null) {
            m103327a(drawable4, 3, this.f70749e, this.f70753i);
        }
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    private void m103327a(Drawable drawable, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i2 == 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (i3 == 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        int i7 = 0;
        if (i != 0) {
            if (i == 1) {
                if (this.f70754j) {
                    i6 = 0;
                } else {
                    i6 = ((-this.f70755k) / 2) + (i2 / 2);
                }
                i2 += i6;
                i4 = i3 + 0;
                i7 = i6;
                i5 = 0;
            } else if (i != 2) {
                i5 = 0;
                i2 = 0;
                i4 = 0;
            }
            drawable.setBounds(i7, i5, i2, i4);
        }
        if (this.f70754j) {
            i5 = 0;
        } else {
            i5 = (((-getLineCount()) * getLineHeight()) / 2) + (getLineHeight() / 2);
        }
        i4 = i3 + i5;
        drawable.setBounds(i7, i5, i2, i4);
    }
}
