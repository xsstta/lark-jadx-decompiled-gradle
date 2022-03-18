package com.ss.android.lark.feed.app.filter.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPoint;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.C69615b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3484c.C69626a;
import net.lucode.hackware.magicindicator.p3481a.AbstractC69614a;

/* renamed from: com.ss.android.lark.feed.app.filter.widget.b */
public class C37565b extends FrameLayout implements AbstractC69614a, C69615b.AbstractC69616a {

    /* renamed from: a */
    public AbstractC69621a f96324a;

    /* renamed from: b */
    public C69615b f96325b;

    /* renamed from: c */
    private HorizontalScrollView f96326c;

    /* renamed from: d */
    private LinearLayout f96327d;

    /* renamed from: e */
    private LinearLayout f96328e;

    /* renamed from: f */
    private AbstractC69623c f96329f;

    /* renamed from: g */
    private boolean f96330g;

    /* renamed from: h */
    private boolean f96331h;

    /* renamed from: i */
    private float f96332i = 0.5f;

    /* renamed from: j */
    private boolean f96333j = true;

    /* renamed from: k */
    private boolean f96334k = true;

    /* renamed from: l */
    private int f96335l;

    /* renamed from: m */
    private int f96336m;

    /* renamed from: n */
    private boolean f96337n;

    /* renamed from: o */
    private boolean f96338o;

    /* renamed from: p */
    private boolean f96339p = true;

    /* renamed from: q */
    private List<C69626a> f96340q = new ArrayList();

