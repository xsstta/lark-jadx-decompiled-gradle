package com.ss.android.ad.splash.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.ad.splash.core.model.C27331b;
import com.ss.android.ad.splash.core.model.C27333c;

public class BDASplashImageView extends ImageView {

    /* renamed from: a */
    private AbstractC27353n f67781a;

    /* renamed from: b */
    private C27331b f67782b;

    /* renamed from: c */
    private float f67783c;

    /* renamed from: d */
    private float f67784d;

    /* renamed from: a */
    private void m99025a() {
    }

    public boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C27287e.m99261f() != null) {
            C27287e.m99261f().mo98028a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (C27287e.m99261f() != null) {
            C27287e.m99261f().mo98029b();
        }
    }

    /* access modifiers changed from: package-private */
    public void setInteraction(AbstractC27353n nVar) {
        this.f67781a = nVar;
    }

    public BDASplashImageView(Context context) {
        super(context);
        m99025a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo97145a(C27331b bVar) {
        this.f67782b = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f67782b.mo97444J() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f67783c = motionEvent.getX();
            this.f67784d = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            this.f67781a.mo97594a(this.f67782b, new C27333c.C27334a().mo97523a(m99024a(this.f67783c, this.f67784d)).mo97524a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo97528a());
        }
        return true;
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99025a();
    }

    /* renamed from: a */
    private int m99024a(float f, float f2) {
        int i;
        int width = getWidth();
        int height = getHeight();
        float f3 = (float) width;
        if (f3 <= BitmapDescriptorFactory.HUE_RED) {
            return -1;
        }
        float f4 = (float) height;
        if (f4 <= BitmapDescriptorFactory.HUE_RED) {
            return -1;
        }
        float f5 = f / f3;
        float f6 = f2 / f4;
        int i2 = 1;
        if (f5 < 0.33f) {
            i = 0;
        } else if (0.33f > f5 || f5 > 0.67f) {
            i = 2;
        } else {
            i = 1;
        }
        if (f6 < 0.33f) {
            i2 = 0;
        } else if (0.33f > f6 || f6 > 0.67f) {
            i2 = 2;
        }
        return (i2 * 3) + i;
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99025a();
    }
}
