package net.lucode.hackware.magicindicator.buildins.commonnavigator;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.C69615b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69622b;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3484c.C69626a;
import net.lucode.hackware.magicindicator.p3481a.AbstractC69614a;

/* renamed from: net.lucode.hackware.magicindicator.buildins.commonnavigator.a */
public class C69619a extends FrameLayout implements AbstractC69614a, C69615b.AbstractC69616a {

    /* renamed from: a */
    public AbstractC69621a f174030a;

    /* renamed from: b */
    public C69615b f174031b;

    /* renamed from: c */
    private HorizontalScrollView f174032c;

    /* renamed from: d */
    private LinearLayout f174033d;

    /* renamed from: e */
    private LinearLayout f174034e;

    /* renamed from: f */
    private AbstractC69623c f174035f;

    /* renamed from: g */
    private boolean f174036g;

    /* renamed from: h */
    private boolean f174037h;

    /* renamed from: i */
    private float f174038i = 0.5f;

    /* renamed from: j */
    private boolean f174039j = true;

    /* renamed from: k */
    private boolean f174040k = true;

    /* renamed from: l */
    private int f174041l;

    /* renamed from: m */
    private int f174042m;

    /* renamed from: n */
    private boolean f174043n;

    /* renamed from: o */
    private boolean f174044o;

    /* renamed from: p */
    private boolean f174045p = true;

    /* renamed from: q */
    private List<C69626a> f174046q = new ArrayList();

