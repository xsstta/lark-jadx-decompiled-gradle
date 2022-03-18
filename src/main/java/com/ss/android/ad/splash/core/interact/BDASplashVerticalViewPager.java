package com.ss.android.ad.splash.core.interact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class BDASplashVerticalViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f68112a = true;

    /* renamed from: b */
    private GestureDetector f68113b;

    /* renamed from: a */
    private void m99403a() {
        setPageTransformer(true, new C27321a());
        setOverScrollMode(2);
    }

    public void setEnableScroll(boolean z) {
        this.f68112a = z;
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.f68113b = gestureDetector;
    }

    public BDASplashVerticalViewPager(Context context) {
        super(context);
        m99403a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private MotionEvent m99402a(MotionEvent motionEvent) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
        return motionEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f68112a) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(m99402a(motionEvent));
        m99402a(motionEvent);
        return onInterceptTouchEvent;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f68112a) {
            return false;
        }
        this.f68113b.onTouchEvent(motionEvent);
        return super.onTouchEvent(m99402a(motionEvent));
    }

    public BDASplashVerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99403a();
    }

    /* renamed from: com.ss.android.ad.splash.core.interact.BDASplashVerticalViewPager$a */
    public static class C27321a implements ViewPager.AbstractC1579d {
        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579d
        /* renamed from: a */
        public void mo8241a(View view, float f) {
            if (f < -1.0f) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else if (f <= 1.0f) {
                view.setAlpha(1.0f);
                view.setTranslationX(((float) view.getWidth()) * (-f));
                view.setTranslationY(f * ((float) view.getHeight()));
            } else {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }
}
