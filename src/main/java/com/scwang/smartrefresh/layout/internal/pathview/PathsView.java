package com.scwang.smartrefresh.layout.internal.pathview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class PathsView extends View {

    /* renamed from: a */
    protected C27166b f67567a = new C27166b();

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getTag() instanceof String) {
            mo96576a(getTag().toString());
        }
    }

    public PathsView(Context context) {
        super(context);
        m98755a(context, null, 0);
    }

    /* renamed from: a */
    public void mo96576a(String... strArr) {
        this.f67567a.mo96584a(strArr);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f67567a.draw(canvas);
    }

    public PathsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m98755a(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(this.f67567a.mo96585b() + getPaddingLeft() + getPaddingRight(), i), resolveSize(this.f67567a.mo96587c() + getPaddingTop() + getPaddingBottom(), i2));
    }

    /* renamed from: a */
    private void m98755a(Context context, AttributeSet attributeSet, int i) {
        this.f67567a = new C27166b();
    }

    public PathsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m98755a(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f67567a.setBounds(getPaddingLeft(), getPaddingTop(), Math.max((i3 - i) - getPaddingRight(), getPaddingLeft()), Math.max((i4 - i2) - getPaddingTop(), getPaddingTop()));
    }
}