    /* renamed from: r */
    private DataSetObserver f174047r = new DataSetObserver() {
        /* class net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a.C696201 */

        public void onInvalidated() {
        }

        public void onChanged() {
            C69619a.this.f174031b.mo243192c(C69619a.this.f174030a.mo16055a());
            C69619a.this.mo243195d();
        }
    };

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: b */
    public void mo67368b() {
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67365a() {
        mo243195d();
    }

    public AbstractC69621a getAdapter() {
        return this.f174030a;
    }

    public int getLeftPadding() {
        return this.f174042m;
    }

    public AbstractC69623c getPagerIndicator() {
        return this.f174035f;
    }

    public int getRightPadding() {
        return this.f174041l;
    }

    public float getScrollPivotX() {
        return this.f174038i;
    }

    public LinearLayout getTitleContainer() {
        return this.f174033d;
    }

    /* renamed from: c */
    public void mo243194c() {
        AbstractC69621a aVar = this.f174030a;
        if (aVar != null) {
            aVar.mo243218b();
        }
    }

    /* renamed from: e */
    private void m267419e() {
        LinearLayout.LayoutParams layoutParams;
        int a = this.f174031b.mo243184a();
        for (int i = 0; i < a; i++) {
            AbstractC69624d a2 = this.f174030a.mo16057a(getContext(), i);
            if (a2 instanceof View) {
                View view = (View) a2;
                if (this.f174036g) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = this.f174030a.mo243217b(getContext(), i);
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f174033d.addView(view, layoutParams);
            }
        }
        AbstractC69621a aVar = this.f174030a;
        if (aVar != null) {
            AbstractC69623c a3 = aVar.mo16056a(getContext());
            this.f174035f = a3;
            if (a3 instanceof View) {
                this.f174034e.addView((View) this.f174035f, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    /* renamed from: f */
    private void m267420f() {
        this.f174046q.clear();
        int a = this.f174031b.mo243184a();
        for (int i = 0; i < a; i++) {
            C69626a aVar = new C69626a();
            View childAt = this.f174033d.getChildAt(i);
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
            this.f174046q.add(aVar);
        }
    }

    /* renamed from: d */
    public void mo243195d() {
        View view;
        removeAllViews();
        if (this.f174036g) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout_no_scroll, this);
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.pager_navigator_layout, this);
        }
        this.f174032c = (HorizontalScrollView) view.findViewById(R.id.scroll_view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.title_container);
        this.f174033d = linearLayout;
        linearLayout.setPadding(this.f174042m, 0, this.f174041l, 0);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.indicator_container);
        this.f174034e = linearLayout2;
        if (this.f174043n) {
            linearLayout2.getParent().bringChildToFront(this.f174034e);
        }
        m267419e();
    }

    public void setAdjustMode(boolean z) {
        this.f174036g = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f174037h = z;
    }

    public void setFollowTouch(boolean z) {
        this.f174040k = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f174043n = z;
    }

    public void setLeftPadding(int i) {
        this.f174042m = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f174045p = z;
    }

    public void setRightPadding(int i) {
        this.f174041l = i;
    }

    public void setScrollPivotX(float f) {
        this.f174038i = f;
    }

    public void setSmoothScroll(boolean z) {
        this.f174039j = z;
    }

    public void setSkimOver(boolean z) {
        this.f174044o = z;
        this.f174031b.mo243188a(z);
    }

    /* renamed from: c */
    public AbstractC69624d mo243193c(int i) {
        LinearLayout linearLayout = this.f174033d;
        if (linearLayout == null) {
            return null;
        }
        return (AbstractC69624d) linearLayout.getChildAt(i);
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67366a(int i) {
        if (this.f174030a != null) {
            this.f174031b.mo243185a(i);
            AbstractC69623c cVar = this.f174035f;
            if (cVar != null) {
                cVar.mo45269a(i);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: b */
    public void mo67369b(int i) {
        if (this.f174030a != null) {
            this.f174031b.mo243190b(i);
            AbstractC69623c cVar = this.f174035f;
            if (cVar != null) {
                cVar.mo45271b(i);
            }
        }
    }

    public C69619a(Context context) {
        super(context);
        C69615b bVar = new C69615b();
        this.f174031b = bVar;
        bVar.mo243187a(this);
    }

    public void setAdapter(AbstractC69621a aVar) {
        AbstractC69621a aVar2 = this.f174030a;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.mo243219b(this.f174047r);
            }
            this.f174030a = aVar;
            if (aVar != null) {
                aVar.mo243216a(this.f174047r);
                this.f174031b.mo243192c(this.f174030a.mo16055a());
                if (this.f174033d != null) {
                    this.f174030a.mo243218b();
                    return;
                }
                return;
            }
            this.f174031b.mo243192c(0);
            mo243195d();
        }
    }

    @Override // net.lucode.hackware.magicindicator.C69615b.AbstractC69616a
    /* renamed from: b */
    public void mo137869b(int i, int i2) {
        LinearLayout linearLayout = this.f174033d;
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
        LinearLayout linearLayout = this.f174033d;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof AbstractC69624d) {
                ((AbstractC69624d) childAt).mo31041a(i, i2);
            }
            if (!this.f174036g && !this.f174040k && this.f174032c != null && this.f174046q.size() > 0) {
                C69626a aVar = this.f174046q.get(Math.min(this.f174046q.size() - 1, i));
                if (this.f174037h) {
                    float b = ((float) aVar.mo243244b()) - (((float) this.f174032c.getWidth()) * this.f174038i);
                    if (this.f174039j) {
                        this.f174032c.smoothScrollTo((int) b, 0);
                    } else {
                        this.f174032c.scrollTo((int) b, 0);
                    }
                } else if (this.f174032c.getScrollX() > aVar.f174062a) {
                    if (this.f174039j) {
                        this.f174032c.smoothScrollTo(aVar.f174062a, 0);
                    } else {
                        this.f174032c.scrollTo(aVar.f174062a, 0);
                    }
                } else if (this.f174032c.getScrollX() + getWidth() >= aVar.f174064c) {
                } else {
                    if (this.f174039j) {
                        this.f174032c.smoothScrollTo(aVar.f174064c - getWidth(), 0);
                    } else {
                        this.f174032c.scrollTo(aVar.f174064c - getWidth(), 0);
                    }
                }
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.p3481a.AbstractC69614a
    /* renamed from: a */
    public void mo67367a(int i, float f, int i2) {
        if (this.f174030a != null) {
            this.f174031b.mo243186a(i, f, i2);
            AbstractC69623c cVar = this.f174035f;
            if (cVar != null) {
                cVar.mo31045a(i, f, i2);
            }
            if (this.f174032c != null && this.f174046q.size() > 0 && i >= 0 && i < this.f174046q.size() && this.f174040k) {
                int min = Math.min(this.f174046q.size() - 1, i);
                int min2 = Math.min(this.f174046q.size() - 1, i + 1);
                float b = ((float) this.f174046q.get(min).mo243244b()) - (((float) this.f174032c.getWidth()) * this.f174038i);
                this.f174032c.scrollTo((int) (b + (((((float) this.f174046q.get(min2).mo243244b()) - (((float) this.f174032c.getWidth()) * this.f174038i)) - b) * f)), 0);
            }
        }
    }

    @Override // net.lucode.hackware.magicindicator.C69615b.AbstractC69616a
    /* renamed from: a */
    public void mo137867a(int i, int i2, float f, boolean z) {
        LinearLayout linearLayout = this.f174033d;
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
        LinearLayout linearLayout = this.f174033d;
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
        if (this.f174030a != null) {
            m267420f();
            AbstractC69623c cVar = this.f174035f;
            if (cVar != null) {
                cVar.mo45270a(this.f174046q);
            }
            if (this.f174045p && this.f174031b.mo243191c() == 0) {
                mo67366a(this.f174031b.mo243189b());
                mo67367a(this.f174031b.mo243189b(), BitmapDescriptorFactory.HUE_RED, 0);
            }
        }
    }
}
