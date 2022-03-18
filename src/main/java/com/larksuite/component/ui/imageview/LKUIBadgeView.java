package com.larksuite.component.ui.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.component.ui.imageview.C25664b;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;

public class LKUIBadgeView extends View {

    /* renamed from: a */
    C25664b f62636a;

    /* renamed from: a */
    public void mo89320a() {
        if (this.f62636a.mo89410b()) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public LKUIBadgeView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public LKUIBadgeView mo89317a(int i) {
        this.f62636a.mo89403a(i);
        return this;
    }

    /* renamed from: b */
    public LKUIBadgeView mo89323b(Drawable drawable) {
        this.f62636a.mo89405a(drawable);
        return this;
    }

    /* renamed from: a */
    public LKUIBadgeView mo89316a(float f) {
        this.f62636a.mo89404a(getContext(), f);
        return this;
    }

    /* renamed from: b */
    public LKUIBadgeView mo89321b(float f) {
        this.f62636a.mo89408b(getContext(), f);
        return this;
    }

    /* renamed from: a */
    public LKUIBadgeView mo89318a(Drawable drawable) {
        this.f62636a.mo89409b(drawable);
        return this;
    }

    /* renamed from: b */
    public LKUIBadgeView mo89322b(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = C0215a.m655b(getContext(), i);
        }
        mo89318a(drawable);
        return this;
    }

    /* renamed from: a */
    public LKUIBadgeView mo89319a(String str) {
        this.f62636a.mo89406a(str);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate((float) ((getWidth() - this.f62636a.getIntrinsicWidth()) / 2), (float) ((getHeight() - this.f62636a.getIntrinsicHeight()) / 2));
        this.f62636a.draw(canvas);
    }

    public LKUIBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(Math.max(this.f62636a.getIntrinsicWidth(), getMinimumWidth()), Math.max(this.f62636a.getIntrinsicHeight(), getMeasuredHeight()));
    }

    public LKUIBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.badgeBackground, R.attr.badgeIcon, R.attr.badgePadding, R.attr.badgeRadius, R.attr.text, R.attr.textColor, R.attr.textSize}, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int color = obtainStyledAttributes.getColor(5, -1);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, (int) C25653b.m91892a(context, 12.0f));
        CharSequence text = obtainStyledAttributes.getText(4);
        obtainStyledAttributes.recycle();
        this.f62636a = new C25664b.C25666a().mo89420a(drawable).mo89424b(drawable2).mo89423b((float) dimensionPixelSize).mo89425c((float) dimensionPixelSize2).mo89421a(text).mo89419a(color).mo89418a((float) dimensionPixelSize3).mo89422a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C25664b bVar = this.f62636a;
        bVar.setBounds(0, 0, bVar.getIntrinsicWidth(), this.f62636a.getIntrinsicHeight());
    }
}
