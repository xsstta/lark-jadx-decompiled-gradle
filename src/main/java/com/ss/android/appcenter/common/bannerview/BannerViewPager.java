package com.ss.android.appcenter.common.bannerview;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.bannerview.indicator.IndicatorView;
import com.ss.android.appcenter.common.bannerview.indicator.base.IIndicator;
import com.ss.android.appcenter.common.bannerview.indicator.option.IndicatorOptions;
import com.ss.android.appcenter.common.bannerview.p1289a.C28134b;
import com.ss.android.appcenter.common.bannerview.p1289a.C28135c;
import com.ss.android.appcenter.common.bannerview.p1291c.C28138a;
import com.ss.android.appcenter.common.bannerview.provider.C28142a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BannerViewPager<T> extends RelativeLayout implements LifecycleObserver {

    /* renamed from: a */
    private int f70442a;

    /* renamed from: b */
    private boolean f70443b;

    /* renamed from: c */
    private boolean f70444c;

    /* renamed from: d */
    private AbstractC28131a f70445d;

    /* renamed from: e */
    private IIndicator f70446e;

    /* renamed from: f */
    private RelativeLayout f70447f;

    /* renamed from: g */
    private ViewPager2 f70448g;

    /* renamed from: h */
    private C28134b f70449h;

    /* renamed from: i */
    private final Handler f70450i;

    /* renamed from: j */
    private AbstractC28132a<T> f70451j;

    /* renamed from: k */
    private ViewPager2.AbstractC1603e f70452k;

    /* renamed from: l */
    private final Runnable f70453l;

    /* renamed from: m */
    private int f70454m;

    /* renamed from: n */
    private int f70455n;

    /* renamed from: o */
    private final ViewPager2.AbstractC1603e f70456o;

    /* renamed from: com.ss.android.appcenter.common.bannerview.BannerViewPager$a */
    public interface AbstractC28131a {
    }

    public AbstractC28132a<T> getAdapter() {
        return this.f70451j;
    }

    public int getCurrentItem() {
        return this.f70442a;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        mo100124c();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        mo100124c();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        mo100120b();
    }

    /* renamed from: a */
    public void mo100117a(int i, float f, int i2) {
        int b = this.f70451j.mo100153b();
        this.f70449h.mo100156a().mo100171b();
        int a = C28138a.m102970a(i, b);
        if (b > 0) {
            ViewPager2.AbstractC1603e eVar = this.f70452k;
            if (eVar != null) {
                eVar.onPageScrolled(a, f, i2);
            }
            IIndicator aVar = this.f70446e;
            if (aVar != null) {
                aVar.onPageScrolled(a, f, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo100118a(List<T> list) {
        AbstractC28132a<T> aVar = this.f70451j;
        Objects.requireNonNull(aVar, "You must set adapter for BannerViewPager");
        aVar.mo100151a(list);
        m102880f();
    }

    public List<T> getData() {
        return this.f70451j.mo100148a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo100120b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo100124c();
        super.onDetachedFromWindow();
    }

    /* renamed from: f */
    private void m102880f() {
        List<T> a = this.f70451j.mo100148a();
        if (a != null) {
            setIndicatorValues(a);
            setupViewPager(a);
        }
    }

    private int getInterval() {
        return this.f70449h.mo100156a().mo100163a();
    }

    /* renamed from: i */
    private boolean m102883i() {
        return this.f70449h.mo100156a().mo100173c();
    }

    /* renamed from: c */
    public void mo100124c() {
        if (this.f70444c) {
            this.f70450i.removeCallbacks(this.f70453l);
            this.f70444c = false;
        }
    }

    /* renamed from: d */
    public void mo100126d() {
        mo100118a(new ArrayList());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", onSaveInstanceState);
        bundle.putInt("CURRENT_POSITION", this.f70442a);
        bundle.putBoolean("IS_CUSTOM_INDICATOR", this.f70443b);
        return bundle;
    }

    /* renamed from: e */
    private void m102879e() {
        inflate(getContext(), R.layout.workplace_bvp_layout, this);
        this.f70448g = (ViewPager2) findViewById(R.id.vp_main);
        this.f70447f = (RelativeLayout) findViewById(R.id.bvp_layout_indicator);
        this.f70448g.setPageTransformer(this.f70449h.mo100159b());
    }

    /* renamed from: g */
    private void m102881g() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f70446e).getLayoutParams();
        int d = this.f70449h.mo100156a().mo100174d();
        if (d == 0) {
            layoutParams.addRule(14);
        } else if (d == 2) {
            layoutParams.addRule(9);
        } else if (d == 4) {
            layoutParams.addRule(11);
        }
    }

    /* renamed from: h */
    private void m102882h() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.f70446e).getLayoutParams();
        C28135c.C28136a k = this.f70449h.mo100156a().mo100188k();
        if (k == null) {
            int a = C28138a.m102968a(10.0f);
            marginLayoutParams.setMargins(a, a, a, a);
            return;
        }
        marginLayoutParams.setMargins(k.mo100196a(), k.mo100198c(), k.mo100197b(), k.mo100199d());
    }

    /* renamed from: j */
    private boolean m102885j() {
        AbstractC28132a<T> aVar;
        C28134b bVar = this.f70449h;
        if (bVar == null || bVar.mo100156a() == null || !this.f70449h.mo100156a().mo100171b() || (aVar = this.f70451j) == null || aVar.mo100153b() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo100120b() {
        AbstractC28132a<T> aVar;
        if (!this.f70444c && m102883i() && (aVar = this.f70451j) != null && aVar.mo100153b() > 1) {
            this.f70450i.postDelayed(this.f70453l, (long) getInterval());
            this.f70444c = true;
        }
    }

    /* renamed from: a */
    public void mo100115a() {
        if (this.f70451j.mo100153b() > 1 && m102883i()) {
            ViewPager2 viewPager2 = this.f70448g;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            this.f70450i.postDelayed(this.f70453l, (long) getInterval());
        }
    }

    /* renamed from: a */
    public BannerViewPager<T> mo100112a(Lifecycle lifecycle) {
        lifecycle.addObserver(this);
        return this;
    }

    /* renamed from: e */
    public BannerViewPager<T> mo100128e(int i) {
        mo100119b(i, i);
        return this;
    }

    public BannerViewPager(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public BannerViewPager<T> mo100113a(AbstractC28132a<T> aVar) {
        this.f70451j = aVar;
        return this;
    }

    /* renamed from: c */
    public BannerViewPager<T> mo100123c(int i) {
        this.f70449h.mo100156a().mo100165a(i);
        return this;
    }

    /* renamed from: d */
    public BannerViewPager<T> mo100125d(int i) {
        this.f70449h.mo100156a().mo100187j(i);
        return this;
    }

    /* renamed from: g */
    public BannerViewPager<T> mo100130g(int i) {
        this.f70449h.mo100156a().mo100164a((float) i);
        return this;
    }

    /* renamed from: h */
    public BannerViewPager<T> mo100134h(int i) {
        this.f70449h.mo100156a().mo100181g(i);
        return this;
    }

    /* renamed from: j */
    private void m102884j(int i) {
        float j = this.f70449h.mo100156a().mo100186j();
        if (i == 4) {
            this.f70449h.mo100158a(true, j);
        } else if (i == 8) {
            this.f70449h.mo100158a(false, j);
        }
    }

    /* renamed from: k */
    private void m102886k(int i) {
        if (m102885j()) {
            this.f70448g.setCurrentItem(C28138a.m102969a(this.f70451j.mo100153b()) + i, false);
        } else {
            this.f70448g.setCurrentItem(i, false);
        }
    }

    /* renamed from: f */
    public BannerViewPager<T> mo100129f(int i) {
        this.f70449h.mo100156a().mo100183h(i);
        return this;
    }

    /* renamed from: i */
    public BannerViewPager<T> mo100135i(int i) {
        this.f70449h.mo100156a().mo100179f(i);
        return this;
    }

    /* renamed from: a */
    private void m102875a(C28135c cVar) {
        int g = cVar.mo100180g();
        int h = cVar.mo100182h();
        if (!(h == -1000 && g == -1000)) {
            RecyclerView recyclerView = (RecyclerView) this.f70448g.getChildAt(0);
            int n = cVar.mo100192n();
            int f = cVar.mo100178f() + g;
            int f2 = cVar.mo100178f() + h;
            if (n == 0) {
                recyclerView.setPadding(f2, 0, f, 0);
            } else if (n == 1) {
                recyclerView.setPadding(0, f2, 0, f);
            }
            recyclerView.setClipToPadding(false);
        }
        this.f70449h.mo100162e();
    }

    /* renamed from: c */
    private void m102878c(List<? extends T> list) {
        setIndicatorValues(list);
        this.f70449h.mo100156a().mo100171b();
        this.f70449h.mo100156a().mo100176e().mo100244g(C28138a.m102970a(this.f70448g.getCurrentItem(), list.size()));
        this.f70446e.mo100200a();
    }

    private void setIndicatorValues(List<? extends T> list) {
        this.f70447f.setVisibility(this.f70449h.mo100156a().mo100191m());
        C28135c a = this.f70449h.mo100156a();
        a.mo100193o();
        if (!this.f70443b || this.f70446e == null) {
            this.f70446e = new IndicatorView(getContext());
        }
        m102876a(a.mo100176e(), list);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f70444c = true;
            mo100124c();
        } else if (action == 1 || action == 3 || action == 4) {
            this.f70444c = false;
            mo100120b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER_STATE"));
        this.f70442a = bundle.getInt("CURRENT_POSITION");
        this.f70443b = bundle.getBoolean("IS_CUSTOM_INDICATOR");
        setCurrentItem(this.f70442a);
    }

    private void setupViewPager(List<T> list) {
        Objects.requireNonNull(this.f70451j, "You must set adapter for BannerViewPager");
        C28135c a = this.f70449h.mo100156a();
        if (a.mo100190l() != 0) {
            C28142a.m103051a(this.f70448g, a.mo100190l());
        }
        this.f70442a = 0;
        this.f70451j.mo100152a(a.mo100171b());
        this.f70451j.mo100150a(this.f70445d);
        this.f70448g.setAdapter(this.f70451j);
        if (m102885j()) {
            this.f70448g.setCurrentItem(C28138a.m102969a(list.size()), false);
        }
        this.f70448g.unregisterOnPageChangeCallback(this.f70456o);
        this.f70448g.registerOnPageChangeCallback(this.f70456o);
        this.f70448g.setOrientation(a.mo100192n());
        this.f70448g.setOffscreenPageLimit(a.mo100195q());
        m102875a(a);
        m102884j(a.mo100184i());
        mo100120b();
    }

    public void setCurrentItem(int i) {
        if (m102885j()) {
            int currentItem = this.f70448g.getCurrentItem();
            int b = this.f70451j.mo100153b();
            this.f70449h.mo100156a().mo100171b();
            int a = C28138a.m102970a(currentItem, this.f70451j.mo100153b());
            if (currentItem == i) {
                return;
            }
            if (i == 0 && a == b - 1) {
                this.f70448g.setCurrentItem(currentItem + 1);
            } else if (a == 0 && i == b - 1) {
                this.f70448g.setCurrentItem(currentItem - 1);
            } else {
                this.f70448g.setCurrentItem(currentItem + (i - a));
            }
        } else {
            this.f70448g.setCurrentItem(i);
        }
    }

    /* renamed from: b */
    public void mo100121b(int i) {
        boolean z;
        int b = this.f70451j.mo100153b();
        boolean b2 = this.f70449h.mo100156a().mo100171b();
        int a = C28138a.m102970a(i, b);
        this.f70442a = a;
        if (b <= 0 || !b2 || !(i == 0 || i == 999)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m102886k(a);
        }
        ViewPager2.AbstractC1603e eVar = this.f70452k;
        if (eVar != null) {
            eVar.onPageSelected(this.f70442a);
        }
        IIndicator aVar = this.f70446e;
        if (aVar != null) {
            aVar.onPageSelected(this.f70442a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r0 != 3) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.common.bannerview.BannerViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public BannerViewPager<T> mo100114a(IIndicator aVar) {
        if (aVar instanceof View) {
            this.f70443b = true;
            this.f70446e = aVar;
        }
        return this;
    }

    /* renamed from: b */
    public void mo100122b(List<? extends T> list) {
        if (list != null && this.f70451j != null) {
            mo100124c();
            this.f70451j.mo100151a(list);
            this.f70451j.notifyDataSetChanged();
            m102886k(getCurrentItem());
            m102878c(list);
            mo100120b();
        }
    }

    /* renamed from: a */
    public void mo100116a(int i) {
        IIndicator aVar = this.f70446e;
        if (aVar != null) {
            aVar.onPageScrollStateChanged(i);
        }
        ViewPager2.AbstractC1603e eVar = this.f70452k;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i);
        }
    }

    public BannerViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m102874a(Context context, AttributeSet attributeSet) {
        C28134b bVar = new C28134b();
        this.f70449h = bVar;
        bVar.mo100157a(context, attributeSet);
        m102879e();
    }

    /* renamed from: b */
    public BannerViewPager<T> mo100119b(int i, int i2) {
        this.f70449h.mo100156a().mo100169b(i, i2);
        return this;
    }

    /* renamed from: a */
    public BannerViewPager<T> mo100111a(int i, int i2) {
        this.f70449h.mo100156a().mo100166a(i, i2);
        return this;
    }

    /* renamed from: a */
    private void m102876a(IndicatorOptions bVar, List<? extends T> list) {
        if (((View) this.f70446e).getParent() == null) {
            this.f70447f.removeAllViews();
            this.f70447f.addView((View) this.f70446e);
            m102882h();
            m102881g();
        }
        this.f70446e.setIndicatorOptions(bVar);
        bVar.mo100237d(list.size());
        this.f70446e.mo100200a();
    }

    public BannerViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70450i = new Handler();
        this.f70453l = new Runnable() {
            /* class com.ss.android.appcenter.common.bannerview.BannerViewPager.RunnableC281291 */

            public void run() {
                BannerViewPager.this.mo100115a();
            }
        };
        this.f70456o = new ViewPager2.AbstractC1603e() {
            /* class com.ss.android.appcenter.common.bannerview.BannerViewPager.C281302 */

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                BannerViewPager.this.mo100116a(i);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                BannerViewPager.this.mo100121b(i);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
            public void onPageScrolled(int i, float f, int i2) {
                super.onPageScrolled(i, f, i2);
                BannerViewPager.this.mo100117a(i, f, i2);
            }
        };
        m102874a(context, attributeSet);
    }

    /* renamed from: a */
    private void m102873a(int i, int i2, int i3) {
        boolean z = false;
        if (i3 > i2) {
            if (this.f70449h.mo100156a().mo100171b()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (this.f70442a != 0 || i - this.f70455n <= 0) {
                ViewParent parent = getParent();
                if (this.f70442a != getData().size() - 1 || i - this.f70455n >= 0) {
                    z = true;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (i2 > i3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: b */
    private void m102877b(int i, int i2, int i3) {
        boolean z = false;
        if (i2 > i3) {
            if (this.f70449h.mo100156a().mo100171b()) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (this.f70442a != 0 || i - this.f70454m <= 0) {
                ViewParent parent = getParent();
                if (this.f70442a != getData().size() - 1 || i - this.f70454m >= 0) {
                    z = true;
                }
                parent.requestDisallowInterceptTouchEvent(z);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (i3 > i2) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }
}
