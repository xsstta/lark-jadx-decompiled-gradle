package com.tt.miniapp.view.refresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Scroller;
import androidx.core.view.C0908j;
import androidx.core.view.ViewCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.p648c.View$OnClickListenerC12976a;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.tt.miniapphost.util.C67590h;
import java.util.ArrayList;
import java.util.List;

public class SwipeToLoadLayout extends ViewGroup {

    /* renamed from: A */
    private boolean f169581A;

    /* renamed from: B */
    private boolean f169582B;

    /* renamed from: C */
    private int f169583C;

    /* renamed from: D */
    private float f169584D;

    /* renamed from: E */
    private float f169585E;

    /* renamed from: F */
    private float f169586F;

    /* renamed from: G */
    private float f169587G;

    /* renamed from: H */
    private int f169588H;

    /* renamed from: I */
    private int f169589I;

    /* renamed from: J */
    private int f169590J;

    /* renamed from: K */
    private int f169591K;

    /* renamed from: L */
    private int f169592L;

    /* renamed from: M */
    private int f169593M;

    /* renamed from: N */
    private int f169594N;

    /* renamed from: O */
    private int f169595O;

    /* renamed from: P */
    private int f169596P;

    /* renamed from: Q */
    private int f169597Q;

    /* renamed from: R */
    private boolean f169598R;

    /* renamed from: S */
    private boolean f169599S;

    /* renamed from: T */
    private boolean f169600T;

    /* renamed from: a */
    public AbstractC67213b f169601a;

    /* renamed from: b */
    public AbstractC67212a f169602b;

    /* renamed from: c */
    public View f169603c;

    /* renamed from: d */
    public View f169604d;

    /* renamed from: e */
    public int f169605e;

    /* renamed from: f */
    AbstractC67210c f169606f;

    /* renamed from: g */
    AbstractC67209b f169607g;

    /* renamed from: h */
    private RunnableC67208a f169608h;

    /* renamed from: i */
    private View f169609i;

    /* renamed from: j */
    private List<View> f169610j;

    /* renamed from: k */
    private int f169611k;

    /* renamed from: l */
    private int f169612l;

    /* renamed from: m */
    private boolean f169613m;

    /* renamed from: n */
    private boolean f169614n;

    /* renamed from: o */
    private boolean f169615o;

    /* renamed from: p */
    private float f169616p;

    /* renamed from: q */
    private boolean f169617q;

    /* renamed from: r */
    private final int f169618r;

    /* renamed from: s */
    private int f169619s;

    /* renamed from: t */
    private int f169620t;

    /* renamed from: u */
    private int f169621u;

    /* renamed from: v */
    private float f169622v;

    /* renamed from: w */
    private float f169623w;

    /* renamed from: x */
    private float f169624x;

    /* renamed from: y */
    private float f169625y;

    /* renamed from: z */
    private int f169626z;

    /* renamed from: b */
    public boolean mo233658b() {
        return this.f169582B;
    }

    public View getHeaderView() {
        return this.f169603c;
    }

    /* renamed from: a */
    public boolean mo233656a() {
        return this.f169581A;
    }

