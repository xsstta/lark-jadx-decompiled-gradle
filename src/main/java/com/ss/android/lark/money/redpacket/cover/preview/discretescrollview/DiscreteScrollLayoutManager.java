package com.ss.android.lark.money.redpacket.cover.preview.discretescrollview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DSVOrientation;
import com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.transform.AbstractC48093a;
import java.util.Locale;

public class DiscreteScrollLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: A */
    private AbstractC48093a f121014A;

    /* renamed from: B */
    private C48083d f121015B;

    /* renamed from: a */
    protected Point f121016a;

    /* renamed from: b */
    protected Point f121017b;

    /* renamed from: c */
    protected Point f121018c;

    /* renamed from: d */
    protected int f121019d;

    /* renamed from: e */
    protected int f121020e;

    /* renamed from: f */
    protected int f121021f;

    /* renamed from: g */
    protected int f121022g;

    /* renamed from: h */
    protected int f121023h;

    /* renamed from: i */
    protected int f121024i;

    /* renamed from: j */
    protected int f121025j;

    /* renamed from: k */
    protected int f121026k;

    /* renamed from: l */
    protected int f121027l;

    /* renamed from: m */
    protected SparseArray<View> f121028m;

    /* renamed from: n */
    public DSVOrientation.AbstractC48063a f121029n;

    /* renamed from: o */
    protected boolean f121030o;

    /* renamed from: p */
    public int f121031p;

    /* renamed from: q */
    private Context f121032q;

    /* renamed from: r */
    private int f121033r;

    /* renamed from: s */
    private int f121034s;

    /* renamed from: t */
    private boolean f121035t;

    /* renamed from: u */
    private int f121036u;

    /* renamed from: v */
    private boolean f121037v;

    /* renamed from: w */
    private int f121038w;

    /* renamed from: x */
    private int f121039x;

    /* renamed from: y */
    private DSVScrollConfig f121040y = DSVScrollConfig.ENABLED;

    /* renamed from: z */
    private final AbstractC48072c f121041z;

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager$b */
    public interface AbstractC48071b {
        /* renamed from: a */
        int mo168339a();
    }

    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager$c */
    public interface AbstractC48072c {
        /* renamed from: a */
        void mo168340a();

        /* renamed from: a */
        void mo168341a(float f);

        /* renamed from: a */
        void mo168342a(boolean z);

        /* renamed from: b */
        void mo168343b();

        /* renamed from: c */
        void mo168344c();

        /* renamed from: d */
        void mo168345d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* renamed from: e */
    public int mo168335e() {
        return this.f121026k;
    }

    /* renamed from: h */
    public int mo168338h() {
        return this.f121021f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo168318a(RecyclerView.Recycler recycler) {
        View a = this.f121015B.mo168375a(0, recycler);
        int d = this.f121015B.mo168390d(a);
        int e = this.f121015B.mo168391e(a);
        this.f121019d = d / 2;
        this.f121020e = e / 2;
        int b = this.f121029n.mo168310b(d, e);
        this.f121022g = b;
        this.f121021f = b * this.f121033r;
        this.f121015B.mo168378a(a, recycler);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo168320a(RecyclerView.State state) {
        if (!state.isMeasuring() && !(this.f121015B.mo168386c() == this.f121038w && this.f121015B.mo168389d() == this.f121039x)) {
            this.f121038w = this.f121015B.mo168386c();
            this.f121039x = this.f121015B.mo168389d();
            this.f121015B.mo168393f();
        }
        this.f121017b.set(this.f121015B.mo168386c() / 2, this.f121015B.mo168389d() / 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo168319a(RecyclerView.Recycler recycler, int i, Point point) {
        if (i >= 0) {
            View view = this.f121028m.get(i);
            if (view == null) {
                this.f121015B.mo168377a(this.f121015B.mo168375a(i, recycler), point.x - this.f121019d, point.y - this.f121020e, point.x + this.f121019d, point.y + this.f121020e);
                return;
            }
            this.f121015B.mo168376a(view);
            this.f121028m.remove(i);
        }
    }

    /* renamed from: a */
    public boolean mo168325a(int i, int i2) {
        return this.f121040y.isScrollBlocked(EnumC48077a.fromDelta(this.f121029n.mo168312c(i, i2)));
    }

    /* renamed from: a */
    public void mo168323a(AbstractC48093a aVar) {
        this.f121014A = aVar;
    }

    /* renamed from: a */
    public void mo168324a(boolean z) {
        this.f121037v = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f121029n.mo168311b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.f121029n.mo168306a();
    }

    /* renamed from: f */
    public View mo168336f() {
        return this.f121015B.mo168374a(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: c */
    public void mo168330c() {
        int i = -this.f121024i;
        this.f121025j = i;
        if (i != 0) {
            m189772k();
        }
    }

    /* renamed from: g */
    public View mo168337g() {
        C48083d dVar = this.f121015B;
        return dVar.mo168374a(dVar.mo168373a() - 1);
    }

    /* renamed from: k */
    private void m189772k() {
        C48070a aVar = new C48070a(this.f121032q);
        aVar.setTargetPosition(this.f121026k);
        this.f121015B.mo168380a(aVar);
    }

    /* renamed from: l */
    private boolean m189773l() {
        if (((float) Math.abs(this.f121024i)) >= ((float) this.f121022g) * 0.6f) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        int i = this.f121027l;
        if (i != -1) {
            this.f121026k = i;
        }
        bundle.putInt("extra_position", this.f121026k);
        return bundle;
    }

    /* renamed from: m */
    private void m189774m() {
        int i;
        if (this.f121027l != -1) {
            i = Math.abs(this.f121024i + this.f121025j);
        } else {
            i = this.f121022g;
        }
        float f = (float) this.f121024i;
        this.f121041z.mo168341a(-Math.min(Math.max(-1.0f, f / ((float) i)), 1.0f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo168326b() {
        if (this.f121014A != null) {
            int i = this.f121022g * this.f121034s;
            for (int i2 = 0; i2 < this.f121015B.mo168373a(); i2++) {
                View a = this.f121015B.mo168374a(i2);
                this.f121014A.mo168397a(a, m189757a(a, i));
            }
        }
    }

    /* renamed from: d */
    public int mo168333d() {
        int i = this.f121024i;
        if (i == 0) {
            return this.f121026k;
        }
        int i2 = this.f121027l;
        if (i2 != -1) {
            return i2;
        }
        return this.f121026k + EnumC48077a.fromDelta(i).applyTo(1);
    }

    /* renamed from: i */
    private boolean m189769i() {
        int i = this.f121027l;
        if (i != -1) {
            this.f121026k = i;
            this.f121027l = -1;
            this.f121024i = 0;
        }
        EnumC48077a fromDelta = EnumC48077a.fromDelta(this.f121024i);
        if (Math.abs(this.f121024i) == this.f121022g) {
            this.f121026k += fromDelta.applyTo(1);
            this.f121024i = 0;
        }
        if (m189773l()) {
            this.f121025j = m189768h(this.f121024i);
        } else {
            this.f121025j = -this.f121024i;
        }
        if (this.f121025j == 0) {
            return true;
        }
        m189772k();
        return false;
    }

    /* renamed from: j */
    private void m189771j() {
        boolean z;
        int abs = Math.abs(this.f121024i);
        int i = this.f121022g;
        if (abs > i) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = this.f121024i;
            int i3 = i2 / i;
            this.f121026k += i3;
            this.f121024i = i2 - (i3 * i);
        }
        if (m189773l()) {
            this.f121026k += EnumC48077a.fromDelta(this.f121024i).applyTo(1);
            this.f121024i = -m189768h(this.f121024i);
        }
        this.f121027l = -1;
        this.f121025j = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo168316a() {
        this.f121028m.clear();
        for (int i = 0; i < this.f121015B.mo168373a(); i++) {
            View a = this.f121015B.mo168374a(i);
            this.f121028m.put(this.f121015B.mo168387c(a), a);
        }
        for (int i2 = 0; i2 < this.f121028m.size(); i2++) {
            this.f121015B.mo168383b(this.f121028m.valueAt(i2));
        }
    }

    /* renamed from: a */
    public void mo168317a(int i) {
        this.f121031p = i;
    }

    /* renamed from: d */
    public void mo168334d(int i) {
        this.f121036u = i;
    }

    /* renamed from: a */
    public void mo168322a(DSVScrollConfig dSVScrollConfig) {
        this.f121040y = dSVScrollConfig;
    }

    /* renamed from: c */
    public void mo168331c(int i) {
        this.f121034s = i;
        mo168326b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return m189763d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return m189762c(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return m189764e(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return m189763d(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return m189762c(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return m189764e(state);
    }

    /* renamed from: b */
    private void m189761b(RecyclerView.State state) {
        int i = this.f121026k;
        if (i == -1 || i >= state.getItemCount()) {
            this.f121026k = 0;
        }
    }

    /* renamed from: e */
    private void m189765e(int i) {
        if (this.f121026k != i) {
            this.f121026k = i;
            this.f121035t = true;
        }
    }

    /* renamed from: i */
    private boolean m189770i(int i) {
        if (i < 0 || i >= this.f121015B.mo168381b()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        this.f121026k = ((Bundle) parcelable).getInt("extra_position");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        if (this.f121026k != i) {
            this.f121026k = i;
            this.f121015B.mo168392e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.discretescrollview.DiscreteScrollLayoutManager$a */
    public class C48070a extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            return new PointF((float) DiscreteScrollLayoutManager.this.f121029n.mo168301a(DiscreteScrollLayoutManager.this.f121025j), (float) DiscreteScrollLayoutManager.this.f121029n.mo168309b(DiscreteScrollLayoutManager.this.f121025j));
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            return (int) (Math.max(0.01f, ((float) Math.min(Math.abs(i), DiscreteScrollLayoutManager.this.f121022g)) / ((float) DiscreteScrollLayoutManager.this.f121022g)) * ((float) DiscreteScrollLayoutManager.this.f121031p));
        }

        public C48070a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i) {
            return DiscreteScrollLayoutManager.this.f121029n.mo168301a(-DiscreteScrollLayoutManager.this.f121025j);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i) {
            return DiscreteScrollLayoutManager.this.f121029n.mo168309b(-DiscreteScrollLayoutManager.this.f121025j);
        }
    }

    /* renamed from: c */
    private int m189762c(RecyclerView.State state) {
        int d = m189763d(state);
        return (this.f121026k * d) + ((int) ((((float) this.f121024i) / ((float) this.f121022g)) * ((float) d)));
    }

    /* renamed from: d */
    private int m189763d(RecyclerView.State state) {
        if (getItemCount() == 0) {
            return 0;
        }
        return (int) (((float) m189764e(state)) / ((float) getItemCount()));
    }

    /* renamed from: e */
    private int m189764e(RecyclerView.State state) {
        if (state.getItemCount() == 0) {
            return 0;
        }
        return this.f121022g * (state.getItemCount() - 1);
    }

    /* renamed from: g */
    private int m189767g(int i) {
        int b = this.f121015B.mo168381b();
        int i2 = this.f121026k;
        if (i2 != 0 && i < 0) {
            return 0;
        }
        int i3 = b - 1;
        if (i2 == i3 || i < b) {
            return i;
        }
        return i3;
    }

    /* renamed from: h */
    private int m189768h(int i) {
        return EnumC48077a.fromDelta(i).applyTo(this.f121022g - Math.abs(this.f121024i));
    }

    /* renamed from: a */
    public void mo168321a(DSVOrientation dSVOrientation) {
        this.f121029n = dSVOrientation.createHelper();
        this.f121015B.mo168393f();
        this.f121015B.mo168392e();
    }

    /* renamed from: b */
    public void mo168327b(int i) {
        this.f121033r = i;
        this.f121021f = this.f121022g * i;
        this.f121015B.mo168392e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f121026k = Math.min(Math.max(0, this.f121026k), this.f121015B.mo168381b() - 1);
        this.f121035t = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        if (this.f121030o) {
            this.f121041z.mo168344c();
            this.f121030o = false;
        } else if (this.f121035t) {
            this.f121041z.mo168345d();
            this.f121035t = false;
        }
    }

    /* renamed from: f */
    private void m189766f(int i) {
        int i2 = this.f121026k;
        if (i2 != i) {
            this.f121025j = -this.f121024i;
            this.f121025j += EnumC48077a.fromDelta(i - i2).applyTo(Math.abs(i - this.f121026k) * this.f121022g);
            this.f121027l = i;
            m189772k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo168332c(RecyclerView.Recycler recycler) {
        for (int i = 0; i < this.f121028m.size(); i++) {
            this.f121015B.mo168384b(this.f121028m.valueAt(i), recycler);
        }
        this.f121028m.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.f121015B.mo168373a() > 0) {
            accessibilityEvent.setFromIndex(getPosition(mo168336f()));
            accessibilityEvent.setToIndex(getPosition(mo168337g()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onScrollStateChanged(int i) {
        int i2 = this.f121023h;
        if (i2 == 0 && i2 != i) {
            this.f121041z.mo168340a();
        }
        if (i == 0) {
            if (m189769i()) {
                this.f121041z.mo168343b();
            } else {
                return;
            }
        } else if (i == 1) {
            m189771j();
        }
        this.f121023h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo168329b(RecyclerView.Recycler recycler) {
        mo168316a();
        this.f121029n.mo168304a(this.f121017b, this.f121024i, this.f121018c);
        int a = this.f121029n.mo168302a(this.f121015B.mo168386c(), this.f121015B.mo168389d());
        if (m189760a(this.f121018c, a)) {
            mo168319a(recycler, this.f121026k, this.f121018c);
        }
        m189758a(recycler, EnumC48077a.START, a);
        m189758a(recycler, EnumC48077a.END, a);
        mo168332c(recycler);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo168315a(EnumC48077a aVar) {
        boolean z;
        int i;
        int i2 = this.f121025j;
        if (i2 != 0) {
            return Math.abs(i2);
        }
        boolean z2 = true;
        if (this.f121023h == 1 && this.f121040y.isScrollBlocked(aVar)) {
            return aVar.reverse().applyTo(this.f121024i);
        }
        boolean z3 = false;
        r2 = 0;
        int abs = 0;
        z3 = false;
        if (aVar.applyTo(this.f121024i) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (aVar == EnumC48077a.START && this.f121026k == 0) {
            int i3 = this.f121024i;
            if (i3 != 0) {
                z2 = false;
            }
            if (!z2) {
                abs = Math.abs(i3);
            }
        } else if (aVar == EnumC48077a.END && this.f121026k == this.f121015B.mo168381b() - 1) {
            int i4 = this.f121024i;
            if (i4 != 0) {
                z2 = false;
            }
            if (!z2) {
                abs = Math.abs(i4);
            }
        } else {
            if (z) {
                i = this.f121022g - Math.abs(this.f121024i);
            } else {
                i = this.f121022g + Math.abs(this.f121024i);
            }
            this.f121041z.mo168342a(z3);
            return i;
        }
        i = abs;
        z3 = z2;
        this.f121041z.mo168342a(z3);
        return i;
    }

    /* renamed from: a */
    private boolean m189760a(Point point, int i) {
        return this.f121029n.mo168307a(point, this.f121019d, this.f121020e, i, this.f121021f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f121027l = -1;
        this.f121025j = 0;
        this.f121024i = 0;
        if (adapter2 instanceof AbstractC48071b) {
            this.f121026k = ((AbstractC48071b) adapter2).mo168339a();
        } else {
            this.f121026k = 0;
        }
        this.f121015B.mo168393f();
    }

    /* renamed from: a */
    private float m189757a(View view, int i) {
        return Math.min(Math.max(-1.0f, this.f121029n.mo168300a(this.f121017b, ((float) getDecoratedLeft(view)) + (((float) view.getWidth()) * 0.5f), ((float) getDecoratedTop(view)) + (((float) view.getHeight()) * 0.5f)) / ((float) i)), 1.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z = false;
        if (state.getItemCount() == 0) {
            this.f121015B.mo168385b(recycler);
            this.f121027l = -1;
            this.f121026k = -1;
            this.f121025j = 0;
            this.f121024i = 0;
            return;
        }
        m189761b(state);
        mo168320a(state);
        if (!this.f121030o) {
            if (this.f121015B.mo168373a() == 0) {
                z = true;
            }
            this.f121030o = z;
            if (z) {
                mo168318a(recycler);
            }
        }
        this.f121015B.mo168379a(recycler);
        mo168329b(recycler);
        mo168326b();
    }

    /* renamed from: b */
    public void mo168328b(int i, int i2) {
        int i3;
        boolean z;
        int c = this.f121029n.mo168312c(i, i2);
        boolean z2 = true;
        if (this.f121037v) {
            i3 = Math.abs(c / this.f121036u);
        } else {
            i3 = 1;
        }
        int g = m189767g(this.f121026k + EnumC48077a.fromDelta(c).applyTo(i3));
        if (c * this.f121024i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !m189770i(g)) {
            z2 = false;
        }
        if (z2) {
            m189766f(g);
        } else {
            mo168330c();
        }
    }

    /* renamed from: a */
    private void m189759a(RecyclerView.State state, int i) {
        if (i < 0 || i >= state.getItemCount()) {
            throw new IllegalArgumentException(String.format(Locale.US, "target position out of bounds: position=%d, itemCount=%d", Integer.valueOf(i), Integer.valueOf(state.getItemCount())));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo168314a(int i, RecyclerView.Recycler recycler) {
        EnumC48077a fromDelta;
        int a;
        if (this.f121015B.mo168373a() == 0 || (a = mo168315a((fromDelta = EnumC48077a.fromDelta(i)))) <= 0) {
            return 0;
        }
        int applyTo = fromDelta.applyTo(Math.min(a, Math.abs(i)));
        this.f121024i += applyTo;
        int i2 = this.f121025j;
        if (i2 != 0) {
            this.f121025j = i2 - applyTo;
        }
        this.f121029n.mo168303a(-applyTo, this.f121015B);
        if (this.f121029n.mo168308a(this)) {
            mo168329b(recycler);
        }
        m189774m();
        mo168326b();
        return applyTo;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return mo168314a(i, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return mo168314a(i, recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f121026k;
        if (i3 == -1) {
            i3 = 0;
        } else if (i3 >= i) {
            i3 = Math.min(i3 + i2, this.f121015B.mo168381b() - 1);
        }
        m189765e(i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (this.f121026k != i && this.f121027l == -1) {
            m189759a(state, i);
            if (this.f121026k == -1) {
                this.f121026k = i;
            } else {
                m189766f(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.f121026k;
        if (this.f121015B.mo168381b() == 0) {
            i3 = -1;
        } else {
            int i4 = this.f121026k;
            if (i4 >= i) {
                if (i4 < i + i2) {
                    this.f121026k = -1;
                }
                i3 = Math.max(0, this.f121026k - i2);
            }
        }
        m189765e(i3);
    }

    public DiscreteScrollLayoutManager(Context context, AbstractC48072c cVar, DSVOrientation dSVOrientation) {
        this.f121032q = context;
        this.f121031p = LocationRequest.PRIORITY_INDOOR;
        this.f121027l = -1;
        this.f121026k = -1;
        this.f121036u = 2100;
        this.f121017b = new Point();
        this.f121018c = new Point();
        this.f121016a = new Point();
        this.f121028m = new SparseArray<>();
        this.f121041z = cVar;
        this.f121029n = dSVOrientation.createHelper();
        this.f121015B = new C48083d(this);
        this.f121034s = 1;
    }

    /* renamed from: a */
    private void m189758a(RecyclerView.Recycler recycler, EnumC48077a aVar, int i) {
        boolean z;
        int applyTo = aVar.applyTo(1);
        int i2 = this.f121027l;
        if (i2 == -1 || !aVar.sameAs(i2 - this.f121026k)) {
            z = true;
        } else {
            z = false;
        }
        this.f121016a.set(this.f121018c.x, this.f121018c.y);
        int i3 = this.f121026k;
        while (true) {
            i3 += applyTo;
            if (m189770i(i3)) {
                if (i3 == this.f121027l) {
                    z = true;
                }
                this.f121029n.mo168305a(aVar, this.f121022g, this.f121016a);
                if (m189760a(this.f121016a, i)) {
                    mo168319a(recycler, i3, this.f121016a);
                } else if (z) {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
