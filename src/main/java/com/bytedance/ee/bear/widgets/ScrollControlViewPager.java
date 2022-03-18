package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

public class ScrollControlViewPager extends FixPageTransformerViewPager {

    /* renamed from: d */
    private boolean f31795d;

    /* renamed from: e */
    private int f31796e;

    /* renamed from: f */
    private Drawable f31797f;

    /* renamed from: g */
    private int f31798g;

    /* renamed from: h */
    private boolean f31799h;

    public void setCanScroll(boolean z) {
        this.f31799h = z;
    }

    public ScrollControlViewPager(Context context) {
        this(context, null);
        m48975a(context, (AttributeSet) null);
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager
    public void setCurrentItem(int i) {
        super.mo45497a(i, false);
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f31799h) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31799h) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f31795d) {
            this.f31797f.setBounds(0, 0, getWidth() * this.f31798g, this.f31796e);
            this.f31797f.draw(canvas);
        }
    }

    public ScrollControlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31796e = 4;
        this.f31799h = true;
        m48975a(context, attributeSet);
    }

    /* renamed from: a */
    private void m48975a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.f31795d = false;
            return;
        }
        int a = C13749l.m55738a(4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.shadow_drawable, R.attr.shadow_height, R.attr.shadow_page_size, R.attr.show_shadow});
        this.f31795d = obtainStyledAttributes.getBoolean(3, false);
        this.f31797f = obtainStyledAttributes.getDrawable(0);
        this.f31796e = obtainStyledAttributes.getDimensionPixelSize(1, a);
        this.f31798g = obtainStyledAttributes.getInteger(2, 1);
        obtainStyledAttributes.recycle();
    }
}
