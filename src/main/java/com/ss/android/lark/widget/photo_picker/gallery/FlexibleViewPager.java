package com.ss.android.lark.widget.photo_picker.gallery;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.TranslateAnimation;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;

public class FlexibleViewPager extends TouchFixedViewPager {

    /* renamed from: a */
    float f144908a;

    /* renamed from: b */
    int f144909b;

    /* renamed from: c */
    private boolean f144910c = true;

    /* renamed from: d */
    private boolean f144911d;

    /* renamed from: e */
    private Rect f144912e = new Rect();

    /* renamed from: f */
    private AbstractC58664a f144913f;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.FlexibleViewPager$a */
    public interface AbstractC58664a {
        /* renamed from: a */
        void mo198936a();

        /* renamed from: b */
        void mo198937b();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void setOnRefreshListener(AbstractC58664a aVar) {
        this.f144913f = aVar;
    }

    public FlexibleViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo198933a(int i) {
        if (this.f144913f != null) {
            if (i > getWidth() / 6) {
                this.f144913f.mo198937b();
            } else if (i < (-getWidth()) / 6) {
                this.f144913f.mo198936a();
            }
        }
        this.f144908a = BitmapDescriptorFactory.HUE_RED;
        TranslateAnimation translateAnimation = new TranslateAnimation(getX(), (float) this.f144912e.left, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(200);
        startAnimation(translateAnimation);
        layout(this.f144912e.left, this.f144912e.top, this.f144912e.right, this.f144912e.bottom);
    }

    @Override // androidx.viewpager.widget.ViewPager, com.ss.android.lark.widget.photo_picker.gallery.TouchFixedViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2) {
                    if (this.f144908a == BitmapDescriptorFactory.HUE_RED) {
                        this.f144908a = motionEvent.getX();
                    }
                    int x = ((int) (this.f144908a - motionEvent.getX())) / 2;
                    this.f144909b = x;
                    if ((this.f144910c && x <= 0) || (this.f144911d && x >= 0)) {
                        layout(-x, this.f144912e.top, this.f144912e.right - this.f144909b, this.f144912e.bottom);
                        return true;
                    }
                }
            } else if (this.f144910c || this.f144911d) {
                mo198933a(this.f144909b);
            }
        } catch (IllegalArgumentException e) {
            Log.m165383e("FlexibleViewPager", e.getMessage());
        }
        return super.onTouchEvent(motionEvent);
    }

    public FlexibleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onPageScrolled(int i, float f, int i2) {
        if (f == 1.0f) {
            i++;
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (getAdapter() == null || getAdapter().getCount() == 0) {
            this.f144910c = false;
            this.f144911d = false;
        } else if (i == 0 && ((double) Math.abs(f)) <= 0.005d) {
            this.f144910c = true;
            if (i == getAdapter().getCount() - 1 && ((double) Math.abs(f)) <= 0.005d) {
                this.f144911d = true;
            }
        } else if (i != getAdapter().getCount() - 1 || ((double) Math.abs(f)) > 0.005d) {
            this.f144910c = false;
            this.f144911d = false;
        } else {
            this.f144911d = true;
        }
        if (this.f144912e.isEmpty() || this.f144912e.top - this.f144912e.bottom == 0) {
            this.f144912e.set(getLeft(), getTop(), getRight(), getBottom());
        }
        super.onPageScrolled(i, f, i2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f144912e.set(getLeft(), getTop(), getRight(), getBottom());
        if (getAdapter() == null || getAdapter().getCount() == 0) {
            Log.m165397w("FlexibleViewPager", "items empty when onSizeChanged!");
        } else if (beginFakeDrag()) {
            fakeDragBy(BitmapDescriptorFactory.HUE_RED);
            endFakeDrag();
        } else {
            Log.m165397w("FlexibleViewPager", "begin fake drag failed!");
        }
    }
}
