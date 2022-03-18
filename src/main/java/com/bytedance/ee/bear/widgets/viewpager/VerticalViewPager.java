package com.bytedance.ee.bear.widgets.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2;
import com.bytedance.ee.log.C13479a;

public class VerticalViewPager extends ViewPager2 {

    /* renamed from: a */
    public int f32114a;

    /* renamed from: b */
    public int f32115b;

    /* renamed from: c */
    private boolean f32116c;

    /* renamed from: d */
    private boolean f32117d = true;

    public int getBaseScrollX() {
        return this.f32114a;
    }

    /* renamed from: a */
    private void m49291a() {
        registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            /* class com.bytedance.ee.bear.widgets.viewpager.VerticalViewPager.C118631 */

            @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    VerticalViewPager verticalViewPager = VerticalViewPager.this;
                    verticalViewPager.f32114a = verticalViewPager.getScrollX();
                }
                VerticalViewPager.this.f32115b = i;
            }
        });
        setOverScrollMode(0);
    }

    public void setBaseScrollX(int i) {
        this.f32114a = i;
    }

    public VerticalViewPager(Context context) {
        super(context);
        m49291a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f32116c) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49291a();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C13479a.m54772d("VerticalViewPager", "onScrollChanged " + i + "," + i2 + "," + i3 + "," + i4);
        if (this.f32115b == 0) {
            this.f32114a = getScrollX();
        }
    }
}
