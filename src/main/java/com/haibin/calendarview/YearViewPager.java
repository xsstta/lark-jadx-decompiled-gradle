package com.haibin.calendarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.haibin.calendarview.YearRecyclerView;

public final class YearViewPager extends ViewPager {

    /* renamed from: e */
    static final /* synthetic */ boolean f57582e = true;

    /* renamed from: a */
    public int f57583a;

    /* renamed from: b */
    public boolean f57584b;

    /* renamed from: c */
    public C23350e f57585c;

    /* renamed from: d */
    public YearRecyclerView.AbstractC23341a f57586d;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81075a() {
        for (int i = 0; i < getChildCount(); i++) {
            ((YearRecyclerView) getChildAt(i)).getAdapter().notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo81076b() {
        for (int i = 0; i < getChildCount(); i++) {
            YearRecyclerView yearRecyclerView = (YearRecyclerView) getChildAt(i);
            yearRecyclerView.mo81060a();
            yearRecyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setOnMonthSelectedListener(YearRecyclerView.AbstractC23341a aVar) {
        this.f57586d = aVar;
    }

    public YearViewPager(Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        setCurrentItem(i, false);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f57585c.mo81128W() || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return f57582e;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f57585c.mo81128W() || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return f57582e;
    }

    /* access modifiers changed from: package-private */
    public void setup(C23350e eVar) {
        this.f57585c = eVar;
        this.f57583a = (eVar.mo81184z() - this.f57585c.mo81183y()) + 1;
        setAdapter(new PagerAdapter() {
            /* class com.haibin.calendarview.YearViewPager.C233421 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public boolean isViewFromObject(View view, Object obj) {
                if (view == obj) {
                    return YearViewPager.f57582e;
                }
                return false;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return YearViewPager.this.f57583a;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getItemPosition(Object obj) {
                if (YearViewPager.this.f57584b) {
                    return -2;
                }
                return super.getItemPosition(obj);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public Object instantiateItem(ViewGroup viewGroup, int i) {
                YearRecyclerView yearRecyclerView = new YearRecyclerView(YearViewPager.this.getContext());
                viewGroup.addView(yearRecyclerView);
                yearRecyclerView.setup(YearViewPager.this.f57585c);
                yearRecyclerView.setOnMonthSelectedListener(YearViewPager.this.f57586d);
                yearRecyclerView.mo81061a(i + YearViewPager.this.f57585c.mo81183y());
                return yearRecyclerView;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
                viewGroup.removeView((View) obj);
            }
        });
        setCurrentItem(this.f57585c.ad().getYear() - this.f57585c.mo81183y());
    }

    public YearViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.viewpager.widget.ViewPager
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(m84752a(getContext(), this), 1073741824));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        if (Math.abs(getCurrentItem() - i) > 1) {
            super.setCurrentItem(i, false);
        } else {
            super.setCurrentItem(i, z);
        }
    }

    /* renamed from: a */
    private static int m84752a(Context context, View view) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (f57582e || windowManager != null) {
            int height = windowManager.getDefaultDisplay().getHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            view.getLocationOnScreen(iArr);
            return height - iArr[1];
        }
        throw new AssertionError();
    }
}
