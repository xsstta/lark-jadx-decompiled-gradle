package com.lcodecore.tkrefreshlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.C0908j;
import androidx.core.view.C0909k;
import androidx.core.view.NestedScrollingChild;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.footer.BallPulseView;
import com.lcodecore.tkrefreshlayout.header.GoogleDotView;
import com.lcodecore.tkrefreshlayout.p1212a.AbstractC26390c;
import com.lcodecore.tkrefreshlayout.p1212a.C26377a;
import com.lcodecore.tkrefreshlayout.p1212a.C26391d;
import com.lcodecore.tkrefreshlayout.p1212a.C26393e;
import com.lcodecore.tkrefreshlayout.p1213b.C26395a;

public class TwinklingRefreshLayout extends RelativeLayout implements NestedScrollingChild, AbstractC26400e {

    /* renamed from: G */
    private static String f65022G = "";

    /* renamed from: H */
    private static String f65023H = "";

    /* renamed from: A */
    public C26373a f65024A;

    /* renamed from: B */
    public final int f65025B;

    /* renamed from: C */
    public AbstractC26400e f65026C;

    /* renamed from: D */
    public AbstractC26390c f65027D;

    /* renamed from: E */
    public float f65028E;

    /* renamed from: F */
    public float f65029F;

    /* renamed from: I */
    private final C0909k f65030I;

    /* renamed from: J */
    private AbstractC26399d f65031J;

    /* renamed from: K */
    private VelocityTracker f65032K;

    /* renamed from: L */
    private float f65033L;

    /* renamed from: M */
    private float f65034M;

    /* renamed from: N */
    private float f65035N;

    /* renamed from: O */
    private float f65036O;

    /* renamed from: P */
    private int f65037P;

    /* renamed from: Q */
    private int f65038Q;

    /* renamed from: R */
    private MotionEvent f65039R;

    /* renamed from: S */
    private boolean f65040S;

    /* renamed from: T */
    private int f65041T;

    /* renamed from: U */
    private final int[] f65042U;

    /* renamed from: V */
    private final int[] f65043V;

    /* renamed from: W */
    private final int[] f65044W;

    /* renamed from: a */
    protected float f65045a;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private AbstractC26401f ae;

    /* renamed from: b */
    protected float f65046b;

    /* renamed from: c */
    protected float f65047c;

    /* renamed from: d */
    protected float f65048d;

    /* renamed from: e */
    public View f65049e;

    /* renamed from: f */
    protected FrameLayout f65050f;

    /* renamed from: g */
    public FrameLayout f65051g;

    /* renamed from: h */
    public AbstractC26394b f65052h;

    /* renamed from: i */
    public AbstractC26376a f65053i;

    /* renamed from: j */
    public float f65054j;

    /* renamed from: k */
    public FrameLayout f65055k;

    /* renamed from: l */
    protected boolean f65056l;

    /* renamed from: m */
    protected boolean f65057m;

    /* renamed from: n */
    protected boolean f65058n;

    /* renamed from: o */
    protected boolean f65059o;

    /* renamed from: p */
    protected boolean f65060p;

    /* renamed from: q */
    protected boolean f65061q;

    /* renamed from: r */
    protected boolean f65062r;

    /* renamed from: s */
    protected boolean f65063s;

    /* renamed from: t */
    protected boolean f65064t;

    /* renamed from: u */
    protected boolean f65065u;

    /* renamed from: v */
    protected boolean f65066v;

    /* renamed from: w */
    protected boolean f65067w;

    /* renamed from: x */
    protected boolean f65068x;

    /* renamed from: y */
    protected boolean f65069y;

    /* renamed from: z */
    protected boolean f65070z;

    /* renamed from: com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout$a */
    public class C26373a {

        /* renamed from: a */
        public C26377a f65074a = new C26377a(this);

        /* renamed from: c */
        private int f65076c;

        /* renamed from: d */
        private boolean f65077d = true;

        /* renamed from: e */
        private boolean f65078e;

        /* renamed from: f */
        private boolean f65079f;

        /* renamed from: S */
        public void mo93576S() {
            this.f65076c = 0;
        }

        /* renamed from: T */
        public void mo93577T() {
            this.f65076c = 1;
        }

