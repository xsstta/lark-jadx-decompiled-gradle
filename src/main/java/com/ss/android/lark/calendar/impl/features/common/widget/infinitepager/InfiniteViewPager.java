package com.ss.android.lark.calendar.impl.features.common.widget.infinitepager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.calendar.impl.features.calendarview.C30804f;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31109e;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.AbstractC31110f;
import java.util.ArrayList;
import java.util.List;

public class InfiniteViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f78938a;

    /* renamed from: c */
    public int f78939c;

    /* renamed from: d */
    public boolean f78940d = true;

    /* renamed from: e */
    public List<AbstractC31110f> f78941e;

    /* renamed from: f */
    public boolean f78942f;

    /* renamed from: g */
    public AbstractC31109e f78943g;

    /* renamed from: h */
    public C30804f f78944h;

    /* renamed from: i */
    public int f78945i;

    /* renamed from: j */
    public boolean f78946j;

    public int getScrollState() {
        return this.f78945i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.infinitepager.InfiniteViewPager$a */
    public class C31216a implements ViewPager.OnPageChangeListener {
        /* renamed from: c */
        private boolean m116651c() {
            if (InfiniteViewPager.this.f78941e == null || !InfiniteViewPager.this.f78940d) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m116647a() {
            if (InfiniteViewPager.this.f78942f && InfiniteViewPager.this.f78943g != null) {
                InfiniteViewPager.this.f78943g.mo111736a();
                InfiniteViewPager.this.f78942f = false;
            }
        }

        /* renamed from: b */
        private void m116649b() {
            if (m116651c()) {
                for (AbstractC31110f fVar : InfiniteViewPager.this.f78941e) {
                    fVar.mo108576a();
                }
            }
        }

        C31216a() {
        }

        /* renamed from: a */
        private void m116648a(AbstractC31218b bVar) {
            if (m116651c()) {
                for (AbstractC31110f fVar : InfiniteViewPager.this.f78941e) {
                    fVar.mo108578a(bVar.mo113215d(1), bVar.mo113215d(2));
                }
            }
        }

        /* renamed from: b */
        private void m116650b(AbstractC31218b bVar) {
            if (m116651c()) {
                for (AbstractC31110f fVar : InfiniteViewPager.this.f78941e) {
                    fVar.mo108581b(bVar.mo113215d(1), bVar.mo113215d(0));
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            InfiniteViewPager.this.f78939c = i;
            AbstractC31218b bVar = (AbstractC31218b) InfiniteViewPager.this.getAdapter();
            if (InfiniteViewPager.this.f78939c == 0) {
                m116650b(bVar);
            } else if (InfiniteViewPager.this.f78939c == 2) {
                m116648a(bVar);
            } else {
                m116649b();
                m116647a();
                InfiniteViewPager.this.f78940d = true;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            int i2;
            InfiniteViewPager.this.f78945i = i;
            if (i == 0) {
                int i3 = InfiniteViewPager.this.f78939c;
                if (i3 == 0) {
                    i2 = 1;
                } else if (i3 != 2) {
                    i2 = -999;
                } else {
                    i2 = 0;
                }
                if (m116651c()) {
                    for (AbstractC31110f fVar : InfiniteViewPager.this.f78941e) {
                        fVar.mo112084b(i2);
                    }
                }
                AbstractC31218b bVar = (AbstractC31218b) InfiniteViewPager.this.getAdapter();
                if (i2 == 0) {
                    bVar.mo113218j();
                } else if (i2 == 1) {
                    bVar.mo113219k();
                }
                if (m116651c()) {
                    for (AbstractC31110f fVar2 : InfiniteViewPager.this.f78941e) {
                        fVar2.mo108577a(i2);
                    }
                }
                InfiniteViewPager.this.setCurrentItem(1, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            if (!InfiniteViewPager.this.f78946j) {
                InfiniteViewPager.this.f78944h.mo111606a(i, f);
            }
        }
    }

    public void setOnSmoothScrollFinishListener(AbstractC31109e eVar) {
        this.f78943g = eVar;
    }

    public void setPageEnabled(boolean z) {
        this.f78938a = z;
    }

    public void setTabMoveDistance(int i) {
        this.f78944h.mo111605a(i);
    }

    public void setUpDownArrow(boolean z) {
        this.f78944h.mo111607a(z);
    }

    public InfiniteViewPager(Context context) {
        super(context);
        m116644a(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScrollHorizontally(int i) {
        if (!this.f78938a || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public boolean canScrollVertically(int i) {
        if (!this.f78938a || !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f78938a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f78938a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        setCurrentItem(1, false);
    }

    /* renamed from: a */
    private void m116644a(Context context) {
        addOnPageChangeListener(new C31216a());
        this.f78938a = true;
        setOverScrollMode(2);
        this.f78944h = new C30804f();
    }

    /* renamed from: a */
    public void mo113204a(AbstractC31110f fVar) {
        if (this.f78941e == null) {
            this.f78941e = new ArrayList();
        }
        this.f78941e.add(fVar);
    }

    /* renamed from: a */
    public void mo113203a(int i, boolean z) {
        this.f78942f = true;
        this.f78940d = z;
        setCurrentItem(i, true);
    }

    public InfiniteViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m116644a(context);
    }
}
