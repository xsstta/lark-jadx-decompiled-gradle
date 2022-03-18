package com.ss.android.lark.widget.timepicker.monthview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.widget.timepicker.monthview.p2980a.AbstractC59233d;
import com.ss.android.lark.widget.timepicker.monthview.p2981b.C59236b;
import java.util.ArrayList;
import java.util.List;

public class InfiniteViewPager extends ViewPager {

    /* renamed from: a */
    public int f147058a;

    /* renamed from: b */
    public boolean f147059b = true;

    /* renamed from: c */
    public List<AbstractC59250j> f147060c;

    /* renamed from: d */
    public boolean f147061d;

    /* renamed from: e */
    public AbstractC59233d f147062e;

    /* renamed from: f */
    public int f147063f;

    /* renamed from: g */
    private boolean f147064g;

    public int getScrollState() {
        return this.f147063f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.timepicker.monthview.InfiniteViewPager$a */
    public class C59219a implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* renamed from: c */
        private boolean m230016c() {
            if (InfiniteViewPager.this.f147060c == null || !InfiniteViewPager.this.f147059b) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private void m230012a() {
            if (InfiniteViewPager.this.f147061d && InfiniteViewPager.this.f147062e != null) {
                InfiniteViewPager.this.f147062e.mo201360a();
                InfiniteViewPager.this.f147061d = false;
            }
        }

        /* renamed from: b */
        private void m230014b() {
            if (m230016c()) {
                for (AbstractC59250j jVar : InfiniteViewPager.this.f147060c) {
                    jVar.mo201355a();
                }
            }
        }

        C59219a() {
        }

        /* renamed from: a */
        private void m230013a(AbstractC59242d dVar) {
            if (m230016c()) {
                for (AbstractC59250j jVar : InfiniteViewPager.this.f147060c) {
                    jVar.mo201357a(dVar.mo201392a(1), dVar.mo201392a(2));
                }
            }
        }

        /* renamed from: b */
        private void m230015b(AbstractC59242d dVar) {
            if (m230016c()) {
                for (AbstractC59250j jVar : InfiniteViewPager.this.f147060c) {
                    jVar.mo201359b(dVar.mo201392a(1), dVar.mo201392a(0));
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            InfiniteViewPager.this.f147058a = i;
            AbstractC59242d dVar = (AbstractC59242d) InfiniteViewPager.this.getAdapter();
            if (InfiniteViewPager.this.f147058a == 0) {
                m230015b(dVar);
            } else if (InfiniteViewPager.this.f147058a == 2) {
                m230013a(dVar);
            } else {
                m230014b();
                m230012a();
                InfiniteViewPager.this.f147059b = true;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            int i2;
            InfiniteViewPager.this.f147063f = i;
            if (i == 0) {
                int i3 = InfiniteViewPager.this.f147058a;
                if (i3 == 0) {
                    i2 = 1;
                } else if (i3 != 2) {
                    i2 = -999;
                } else {
                    i2 = 0;
                }
                if (m230016c()) {
                    for (AbstractC59250j jVar : InfiniteViewPager.this.f147060c) {
                        jVar.mo201358b(i2);
                    }
                }
                AbstractC59242d dVar = (AbstractC59242d) InfiniteViewPager.this.getAdapter();
                if (i2 == 0) {
                    dVar.mo201396c();
                } else if (i2 == 1) {
                    dVar.mo201398d();
                }
                if (m230016c()) {
                    for (AbstractC59250j jVar2 : InfiniteViewPager.this.f147060c) {
                        jVar2.mo201356a(i2);
                    }
                }
                InfiniteViewPager.this.setCurrentItem(1, false);
            }
        }
    }

    public void setOnSmoothScrollFinishListener(AbstractC59233d dVar) {
        this.f147062e = dVar;
    }

    public void setPageEnabled(boolean z) {
        this.f147064g = z;
    }

    public InfiniteViewPager(Context context) {
        super(context);
        m230009a(context);
    }

    /* renamed from: a */
    private void m230009a(Context context) {
        addOnPageChangeListener(new C59219a());
        this.f147064g = true;
        C59236b.m230066a(this);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScrollHorizontally(int i) {
        if (!this.f147064g || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public boolean canScrollVertically(int i) {
        if (!this.f147064g || !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f147064g || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f147064g || !super.onTouchEvent(motionEvent)) {
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
    public void mo201313a(AbstractC59250j jVar) {
        if (this.f147060c == null) {
            this.f147060c = new ArrayList();
        }
        this.f147060c.add(jVar);
    }

    public InfiniteViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m230009a(context);
    }

    /* renamed from: a */
    public void mo201312a(int i, boolean z) {
        this.f147061d = true;
        this.f147059b = z;
        setCurrentItem(i, true);
    }
}
