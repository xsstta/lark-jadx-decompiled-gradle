package com.bytedance.ies.xelement.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class BannerViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f38157a = true;

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new Runnable() {
            /* class com.bytedance.ies.xelement.banner.BannerViewPager.RunnableC144611 */

            public void run() {
                if (BannerViewPager.this.getAdapter() != null) {
                    BannerViewPager.this.getAdapter().notifyDataSetChanged();
                }
            }
        });
    }

    public void setScrollable(boolean z) {
        this.f38157a = z;
    }

    public BannerViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f38157a) {
            return false;
        }
        if (getCurrentItem() == 0 && getChildCount() == 0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f38157a) {
            if (getCurrentItem() == 0 && getChildCount() == 0) {
                return false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(2, null);
    }
}