    /* renamed from: c */
    public boolean mo233659c() {
        return C67211d.m261934a(this.f169605e);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: l */
    private void m261901l() {
        this.f169608h.mo233705a((int) (this.f169584D + 0.5f), this.f169592L);
    }

    /* renamed from: m */
    private void m261902m() {
        this.f169608h.mo233705a(-((int) (this.f169585E + 0.5f)), this.f169597Q);
    }

    /* renamed from: n */
    private void m261903n() {
        this.f169608h.mo233705a(-this.f169619s, this.f169588H);
    }

    /* renamed from: o */
    private void m261904o() {
        this.f169608h.mo233705a(-this.f169621u, this.f169596P);
    }

    /* renamed from: p */
    private void m261905p() {
        this.f169608h.mo233705a(this.f169611k - this.f169619s, this.f169589I);
    }

    /* renamed from: q */
    private void m261906q() {
        this.f169608h.mo233705a((-this.f169621u) - this.f169612l, this.f169593M);
    }

    /* renamed from: f */
    public void mo233663f() {
        this.f169608h.mo233705a(-this.f169619s, this.f169591K);
    }

    /* renamed from: g */
    public void mo233664g() {
        this.f169608h.mo233705a(-this.f169621u, this.f169595O);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.refresh.SwipeToLoadLayout$a */
    public class RunnableC67208a implements Runnable {

        /* renamed from: b */
        private Scroller f169632b;

        /* renamed from: c */
        private int f169633c;

        /* renamed from: d */
        private boolean f169634d;

        /* renamed from: e */
        private boolean f169635e;

        /* renamed from: b */
        private void m261931b() {
            this.f169633c = 0;
            this.f169634d = false;
            SwipeToLoadLayout.this.removeCallbacks(this);
            if (!this.f169635e) {
                SwipeToLoadLayout.this.mo233669h();
            }
        }

        /* renamed from: a */
        public void mo233704a() {
            if (this.f169634d) {
                if (!this.f169632b.isFinished()) {
                    this.f169635e = true;
                    this.f169632b.forceFinished(true);
                }
                m261931b();
                this.f169635e = false;
            }
        }

        public void run() {
            boolean z;
            if (!this.f169632b.computeScrollOffset() || this.f169632b.isFinished()) {
                z = true;
            } else {
                z = false;
            }
            int currY = this.f169632b.getCurrY();
            int i = currY - this.f169633c;
            if (z) {
                m261931b();
                return;
            }
            this.f169633c = currY;
            SwipeToLoadLayout.this.mo233654a((float) i);
            SwipeToLoadLayout.this.post(this);
        }

        public RunnableC67208a() {
            this.f169632b = new Scroller(SwipeToLoadLayout.this.getContext());
        }

        /* renamed from: a */
        public void mo233705a(int i, int i2) {
            SwipeToLoadLayout.this.removeCallbacks(this);
            this.f169633c = 0;
            if (!this.f169632b.isFinished()) {
                this.f169632b.forceFinished(true);
            }
            this.f169632b.startScroll(0, 0, 0, i, i2);
            SwipeToLoadLayout.this.post(this);
            this.f169634d = true;
        }
    }

    /* renamed from: s */
    private boolean m261908s() {
        if (this.f169599S || !this.f169582B || mo233662e() || !this.f169614n || this.f169585E <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m261907r() {
        boolean z;
        if (this.f169599S || !this.f169581A || mo233660d() || !this.f169613m || this.f169584D <= BitmapDescriptorFactory.HUE_RED) {
            z = false;
        } else {
            z = true;
        }
        AppBrandLogger.m52830i("SwipeToLoadLayout", "onCheckCanRefresh: ", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: j */
    private void m261899j() {
        if (C67211d.m261934a(this.f169605e)) {
            int i = (int) (this.f169584D + 0.5f);
            this.f169620t = i;
            this.f169619s = i;
            this.f169621u = 0;
            m261898i();
            invalidate();
        } else if (C67211d.m261942i(this.f169605e)) {
            this.f169620t = 0;
            this.f169619s = 0;
            this.f169621u = 0;
            m261898i();
            invalidate();
        } else if (C67211d.m261935b(this.f169605e)) {
            int i2 = -((int) (this.f169585E + 0.5f));
            this.f169620t = i2;
            this.f169619s = 0;
            this.f169621u = i2;
            m261898i();
            invalidate();
        }
    }

    /* renamed from: k */
    private void m261900k() {
        if (C67211d.m261938e(this.f169605e) || C67211d.m261934a(this.f169605e)) {
            m261903n();
        } else if (C67211d.m261939f(this.f169605e)) {
            m261904o();
        } else if (C67211d.m261936c(this.f169605e)) {
            this.f169606f.mo233649e();
            m261905p();
        } else if (C67211d.m261937d(this.f169605e)) {
            this.f169607g.mo233649e();
            m261906q();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo233660d() {
        if (Build.VERSION.SDK_INT >= 14) {
            return ViewCompat.m4060b(this.f169609i, -1);
        }
        View view = this.f169609i;
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (ViewCompat.m4060b(view, -1) || this.f169609i.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo233662e() {
        if (Build.VERSION.SDK_INT >= 14) {
            return ViewCompat.m4060b(this.f169609i, 1);
        }
        View view = this.f169609i;
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (absListView.getChildCount() <= 0 || (absListView.getLastVisiblePosition() >= absListView.getChildCount() - 1 && absListView.getChildAt(absListView.getChildCount() - 1).getBottom() <= absListView.getPaddingBottom())) {
                return false;
            }
            return true;
        } else if (ViewCompat.m4060b(view, 1) || this.f169609i.getScrollY() < 0) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount != 0) {
            if (childCount <= 0 || childCount >= 11 || this.f169610j.size() >= 8) {
                throw new IllegalStateException("Children num must equal or less than 10");
            }
            this.f169603c = findViewById(R.id.microapp_m_swipe_refresh_header);
            this.f169609i = findViewById(R.id.microapp_m_swipe_target);
            this.f169604d = findViewById(R.id.microapp_m_swipe_load_more_footer);
            if (this.f169609i != null) {
                View view = this.f169603c;
                if (view != null && (view instanceof AbstractC67216e)) {
                    view.setVisibility(8);
                }
                View view2 = this.f169604d;
                if (view2 != null && (view2 instanceof AbstractC67216e)) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo233669h() {
        int i = this.f169605e;
        if (C67211d.m261936c(i)) {
            setStatus(-3);
            m261899j();
            this.f169606f.mo233647c();
        } else if (C67211d.m261934a(this.f169605e)) {
            setStatus(0);
            m261899j();
            this.f169606f.mo233651g();
        } else if (C67211d.m261938e(this.f169605e)) {
            if (this.f169617q) {
                this.f169617q = false;
                setStatus(-3);
                m261899j();
                this.f169606f.mo233647c();
            } else {
                setStatus(0);
                m261899j();
                this.f169606f.mo233651g();
            }
        } else if (!C67211d.m261942i(this.f169605e)) {
            if (C67211d.m261939f(this.f169605e)) {
                if (this.f169617q) {
                    this.f169617q = false;
                    setStatus(3);
                    m261899j();
                    this.f169607g.mo233653a();
                } else {
                    setStatus(0);
                    m261899j();
                    this.f169607g.mo233651g();
                }
            } else if (C67211d.m261935b(this.f169605e)) {
                setStatus(0);
                m261899j();
                this.f169607g.mo233651g();
            } else if (C67211d.m261937d(this.f169605e)) {
                setStatus(3);
                m261899j();
                this.f169607g.mo233653a();
            } else {
                throw new IllegalStateException("illegal state: " + C67211d.m261943j(this.f169605e));
            }
        }
        if (this.f169615o) {
            AppBrandLogger.m52830i("SwipeToLoadLayout", C67211d.m261943j(i), " -> ", C67211d.m261943j(this.f169605e));
        }
    }

    /* renamed from: i */
    private void m261898i() {
        View view;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (this.f169609i != null) {
            View view2 = this.f169603c;
            if (view2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                int i14 = marginLayoutParams.leftMargin + paddingLeft;
                int i15 = this.f169583C;
                if (i15 == 0) {
                    i13 = (marginLayoutParams.topMargin + paddingTop) - this.f169611k;
                    i12 = this.f169619s;
                } else if (i15 == 1) {
                    i13 = (marginLayoutParams.topMargin + paddingTop) - this.f169611k;
                    i12 = this.f169619s;
                } else if (i15 == 2) {
                    i11 = marginLayoutParams.topMargin + paddingTop;
                    view2.layout(i14, i11, view2.getMeasuredWidth() + i14, view2.getMeasuredHeight() + i11);
                } else if (i15 != 3) {
                    i13 = (marginLayoutParams.topMargin + paddingTop) - this.f169611k;
                    i12 = this.f169619s;
                } else {
                    i13 = (marginLayoutParams.topMargin + paddingTop) - (this.f169611k / 2);
                    i12 = this.f169619s / 2;
                }
                i11 = i13 + i12;
                view2.layout(i14, i11, view2.getMeasuredWidth() + i14, view2.getMeasuredHeight() + i11);
            }
            View view3 = this.f169609i;
            if (view3 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                int i16 = marginLayoutParams2.leftMargin + paddingLeft;
                int i17 = this.f169583C;
                if (i17 == 0) {
                    i10 = marginLayoutParams2.topMargin + paddingTop;
                    i9 = this.f169620t;
                } else if (i17 == 1) {
                    i8 = marginLayoutParams2.topMargin + paddingTop;
                    view3.layout(i16, i8, view3.getMeasuredWidth() + i16, view3.getMeasuredHeight() + i8);
                } else if (i17 == 2) {
                    i10 = marginLayoutParams2.topMargin + paddingTop;
                    i9 = this.f169620t;
                } else if (i17 != 3) {
                    i10 = marginLayoutParams2.topMargin + paddingTop;
                    i9 = this.f169620t;
                } else {
                    i10 = marginLayoutParams2.topMargin + paddingTop;
                    i9 = this.f169620t;
                }
                i8 = i10 + i9;
                view3.layout(i16, i8, view3.getMeasuredWidth() + i16, view3.getMeasuredHeight() + i8);
            }
            View view4 = this.f169604d;
            if (view4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                int i18 = marginLayoutParams3.leftMargin + paddingLeft;
                int i19 = this.f169583C;
                if (i19 == 0) {
                    i7 = ((measuredHeight - paddingBottom) - marginLayoutParams3.bottomMargin) + this.f169612l;
                    i6 = this.f169621u;
                } else if (i19 == 1) {
                    i7 = ((measuredHeight - paddingBottom) - marginLayoutParams3.bottomMargin) + this.f169612l;
                    i6 = this.f169621u;
                } else if (i19 == 2) {
                    i5 = (measuredHeight - paddingBottom) - marginLayoutParams3.bottomMargin;
                    view4.layout(i18, i5 - view4.getMeasuredHeight(), view4.getMeasuredWidth() + i18, i5);
                } else if (i19 != 3) {
                    i7 = ((measuredHeight - paddingBottom) - marginLayoutParams3.bottomMargin) + this.f169612l;
                    i6 = this.f169621u;
                } else {
                    i7 = ((measuredHeight - paddingBottom) - marginLayoutParams3.bottomMargin) + (this.f169612l / 2);
                    i6 = this.f169621u / 2;
                }
                i5 = i7 + i6;
                view4.layout(i18, i5 - view4.getMeasuredHeight(), view4.getMeasuredWidth() + i18, i5);
            }
            if (CollectionUtils.isNotEmpty(this.f169610j)) {
                for (View view5 : this.f169610j) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) view5.getLayoutParams();
                    if (marginLayoutParams4.rightMargin > 0) {
                        i2 = (C67590h.m263090d(getContext()) - paddingRight) - marginLayoutParams4.rightMargin;
                        i = i2 - view5.getMeasuredWidth();
                    } else {
                        i = paddingLeft + marginLayoutParams4.leftMargin;
                        i2 = view5.getMeasuredWidth() + i;
                    }
                    if (marginLayoutParams4.bottomMargin > 0) {
                        i3 = (C67590h.m263091e(getContext()) - paddingBottom) - marginLayoutParams4.bottomMargin;
                        i4 = i3 - view5.getMeasuredHeight();
                    } else {
                        i4 = marginLayoutParams4.topMargin + paddingTop;
                        i3 = view5.getMeasuredHeight() + i4;
                    }
                    view5.layout(i, i4, i2, i3);
                }
            }
            int i20 = this.f169583C;
            if (i20 == 0 || i20 == 1) {
                View view6 = this.f169603c;
                if (view6 != null) {
                    view6.bringToFront();
                }
                View view7 = this.f169604d;
                if (view7 != null) {
                    view7.bringToFront();
                }
                if (CollectionUtils.isNotEmpty(this.f169610j)) {
                    for (View view8 : this.f169610j) {
                        view8.bringToFront();
                    }
                }
            } else if ((i20 == 2 || i20 == 3) && (view = this.f169609i) != null) {
                view.bringToFront();
            }
        }
    }

    /* renamed from: a */
    public void mo233655a(int i) {
        this.f169620t = i;
    }

    public void setDebug(boolean z) {
        this.f169615o = z;
    }

    public void setDefaultToLoadingMoreScrollingDuration(int i) {
        this.f169597Q = i;
    }

    public void setDefaultToRefreshingScrollingDuration(int i) {
        this.f169592L = i;
    }

    public void setDisableRefresh(boolean z) {
        this.f169599S = z;
    }

    public void setDisableScroll(boolean z) {
        this.f169600T = z;
    }

    public void setDragRatio(float f) {
        this.f169616p = f;
    }

    public void setLoadMoreCompleteDelayDuration(int i) {
        this.f169594N = i;
    }

    public void setLoadMoreCompleteToDefaultScrollingDuration(int i) {
        this.f169595O = i;
    }

    public void setLoadMoreEnabled(boolean z) {
        this.f169582B = z;
    }

    public void setLoadMoreFinalDragOffset(int i) {
        this.f169587G = (float) i;
    }

    public void setLoadMoreTriggerOffset(int i) {
        this.f169585E = (float) i;
    }

    public void setOnLoadMoreListener(AbstractC67212a aVar) {
        this.f169602b = aVar;
    }

    public void setOnRefreshListener(AbstractC67213b bVar) {
        this.f169601a = bVar;
    }

    public void setRefreshCompleteDelayDuration(int i) {
        this.f169590J = i;
    }

    public void setRefreshCompleteToDefaultScrollingDuration(int i) {
        this.f169591K = i;
    }

    public void setRefreshEnabled(boolean z) {
        this.f169581A = z;
    }

    public void setRefreshFinalDragOffset(int i) {
        this.f169586F = (float) i;
    }

    public void setRefreshTriggerOffset(int i) {
        this.f169584D = (float) i;
    }

    public void setReleaseToLoadingMoreScrollingDuration(int i) {
        this.f169593M = i;
    }

    public void setReleaseToRefreshingScrollingDuration(int i) {
        this.f169589I = i;
    }

    public void setSwipingToLoadMoreToDefaultScrollingDuration(int i) {
        this.f169596P = i;
    }

    public void setSwipingToRefreshToDefaultScrollingDuration(int i) {
        this.f169588H = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.view.refresh.SwipeToLoadLayout$b */
    public abstract class AbstractC67209b implements AbstractC67214c, AbstractC67216e {
        AbstractC67209b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.view.refresh.SwipeToLoadLayout$c */
    public abstract class AbstractC67210c implements AbstractC67215d, AbstractC67216e {
        AbstractC67210c() {
        }
    }

    public SwipeToLoadLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSwipeStyle(int i) {
        this.f169583C = i;
        requestLayout();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private void setStatus(int i) {
        this.f169605e = i;
        if (this.f169615o) {
            C67211d.m261944k(i);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.miniapp.view.refresh.SwipeToLoadLayout$d */
    public static final class C67211d {
        /* renamed from: a */
        public static boolean m261934a(int i) {
            return i == -3;
        }

        /* renamed from: b */
        public static boolean m261935b(int i) {
            return i == 3;
        }

        /* renamed from: c */
        public static boolean m261936c(int i) {
            return i == -2;
        }

        /* renamed from: d */
        public static boolean m261937d(int i) {
            return i == 2;
        }

        /* renamed from: e */
        public static boolean m261938e(int i) {
            return i == -1;
        }

        /* renamed from: f */
        public static boolean m261939f(int i) {
            return i == 1;
        }

        /* renamed from: g */
        public static boolean m261940g(int i) {
            return i < 0;
        }

        /* renamed from: h */
        public static boolean m261941h(int i) {
            return i > 0;
        }

        /* renamed from: i */
        public static boolean m261942i(int i) {
            return i == 0;
        }

        /* renamed from: j */
        public static String m261943j(int i) {
            switch (i) {
                case -4:
                    return "status_refresh_returning";
                case -3:
                    return "status_refreshing";
                case -2:
                    return "status_release_to_refresh";
                case -1:
                    return "status_swiping_to_refresh";
                case 0:
                    return "status_default";
                case 1:
                    return "status_swiping_to_load_more";
                case 2:
                    return "status_release_to_load_more";
                case 3:
                    return "status_loading_more";
                case 4:
                    return "status_load_more_returning";
                default:
                    return "status_illegal!";
            }
        }

        /* renamed from: k */
        public static void m261944k(int i) {
            AppBrandLogger.m52830i("SwipeToLoadLayout", "printStatus:", m261943j(i));
        }
    }

    /* renamed from: a */
    private void m261894a(MotionEvent motionEvent) {
        int i;
        int b = C0908j.m4368b(motionEvent);
        if (C0908j.m4369b(motionEvent, b) == this.f169626z) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f169626z = C0908j.m4369b(motionEvent, i);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int a = C0908j.m4366a(motionEvent);
        if (a == 1 || a == 3) {
            m261900k();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setLoadMoreFooterView(View view) {
        if (view instanceof AbstractC67214c) {
            View view2 = this.f169604d;
            if (!(view2 == null || view2 == view)) {
                removeView(view2);
            }
            if (this.f169604d != view) {
                this.f169604d = view;
                addView(view);
                return;
            }
            return;
        }
        AppBrandLogger.m52829e("SwipeToLoadLayout", "Load more footer view must be an implement of SwipeLoadTrigger");
    }

    public void setLoadingMore(boolean z) {
        if (mo233658b() && this.f169604d != null) {
            this.f169617q = z;
            if (z) {
                if (C67211d.m261942i(this.f169605e)) {
                    setStatus(1);
                    m261902m();
                }
            } else if (C67211d.m261935b(this.f169605e)) {
                this.f169607g.mo233650f();
                postDelayed(new Runnable() {
                    /* class com.tt.miniapp.view.refresh.SwipeToLoadLayout.RunnableC672052 */

                    public void run() {
                        SwipeToLoadLayout.this.mo233664g();
                    }
                }, (long) this.f169594N);
            }
        }
    }

    public void setRefreshHeaderView(View view) {
        if (view instanceof AbstractC67215d) {
            View view2 = this.f169603c;
            if (!(view2 == null || view2 == view)) {
                removeView(view2);
            }
            if (this.f169603c != view) {
                this.f169603c = view;
                addView(view);
                return;
            }
            return;
        }
        AppBrandLogger.m52829e("SwipeToLoadLayout", "Refresh header view must be an implement of SwipeRefreshTrigger");
    }

    public void setRefreshing(boolean z) {
        if (mo233656a() && this.f169603c != null) {
            this.f169617q = z;
            if (z) {
                if (C67211d.m261942i(this.f169605e)) {
                    setStatus(-1);
                    m261901l();
                }
            } else if (C67211d.m261934a(this.f169605e)) {
                this.f169606f.mo233650f();
                postDelayed(new Runnable() {
                    /* class com.tt.miniapp.view.refresh.SwipeToLoadLayout.RunnableC672041 */

                    public void run() {
                        SwipeToLoadLayout.this.mo233663f();
                    }
                }, (long) this.f169590J);
            }
        }
    }

    /* renamed from: b */
    private void m261896b(float f) {
        float f2 = f * this.f169616p;
        int i = this.f169620t;
        float f3 = ((float) i) + f2;
        if ((f3 > BitmapDescriptorFactory.HUE_RED && i < 0) || (f3 < BitmapDescriptorFactory.HUE_RED && i > 0)) {
            f2 = (float) (-i);
        }
        float f4 = this.f169586F;
        if (f4 < this.f169584D || f3 <= f4) {
            float f5 = this.f169587G;
            if (f5 >= this.f169585E && (-f3) > f5) {
                f2 = (-f5) - ((float) i);
            }
        } else {
            f2 = f4 - ((float) i);
        }
        if (C67211d.m261940g(this.f169605e)) {
            this.f169606f.mo233646a(this.f169620t, false, false);
        } else if (C67211d.m261941h(this.f169605e)) {
            this.f169607g.mo233646a(this.f169620t, false, false);
        }
        m261897c(f2);
    }

    /* renamed from: c */
    private void m261897c(float f) {
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.f169620t = (int) (((float) this.f169620t) + f);
            if (C67211d.m261940g(this.f169605e)) {
                this.f169619s = this.f169620t;
                this.f169621u = 0;
            } else if (C67211d.m261941h(this.f169605e)) {
                this.f169621u = this.f169620t;
                this.f169619s = 0;
            }
            if (this.f169615o) {
                AppBrandLogger.m52830i("SwipeToLoadLayout", "mTargetOffset = ", Integer.valueOf(this.f169620t));
            }
            m261898i();
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo233654a(float f) {
        if (C67211d.m261938e(this.f169605e)) {
            this.f169606f.mo233646a(this.f169620t, false, true);
        } else if (C67211d.m261936c(this.f169605e)) {
            this.f169606f.mo233646a(this.f169620t, false, true);
        } else if (C67211d.m261934a(this.f169605e)) {
            this.f169606f.mo233646a(this.f169620t, true, true);
        } else if (C67211d.m261939f(this.f169605e)) {
            this.f169607g.mo233646a(this.f169620t, false, true);
        } else if (C67211d.m261937d(this.f169605e)) {
            this.f169607g.mo233646a(this.f169620t, false, true);
        } else if (C67211d.m261935b(this.f169605e)) {
            this.f169607g.mo233646a(this.f169620t, true, true);
        }
        m261897c(f);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int a = C0908j.m4366a(motionEvent);
        boolean z3 = false;
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    int i = this.f169626z;
                    if (i == -1) {
                        return false;
                    }
                    float a2 = m261893a(motionEvent, i);
                    float b = m261895b(motionEvent, this.f169626z);
                    float f = a2 - this.f169622v;
                    this.f169624x = a2;
                    this.f169625y = b;
                    if (Math.abs(f) <= Math.abs(b - this.f169623w) || Math.abs(f) <= ((float) this.f169618r)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if ((f <= BitmapDescriptorFactory.HUE_RED || !z || !m261907r()) && (f >= BitmapDescriptorFactory.HUE_RED || !z || !m261908s())) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        return true;
                    }
                    if (z && mo233659c()) {
                        z3 = true;
                    }
                    if (z3) {
                        this.f169598R = true;
                        return true;
                    }
                } else if (a != 3) {
                    if (a == 6) {
                        m261894a(motionEvent);
                        float a3 = m261893a(motionEvent, this.f169626z);
                        this.f169624x = a3;
                        this.f169622v = a3;
                        float b2 = m261895b(motionEvent, this.f169626z);
                        this.f169625y = b2;
                        this.f169623w = b2;
                    }
                }
            }
            this.f169626z = -1;
        } else {
            this.f169598R = false;
            int b3 = C0908j.m4369b(motionEvent, 0);
            this.f169626z = b3;
            float a4 = m261893a(motionEvent, b3);
            this.f169624x = a4;
            this.f169622v = a4;
            float b4 = m261895b(motionEvent, this.f169626z);
            this.f169625y = b4;
            this.f169623w = b4;
            if (C67211d.m261938e(this.f169605e) || C67211d.m261939f(this.f169605e) || C67211d.m261936c(this.f169605e) || C67211d.m261937d(this.f169605e)) {
                this.f169608h.mo233704a();
                if (this.f169615o) {
                    AppBrandLogger.m52830i("SwipeToLoadLayout", "Another finger down, abort auto scrolling, let the new finger handle");
                }
            }
            if (C67211d.m261938e(this.f169605e) || C67211d.m261936c(this.f169605e) || C67211d.m261939f(this.f169605e) || C67211d.m261937d(this.f169605e)) {
                AppBrandLogger.m52830i("SwipeToLoadLayout", "intercept1");
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C0908j.m4366a(motionEvent);
        if (a != 0) {
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a == 5) {
                            int b = C0908j.m4369b(motionEvent, C0908j.m4368b(motionEvent));
                            if (b != -1) {
                                this.f169626z = b;
                            }
                            float a2 = m261893a(motionEvent, this.f169626z);
                            this.f169624x = a2;
                            this.f169622v = a2;
                            float b2 = m261895b(motionEvent, this.f169626z);
                            this.f169625y = b2;
                            this.f169623w = b2;
                        } else if (a == 6) {
                            m261894a(motionEvent);
                            float a3 = m261893a(motionEvent, this.f169626z);
                            this.f169624x = a3;
                            this.f169622v = a3;
                            float b3 = m261895b(motionEvent, this.f169626z);
                            this.f169625y = b3;
                            this.f169623w = b3;
                        }
                        return super.onTouchEvent(motionEvent);
                    }
                } else if (this.f169600T && motionEvent.getAction() == 2) {
                    return true;
                } else {
                    float a4 = m261893a(motionEvent, this.f169626z);
                    float b4 = m261895b(motionEvent, this.f169626z);
                    float f = a4 - this.f169624x;
                    float f2 = b4 - this.f169625y;
                    this.f169624x = a4;
                    this.f169625y = b4;
                    if (Math.abs(f2) > Math.abs(f) && Math.abs(f2) > ((float) this.f169618r)) {
                        return false;
                    }
                    if (C67211d.m261942i(this.f169605e)) {
                        if (f > BitmapDescriptorFactory.HUE_RED && m261907r()) {
                            this.f169606f.mo233648d();
                            setStatus(-1);
                        } else if (f < BitmapDescriptorFactory.HUE_RED && m261908s()) {
                            this.f169607g.mo233648d();
                            setStatus(1);
                        }
                    } else if (C67211d.m261940g(this.f169605e)) {
                        if (this.f169620t <= 0) {
                            setStatus(0);
                            m261899j();
                            return false;
                        }
                    } else if (C67211d.m261941h(this.f169605e) && this.f169620t >= 0) {
                        setStatus(0);
                        m261899j();
                        return false;
                    }
                    if (C67211d.m261940g(this.f169605e)) {
                        if (C67211d.m261938e(this.f169605e) || C67211d.m261936c(this.f169605e)) {
                            if (((float) this.f169620t) >= this.f169584D) {
                                setStatus(-2);
                            } else {
                                setStatus(-1);
                            }
                            m261896b(f);
                        } else if (C67211d.m261934a(this.f169605e)) {
                            m261896b(f);
                        }
                    } else if (C67211d.m261941h(this.f169605e) && (C67211d.m261939f(this.f169605e) || C67211d.m261937d(this.f169605e))) {
                        if (((float) (-this.f169620t)) >= this.f169585E) {
                            setStatus(2);
                        } else {
                            setStatus(1);
                        }
                        m261896b(f);
                    }
                    return true;
                }
            } else if (this.f169598R) {
                this.f169609i.onTouchEvent(motionEvent);
                this.f169598R = false;
            }
            this.f169599S = false;
            if (this.f169626z == -1) {
                return false;
            }
            this.f169626z = -1;
            return super.onTouchEvent(motionEvent);
        }
        this.f169626z = C0908j.m4369b(motionEvent, 0);
        return true;
    }

    public SwipeToLoadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private float m261893a(MotionEvent motionEvent, int i) {
        int a = C0908j.m4367a(motionEvent, i);
        if (a < 0) {
            return -1.0f;
        }
        return C0908j.m4372d(motionEvent, a);
    }

    /* renamed from: b */
    private float m261895b(MotionEvent motionEvent, int i) {
        int a = C0908j.m4367a(motionEvent, i);
        if (a < 0) {
            return -1.0f;
        }
        return C0908j.m4370c(motionEvent, a);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        if (view instanceof View$OnClickListenerC12976a) {
            this.f169610j.add(view);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f169603c;
        if (view != null) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            this.f169611k = measuredHeight;
            if (this.f169584D < ((float) measuredHeight)) {
                this.f169584D = (float) measuredHeight;
            }
        }
        View view2 = this.f169609i;
        if (view2 != null) {
            measureChildWithMargins(view2, i, 0, i2, 0);
        }
        View view3 = this.f169604d;
        if (view3 != null) {
            measureChildWithMargins(view3, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            int measuredHeight2 = view3.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            this.f169612l = measuredHeight2;
            if (this.f169585E < ((float) measuredHeight2)) {
                this.f169585E = (float) measuredHeight2;
            }
        }
        if (CollectionUtils.isNotEmpty(this.f169610j)) {
            for (View view4 : this.f169610j) {
                measureChildWithMargins(view4, i, 0, i2, 0);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public SwipeToLoadLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f169610j = new ArrayList();
        this.f169616p = 0.5f;
        this.f169605e = 0;
        this.f169581A = true;
        this.f169582B = true;
        this.f169583C = 0;
        this.f169588H = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f169589I = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f169590J = LocationRequest.PRIORITY_INDOOR;
        this.f169591K = ParticipantRepo.f117150c;
        this.f169592L = ParticipantRepo.f117150c;
        this.f169593M = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f169594N = LocationRequest.PRIORITY_INDOOR;
        this.f169595O = LocationRequest.PRIORITY_INDOOR;
        this.f169596P = LocationRequest.PRIORITY_HD_ACCURACY;
        this.f169597Q = LocationRequest.PRIORITY_INDOOR;
        this.f169600T = false;
        this.f169606f = new AbstractC67210c() {
            /* class com.tt.miniapp.view.refresh.SwipeToLoadLayout.C672063 */

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: f */
            public void mo233650f() {
                if (SwipeToLoadLayout.this.f169603c != null && (SwipeToLoadLayout.this.f169603c instanceof AbstractC67216e)) {
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169603c).mo233650f();
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67215d
            /* renamed from: c */
            public void mo233647c() {
                if (SwipeToLoadLayout.this.f169603c != null && C67211d.m261934a(SwipeToLoadLayout.this.f169605e)) {
                    if (SwipeToLoadLayout.this.f169603c instanceof AbstractC67215d) {
                        ((AbstractC67215d) SwipeToLoadLayout.this.f169603c).mo233647c();
                    }
                    if (SwipeToLoadLayout.this.f169601a != null) {
                        SwipeToLoadLayout.this.f169601a.onRefresh();
                    }
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: d */
            public void mo233648d() {
                if (SwipeToLoadLayout.this.f169603c != null && (SwipeToLoadLayout.this.f169603c instanceof AbstractC67216e) && C67211d.m261942i(SwipeToLoadLayout.this.f169605e)) {
                    SwipeToLoadLayout.this.f169603c.setVisibility(0);
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169603c).mo233648d();
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: e */
            public void mo233649e() {
                if (SwipeToLoadLayout.this.f169603c != null && (SwipeToLoadLayout.this.f169603c instanceof AbstractC67216e) && C67211d.m261936c(SwipeToLoadLayout.this.f169605e)) {
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169603c).mo233649e();
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: g */
            public void mo233651g() {
                if (SwipeToLoadLayout.this.f169603c != null && (SwipeToLoadLayout.this.f169603c instanceof AbstractC67216e) && C67211d.m261942i(SwipeToLoadLayout.this.f169605e)) {
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169603c).mo233651g();
                    SwipeToLoadLayout.this.f169603c.setVisibility(8);
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: a */
            public void mo233646a(int i, boolean z, boolean z2) {
                if (SwipeToLoadLayout.this.f169603c != null && (SwipeToLoadLayout.this.f169603c instanceof AbstractC67216e) && C67211d.m261940g(SwipeToLoadLayout.this.f169605e)) {
                    if (SwipeToLoadLayout.this.f169603c.getVisibility() != 0) {
                        SwipeToLoadLayout.this.f169603c.setVisibility(0);
                    }
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169603c).mo233646a(i, z, z2);
                }
            }
        };
        this.f169607g = new AbstractC67209b() {
            /* class com.tt.miniapp.view.refresh.SwipeToLoadLayout.C672074 */

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: f */
            public void mo233650f() {
                if (SwipeToLoadLayout.this.f169604d != null && (SwipeToLoadLayout.this.f169604d instanceof AbstractC67216e)) {
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169604d).mo233650f();
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67214c
            /* renamed from: a */
            public void mo233653a() {
                if (SwipeToLoadLayout.this.f169604d != null && C67211d.m261935b(SwipeToLoadLayout.this.f169605e)) {
                    if (SwipeToLoadLayout.this.f169604d instanceof AbstractC67214c) {
                        ((AbstractC67214c) SwipeToLoadLayout.this.f169604d).mo233653a();
                    }
                    if (SwipeToLoadLayout.this.f169602b != null) {
                        SwipeToLoadLayout.this.f169602b.mo233707a();
                    }
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: d */
            public void mo233648d() {
                if (SwipeToLoadLayout.this.f169604d != null && (SwipeToLoadLayout.this.f169604d instanceof AbstractC67216e) && C67211d.m261942i(SwipeToLoadLayout.this.f169605e)) {
                    SwipeToLoadLayout.this.f169604d.setVisibility(0);
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169604d).mo233648d();
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: e */
            public void mo233649e() {
                if (SwipeToLoadLayout.this.f169604d != null && (SwipeToLoadLayout.this.f169604d instanceof AbstractC67216e) && C67211d.m261937d(SwipeToLoadLayout.this.f169605e)) {
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169604d).mo233649e();
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: g */
            public void mo233651g() {
                if (SwipeToLoadLayout.this.f169604d != null && (SwipeToLoadLayout.this.f169604d instanceof AbstractC67216e) && C67211d.m261942i(SwipeToLoadLayout.this.f169605e)) {
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169604d).mo233651g();
                    SwipeToLoadLayout.this.f169604d.setVisibility(8);
                }
            }

            @Override // com.tt.miniapp.view.refresh.AbstractC67216e
            /* renamed from: a */
            public void mo233646a(int i, boolean z, boolean z2) {
                if (SwipeToLoadLayout.this.f169604d != null && (SwipeToLoadLayout.this.f169604d instanceof AbstractC67216e) && C67211d.m261941h(SwipeToLoadLayout.this.f169605e)) {
                    if (SwipeToLoadLayout.this.f169604d.getVisibility() != 0) {
                        SwipeToLoadLayout.this.f169604d.setVisibility(0);
                    }
                    ((AbstractC67216e) SwipeToLoadLayout.this.f169604d).mo233646a(i, z, z2);
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.microapp_m_swipe_style, R.attr.tma_default_to_loading_more_scrolling_duration, R.attr.tma_default_to_refreshing_scrolling_duration, R.attr.tma_drag_ratio, R.attr.tma_load_more_complete_delay_duration, R.attr.tma_load_more_complete_to_default_scrolling_duration, R.attr.tma_load_more_enabled, R.attr.tma_load_more_final_drag_offset, R.attr.tma_load_more_trigger_offset, R.attr.tma_refresh_complete_delay_duration, R.attr.tma_refresh_complete_to_default_scrolling_duration, R.attr.tma_refresh_enabled, R.attr.tma_refresh_final_drag_offset, R.attr.tma_refresh_trigger_offset, R.attr.tma_release_to_loading_more_scrolling_duration, R.attr.tma_release_to_refreshing_scrolling_duration, R.attr.tma_swiping_to_load_more_to_default_scrolling_duration, R.attr.tma_swiping_to_refresh_to_default_scrolling_duration}, i, 0);
        try {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 11) {
                    setRefreshEnabled(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == 6) {
                    setLoadMoreEnabled(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == 0) {
                    setSwipeStyle(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 3) {
                    setDragRatio(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == 12) {
                    setRefreshFinalDragOffset(obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                } else if (index == 7) {
                    setLoadMoreFinalDragOffset(obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                } else if (index == 13) {
                    setRefreshTriggerOffset(obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                } else if (index == 8) {
                    setLoadMoreTriggerOffset(obtainStyledAttributes.getDimensionPixelOffset(index, 0));
                } else if (index == 17) {
                    setSwipingToRefreshToDefaultScrollingDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_HD_ACCURACY));
                } else if (index == 15) {
                    setReleaseToRefreshingScrollingDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_HD_ACCURACY));
                } else if (index == 9) {
                    setRefreshCompleteDelayDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_INDOOR));
                } else if (index == 10) {
                    setRefreshCompleteToDefaultScrollingDuration(obtainStyledAttributes.getInt(index, ParticipantRepo.f117150c));
                } else if (index == 2) {
                    setDefaultToRefreshingScrollingDuration(obtainStyledAttributes.getInt(index, ParticipantRepo.f117150c));
                } else if (index == 16) {
                    setSwipingToLoadMoreToDefaultScrollingDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_HD_ACCURACY));
                } else if (index == 14) {
                    setReleaseToLoadingMoreScrollingDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_HD_ACCURACY));
                } else if (index == 4) {
                    setLoadMoreCompleteDelayDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_INDOOR));
                } else if (index == 5) {
                    setLoadMoreCompleteToDefaultScrollingDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_INDOOR));
                } else if (index == 1) {
                    setDefaultToLoadingMoreScrollingDuration(obtainStyledAttributes.getInt(index, LocationRequest.PRIORITY_INDOOR));
                }
            }
            obtainStyledAttributes.recycle();
            this.f169618r = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f169608h = new RunnableC67208a();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        m261898i();
        boolean z3 = true;
        if (this.f169603c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f169613m = z2;
        if (this.f169604d == null) {
            z3 = false;
        }
        this.f169614n = z3;
    }
}