        /* renamed from: W */
        public boolean mo93580W() {
            return this.f65078e;
        }

        /* renamed from: X */
        public boolean mo93581X() {
            return this.f65079f;
        }

        /* renamed from: b */
        public C26377a mo93586b() {
            return this.f65074a;
        }

        /* renamed from: r */
        public boolean mo93610r() {
            return this.f65077d;
        }

        /* renamed from: u */
        public void mo93613u() {
            mo93572O();
        }

        /* renamed from: A */
        public boolean mo93558A() {
            return TwinklingRefreshLayout.this.f65061q;
        }

        /* renamed from: B */
        public boolean mo93559B() {
            return TwinklingRefreshLayout.this.f65060p;
        }

        /* renamed from: D */
        public boolean mo93561D() {
            return TwinklingRefreshLayout.this.f65056l;
        }

        /* renamed from: E */
        public boolean mo93562E() {
            return TwinklingRefreshLayout.this.f65057m;
        }

        /* renamed from: F */
        public boolean mo93563F() {
            return TwinklingRefreshLayout.this.f65058n;
        }

        /* renamed from: G */
        public boolean mo93564G() {
            return TwinklingRefreshLayout.this.f65059o;
        }

        /* renamed from: H */
        public boolean mo93565H() {
            return TwinklingRefreshLayout.this.f65066v;
        }

        /* renamed from: I */
        public boolean mo93566I() {
            return TwinklingRefreshLayout.this.f65065u;
        }

        /* renamed from: J */
        public boolean mo93567J() {
            return TwinklingRefreshLayout.this.f65064t;
        }

        /* renamed from: K */
        public boolean mo93568K() {
            return TwinklingRefreshLayout.this.f65062r;
        }

        /* renamed from: L */
        public boolean mo93569L() {
            return TwinklingRefreshLayout.this.f65063s;
        }

        /* renamed from: O */
        public void mo93572O() {
            TwinklingRefreshLayout.this.f65026C.mo93515a();
        }

        /* renamed from: P */
        public void mo93573P() {
            TwinklingRefreshLayout.this.f65026C.mo93518b();
        }

        /* renamed from: Q */
        public void mo93574Q() {
            TwinklingRefreshLayout.this.f65026C.mo93521c();
        }

        /* renamed from: R */
        public void mo93575R() {
            TwinklingRefreshLayout.this.f65026C.mo93523d();
        }