    /* renamed from: r */
    private DataSetObserver f96341r = new DataSetObserver() {
        /* class com.ss.android.lark.feed.app.filter.widget.C37565b.C375661 */

        public void onInvalidated() {
        }

        public void onChanged() {
            C37565b.this.f96325b.mo243192c(C37565b.this.f96324a.mo16055a());
            C37565b.this.mo137872d();
        }
    };

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: b */
    public void mo67368b() {
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67365a() {
        m147739e();
    }

    public AbstractC69621a getAdapter() {
        return this.f96324a;
    }

    public int getLeftPadding() {
        return this.f96336m;
    }

    public AbstractC69623c getPagerIndicator() {
        return this.f96329f;
    }

    public int getRightPadding() {
        return this.f96335l;
    }

    public float getScrollPivotX() {
        return this.f96332i;
    }

    public LinearLayout getTitleContainer() {
        return this.f96327d;
    }

    /* renamed from: c */
    public void mo137871c() {
        AbstractC69621a aVar = this.f96324a;
        if (aVar != null) {
            aVar.mo243218b();
        }
    }

    /* renamed from: d */
    public void mo137872d() {
        this.f96327d.removeAllViews();
        this.f96328e.removeAllViews();
        m147740f();
    }

    /* renamed from: e */
    private void m147739e() {
        View view;
        removeAllViews();
        if (this.f96330g) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout_no_scroll, this);
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout, this);
        }
        this.f96326c = (HorizontalScrollView) view.findViewById(R.id.scroll_view);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f96326c.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                /* class com.ss.android.lark.feed.app.filter.widget.C37565b.View$OnScrollChangeListenerC375672 */

                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (Math.abs(i - i3) >= 50) {
                        FeedHitPoint.m148870f();
                    }
                }
            });
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.title_container);
        this.f96327d = linearLayout;
        linearLayout.setPadding(this.f96336m, 0, this.f96335l, 0);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.indicator_container);
        this.f96328e = linearLayout2;
        if (this.f96337n) {
            linearLayout2.getParent().bringChildToFront(this.f96328e);
        }
        m147740f();
    }

    /* renamed from: f */
    private void m147740f() {
        LinearLayout.LayoutParams layoutParams;
        int a = this.f96325b.mo243184a();
        for (int i = 0; i < a; i++) {
            AbstractC69624d a2 = this.f96324a.mo16057a(getContext(), i);
            if (a2 instanceof View) {
                View view = (View) a2;
                if (this.f96330g) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.f96324a.mo243217b(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                this.f96327d.addView(view, layoutParams);
            }
        }
        AbstractC69621a aVar = this.f96324a;
        if (aVar != null) {
            AbstractC69623c a3 = aVar.mo16056a(getContext());
            this.f96329f = a3;
            if (a3 instanceof View) {
                this.f96328e.addView((View) this.f96329f, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: g */
    private void m147741g() {
        this.f96340q.clear();
        int a = this.f96325b.mo243184a();
        for (int i = 0; i < a; i++) {
            C69626a aVar = new C69626a();
            View childAt = this.f96327d.getChildAt(i);
            if (childAt != null) {
                aVar.f174062a = childAt.getLeft();
                aVar.f174063b = childAt.getTop();
                aVar.f174064c = childAt.getRight();
                aVar.f174065d = childAt.getBottom();
                if (childAt instanceof AbstractC69622b) {
                    AbstractC69622b bVar = (AbstractC69622b) childAt;
                    aVar.f174066e = bVar.getContentLeft();
                    aVar.f174067f = bVar.getContentTop();
                    aVar.f174068g = bVar.getContentRight();
                    aVar.f174069h = bVar.getContentBottom();
                } else {
                    aVar.f174066e = aVar.f174062a;
                    aVar.f174067f = aVar.f174063b;
                    aVar.f174068g = aVar.f174064c;
                    aVar.f174069h = aVar.f174065d;
                }
            }
            this.f96340q.add(aVar);
        }
    }

    public void setAdjustMode(boolean z) {
        this.f96330g = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f96331h = z;
    }

    public void setFollowTouch(boolean z) {
        this.f96334k = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f96337n = z;
    }

    public void setLeftPadding(int i) {
        this.f96336m = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f96339p = z;
    }

    public void setRightPadding(int i) {
        this.f96335l = i;
    }

    public void setScrollPivotX(float f) {
        this.f96332i = f;
    }

    public void setSmoothScroll(boolean z) {
        this.f96333j = z;
    }

    public void setSkimOver(boolean z) {
        this.f96338o = z;
        this.f96325b.mo243188a(z);
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67366a(int i) {
        if (this.f96324a != null) {
            this.f96325b.mo243185a(i);
            AbstractC69623c cVar = this.f96329f;
            if (cVar != null) {
                cVar.mo45269a(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: b */
    public void mo67369b(int i) {
        if (this.f96324a != null) {
            this.f96325b.mo243190b(i);
            AbstractC69623c cVar = this.f96329f;
            if (cVar != null) {
                cVar.mo45271b(i);
            }
        }
    }

    public C37565b(Context context) {
        super(context);
        C69615b bVar = new C69615b();
        this.f96325b = bVar;
        bVar.mo243187a(this);
    }

    public void setAdapter(AbstractC69621a aVar) {
        AbstractC69621a aVar2 = this.f96324a;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo243219b(this.f96341r);
            }
            this.f96324a = aVar;
            if (aVar != null) {
                aVar.mo243216a(this.f96341r);
                this.f96325b.mo243192c(this.f96324a.mo16055a());
                if (this.f96327d != null) {
                    this.f96324a.mo243218b();
                    return;
                }
                return;
            }
            this.f96325b.mo243192c(0);
            m147739e();
        }
    }

    @Override // net.lucode.hackware.magicindicator.C69615b.AbstractC69616a
    /* renamed from: b */
    public void mo137869b(int i, int i2) {
        LinearLayout linearLayout = this.f96327d;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof AbstractC69624d) {
                ((AbstractC69624d) childAt).mo31043b(i, i2);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.C69615b.AbstractC69616a
    /* renamed from: a */
    public void mo137866a(int i, int i2) {
        LinearLayout linearLayout = this.f96327d;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof AbstractC69624d) {
                ((AbstractC69624d) childAt).mo31041a(i, i2);
            }
            if (!this.f96330g && !this.f96334k && this.f96326c != null && this.f96340q.size() > 0) {
                C69626a aVar = this.f96340q.get(Math.min(this.f96340q.size() - 1, i));
                if (this.f96331h) {
                    float b = ((float) aVar.mo243244b()) - (((float) this.f96326c.getWidth()) * this.f96332i);
                    if (this.f96333j) {
                        this.f96326c.smoothScrollTo((int) b, 0);
                    } else {
                        this.f96326c.scrollTo((int) b, 0);
                    }
                } else if (this.f96326c.getScrollX() > aVar.f174062a) {
                    if (this.f96333j) {
                        this.f96326c.smoothScrollTo(aVar.f174062a, 0);
                    } else {
                        this.f96326c.scrollTo(aVar.f174062a, 0);
                    }
                } else if (this.f96326c.getScrollX() + getWidth() >= aVar.f174064c) {
                } else {
                    if (this.f96333j) {
                        this.f96326c.smoothScrollTo(aVar.f174064c - getWidth(), 0);
                    } else {
                        this.f96326c.scrollTo(aVar.f174064c - getWidth(), 0);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo137868b(int i, float f, int i2) {
        if (this.f96324a != null) {
            this.f96325b.mo243186a(i, f, i2);
            AbstractC69623c cVar = this.f96329f;
            if (cVar != null) {
                cVar.mo31045a(i, f, i2);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67367a(int i, float f, int i2) {
        if (this.f96324a != null) {
            this.f96325b.mo243186a(i, f, i2);
            AbstractC69623c cVar = this.f96329f;
            if (cVar != null) {
                cVar.mo31045a(i, f, i2);
            }
            if (this.f96326c != null && this.f96340q.size() > 0 && i >= 0 && i < this.f96340q.size() && this.f96334k) {
                int min = Math.min(this.f96340q.size() - 1, i);
                int min2 = Math.min(this.f96340q.size() - 1, i + 1);
                float b = ((float) this.f96340q.get(min).mo243244b()) - (((float) this.f96326c.getWidth()) * this.f96332i);
                this.f96326c.scrollTo((int) (b + (((((float) this.f96340q.get(min2).mo243244b()) - (((float) this.f96326c.getWidth()) * this.f96332i)) - b) * f)), 0);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.C69615b.AbstractC69616a
    /* renamed from: a */
    public void mo137867a(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f96327d;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof AbstractC69624d) {
                ((AbstractC69624d) childAt).mo31044b(i, i2, f, z);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.C69615b.AbstractC69616a
    /* renamed from: b */
    public void mo137870b(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f96327d;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof AbstractC69624d) {
                ((AbstractC69624d) childAt).mo31042a(i, i2, f, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f96324a != null) {
            m147741g();
            AbstractC69623c cVar = this.f96329f;
            if (cVar != null) {
                cVar.mo45270a(this.f96340q);
            }
            if (this.f96339p && this.f96325b.mo243191c() == 0) {
                mo67366a(this.f96325b.mo243189b());
                mo137868b(this.f96325b.mo243189b(), BitmapDescriptorFactory.HUE_RED, 0);
            }
        }
    }
}