        /* renamed from: U */
        public boolean mo93578U() {
            if (this.f65076c == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: V */
        public boolean mo93579V() {
            if (1 == this.f65076c) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo93596e() {
            return TwinklingRefreshLayout.this.f65070z;
        }

        /* renamed from: f */
        public float mo93597f() {
            return TwinklingRefreshLayout.this.f65045a;
        }

        /* renamed from: g */
        public int mo93599g() {
            return (int) TwinklingRefreshLayout.this.f65047c;
        }

        /* renamed from: h */
        public int mo93600h() {
            return (int) TwinklingRefreshLayout.this.f65046b;
        }

        /* renamed from: i */
        public int mo93601i() {
            return (int) TwinklingRefreshLayout.this.f65054j;
        }

        /* renamed from: j */
        public int mo93602j() {
            return (int) TwinklingRefreshLayout.this.f65048d;
        }

        /* renamed from: k */
        public View mo93603k() {
            return TwinklingRefreshLayout.this.f65049e;
        }

        /* renamed from: l */
        public View mo93604l() {
            return TwinklingRefreshLayout.this.f65050f;
        }

        /* renamed from: m */
        public View mo93605m() {
            return TwinklingRefreshLayout.this.f65055k;
        }

        /* renamed from: n */
        public int mo93606n() {
            return TwinklingRefreshLayout.this.f65025B;
        }

        /* renamed from: q */
        public View mo93609q() {
            return TwinklingRefreshLayout.this.f65051g;
        }

        /* renamed from: x */
        public boolean mo93616x() {
            return TwinklingRefreshLayout.this.f65067w;
        }

        /* renamed from: C */
        public boolean mo93560C() {
            if (TwinklingRefreshLayout.this.f65056l || TwinklingRefreshLayout.this.f65057m) {
                return false;
            }
            return true;
        }

        /* renamed from: M */
        public void mo93570M() {
            TwinklingRefreshLayout.this.f65026C.mo93516a(TwinklingRefreshLayout.this);
        }

        /* renamed from: N */
        public void mo93571N() {
            TwinklingRefreshLayout.this.f65026C.mo93519b(TwinklingRefreshLayout.this);
        }

        /* renamed from: o */
        public void mo93607o() {
            if (TwinklingRefreshLayout.this.f65052h != null) {
                TwinklingRefreshLayout.this.f65052h.mo93668a();
            }
        }

        /* renamed from: p */
        public void mo93608p() {
            if (TwinklingRefreshLayout.this.f65053i != null) {
                TwinklingRefreshLayout.this.f65053i.mo93624b();
            }
        }

        /* renamed from: s */
        public void mo93611s() {
            TwinklingRefreshLayout.this.post(new Runnable() {
                /* class com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.C26373a.RunnableC263741 */

                public void run() {
                    C26373a.this.mo93576S();
                    if (!TwinklingRefreshLayout.this.f65064t && TwinklingRefreshLayout.this.f65049e != null) {
                        C26373a.this.mo93590c(true);
                        C26373a.this.f65074a.mo93642d();
                    }
                }
            });
        }

        /* renamed from: t */
        public void mo93612t() {
            TwinklingRefreshLayout.this.post(new Runnable() {
                /* class com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.C26373a.RunnableC263752 */

                public void run() {
                    C26373a.this.mo93577T();
                    if (!TwinklingRefreshLayout.this.f65064t && TwinklingRefreshLayout.this.f65049e != null) {
                        C26373a.this.mo93593d(true);
                        C26373a.this.f65074a.mo93644e();
                    }
                }
            });
        }

        /* renamed from: v */
        public void mo93614v() {
            if (TwinklingRefreshLayout.this.f65049e != null) {
                this.f65074a.mo93633a(true);
            }
        }

        /* renamed from: w */
        public void mo93615w() {
            mo93573P();
            if (TwinklingRefreshLayout.this.f65049e != null) {
                this.f65074a.mo93638b(true);
            }
        }

        /* renamed from: c */
        public boolean mo93591c() {
            return TwinklingRefreshLayout.this.f65068x;
        }

        /* renamed from: d */
        public boolean mo93594d() {
            return TwinklingRefreshLayout.this.f65069y;
        }

        /* renamed from: y */
        public boolean mo93617y() {
            if (TwinklingRefreshLayout.this.f65061q || TwinklingRefreshLayout.this.f65067w) {
                return true;
            }
            return false;
        }

        /* renamed from: z */
        public boolean mo93618z() {
            if (TwinklingRefreshLayout.this.f65060p || TwinklingRefreshLayout.this.f65067w) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo93582a() {
            if (TwinklingRefreshLayout.this.f65064t) {
                TwinklingRefreshLayout.this.setOverScrollTopShow(false);
                TwinklingRefreshLayout.this.setOverScrollBottomShow(false);
                if (TwinklingRefreshLayout.this.f65050f != null) {
                    TwinklingRefreshLayout.this.f65050f.setVisibility(8);
                }
                if (TwinklingRefreshLayout.this.f65055k != null) {
                    TwinklingRefreshLayout.this.f65055k.setVisibility(8);
                }
            }
        }

        /* renamed from: e */
        public void mo93595e(boolean z) {
            this.f65078e = z;
        }

        /* renamed from: f */
        public void mo93598f(boolean z) {
            this.f65079f = z;
        }

        /* renamed from: a */
        public void mo93584a(boolean z) {
            TwinklingRefreshLayout.this.f65056l = z;
        }

        /* renamed from: b */
        public void mo93588b(boolean z) {
            TwinklingRefreshLayout.this.f65057m = z;
        }

        /* renamed from: c */
        public void mo93590c(boolean z) {
            TwinklingRefreshLayout.this.f65058n = z;
        }

        /* renamed from: d */
        public void mo93593d(boolean z) {
            TwinklingRefreshLayout.this.f65059o = z;
        }

        public C26373a() {
        }

        /* renamed from: a */
        public void mo93583a(float f) {
            AbstractC26400e eVar = TwinklingRefreshLayout.this.f65026C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.mo93517a(twinklingRefreshLayout, f / twinklingRefreshLayout.f65047c);
        }

        /* renamed from: b */
        public void mo93587b(float f) {
            AbstractC26400e eVar = TwinklingRefreshLayout.this.f65026C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.mo93520b(twinklingRefreshLayout, f / twinklingRefreshLayout.f65054j);
        }

        /* renamed from: c */
        public void mo93589c(float f) {
            AbstractC26400e eVar = TwinklingRefreshLayout.this.f65026C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.mo93522c(twinklingRefreshLayout, f / twinklingRefreshLayout.f65047c);
        }

        /* renamed from: d */
        public void mo93592d(float f) {
            AbstractC26400e eVar = TwinklingRefreshLayout.this.f65026C;
            TwinklingRefreshLayout twinklingRefreshLayout = TwinklingRefreshLayout.this;
            eVar.mo93524d(twinklingRefreshLayout, f / twinklingRefreshLayout.f65054j);
        }

        /* renamed from: a */
        public boolean mo93585a(MotionEvent motionEvent) {
            return TwinklingRefreshLayout.super.dispatchTouchEvent(motionEvent);
        }
    }

    public View getExtraHeaderView() {
        return this.f65051g;
    }

    /* renamed from: j */
    private void m95461j() {
        this.f65031J = new AbstractC26399d() {
            /* class com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.C263701 */

            @Override // com.lcodecore.tkrefreshlayout.AbstractC26399d
            /* renamed from: a */
            public void mo93552a(MotionEvent motionEvent) {
                TwinklingRefreshLayout.this.f65027D.mo93666d(motionEvent);
            }

            @Override // com.lcodecore.tkrefreshlayout.AbstractC26399d
            /* renamed from: a */
            public void mo93554a(MotionEvent motionEvent, boolean z) {
                TwinklingRefreshLayout.this.f65027D.mo93662a(motionEvent, z);
            }

            @Override // com.lcodecore.tkrefreshlayout.AbstractC26399d
            /* renamed from: b */
            public void mo93555b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                TwinklingRefreshLayout.this.f65027D.mo93660a(motionEvent, motionEvent2, f, f2);
            }

            @Override // com.lcodecore.tkrefreshlayout.AbstractC26399d
            /* renamed from: a */
            public void mo93553a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                TwinklingRefreshLayout.this.f65027D.mo93661a(motionEvent, motionEvent2, f, f2, TwinklingRefreshLayout.this.f65028E, TwinklingRefreshLayout.this.f65029F);
            }
        };
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: c */
    public void mo93521c() {
        AbstractC26401f fVar = this.ae;
        if (fVar != null) {
            fVar.mo93521c();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: d */
    public void mo93523d() {
        AbstractC26401f fVar = this.ae;
        if (fVar != null) {
            fVar.mo93523d();
        }
    }

    /* renamed from: e */
    public void mo93526e() {
        this.f65024A.mo93611s();
    }

    /* renamed from: f */
    public void mo93527f() {
        this.f65024A.mo93613u();
    }

    /* renamed from: g */
    public void mo93528g() {
        this.f65024A.mo93615w();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f65030I.mo4703b();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f65030I.mo4694a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f65030I.mo4705c();
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: b */
    public void mo93518b() {
        AbstractC26401f fVar = this.ae;
        if (fVar != null) {
            fVar.mo93518b();
        }
        if (this.f65024A.mo93591c() || this.f65024A.mo93564G()) {
            this.f65053i.mo93621a();
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: a */
    public void mo93515a() {
        AbstractC26401f fVar = this.ae;
        if (fVar != null) {
            fVar.mo93515a();
        }
        if (this.f65024A.mo93591c() || this.f65024A.mo93563F()) {
            this.f65052h.mo93671a(new AbstractC26398c() {
                /* class com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.C263723 */

                @Override // com.lcodecore.tkrefreshlayout.AbstractC26398c
                /* renamed from: a */
                public void mo93557a() {
                    TwinklingRefreshLayout.this.f65024A.mo93614v();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f65049e = getChildAt(3);
        this.f65024A.mo93582a();
        C26373a aVar = this.f65024A;
        this.f65027D = new C26391d(aVar, new C26393e(aVar));
        m95461j();
    }

    /* renamed from: h */
    private void m95459h() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(10);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setId(R.id.ex_header);
        addView(frameLayout2, new RelativeLayout.LayoutParams(-1, -2));
        addView(frameLayout, layoutParams);
        this.f65051g = frameLayout2;
        this.f65050f = frameLayout;
        if (this.f65052h != null) {
            return;
        }
        if (!TextUtils.isEmpty(f65022G)) {
            try {
                setHeaderView((AbstractC26394b) Class.forName(f65022G).getDeclaredConstructor(Context.class).newInstance(getContext()));
            } catch (Exception e) {
                Log.e("TwinklingRefreshLayout:", "setDefaultHeader classname=" + e.getMessage());
                setHeaderView(new GoogleDotView(getContext()));
            }
        } else {
            setHeaderView(new GoogleDotView(getContext()));
        }
    }

    /* renamed from: i */
    private void m95460i() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 0);
        layoutParams.addRule(12);
        frameLayout.setLayoutParams(layoutParams);
        this.f65055k = frameLayout;
        addView(frameLayout);
        if (this.f65053i != null) {
            return;
        }
        if (!TextUtils.isEmpty(f65023H)) {
            try {
                setBottomView((AbstractC26376a) Class.forName(f65023H).getDeclaredConstructor(Context.class).newInstance(getContext()));
            } catch (Exception e) {
                Log.e("TwinklingRefreshLayout:", "setDefaultFooter classname=" + e.getMessage());
                setBottomView(new BallPulseView(getContext()));
            }
        } else {
            setBottomView(new BallPulseView(getContext()));
        }
    }

    public static void setDefaultFooter(String str) {
        f65023H = str;
    }

    public static void setDefaultHeader(String str) {
        f65022G = str;
    }

    public void setEnableKeepIView(boolean z) {
        this.f65068x = z;
    }

    public void setEnableOverScroll(boolean z) {
        this.f65067w = z;
    }

    public void setOverScrollBottomShow(boolean z) {
        this.f65063s = z;
    }

    public void setOverScrollTopShow(boolean z) {
        this.f65062r = z;
    }

    public TwinklingRefreshLayout(Context context) {
        this(context, null, 0);
    }

    public void setDecorator(AbstractC26390c cVar) {
        if (cVar != null) {
            this.f65027D = cVar;
        }
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f65030I.mo4693a(z);
    }

    public void setOnRefreshListener(AbstractC26401f fVar) {
        if (fVar != null) {
            this.ae = fVar;
        }
    }

    public void setOverScrollRefreshShow(boolean z) {
        this.f65062r = z;
        this.f65063s = z;
    }

    public void setTargetView(View view) {
        if (view != null) {
            this.f65049e = view;
        }
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.f65030I.mo4704b(i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean a = this.f65027D.mo93663a(motionEvent);
        m95456a(motionEvent, this.f65031J);
        m95457a(motionEvent);
        return a;
    }

    public void setAutoLoadMore(boolean z) {
        this.f65065u = z;
        if (z) {
            setEnableLoadmore(true);
        }
    }

    public void setBottomHeight(float f) {
        this.f65054j = (float) C26395a.m95593a(getContext(), f);
    }

    public void setFloatRefresh(boolean z) {
        this.f65066v = z;
        if (z) {
            post(new Runnable() {
                /* class com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout.RunnableC263712 */

                public void run() {
                    if (TwinklingRefreshLayout.this.f65050f != null) {
                        TwinklingRefreshLayout.this.f65050f.bringToFront();
                    }
                }
            });
        }
    }

    public void setHeaderHeight(float f) {
        this.f65047c = (float) C26395a.m95593a(getContext(), f);
    }

    public void setMaxBottomHeight(float f) {
        this.f65046b = (float) C26395a.m95593a(getContext(), f);
    }

    public void setMaxHeadHeight(float f) {
        this.f65045a = (float) C26395a.m95593a(getContext(), f);
    }

    public void setOverScrollHeight(float f) {
        this.f65048d = (float) C26395a.m95593a(getContext(), f);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: a */
    public void mo93516a(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.f65052h.mo93669a(this.f65045a, this.f65047c);
        AbstractC26401f fVar = this.ae;
        if (fVar != null) {
            fVar.mo93516a(twinklingRefreshLayout);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f65027D.mo93664b(motionEvent) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f65027D.mo93665c(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setBottomView(AbstractC26376a aVar) {
        if (aVar != null) {
            this.f65055k.removeAllViewsInLayout();
            this.f65055k.addView(aVar.getView());
            this.f65053i = aVar;
        }
    }

    public void setEnableLoadmore(boolean z) {
        this.f65060p = z;
        AbstractC26376a aVar = this.f65053i;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.getView().setVisibility(0);
        } else {
            aVar.getView().setVisibility(8);
        }
    }

    public void setEnableRefresh(boolean z) {
        this.f65061q = z;
        AbstractC26394b bVar = this.f65052h;
        if (bVar == null) {
            return;
        }
        if (z) {
            bVar.getView().setVisibility(0);
        } else {
            bVar.getView().setVisibility(8);
        }
    }

    public void setHeaderView(AbstractC26394b bVar) {
        if (bVar != null) {
            this.f65050f.removeAllViewsInLayout();
            this.f65050f.addView(bVar.getView());
            this.f65052h = bVar;
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: b */
    public void mo93519b(TwinklingRefreshLayout twinklingRefreshLayout) {
        this.f65053i.mo93622a(this.f65046b, this.f65054j);
        AbstractC26401f fVar = this.ae;
        if (fVar != null) {
            fVar.mo93519b(twinklingRefreshLayout);
        }
    }

    /* renamed from: a */
    private boolean m95457a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a = C0908j.m4366a(motionEvent);
        int b = C0908j.m4368b(motionEvent);
        if (a == 0) {
            int[] iArr = this.f65044W;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.f65044W;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.aa);
                    if (findPointerIndex < 0) {
                        Log.e("TwinklingRefreshLayout", "Error processing scroll; pointer index for id " + this.aa + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int x = this.ab - ((int) motionEvent.getX(findPointerIndex));
                    int i = this.ac - y;
                    if (dispatchNestedPreScroll(x, i, this.f65043V, this.f65042U)) {
                        int[] iArr3 = this.f65043V;
                        int i2 = iArr3[0];
                        i -= iArr3[1];
                        int[] iArr4 = this.f65042U;
                        obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                        int[] iArr5 = this.f65044W;
                        int i3 = iArr5[0];
                        int[] iArr6 = this.f65042U;
                        iArr5[0] = i3 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                    }
                    if (!this.ad && Math.abs(i) > this.f65025B) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.ad = true;
                        if (i > 0) {
                            i -= this.f65025B;
                        } else {
                            i += this.f65025B;
                        }
                    }
                    if (this.ad) {
                        int[] iArr7 = this.f65042U;
                        this.ac = y - iArr7[1];
                        if (dispatchNestedScroll(0, 0, 0, i + 0, iArr7)) {
                            int i4 = this.ab;
                            int[] iArr8 = this.f65042U;
                            this.ab = i4 - iArr8[0];
                            this.ac -= iArr8[1];
                            obtain.offsetLocation((float) iArr8[0], (float) iArr8[1]);
                            int[] iArr9 = this.f65044W;
                            int i5 = iArr9[0];
                            int[] iArr10 = this.f65042U;
                            iArr9[0] = i5 + iArr10[0];
                            iArr9[1] = iArr9[1] + iArr10[1];
                        }
                    }
                } else if (a != 3) {
                    if (a == 5) {
                        this.aa = motionEvent.getPointerId(b);
                        this.ab = (int) motionEvent.getX(b);
                        this.ac = (int) motionEvent.getY(b);
                    }
                }
            }
            stopNestedScroll();
            this.ad = false;
            this.aa = -1;
        } else {
            this.aa = motionEvent.getPointerId(0);
            this.ab = (int) motionEvent.getX();
            this.ac = (int) motionEvent.getY();
            startNestedScroll(2);
        }
        obtain.recycle();
        return true;
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f65030I.mo4695a(f, f2);
    }

    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: c */
    public void mo93522c(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        AbstractC26401f fVar;
        this.f65052h.mo93672b(f, this.f65045a, this.f65047c);
        if (this.f65061q && (fVar = this.ae) != null) {
            fVar.mo93522c(twinklingRefreshLayout, f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: d */
    public void mo93524d(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        AbstractC26401f fVar;
        this.f65053i.mo93625b(f, this.f65046b, this.f65054j);
        if (this.f65060p && (fVar = this.ae) != null) {
            fVar.mo93524d(twinklingRefreshLayout, f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: a */
    public void mo93517a(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        AbstractC26401f fVar;
        this.f65052h.mo93670a(f, this.f65045a, this.f65047c);
        if (this.f65061q && (fVar = this.ae) != null) {
            fVar.mo93517a(twinklingRefreshLayout, f);
        }
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26400e
    /* renamed from: b */
    public void mo93520b(TwinklingRefreshLayout twinklingRefreshLayout, float f) {
        AbstractC26401f fVar;
        this.f65053i.mo93623a(f, this.f65045a, this.f65047c);
        if (this.f65060p && (fVar = this.ae) != null) {
            fVar.mo93520b(twinklingRefreshLayout, f);
        }
    }

    /* renamed from: a */
    private void m95456a(MotionEvent motionEvent, AbstractC26399d dVar) {
        boolean z;
        int i;
        int action = motionEvent.getAction();
        if (this.f65032K == null) {
            this.f65032K = VelocityTracker.obtain();
        }
        this.f65032K.addMovement(motionEvent);
        int i2 = action & 255;
        boolean z2 = true;
        if (i2 == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        int pointerCount = motionEvent.getPointerCount();
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (i != i3) {
                f += motionEvent.getX(i3);
                f2 += motionEvent.getY(i3);
            }
        }
        float f3 = (float) (z ? pointerCount - 1 : pointerCount);
        float f4 = f / f3;
        float f5 = f2 / f3;
        if (i2 == 0) {
            this.f65033L = f4;
            this.f65035N = f4;
            this.f65034M = f5;
            this.f65036O = f5;
            MotionEvent motionEvent2 = this.f65039R;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.f65039R = MotionEvent.obtain(motionEvent);
            this.f65040S = true;
            dVar.mo93552a(motionEvent);
        } else if (i2 == 1) {
            int pointerId = motionEvent.getPointerId(0);
            this.f65032K.computeCurrentVelocity(1000, (float) this.f65037P);
            this.f65029F = this.f65032K.getYVelocity(pointerId);
            this.f65028E = this.f65032K.getXVelocity(pointerId);
            if (Math.abs(this.f65029F) > ((float) this.f65038Q) || Math.abs(this.f65028E) > ((float) this.f65038Q)) {
                dVar.mo93555b(this.f65039R, motionEvent, this.f65028E, this.f65029F);
            } else {
                z2 = false;
            }
            dVar.mo93554a(motionEvent, z2);
            VelocityTracker velocityTracker = this.f65032K;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f65032K = null;
            }
        } else if (i2 == 2) {
            float f6 = this.f65033L - f4;
            float f7 = this.f65034M - f5;
            if (this.f65040S) {
                int i4 = (int) (f4 - this.f65035N);
                int i5 = (int) (f5 - this.f65036O);
                if ((i4 * i4) + (i5 * i5) > this.f65041T) {
                    dVar.mo93553a(this.f65039R, motionEvent, f6, f7);
                    this.f65033L = f4;
                    this.f65034M = f5;
                    this.f65040S = false;
                }
            } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                dVar.mo93553a(this.f65039R, motionEvent, f6, f7);
                this.f65033L = f4;
                this.f65034M = f5;
            }
        } else if (i2 == 3) {
            this.f65040S = false;
            VelocityTracker velocityTracker2 = this.f65032K;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f65032K = null;
            }
        } else if (i2 == 5) {
            this.f65033L = f4;
            this.f65035N = f4;
            this.f65034M = f5;
            this.f65036O = f5;
        } else if (i2 == 6) {
            this.f65033L = f4;
            this.f65035N = f4;
            this.f65034M = f5;
            this.f65036O = f5;
            this.f65032K.computeCurrentVelocity(1000, (float) this.f65037P);
            int actionIndex = motionEvent.getActionIndex();
            int pointerId2 = motionEvent.getPointerId(actionIndex);
            float xVelocity = this.f65032K.getXVelocity(pointerId2);
            float yVelocity = this.f65032K.getYVelocity(pointerId2);
            for (int i6 = 0; i6 < pointerCount; i6++) {
                if (i6 != actionIndex) {
                    int pointerId3 = motionEvent.getPointerId(i6);
                    if ((this.f65032K.getXVelocity(pointerId3) * xVelocity) + (this.f65032K.getYVelocity(pointerId3) * yVelocity) < BitmapDescriptorFactory.HUE_RED) {
                        this.f65032K.clear();
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f65030I.mo4696a(f, f2, z);
    }

    /* JADX INFO: finally extract failed */
    public TwinklingRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f65060p = true;
        this.f65061q = true;
        this.f65062r = true;
        this.f65063s = true;
        this.f65067w = true;
        this.f65068x = true;
        this.f65069y = true;
        this.f65070z = true;
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f65025B = scaledTouchSlop;
        this.f65026C = this;
        this.f65037P = ViewConfiguration.getMaximumFlingVelocity();
        this.f65038Q = ViewConfiguration.getMinimumFlingVelocity();
        this.f65041T = scaledTouchSlop * scaledTouchSlop;
        this.f65042U = new int[2];
        this.f65043V = new int[2];
        this.f65044W = new int[2];
        this.aa = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.tr_autoLoadMore, R.attr.tr_bottomView, R.attr.tr_bottom_height, R.attr.tr_enable_keepIView, R.attr.tr_enable_loadmore, R.attr.tr_enable_overscroll, R.attr.tr_enable_refresh, R.attr.tr_floatRefresh, R.attr.tr_head_height, R.attr.tr_headerView, R.attr.tr_max_bottom_height, R.attr.tr_max_head_height, R.attr.tr_overscroll_bottom_show, R.attr.tr_overscroll_height, R.attr.tr_overscroll_top_show, R.attr.tr_pureScrollMode_on, R.attr.tr_showLoadingWhenOverScroll, R.attr.tr_showRefreshingWhenOverScroll}, i, 0);
        try {
            this.f65045a = (float) obtainStyledAttributes.getDimensionPixelSize(11, C26395a.m95593a(context, 120.0f));
            this.f65047c = (float) obtainStyledAttributes.getDimensionPixelSize(8, C26395a.m95593a(context, 80.0f));
            this.f65046b = (float) obtainStyledAttributes.getDimensionPixelSize(10, C26395a.m95593a(context, 120.0f));
            this.f65054j = (float) obtainStyledAttributes.getDimensionPixelSize(2, C26395a.m95593a(context, 60.0f));
            this.f65048d = (float) obtainStyledAttributes.getDimensionPixelSize(13, (int) this.f65047c);
            this.f65061q = obtainStyledAttributes.getBoolean(6, true);
            this.f65060p = obtainStyledAttributes.getBoolean(4, true);
            this.f65064t = obtainStyledAttributes.getBoolean(15, false);
            this.f65062r = obtainStyledAttributes.getBoolean(14, true);
            this.f65063s = obtainStyledAttributes.getBoolean(12, true);
            this.f65067w = obtainStyledAttributes.getBoolean(5, true);
            this.f65066v = obtainStyledAttributes.getBoolean(7, false);
            this.f65065u = obtainStyledAttributes.getBoolean(0, false);
            this.f65068x = obtainStyledAttributes.getBoolean(3, true);
            this.f65069y = obtainStyledAttributes.getBoolean(17, true);
            this.f65070z = obtainStyledAttributes.getBoolean(16, true);
            obtainStyledAttributes.recycle();
            this.f65024A = new C26373a();
            m95459h();
            m95460i();
            setFloatRefresh(this.f65066v);
            setAutoLoadMore(this.f65065u);
            setEnableRefresh(this.f65061q);
            setEnableLoadmore(this.f65060p);
            this.f65030I = new C0909k(this);
            setNestedScrollingEnabled(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f65030I.mo4701a(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f65030I.mo4699a(i, i2, i3, i4, iArr);
    }
}
