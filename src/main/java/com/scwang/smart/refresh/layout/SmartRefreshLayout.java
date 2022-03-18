package com.scwang.smart.refresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.C0909k;
import androidx.core.view.C0911m;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smart.refresh.layout.constant.C27098a;
import com.scwang.smart.refresh.layout.constant.C27099b;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27079a;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27080b;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27081c;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27082d;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27083e;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27084f;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27086b;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27087c;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27088d;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27089e;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27090f;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27091g;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27094j;
import com.scwang.smart.refresh.layout.p1232d.animationInterpolatorC27102b;
import com.scwang.smart.refresh.layout.p1233e.C27103a;

public class SmartRefreshLayout extends ViewGroup implements NestedScrollingParent, AbstractC27084f {
    protected static AbstractC27086b aK;
    protected static AbstractC27087c aL;
    protected static AbstractC27088d aM;
    protected static ViewGroup.MarginLayoutParams aN = new ViewGroup.MarginLayoutParams(-1, -1);

    /* renamed from: A */
    protected int[] f67229A;

    /* renamed from: B */
    protected boolean f67230B;

    /* renamed from: C */
    protected boolean f67231C;

    /* renamed from: D */
    protected boolean f67232D;

    /* renamed from: E */
    protected boolean f67233E;

    /* renamed from: F */
    protected boolean f67234F;

    /* renamed from: G */
    protected boolean f67235G;

    /* renamed from: H */
    protected boolean f67236H;

    /* renamed from: I */
    protected boolean f67237I;

    /* renamed from: J */
    protected boolean f67238J;

    /* renamed from: K */
    protected boolean f67239K;

    /* renamed from: L */
    protected boolean f67240L;

    /* renamed from: M */
    protected boolean f67241M;

    /* renamed from: N */
    protected boolean f67242N;

    /* renamed from: O */
    protected boolean f67243O;

    /* renamed from: P */
    protected boolean f67244P;

    /* renamed from: Q */
    protected boolean f67245Q;

    /* renamed from: R */
    protected boolean f67246R;

    /* renamed from: S */
    protected boolean f67247S;

    /* renamed from: T */
    protected boolean f67248T;

    /* renamed from: U */
    protected boolean f67249U;

    /* renamed from: V */
    protected boolean f67250V;

    /* renamed from: W */
    protected boolean f67251W;

    /* renamed from: a */
    protected int f67252a;
    protected AbstractC27083e aA;
    protected RefreshState aB;
    protected RefreshState aC;
    protected long aD;
    protected int aE;
    protected int aF;
    protected boolean aG;
    protected boolean aH;
    protected boolean aI;
    protected boolean aJ;
    protected boolean aO;
    protected MotionEvent aP;
    protected Runnable aQ;
    protected ValueAnimator aR;
    protected boolean aa;
    protected AbstractC27091g ab;
    protected AbstractC27089e ac;
    protected AbstractC27090f ad;
    protected AbstractC27094j ae;
    protected int af;
    protected boolean ag;
    protected int[] ah;

    /* renamed from: ai  reason: collision with root package name */
    protected C0909k f175439ai;
    protected C0911m aj;
    protected int ak;
    protected C27098a al;
    protected int am;
    protected C27098a an;
    protected int ao;
    protected int ap;
    protected float aq;
    protected float ar;
    protected float as;
    protected float at;
    protected float au;
    protected AbstractC27079a av;
    protected AbstractC27079a aw;
    protected AbstractC27080b ax;
    protected Paint ay;
    protected Handler az;

    /* renamed from: b */
    protected int f67253b;

    /* renamed from: c */
    protected int f67254c;

    /* renamed from: d */
    protected int f67255d;

    /* renamed from: e */
    protected int f67256e;

    /* renamed from: f */
    protected int f67257f;

    /* renamed from: g */
    protected int f67258g;

    /* renamed from: h */
    protected float f67259h;

    /* renamed from: i */
    protected float f67260i;

    /* renamed from: j */
    protected float f67261j;

    /* renamed from: k */
    protected float f67262k;

    /* renamed from: l */
    protected float f67263l;

    /* renamed from: m */
    protected char f67264m;

    /* renamed from: n */
    protected boolean f67265n;

    /* renamed from: o */
    protected boolean f67266o;

    /* renamed from: p */
    protected boolean f67267p;

    /* renamed from: q */
    protected int f67268q;

    /* renamed from: r */
    protected int f67269r;

    /* renamed from: s */
    protected int f67270s;

    /* renamed from: t */
    protected int f67271t;

    /* renamed from: u */
    protected int f67272u;

    /* renamed from: v */
    protected int f67273v;

    /* renamed from: w */
    protected int f67274w;

    /* renamed from: x */
    protected Scroller f67275x;

    /* renamed from: y */
    protected VelocityTracker f67276y;

    /* renamed from: z */
    protected Interpolator f67277z;

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27084f
    public ViewGroup getLayout() {
        return this;
    }

    /* renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$c */
    public class C27078c implements AbstractC27083e {
        @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27083e
        /* renamed from: a */
        public AbstractC27084f mo96287a() {
            return SmartRefreshLayout.this;
        }

        @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27083e
        /* renamed from: b */
        public AbstractC27083e mo96288b() {
            if (SmartRefreshLayout.this.aB == RefreshState.TwoLevel) {
                SmartRefreshLayout.this.aA.mo96286a(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f67253b == 0) {
                    mo96284a(0, false);
                    SmartRefreshLayout.this.mo96232a(RefreshState.None);
                } else {
                    mo96283a(0).setDuration((long) SmartRefreshLayout.this.f67256e);
                }
            }
            return this;
        }

        public C27078c() {
        }

        @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27083e
        /* renamed from: a */
        public ValueAnimator mo96283a(int i) {
            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
            return smartRefreshLayout.mo96222a(i, 0, smartRefreshLayout.f67277z, SmartRefreshLayout.this.f67257f);
        }

        @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27083e
        /* renamed from: a */
        public AbstractC27083e mo96286a(RefreshState refreshState) {
            switch (C270672.f67280a[refreshState.ordinal()]) {
                case 1:
                    if (SmartRefreshLayout.this.aB != RefreshState.None && SmartRefreshLayout.this.f67253b == 0) {
                        SmartRefreshLayout.this.mo96232a(RefreshState.None);
                        return null;
                    } else if (SmartRefreshLayout.this.f67253b == 0) {
                        return null;
                    } else {
                        mo96283a(0);
                        return null;
                    }
                case 2:
                    if (!SmartRefreshLayout.this.aB.isOpening) {
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        if (smartRefreshLayout.mo96235a(smartRefreshLayout.f67230B)) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.PullDownToRefresh);
                            return null;
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullDownToRefresh);
                    return null;
                case 3:
                    SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout2.mo96235a(smartRefreshLayout2.f67231C) || SmartRefreshLayout.this.aB.isOpening || SmartRefreshLayout.this.aB.isFinishing || (SmartRefreshLayout.this.f67248T && SmartRefreshLayout.this.f67236H && SmartRefreshLayout.this.f67249U)) {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullUpToLoad);
                        return null;
                    }
                    SmartRefreshLayout.this.mo96232a(RefreshState.PullUpToLoad);
                    return null;
                case 4:
                    if (!SmartRefreshLayout.this.aB.isOpening) {
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        if (smartRefreshLayout3.mo96235a(smartRefreshLayout3.f67230B)) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.PullDownCanceled);
                            mo96286a(RefreshState.None);
                            return null;
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.PullDownCanceled);
                    return null;
                case 5:
                    SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout4.mo96235a(smartRefreshLayout4.f67231C) || SmartRefreshLayout.this.aB.isOpening || (SmartRefreshLayout.this.f67248T && SmartRefreshLayout.this.f67236H && SmartRefreshLayout.this.f67249U)) {
                        SmartRefreshLayout.this.setViceState(RefreshState.PullUpCanceled);
                        return null;
                    }
                    SmartRefreshLayout.this.mo96232a(RefreshState.PullUpCanceled);
                    mo96286a(RefreshState.None);
                    return null;
                case 6:
                    if (!SmartRefreshLayout.this.aB.isOpening) {
                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                        if (smartRefreshLayout5.mo96235a(smartRefreshLayout5.f67230B)) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.ReleaseToRefresh);
                            return null;
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToRefresh);
                    return null;
                case 7:
                    SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                    if (!smartRefreshLayout6.mo96235a(smartRefreshLayout6.f67231C) || SmartRefreshLayout.this.aB.isOpening || SmartRefreshLayout.this.aB.isFinishing || (SmartRefreshLayout.this.f67248T && SmartRefreshLayout.this.f67236H && SmartRefreshLayout.this.f67249U)) {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToLoad);
                        return null;
                    }
                    SmartRefreshLayout.this.mo96232a(RefreshState.ReleaseToLoad);
                    return null;
                case 8:
                    if (!SmartRefreshLayout.this.aB.isOpening) {
                        SmartRefreshLayout smartRefreshLayout7 = SmartRefreshLayout.this;
                        if (smartRefreshLayout7.mo96235a(smartRefreshLayout7.f67230B)) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.ReleaseToTwoLevel);
                            return null;
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                    return null;
                case 9:
                    if (!SmartRefreshLayout.this.aB.isOpening) {
                        SmartRefreshLayout smartRefreshLayout8 = SmartRefreshLayout.this;
                        if (smartRefreshLayout8.mo96235a(smartRefreshLayout8.f67230B)) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.RefreshReleased);
                            return null;
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                    return null;
                case 10:
                    if (!SmartRefreshLayout.this.aB.isOpening) {
                        SmartRefreshLayout smartRefreshLayout9 = SmartRefreshLayout.this;
                        if (smartRefreshLayout9.mo96235a(smartRefreshLayout9.f67231C)) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.LoadReleased);
                            return null;
                        }
                    }
                    SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                    return null;
                case 11:
                    SmartRefreshLayout.this.setStateRefreshing(true);
                    return null;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    SmartRefreshLayout.this.setStateLoading(true);
                    return null;
                default:
                    SmartRefreshLayout.this.mo96232a(refreshState);
                    return null;
            }
        }

        @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27083e
        /* renamed from: a */
        public AbstractC27083e mo96285a(AbstractC27079a aVar, int i) {
            if (SmartRefreshLayout.this.ay == null && i != 0) {
                SmartRefreshLayout.this.ay = new Paint();
            }
            if (aVar.equals(SmartRefreshLayout.this.av)) {
                SmartRefreshLayout.this.aE = i;
            } else if (aVar.equals(SmartRefreshLayout.this.aw)) {
                SmartRefreshLayout.this.aF = i;
            }
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
        @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27083e
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.scwang.smart.refresh.layout.p1229a.AbstractC27083e mo96284a(int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 1049
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.C27078c.mo96284a(int, boolean):com.scwang.smart.refresh.layout.a.e");
        }
    }

    public RefreshState getState() {
        return this.aB;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo96233a(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = (float) this.f67274w;
        }
        if (Build.VERSION.SDK_INT > 27 && this.ax != null) {
            getScaleY();
            View a = this.ax.mo96300a();
            if (getScaleY() == -1.0f && a.getScaleY() == -1.0f) {
                f = -f;
            }
        }
        if (Math.abs(f) > ((float) this.f67272u)) {
            if (((float) this.f67253b) * f < BitmapDescriptorFactory.HUE_RED) {
                if (this.aB == RefreshState.Refreshing || this.aB == RefreshState.Loading || (this.f67253b < 0 && this.f67248T)) {
                    this.aQ = new RunnableC27077b(f).mo96281a();
                    return true;
                } else if (this.aB.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f < BitmapDescriptorFactory.HUE_RED && ((this.f67238J && (this.f67231C || this.f67239K)) || ((this.aB == RefreshState.Loading && this.f67253b >= 0) || (this.f67240L && mo96235a(this.f67231C))))) || (f > BitmapDescriptorFactory.HUE_RED && ((this.f67238J && this.f67230B) || this.f67239K || (this.aB == RefreshState.Refreshing && this.f67253b <= 0)))) {
                this.aO = false;
                this.f67275x.fling(0, 0, 0, (int) (-f), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f67275x.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo96234a(int i) {
        if (i == 0) {
            if (this.aR != null) {
                if (this.aB.isFinishing || this.aB == RefreshState.TwoLevelReleased || this.aB == RefreshState.RefreshReleased || this.aB == RefreshState.LoadReleased) {
                    return true;
                }
                if (this.aB == RefreshState.PullDownCanceled) {
                    this.aA.mo96286a(RefreshState.PullDownToRefresh);
                } else if (this.aB == RefreshState.PullUpCanceled) {
                    this.aA.mo96286a(RefreshState.PullUpToLoad);
                }
                this.aR.setDuration(0L);
                this.aR.cancel();
                this.aR = null;
            }
            this.aQ = null;
        }
        if (this.aR != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96232a(RefreshState refreshState) {
        RefreshState refreshState2 = this.aB;
        if (refreshState2 != refreshState) {
            this.aB = refreshState;
            this.aC = refreshState;
            AbstractC27079a aVar = this.av;
            AbstractC27079a aVar2 = this.aw;
            AbstractC27090f fVar = this.ad;
            if (aVar != null) {
                aVar.mo96324a(this, refreshState2, refreshState);
            }
            if (aVar2 != null) {
                aVar2.mo96324a(this, refreshState2, refreshState);
            }
            if (fVar != null) {
                fVar.mo96324a(this, refreshState2, refreshState);
            }
            if (refreshState == RefreshState.LoadFinish) {
                this.aJ = false;
            }
        } else if (this.aC != refreshState2) {
            this.aC = refreshState2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo96236a(boolean z, AbstractC27079a aVar) {
        return z || this.f67241M || aVar == null || aVar.getSpinnerStyle() == C27099b.f67339c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo96235a(boolean z) {
        return z && !this.f67241M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96231a() {
        if (this.aB == RefreshState.TwoLevel) {
            if (this.f67274w > -1000 && this.f67253b > getHeight() / 2) {
                ValueAnimator a = this.aA.mo96283a(getHeight());
                if (a != null) {
                    a.setDuration((long) this.f67256e);
                }
            } else if (this.f67265n) {
                this.aA.mo96288b();
            }
        } else if (this.aB == RefreshState.Loading || (this.f67236H && this.f67248T && this.f67249U && this.f67253b < 0 && mo96235a(this.f67231C))) {
            int i = this.f67253b;
            int i2 = this.am;
            if (i < (-i2)) {
                this.aA.mo96283a(-i2);
            } else if (i > 0) {
                this.aA.mo96283a(0);
            }
        } else if (this.aB == RefreshState.Refreshing) {
            int i3 = this.f67253b;
            int i4 = this.ak;
            if (i3 > i4) {
                this.aA.mo96283a(i4);
            } else if (i3 < 0) {
                this.aA.mo96283a(0);
            }
        } else if (this.aB == RefreshState.PullDownToRefresh) {
            this.aA.mo96286a(RefreshState.PullDownCanceled);
        } else if (this.aB == RefreshState.PullUpToLoad) {
            this.aA.mo96286a(RefreshState.PullUpCanceled);
        } else if (this.aB == RefreshState.ReleaseToRefresh) {
            this.aA.mo96286a(RefreshState.Refreshing);
        } else if (this.aB == RefreshState.ReleaseToLoad) {
            this.aA.mo96286a(RefreshState.Loading);
        } else if (this.aB == RefreshState.ReleaseToTwoLevel) {
            this.aA.mo96286a(RefreshState.TwoLevelReleased);
        } else if (this.aB == RefreshState.RefreshReleased) {
            if (this.aR == null) {
                this.aA.mo96283a(this.ak);
            }
        } else if (this.aB == RefreshState.LoadReleased) {
            if (this.aR == null) {
                this.aA.mo96283a(-this.am);
            }
        } else if (this.aB != RefreshState.LoadFinish && this.f67253b != 0) {
            this.aA.mo96283a(0);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.aj.mo4707a();
    }

    /* renamed from: b */
    public AbstractC27084f mo96237b() {
        return mo96253g(true);
    }

    /* renamed from: e */
    public boolean mo96251e() {
        if (this.aB == RefreshState.Refreshing) {
            return true;
        }
        return false;
    }

    public AbstractC27081c getRefreshFooter() {
        AbstractC27079a aVar = this.aw;
        if (aVar instanceof AbstractC27081c) {
            return (AbstractC27081c) aVar;
        }
        return null;
    }

    public AbstractC27082d getRefreshHeader() {
        AbstractC27079a aVar = this.av;
        if (aVar instanceof AbstractC27082d) {
            return (AbstractC27082d) aVar;
        }
        return null;
    }

    /* renamed from: c */
    public AbstractC27084f mo96241c() {
        return mo96223a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.aD))), (int) LocationRequest.PRIORITY_INDOOR) << 16, true, Boolean.TRUE);
    }

    /* renamed from: d */
    public AbstractC27084f mo96246d() {
        return mo96224a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.aD))), (int) LocationRequest.PRIORITY_INDOOR) << 16, true, true);
    }

    public boolean isNestedScrollingEnabled() {
        if (!this.f67245Q || (!this.f67239K && !this.f67230B && !this.f67231C)) {
            return false;
        }
        return true;
    }

    public void computeScroll() {
        float f;
        this.f67275x.getCurrY();
        if (this.f67275x.computeScrollOffset()) {
            int finalY = this.f67275x.getFinalY();
            if ((finalY >= 0 || ((!this.f67230B && !this.f67239K) || !this.ax.mo96307c())) && (finalY <= 0 || ((!this.f67231C && !this.f67239K) || !this.ax.mo96308d()))) {
                this.aO = true;
                invalidate();
                return;
            }
            if (this.aO) {
                if (finalY > 0) {
                    f = -this.f67275x.getCurrVelocity();
                } else {
                    f = this.f67275x.getCurrVelocity();
                }
                mo96240b(f);
            }
            this.f67275x.forceFinished(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.aI = false;
        this.f67250V = true;
        this.aQ = null;
        ValueAnimator valueAnimator = this.aR;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.aR.removeAllUpdateListeners();
            this.aR.setDuration(0L);
            this.aR.cancel();
            this.aR = null;
        }
        if (this.av != null && this.aB == RefreshState.Refreshing) {
            this.av.mo96289a(this, false);
        }
        if (this.aw != null && this.aB == RefreshState.Loading) {
            this.aw.mo96289a(this, false);
        }
        if (this.f67253b != 0) {
            this.aA.mo96284a(0, true);
        }
        if (this.aB != RefreshState.None) {
            mo96232a(RefreshState.None);
        }
        Handler handler = this.az;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.aJ = false;
    }

    /* renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$2 */
    static /* synthetic */ class C270672 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67280a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.C270672.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$b */
    public class RunnableC27077b implements Runnable {

        /* renamed from: a */
        int f67308a;

        /* renamed from: b */
        int f67309b = 10;

        /* renamed from: c */
        float f67310c;

        /* renamed from: d */
        float f67311d = 0.98f;

        /* renamed from: e */
        long f67312e;

        /* renamed from: f */
        long f67313f = AnimationUtils.currentAnimationTimeMillis();

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
            if (r0.mo96235a(r0.f67231C) != false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
            if (r0.mo96235a(r0.f67231C) != false) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
            if (r10.f67314g.f67253b >= (-r10.f67314g.am)) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
            if (r10.f67314g.f67253b > r10.f67314g.ak) goto L_0x0075;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Runnable mo96281a() {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.RunnableC27077b.mo96281a():java.lang.Runnable");
        }

        public void run() {
            if (SmartRefreshLayout.this.aQ == this && !SmartRefreshLayout.this.aB.isFinishing) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float pow = (float) (((double) this.f67310c) * Math.pow((double) this.f67311d, (double) (((float) (currentAnimationTimeMillis - this.f67312e)) / (1000.0f / ((float) this.f67309b)))));
                this.f67310c = pow;
                float f = pow * ((((float) (currentAnimationTimeMillis - this.f67313f)) * 1.0f) / 1000.0f);
                if (Math.abs(f) > 1.0f) {
                    this.f67313f = currentAnimationTimeMillis;
                    this.f67308a = (int) (((float) this.f67308a) + f);
                    if (SmartRefreshLayout.this.f67253b * this.f67308a > 0) {
                        SmartRefreshLayout.this.aA.mo96284a(this.f67308a, true);
                        SmartRefreshLayout.this.az.postDelayed(this, (long) this.f67309b);
                        return;
                    }
                    SmartRefreshLayout.this.aQ = null;
                    SmartRefreshLayout.this.aA.mo96284a(0, true);
                    animationInterpolatorC27102b.m98452a(SmartRefreshLayout.this.ax.mo96306b(), (int) (-this.f67310c));
                    if (SmartRefreshLayout.this.aJ && f > BitmapDescriptorFactory.HUE_RED) {
                        SmartRefreshLayout.this.aJ = false;
                        return;
                    }
                    return;
                }
                SmartRefreshLayout.this.aQ = null;
            }
        }

        RunnableC27077b(float f) {
            this.f67310c = f;
            this.f67308a = SmartRefreshLayout.this.f67253b;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinishInflate() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onFinishInflate():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.scwang.smart.refresh.layout.SmartRefreshLayout$a */
    public class RunnableC27076a implements Runnable {

        /* renamed from: a */
        int f67301a;

        /* renamed from: b */
        int f67302b = 10;

        /* renamed from: c */
        int f67303c;

        /* renamed from: d */
        long f67304d;

        /* renamed from: e */
        float f67305e;

        /* renamed from: f */
        float f67306f;

        public void run() {
            if (SmartRefreshLayout.this.aQ == this && !SmartRefreshLayout.this.aB.isFinishing) {
                if (Math.abs(SmartRefreshLayout.this.f67253b) < Math.abs(this.f67303c)) {
                    int i = this.f67301a + 1;
                    this.f67301a = i;
                    this.f67306f = (float) (((double) this.f67306f) * Math.pow(0.949999988079071d, (double) (i * 2)));
                } else if (this.f67303c != 0) {
                    int i2 = this.f67301a + 1;
                    this.f67301a = i2;
                    this.f67306f = (float) (((double) this.f67306f) * Math.pow(0.44999998807907104d, (double) (i2 * 2)));
                } else {
                    int i3 = this.f67301a + 1;
                    this.f67301a = i3;
                    this.f67306f = (float) (((double) this.f67306f) * Math.pow(0.8500000238418579d, (double) (i3 * 2)));
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float f = this.f67306f * ((((float) (currentAnimationTimeMillis - this.f67304d)) * 1.0f) / 1000.0f);
                if (Math.abs(f) >= 1.0f) {
                    this.f67304d = currentAnimationTimeMillis;
                    float f2 = this.f67305e + f;
                    this.f67305e = f2;
                    SmartRefreshLayout.this.mo96244c(f2);
                    SmartRefreshLayout.this.az.postDelayed(this, (long) this.f67302b);
                    return;
                }
                if (SmartRefreshLayout.this.aC.isDragging && SmartRefreshLayout.this.aC.isHeader) {
                    SmartRefreshLayout.this.aA.mo96286a(RefreshState.PullDownCanceled);
                } else if (SmartRefreshLayout.this.aC.isDragging && SmartRefreshLayout.this.aC.isFooter) {
                    SmartRefreshLayout.this.aA.mo96286a(RefreshState.PullUpCanceled);
                }
                SmartRefreshLayout.this.aQ = null;
                if (Math.abs(SmartRefreshLayout.this.f67253b) >= Math.abs(this.f67303c)) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.mo96222a(this.f67303c, 0, smartRefreshLayout.f67277z, Math.min(Math.max((int) animationInterpolatorC27102b.m98449a(Math.abs(SmartRefreshLayout.this.f67253b - this.f67303c)), 30), 100) * 10);
                }
            }
        }

        RunnableC27076a(float f, int i) {
            this.f67306f = f;
            this.f67303c = i;
            this.f67304d = AnimationUtils.currentAnimationTimeMillis();
            SmartRefreshLayout.this.az.postDelayed(this, (long) this.f67302b);
            if (f > BitmapDescriptorFactory.HUE_RED) {
                SmartRefreshLayout.this.aA.mo96286a(RefreshState.PullDownToRefresh);
            } else {
                SmartRefreshLayout.this.aA.mo96286a(RefreshState.PullUpToLoad);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        AbstractC27079a aVar;
        AbstractC27087c cVar;
        super.onAttachedToWindow();
        boolean z = true;
        this.aI = true;
        if (!isInEditMode()) {
            if (this.av == null && (cVar = aL) != null) {
                AbstractC27082d a = cVar.mo96312a(getContext(), this);
                if (a != null) {
                    mo96227a(a);
                } else {
                    throw new RuntimeException("DefaultRefreshHeaderCreator can not return null");
                }
            }
            if (this.aw == null) {
                AbstractC27086b bVar = aK;
                if (bVar != null) {
                    AbstractC27081c a2 = bVar.mo96311a(getContext(), this);
                    if (a2 != null) {
                        mo96225a(a2);
                    } else {
                        throw new RuntimeException("DefaultRefreshFooterCreator can not return null");
                    }
                }
            } else {
                if (!this.f67231C && this.f67250V) {
                    z = false;
                }
                this.f67231C = z;
            }
            if (this.ax == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    AbstractC27079a aVar2 = this.av;
                    if ((aVar2 == null || childAt != aVar2.getView()) && ((aVar = this.aw) == null || childAt != aVar.getView())) {
                        this.ax = new C27103a(childAt);
                    }
                }
            }
            if (this.ax == null) {
                int a3 = animationInterpolatorC27102b.m98450a(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(R.string.srl_content_empty);
                super.addView(textView, 0, new LayoutParams(-1, -1));
                C27103a aVar3 = new C27103a(textView);
                this.ax = aVar3;
                aVar3.mo96300a().setPadding(a3, a3, a3, a3);
            }
            View findViewById = findViewById(this.f67268q);
            View findViewById2 = findViewById(this.f67269r);
            this.ax.mo96304a(this.ae);
            this.ax.mo96305a(this.f67244P);
            this.ax.mo96303a(this.aA, findViewById, findViewById2);
            if (this.f67253b != 0) {
                mo96232a(RefreshState.None);
                AbstractC27080b bVar2 = this.ax;
                this.f67253b = 0;
                bVar2.mo96301a(0, this.f67270s, this.f67271t);
            }
        }
        int[] iArr = this.f67229A;
        if (iArr != null) {
            AbstractC27079a aVar4 = this.av;
            if (aVar4 != null) {
                aVar4.setPrimaryColors(iArr);
            }
            AbstractC27079a aVar5 = this.aw;
            if (aVar5 != null) {
                aVar5.setPrimaryColors(this.f67229A);
            }
        }
        AbstractC27080b bVar3 = this.ax;
        if (bVar3 != null) {
            super.bringChildToFront(bVar3.mo96300a());
        }
        AbstractC27079a aVar6 = this.av;
        if (aVar6 != null && aVar6.getSpinnerStyle().f67344h) {
            super.bringChildToFront(this.av.getView());
        }
        AbstractC27079a aVar7 = this.aw;
        if (aVar7 != null && aVar7.getSpinnerStyle().f67344h) {
            super.bringChildToFront(this.aw.getView());
        }
    }

    public static void setDefaultRefreshFooterCreator(AbstractC27086b bVar) {
        aK = bVar;
    }

    public static void setDefaultRefreshHeaderCreator(AbstractC27087c cVar) {
        aL = cVar;
    }

    public static void setDefaultRefreshInitializer(AbstractC27088d dVar) {
        aM = dVar;
    }

    /* renamed from: a */
    public AbstractC27084f mo96229a(AbstractC27090f fVar) {
        this.ad = fVar;
        return this;
    }

    /* renamed from: c */
    public AbstractC27084f mo96243c(boolean z) {
        this.f67230B = z;
        return this;
    }

    /* renamed from: d */
    public AbstractC27084f mo96247d(boolean z) {
        this.f67238J = z;
        return this;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27084f
    /* renamed from: e */
    public AbstractC27084f mo96250e(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    public SmartRefreshLayout(Context context) {
        this(context, null);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f67245Q = z;
        this.f175439ai.mo4693a(z);
    }

    /* renamed from: a */
    public AbstractC27084f mo96225a(AbstractC27081c cVar) {
        return mo96226a(cVar, 0, 0);
    }

    /* renamed from: c */
    public AbstractC27084f mo96242c(int i) {
        return mo96224a(i, true, false);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: b */
    public AbstractC27084f mo96238b(int i) {
        return mo96223a(i, true, Boolean.FALSE);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.aj.mo4708a(view);
        this.ag = false;
        this.af = 0;
        mo96231a();
        this.f175439ai.mo4705c();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        View b = this.ax.mo96306b();
        if ((Build.VERSION.SDK_INT >= 21 || !(b instanceof AbsListView)) && ViewCompat.m4010D(b)) {
            this.f67267p = z;
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: protected */
    public void setViceState(RefreshState refreshState) {
        if (this.aB.isDragging && this.aB.isHeader != refreshState.isHeader) {
            mo96232a(RefreshState.None);
        }
        if (this.aC != refreshState) {
            this.aC = refreshState;
        }
    }

    /* renamed from: b */
    public AbstractC27084f mo96239b(boolean z) {
        this.f67250V = true;
        this.f67231C = z;
        return this;
    }

    /* renamed from: g */
    public AbstractC27084f mo96253g(boolean z) {
        if (z) {
            return mo96223a(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.aD))), (int) LocationRequest.PRIORITY_INDOOR) << 16, true, Boolean.FALSE);
        }
        return mo96223a(0, false, (Boolean) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo96240b(float f) {
        if (this.aR != null) {
            return;
        }
        if (f > BitmapDescriptorFactory.HUE_RED && (this.aB == RefreshState.Refreshing || this.aB == RefreshState.TwoLevel)) {
            this.aQ = new RunnableC27076a(f, this.ak);
        } else if (f < BitmapDescriptorFactory.HUE_RED && (this.aB == RefreshState.Loading || ((this.f67236H && this.f67248T && this.f67249U && mo96235a(this.f67231C)) || (this.f67240L && !this.f67248T && mo96235a(this.f67231C) && this.aB != RefreshState.Refreshing)))) {
            this.aQ = new RunnableC27076a(f, -this.am);
        } else if (this.f67253b == 0 && this.f67238J) {
            this.aQ = new RunnableC27076a(f, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setStateDirectLoading(boolean z) {
        if (this.aB != RefreshState.Loading) {
            this.aD = System.currentTimeMillis();
            this.aJ = true;
            mo96232a(RefreshState.Loading);
            AbstractC27089e eVar = this.ac;
            if (eVar != null) {
                if (z) {
                    eVar.mo96314a(this);
                }
            } else if (this.ad == null) {
                mo96242c(2000);
            }
            AbstractC27079a aVar = this.aw;
            if (aVar != null) {
                int i = this.am;
                aVar.mo96295b(this, i, (int) (this.ar * ((float) i)));
            }
            AbstractC27090f fVar = this.ad;
            if (fVar != null && (this.aw instanceof AbstractC27081c)) {
                if (z) {
                    fVar.mo96314a(this);
                }
                int i2 = this.am;
                this.ad.mo96321b((AbstractC27081c) this.aw, i2, (int) (this.ar * ((float) i2)));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setStateLoading(final boolean z) {
        C270661 r0 = new AnimatorListenerAdapter() {
            /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.C270661 */

            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.setStateDirectLoading(z);
                }
            }
        };
        mo96232a(RefreshState.LoadReleased);
        ValueAnimator a = this.aA.mo96283a(-this.am);
        if (a != null) {
            a.addListener(r0);
        }
        AbstractC27079a aVar = this.aw;
        if (aVar != null) {
            int i = this.am;
            aVar.mo96292a(this, i, (int) (this.ar * ((float) i)));
        }
        AbstractC27090f fVar = this.ad;
        if (fVar != null) {
            AbstractC27079a aVar2 = this.aw;
            if (aVar2 instanceof AbstractC27081c) {
                int i2 = this.am;
                fVar.mo96315a((AbstractC27081c) aVar2, i2, (int) (this.ar * ((float) i2)));
            }
        }
        if (a == null) {
            r0.onAnimationEnd(null);
        }
    }

    /* access modifiers changed from: protected */
    public void setStateRefreshing(final boolean z) {
        C270683 r0 = new AnimatorListenerAdapter() {
            /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.C270683 */

            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.aD = System.currentTimeMillis();
                    SmartRefreshLayout.this.mo96232a(RefreshState.Refreshing);
                    if (SmartRefreshLayout.this.ab != null) {
                        if (z) {
                            SmartRefreshLayout.this.ab.mo96323b(SmartRefreshLayout.this);
                        }
                    } else if (SmartRefreshLayout.this.ad == null) {
                        SmartRefreshLayout.this.mo96238b(3000);
                    }
                    if (SmartRefreshLayout.this.av != null) {
                        AbstractC27079a aVar = SmartRefreshLayout.this.av;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        aVar.mo96295b(smartRefreshLayout, smartRefreshLayout.ak, (int) (SmartRefreshLayout.this.aq * ((float) SmartRefreshLayout.this.ak)));
                    }
                    if (SmartRefreshLayout.this.ad != null && (SmartRefreshLayout.this.av instanceof AbstractC27082d)) {
                        if (z) {
                            SmartRefreshLayout.this.ad.mo96323b(SmartRefreshLayout.this);
                        }
                        SmartRefreshLayout.this.ad.mo96322b((AbstractC27082d) SmartRefreshLayout.this.av, SmartRefreshLayout.this.ak, (int) (SmartRefreshLayout.this.aq * ((float) SmartRefreshLayout.this.ak)));
                    }
                }
            }
        };
        mo96232a(RefreshState.RefreshReleased);
        ValueAnimator a = this.aA.mo96283a(this.ak);
        if (a != null) {
            a.addListener(r0);
        }
        AbstractC27079a aVar = this.av;
        if (aVar != null) {
            int i = this.ak;
            aVar.mo96292a(this, i, (int) (this.aq * ((float) i)));
        }
        AbstractC27090f fVar = this.ad;
        if (fVar != null) {
            AbstractC27079a aVar2 = this.av;
            if (aVar2 instanceof AbstractC27082d) {
                int i2 = this.ak;
                fVar.mo96318a((AbstractC27082d) aVar2, i2, (int) (this.aq * ((float) i2)));
            }
        }
        if (a == null) {
            r0.onAnimationEnd(null);
        }
    }

    /* renamed from: f */
    public AbstractC27084f mo96252f(boolean z) {
        if (this.aB == RefreshState.Refreshing && z) {
            mo96241c();
        } else if (this.aB == RefreshState.Loading && z) {
            mo96246d();
        } else if (this.f67248T != z) {
            this.f67248T = z;
            AbstractC27079a aVar = this.aw;
            if (aVar instanceof AbstractC27081c) {
                if (((AbstractC27081c) aVar).mo96309a(z)) {
                    this.f67249U = true;
                    if (this.f67248T && this.f67236H && this.f67253b > 0 && this.aw.getSpinnerStyle() == C27099b.f67337a && mo96235a(this.f67231C) && mo96236a(this.f67230B, this.av)) {
                        this.aw.getView().setTranslationY((float) this.f67253b);
                    }
                } else {
                    this.f67249U = false;
                    new RuntimeException("Footer:" + this.aw + " NoMoreData is not supported.(不支持NoMoreData，请使用[ClassicsFooter]或者[自定义Footer并实现setNoMoreData方法且返回true])").printStackTrace();
                }
            }
        }
        return this;
    }

    /* renamed from: a */
    public AbstractC27084f mo96227a(AbstractC27082d dVar) {
        return mo96228a(dVar, 0, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo96244c(float f) {
        float f2;
        if (!this.ag || this.f67244P || f >= BitmapDescriptorFactory.HUE_RED || this.ax.mo96308d()) {
            f2 = f;
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if (f2 > ((float) (this.f67258g * 5)) && getTag() == null && getTag(R.id.srl_tag) == null) {
            float f3 = this.f67262k;
            int i = this.f67258g;
            if (f3 < ((float) i) / 6.0f && this.f67261j < ((float) i) / 16.0f) {
                Toast.makeText(getContext(), "你这么死拉，臣妾做不到啊！", 0).show();
                setTag(R.id.srl_tag, "你这么死拉，臣妾做不到啊！");
            }
        }
        if (this.aB == RefreshState.TwoLevel && f2 > BitmapDescriptorFactory.HUE_RED) {
            this.aA.mo96284a(Math.min((int) f2, getMeasuredHeight()), true);
        } else if (this.aB == RefreshState.Refreshing && f2 >= BitmapDescriptorFactory.HUE_RED) {
            int i2 = this.ak;
            if (f2 < ((float) i2)) {
                this.aA.mo96284a((int) f2, true);
            } else {
                double d = (double) ((this.aq - 1.0f) * ((float) i2));
                int max = Math.max((this.f67258g * 4) / 3, getHeight());
                int i3 = this.ak;
                double d2 = (double) (max - i3);
                double max2 = (double) Math.max((float) BitmapDescriptorFactory.HUE_RED, (f2 - ((float) i3)) * this.f67263l);
                double d3 = -max2;
                if (d2 == 0.0d) {
                    d2 = 1.0d;
                }
                this.aA.mo96284a(((int) Math.min(d * (1.0d - Math.pow(100.0d, d3 / d2)), max2)) + this.ak, true);
            }
        } else if (f2 < BitmapDescriptorFactory.HUE_RED && (this.aB == RefreshState.Loading || ((this.f67236H && this.f67248T && this.f67249U && mo96235a(this.f67231C)) || (this.f67240L && !this.f67248T && mo96235a(this.f67231C))))) {
            int i4 = this.am;
            if (f2 > ((float) (-i4))) {
                this.aA.mo96284a((int) f2, true);
            } else {
                double d4 = (double) ((this.ar - 1.0f) * ((float) i4));
                int max3 = Math.max((this.f67258g * 4) / 3, getHeight());
                int i5 = this.am;
                double d5 = (double) (max3 - i5);
                double d6 = (double) (-Math.min((float) BitmapDescriptorFactory.HUE_RED, (((float) i5) + f2) * this.f67263l));
                double d7 = -d6;
                if (d5 == 0.0d) {
                    d5 = 1.0d;
                }
                this.aA.mo96284a(((int) (-Math.min(d4 * (1.0d - Math.pow(100.0d, d7 / d5)), d6))) - this.am, true);
            }
        } else if (f2 >= BitmapDescriptorFactory.HUE_RED) {
            double d8 = (double) (this.aq * ((float) this.ak));
            double max4 = (double) Math.max(this.f67258g / 2, getHeight());
            double max5 = (double) Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f67263l * f2);
            double d9 = -max5;
            if (max4 == 0.0d) {
                max4 = 1.0d;
            }
            this.aA.mo96284a((int) Math.min(d8 * (1.0d - Math.pow(100.0d, d9 / max4)), max5), true);
        } else {
            double d10 = (double) (this.ar * ((float) this.am));
            double max6 = (double) Math.max(this.f67258g / 2, getHeight());
            double d11 = (double) (-Math.min((float) BitmapDescriptorFactory.HUE_RED, this.f67263l * f2));
            double d12 = -d11;
            if (max6 == 0.0d) {
                max6 = 1.0d;
            }
            this.aA.mo96284a((int) (-Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / max6)), d11)), true);
        }
        if (this.f67240L && !this.f67248T && mo96235a(this.f67231C) && f2 < BitmapDescriptorFactory.HUE_RED && this.aB != RefreshState.Refreshing && this.aB != RefreshState.Loading && this.aB != RefreshState.LoadFinish) {
            if (this.f67247S) {
                this.aQ = null;
                this.aA.mo96283a(-this.am);
            }
            setStateDirectLoading(false);
            this.az.postDelayed(new Runnable() {
                /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.RunnableC270716 */

                public void run() {
                    if (SmartRefreshLayout.this.ac != null) {
                        SmartRefreshLayout.this.ac.mo96314a(SmartRefreshLayout.this);
                    } else if (SmartRefreshLayout.this.ad == null) {
                        SmartRefreshLayout.this.mo96242c(2000);
                    }
                    AbstractC27090f fVar = SmartRefreshLayout.this.ad;
                    if (fVar != null) {
                        fVar.mo96314a(SmartRefreshLayout.this);
                    }
                }
            }, (long) this.f67257f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0114, code lost:
        if (r6 != 3) goto L_0x0326;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r23) {
        /*
        // Method dump skipped, instructions count: 886
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public AbstractC27084f mo96230a(AbstractC27091g gVar) {
        this.ab = gVar;
        return this;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f67299a;

        /* renamed from: b */
        public C27099b f67300b;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_srlBackgroundColor, R.attr.layout_srlSpinnerStyle});
            this.f67299a = obtainStyledAttributes.getColor(0, this.f67299a);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f67300b = C27099b.f67342f[obtainStyledAttributes.getInt(1, C27099b.f67337a.f67343g)];
            }
            obtainStyledAttributes.recycle();
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        boolean z2;
        boolean z3;
        C27098a aVar;
        C27098a aVar2;
        this.f67256e = LocationRequest.PRIORITY_INDOOR;
        this.f67257f = LocationRequest.PRIORITY_INDOOR;
        this.f67263l = 0.5f;
        this.f67264m = 'n';
        this.f67268q = -1;
        this.f67269r = -1;
        this.f67270s = -1;
        this.f67271t = -1;
        this.f67230B = true;
        this.f67232D = true;
        this.f67233E = true;
        this.f67234F = true;
        this.f67235G = true;
        this.f67237I = true;
        this.f67238J = true;
        this.f67240L = true;
        this.f67242N = true;
        this.f67243O = true;
        this.f67244P = true;
        this.f67245Q = true;
        this.ah = new int[2];
        this.f175439ai = new C0909k(this);
        this.aj = new C0911m(this);
        this.al = C27098a.f67322a;
        this.an = C27098a.f67322a;
        this.aq = 2.5f;
        this.ar = 2.5f;
        this.as = 1.0f;
        this.at = 1.0f;
        this.au = 0.16666667f;
        this.aA = new C27078c();
        this.aB = RefreshState.None;
        this.aC = RefreshState.None;
        this.aD = 0;
        this.aE = 0;
        this.aF = 0;
        this.aJ = false;
        this.aO = false;
        this.aP = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.az = new Handler(Looper.getMainLooper());
        this.f67275x = new Scroller(context);
        this.f67276y = VelocityTracker.obtain();
        this.f67258g = context.getResources().getDisplayMetrics().heightPixels;
        this.f67277z = new animationInterpolatorC27102b(animationInterpolatorC27102b.f67347a);
        this.f67252a = viewConfiguration.getScaledTouchSlop();
        this.f67272u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f67273v = viewConfiguration.getScaledMaximumFlingVelocity();
        this.am = animationInterpolatorC27102b.m98450a(60.0f);
        this.ak = animationInterpolatorC27102b.m98450a(100.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842986, 16842987, R.attr.srlAccentColor, R.attr.srlDisableContentWhenLoading, R.attr.srlDisableContentWhenRefresh, R.attr.srlDragRate, R.attr.srlEnableAutoLoadMore, R.attr.srlEnableAutoLoadmore, R.attr.srlEnableClipFooterWhenFixedBehind, R.attr.srlEnableClipHeaderWhenFixedBehind, R.attr.srlEnableFooterFollowWhenLoadFinished, R.attr.srlEnableFooterFollowWhenNoMoreData, R.attr.srlEnableFooterTranslationContent, R.attr.srlEnableHeaderTranslationContent, R.attr.srlEnableLoadMore, R.attr.srlEnableLoadMoreWhenContentNotFull, R.attr.srlEnableLoadmore, R.attr.srlEnableLoadmoreWhenContentNotFull, R.attr.srlEnableNestedScrolling, R.attr.srlEnableOverScrollBounce, R.attr.srlEnableOverScrollDrag, R.attr.srlEnablePreviewInEditMode, R.attr.srlEnablePureScrollMode, R.attr.srlEnableRefresh, R.attr.srlEnableScrollContentWhenLoaded, R.attr.srlEnableScrollContentWhenRefreshed, R.attr.srlFixedFooterViewId, R.attr.srlFixedHeaderViewId, R.attr.srlFooterHeight, R.attr.srlFooterInsetStart, R.attr.srlFooterMaxDragRate, R.attr.srlFooterTranslationViewId, R.attr.srlFooterTriggerRate, R.attr.srlHeaderHeight, R.attr.srlHeaderInsetStart, R.attr.srlHeaderMaxDragRate, R.attr.srlHeaderTranslationViewId, R.attr.srlHeaderTriggerRate, R.attr.srlPrimaryColor, R.attr.srlReboundDuration});
        if (!obtainStyledAttributes.hasValue(1)) {
            super.setClipToPadding(false);
        }
        if (!obtainStyledAttributes.hasValue(0)) {
            super.setClipChildren(false);
        }
        AbstractC27088d dVar = aM;
        if (dVar != null) {
            dVar.mo96313a(context, this);
        }
        this.f67263l = obtainStyledAttributes.getFloat(5, this.f67263l);
        this.aq = obtainStyledAttributes.getFloat(35, this.aq);
        this.ar = obtainStyledAttributes.getFloat(30, this.ar);
        this.as = obtainStyledAttributes.getFloat(37, this.as);
        this.at = obtainStyledAttributes.getFloat(32, this.at);
        this.f67230B = obtainStyledAttributes.getBoolean(23, this.f67230B);
        this.f67257f = obtainStyledAttributes.getInt(39, this.f67257f);
        this.f67231C = obtainStyledAttributes.getBoolean(14, this.f67231C);
        this.ak = obtainStyledAttributes.getDimensionPixelOffset(33, this.ak);
        this.am = obtainStyledAttributes.getDimensionPixelOffset(28, this.am);
        this.ao = obtainStyledAttributes.getDimensionPixelOffset(34, this.ao);
        this.ap = obtainStyledAttributes.getDimensionPixelOffset(29, this.ap);
        this.f67246R = obtainStyledAttributes.getBoolean(4, this.f67246R);
        this.f67247S = obtainStyledAttributes.getBoolean(3, this.f67247S);
        this.f67234F = obtainStyledAttributes.getBoolean(13, this.f67234F);
        this.f67235G = obtainStyledAttributes.getBoolean(12, this.f67235G);
        this.f67237I = obtainStyledAttributes.getBoolean(21, this.f67237I);
        this.f67240L = obtainStyledAttributes.getBoolean(6, this.f67240L);
        this.f67238J = obtainStyledAttributes.getBoolean(19, this.f67238J);
        this.f67241M = obtainStyledAttributes.getBoolean(22, this.f67241M);
        this.f67242N = obtainStyledAttributes.getBoolean(24, this.f67242N);
        this.f67243O = obtainStyledAttributes.getBoolean(25, this.f67243O);
        this.f67244P = obtainStyledAttributes.getBoolean(15, this.f67244P);
        boolean z4 = obtainStyledAttributes.getBoolean(10, this.f67236H);
        this.f67236H = z4;
        this.f67236H = obtainStyledAttributes.getBoolean(11, z4);
        this.f67232D = obtainStyledAttributes.getBoolean(9, this.f67232D);
        this.f67233E = obtainStyledAttributes.getBoolean(8, this.f67233E);
        this.f67239K = obtainStyledAttributes.getBoolean(20, this.f67239K);
        this.f67268q = obtainStyledAttributes.getResourceId(27, this.f67268q);
        this.f67269r = obtainStyledAttributes.getResourceId(26, this.f67269r);
        this.f67270s = obtainStyledAttributes.getResourceId(36, this.f67270s);
        this.f67271t = obtainStyledAttributes.getResourceId(31, this.f67271t);
        boolean z5 = obtainStyledAttributes.getBoolean(18, this.f67245Q);
        this.f67245Q = z5;
        this.f175439ai.mo4693a(z5);
        if (this.f67250V || obtainStyledAttributes.hasValue(14)) {
            z = true;
        } else {
            z = false;
        }
        this.f67250V = z;
        if (this.f67251W || obtainStyledAttributes.hasValue(13)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f67251W = z2;
        if (this.aa || obtainStyledAttributes.hasValue(12)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.aa = z3;
        if (obtainStyledAttributes.hasValue(33)) {
            aVar = C27098a.f67328g;
        } else {
            aVar = this.al;
        }
        this.al = aVar;
        if (obtainStyledAttributes.hasValue(28)) {
            aVar2 = C27098a.f67328g;
        } else {
            aVar2 = this.an;
        }
        this.an = aVar2;
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(38, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f67229A = new int[]{color2, color};
            } else {
                this.f67229A = new int[]{color2};
            }
        } else if (color != 0) {
            this.f67229A = new int[]{0, color};
        }
        if (this.f67241M && !this.f67250V && !this.f67231C) {
            this.f67231C = true;
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 798
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.SmartRefreshLayout.onMeasure(int, int):void");
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27084f
    /* renamed from: a */
    public AbstractC27084f mo96223a(int i, final boolean z, final Boolean bool) {
        final int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC270727 r1 = new Runnable() {
            /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.RunnableC270727 */

            /* renamed from: a */
            int f67286a;

            public void run() {
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
                if (this.f67286a == 0) {
                    if (SmartRefreshLayout.this.aB == RefreshState.None && SmartRefreshLayout.this.aC == RefreshState.Refreshing) {
                        SmartRefreshLayout.this.aC = RefreshState.None;
                    } else if (SmartRefreshLayout.this.aR != null && SmartRefreshLayout.this.aB.isHeader && (SmartRefreshLayout.this.aB.isDragging || SmartRefreshLayout.this.aB == RefreshState.RefreshReleased)) {
                        SmartRefreshLayout.this.aR.setDuration(0L);
                        SmartRefreshLayout.this.aR.cancel();
                        SmartRefreshLayout.this.aR = null;
                        if (SmartRefreshLayout.this.aA.mo96283a(0) == null) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.None);
                        } else {
                            SmartRefreshLayout.this.mo96232a(RefreshState.PullDownCanceled);
                        }
                    } else if (!(SmartRefreshLayout.this.aB != RefreshState.Refreshing || SmartRefreshLayout.this.av == null || SmartRefreshLayout.this.ax == null)) {
                        this.f67286a++;
                        SmartRefreshLayout.this.az.postDelayed(this, (long) i2);
                        SmartRefreshLayout.this.mo96232a(RefreshState.RefreshFinish);
                        if (bool == Boolean.FALSE) {
                            SmartRefreshLayout.this.mo96252f(false);
                        }
                    }
                    if (bool == Boolean.TRUE) {
                        SmartRefreshLayout.this.mo96252f(true);
                        return;
                    }
                    return;
                }
                int a = SmartRefreshLayout.this.av.mo96289a(SmartRefreshLayout.this, z);
                if (SmartRefreshLayout.this.ad != null && (SmartRefreshLayout.this.av instanceof AbstractC27082d)) {
                    SmartRefreshLayout.this.ad.mo96319a((AbstractC27082d) SmartRefreshLayout.this.av, z);
                }
                if (a < Integer.MAX_VALUE) {
                    if (SmartRefreshLayout.this.f67265n || SmartRefreshLayout.this.ag) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (SmartRefreshLayout.this.f67265n) {
                            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                            smartRefreshLayout.f67260i = smartRefreshLayout.f67262k;
                            SmartRefreshLayout.this.f67255d = 0;
                            SmartRefreshLayout.this.f67265n = false;
                            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, smartRefreshLayout2.f67261j, (SmartRefreshLayout.this.f67262k + ((float) SmartRefreshLayout.this.f67253b)) - ((float) (SmartRefreshLayout.this.f67252a * 2)), 0));
                            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, smartRefreshLayout3.f67261j, SmartRefreshLayout.this.f67262k + ((float) SmartRefreshLayout.this.f67253b), 0));
                        }
                        if (SmartRefreshLayout.this.ag) {
                            SmartRefreshLayout.this.af = 0;
                            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, smartRefreshLayout4.f67261j, SmartRefreshLayout.this.f67262k, 0));
                            SmartRefreshLayout.this.ag = false;
                            SmartRefreshLayout.this.f67255d = 0;
                        }
                    }
                    if (SmartRefreshLayout.this.f67253b > 0) {
                        SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                        ValueAnimator a2 = smartRefreshLayout5.mo96222a(0, a, smartRefreshLayout5.f67277z, SmartRefreshLayout.this.f67257f);
                        if (SmartRefreshLayout.this.f67243O) {
                            animatorUpdateListener = SmartRefreshLayout.this.ax.mo96299a(SmartRefreshLayout.this.f67253b);
                        }
                        if (a2 != null && animatorUpdateListener != null) {
                            a2.addUpdateListener(animatorUpdateListener);
                        }
                    } else if (SmartRefreshLayout.this.f67253b < 0) {
                        SmartRefreshLayout smartRefreshLayout6 = SmartRefreshLayout.this;
                        smartRefreshLayout6.mo96222a(0, a, smartRefreshLayout6.f67277z, SmartRefreshLayout.this.f67257f);
                    } else {
                        SmartRefreshLayout.this.aA.mo96284a(0, false);
                        SmartRefreshLayout.this.aA.mo96286a(RefreshState.None);
                    }
                }
            }
        };
        if (i3 > 0) {
            this.az.postDelayed(r1, (long) i3);
        } else {
            r1.run();
        }
        return this;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if ((!this.aJ || f2 <= BitmapDescriptorFactory.HUE_RED) && !mo96233a(-f2) && !this.f175439ai.mo4695a(f, f2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.aj.mo4710a(view, view2, i);
        this.f175439ai.mo4704b(i & 2);
        this.af = this.f67253b;
        this.ag = true;
        mo96234a(0);
    }

    /* renamed from: a */
    public AbstractC27084f mo96224a(int i, final boolean z, final boolean z2) {
        final int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        RunnableC270738 r1 = new Runnable() {
            /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.RunnableC270738 */

            /* renamed from: a */
            int f67291a;

            public void run() {
                int i;
                long j;
                int i2;
                boolean z = true;
                if (this.f67291a == 0) {
                    if (SmartRefreshLayout.this.aB == RefreshState.None && SmartRefreshLayout.this.aC == RefreshState.Loading) {
                        SmartRefreshLayout.this.aC = RefreshState.None;
                    } else if (SmartRefreshLayout.this.aR != null && ((SmartRefreshLayout.this.aB.isDragging || SmartRefreshLayout.this.aB == RefreshState.LoadReleased) && SmartRefreshLayout.this.aB.isFooter)) {
                        SmartRefreshLayout.this.aR.setDuration(0L);
                        SmartRefreshLayout.this.aR.cancel();
                        SmartRefreshLayout.this.aR = null;
                        if (SmartRefreshLayout.this.aA.mo96283a(0) == null) {
                            SmartRefreshLayout.this.mo96232a(RefreshState.None);
                        } else {
                            SmartRefreshLayout.this.mo96232a(RefreshState.PullUpCanceled);
                        }
                    } else if (!(SmartRefreshLayout.this.aB != RefreshState.Loading || SmartRefreshLayout.this.aw == null || SmartRefreshLayout.this.ax == null)) {
                        this.f67291a++;
                        SmartRefreshLayout.this.az.postDelayed(this, (long) i2);
                        SmartRefreshLayout.this.mo96232a(RefreshState.LoadFinish);
                        return;
                    }
                    if (z2) {
                        SmartRefreshLayout.this.mo96252f(true);
                        return;
                    }
                    return;
                }
                int a = SmartRefreshLayout.this.aw.mo96289a(SmartRefreshLayout.this, z);
                if (SmartRefreshLayout.this.ad != null && (SmartRefreshLayout.this.aw instanceof AbstractC27081c)) {
                    SmartRefreshLayout.this.ad.mo96316a((AbstractC27081c) SmartRefreshLayout.this.aw, z);
                }
                if (a < Integer.MAX_VALUE) {
                    if (!z2 || !SmartRefreshLayout.this.f67236H || SmartRefreshLayout.this.f67253b >= 0 || !SmartRefreshLayout.this.ax.mo96308d()) {
                        z = false;
                    }
                    int i3 = SmartRefreshLayout.this.f67253b;
                    if (z) {
                        i = Math.max(SmartRefreshLayout.this.f67253b, -SmartRefreshLayout.this.am);
                    } else {
                        i = 0;
                    }
                    final int i4 = i3 - i;
                    if (SmartRefreshLayout.this.f67265n || SmartRefreshLayout.this.ag) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (SmartRefreshLayout.this.f67265n) {
                            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                            smartRefreshLayout.f67260i = smartRefreshLayout.f67262k;
                            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                            smartRefreshLayout2.f67255d = smartRefreshLayout2.f67253b - i4;
                            SmartRefreshLayout.this.f67265n = false;
                            if (SmartRefreshLayout.this.f67235G) {
                                i2 = i4;
                            } else {
                                i2 = 0;
                            }
                            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                            float f = (float) i2;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, smartRefreshLayout3.f67261j, SmartRefreshLayout.this.f67262k + f + ((float) (SmartRefreshLayout.this.f67252a * 2)), 0));
                            SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, smartRefreshLayout4.f67261j, SmartRefreshLayout.this.f67262k + f, 0));
                        }
                        if (SmartRefreshLayout.this.ag) {
                            SmartRefreshLayout.this.af = 0;
                            SmartRefreshLayout smartRefreshLayout5 = SmartRefreshLayout.this;
                            SmartRefreshLayout.super.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 1, smartRefreshLayout5.f67261j, SmartRefreshLayout.this.f67262k, 0));
                            SmartRefreshLayout.this.ag = false;
                            SmartRefreshLayout.this.f67255d = 0;
                        }
                    }
                    Handler handler = SmartRefreshLayout.this.az;
                    RunnableC270741 r3 = new Runnable() {
                        /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.RunnableC270738.RunnableC270741 */

                        public void run() {
                            ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
                            ValueAnimator valueAnimator;
                            if (!SmartRefreshLayout.this.f67242N || i4 >= 0) {
                                animatorUpdateListener = null;
                            } else {
                                animatorUpdateListener = SmartRefreshLayout.this.ax.mo96299a(SmartRefreshLayout.this.f67253b);
                                if (animatorUpdateListener != null) {
                                    animatorUpdateListener.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                                }
                            }
                            C270751 r2 = new AnimatorListenerAdapter() {
                                /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.RunnableC270738.RunnableC270741.C270751 */

                                public void onAnimationEnd(Animator animator) {
                                    if (animator == null || animator.getDuration() != 0) {
                                        SmartRefreshLayout.this.aJ = false;
                                        if (z2) {
                                            SmartRefreshLayout.this.mo96252f(true);
                                        }
                                        if (SmartRefreshLayout.this.aB == RefreshState.LoadFinish) {
                                            SmartRefreshLayout.this.mo96232a(RefreshState.None);
                                        }
                                    }
                                }
                            };
                            if (SmartRefreshLayout.this.f67253b > 0) {
                                valueAnimator = SmartRefreshLayout.this.aA.mo96283a(0);
                            } else {
                                if (animatorUpdateListener != null || SmartRefreshLayout.this.f67253b == 0) {
                                    if (SmartRefreshLayout.this.aR != null) {
                                        SmartRefreshLayout.this.aR.setDuration(0L);
                                        SmartRefreshLayout.this.aR.cancel();
                                        SmartRefreshLayout.this.aR = null;
                                    }
                                    SmartRefreshLayout.this.aA.mo96284a(0, false);
                                    SmartRefreshLayout.this.aA.mo96286a(RefreshState.None);
                                } else if (!z2 || !SmartRefreshLayout.this.f67236H) {
                                    valueAnimator = SmartRefreshLayout.this.aA.mo96283a(0);
                                } else if (SmartRefreshLayout.this.f67253b >= (-SmartRefreshLayout.this.am)) {
                                    SmartRefreshLayout.this.mo96232a(RefreshState.None);
                                } else {
                                    valueAnimator = SmartRefreshLayout.this.aA.mo96283a(-SmartRefreshLayout.this.am);
                                }
                                valueAnimator = null;
                            }
                            if (valueAnimator != null) {
                                valueAnimator.addListener(r2);
                            } else {
                                r2.onAnimationEnd(null);
                            }
                        }
                    };
                    if (SmartRefreshLayout.this.f67253b < 0) {
                        j = (long) a;
                    } else {
                        j = 0;
                    }
                    handler.postDelayed(r3, j);
                }
            }
        };
        if (i3 > 0) {
            this.az.postDelayed(r1, (long) i3);
        } else {
            r1.run();
        }
        return this;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z;
        if (!isEnabled() || !isNestedScrollingEnabled() || (i & 2) == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (!this.f67239K && !this.f67230B && !this.f67231C)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC27084f mo96226a(AbstractC27081c cVar, int i, int i2) {
        boolean z;
        AbstractC27079a aVar;
        AbstractC27079a aVar2 = this.aw;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.aw = cVar;
        this.aJ = false;
        this.aF = 0;
        this.f67249U = false;
        this.aH = false;
        this.an = C27098a.f67322a;
        if (!this.f67250V || this.f67231C) {
            z = true;
        } else {
            z = false;
        }
        this.f67231C = z;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        ViewGroup.LayoutParams layoutParams2 = cVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.aw.getSpinnerStyle().f67344h) {
            super.addView(this.aw.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.aw.getView(), 0, layoutParams);
        }
        int[] iArr = this.f67229A;
        if (!(iArr == null || (aVar = this.aw) == null)) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        View view2;
        Paint paint;
        Paint paint2;
        AbstractC27080b bVar = this.ax;
        if (bVar != null) {
            view2 = bVar.mo96300a();
        } else {
            view2 = null;
        }
        AbstractC27079a aVar = this.av;
        if (aVar != null && aVar.getView() == view) {
            if (!mo96235a(this.f67230B) || (!this.f67237I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int max = Math.max(view2.getTop() + view2.getPaddingTop() + this.f67253b, view.getTop());
                int i = this.aE;
                if (!(i == 0 || (paint2 = this.ay) == null)) {
                    paint2.setColor(i);
                    if (this.av.getSpinnerStyle().f67345i) {
                        max = view.getBottom();
                    } else if (this.av.getSpinnerStyle() == C27099b.f67337a) {
                        max = view.getBottom() + this.f67253b;
                    }
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) view.getTop(), (float) getWidth(), (float) max, this.ay);
                }
                if ((this.f67232D && this.av.getSpinnerStyle() == C27099b.f67339c) || this.av.getSpinnerStyle().f67345i) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), max);
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
            }
        }
        AbstractC27079a aVar2 = this.aw;
        if (aVar2 != null && aVar2.getView() == view) {
            if (!mo96235a(this.f67231C) || (!this.f67237I && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int min = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.f67253b, view.getBottom());
                int i2 = this.aF;
                if (!(i2 == 0 || (paint = this.ay) == null)) {
                    paint.setColor(i2);
                    if (this.aw.getSpinnerStyle().f67345i) {
                        min = view.getTop();
                    } else if (this.aw.getSpinnerStyle() == C27099b.f67337a) {
                        min = view.getTop() + this.f67253b;
                    }
                    canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) min, (float) getWidth(), (float) view.getBottom(), this.ay);
                }
                if ((this.f67233E && this.aw.getSpinnerStyle() == C27099b.f67339c) || this.aw.getSpinnerStyle().f67345i) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), min, view.getRight(), view.getBottom());
                    boolean drawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: a */
    public AbstractC27084f mo96228a(AbstractC27082d dVar, int i, int i2) {
        AbstractC27079a aVar;
        AbstractC27079a aVar2 = this.av;
        if (aVar2 != null) {
            super.removeView(aVar2.getView());
        }
        this.av = dVar;
        this.aE = 0;
        this.aG = false;
        this.al = C27098a.f67322a;
        if (i == 0) {
            i = -1;
        }
        if (i2 == 0) {
            i2 = -2;
        }
        LayoutParams layoutParams = new LayoutParams(i, i2);
        ViewGroup.LayoutParams layoutParams2 = dVar.getView().getLayoutParams();
        if (layoutParams2 instanceof LayoutParams) {
            layoutParams = (LayoutParams) layoutParams2;
        }
        if (this.av.getSpinnerStyle().f67344h) {
            super.addView(this.av.getView(), getChildCount(), layoutParams);
        } else {
            super.addView(this.av.getView(), 0, layoutParams);
        }
        int[] iArr = this.f67229A;
        if (!(iArr == null || (aVar = this.av) == null)) {
            aVar.setPrimaryColors(iArr);
        }
        return this;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.f175439ai.mo4696a(f, f2, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ValueAnimator mo96222a(int i, int i2, Interpolator interpolator, int i3) {
        if (this.f67253b == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.aR;
        if (valueAnimator != null) {
            valueAnimator.setDuration(0L);
            this.aR.cancel();
            this.aR = null;
        }
        this.aQ = null;
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f67253b, i);
        this.aR = ofInt;
        ofInt.setDuration((long) i3);
        this.aR.setInterpolator(interpolator);
        this.aR.addListener(new AnimatorListenerAdapter() {
            /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.C270694 */

            public void onAnimationEnd(Animator animator) {
                if (animator == null || animator.getDuration() != 0) {
                    SmartRefreshLayout.this.aR = null;
                    if (SmartRefreshLayout.this.f67253b == 0 && SmartRefreshLayout.this.aB != RefreshState.None && !SmartRefreshLayout.this.aB.isOpening && !SmartRefreshLayout.this.aB.isDragging) {
                        SmartRefreshLayout.this.mo96232a(RefreshState.None);
                    } else if (SmartRefreshLayout.this.aB != SmartRefreshLayout.this.aC) {
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.setViceState(smartRefreshLayout.aB);
                    }
                }
            }
        });
        this.aR.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smart.refresh.layout.SmartRefreshLayout.C270705 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout.this.aA.mo96284a(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
            }
        });
        this.aR.setStartDelay((long) i2);
        this.aR.start();
        return this.aR;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = this.af;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.af)) {
                int i5 = this.af;
                this.af = 0;
                i4 = i5;
            } else {
                this.af -= i2;
                i4 = i2;
            }
            mo96244c((float) this.af);
        } else if (i2 > 0 && this.aJ) {
            int i6 = i3 - i2;
            this.af = i6;
            mo96244c((float) i6);
            i4 = i2;
        }
        this.f175439ai.mo4701a(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        RefreshState refreshState;
        ViewParent parent;
        AbstractC27094j jVar;
        AbstractC27094j jVar2;
        boolean a = this.f175439ai.mo4699a(i, i2, i3, i4, this.ah);
        int i5 = i4 + this.ah[1];
        if ((i5 < 0 && ((this.f67230B || this.f67239K) && (this.af != 0 || (jVar2 = this.ae) == null || jVar2.mo96325a(this.ax.mo96300a())))) || (i5 > 0 && ((this.f67231C || this.f67239K) && (this.af != 0 || (jVar = this.ae) == null || jVar.mo96326b(this.ax.mo96300a()))))) {
            if (this.aC == RefreshState.None || this.aC.isOpening) {
                AbstractC27083e eVar = this.aA;
                if (i5 > 0) {
                    refreshState = RefreshState.PullUpToLoad;
                } else {
                    refreshState = RefreshState.PullDownToRefresh;
                }
                eVar.mo96286a(refreshState);
                if (!a && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            }
            int i6 = this.af - i5;
            this.af = i6;
            mo96244c((float) i6);
        }
        if (this.aJ && i2 < 0) {
            this.aJ = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = super.getChildAt(i8);
            if (childAt.getVisibility() != 8 && !"GONE".equals(childAt.getTag(R.id.srl_tag))) {
                AbstractC27080b bVar = this.ax;
                boolean z4 = true;
                if (bVar != null && bVar.mo96300a() == childAt) {
                    if (!isInEditMode() || !this.f67237I || !mo96235a(this.f67230B) || this.av == null) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    View a = this.ax.mo96300a();
                    ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams3 = aN;
                    }
                    int i9 = marginLayoutParams3.leftMargin + paddingLeft;
                    int i10 = marginLayoutParams3.topMargin + paddingTop;
                    int measuredWidth = a.getMeasuredWidth() + i9;
                    int measuredHeight = a.getMeasuredHeight() + i10;
                    if (z3 && mo96236a(this.f67234F, this.av)) {
                        int i11 = this.ak;
                        i10 += i11;
                        measuredHeight += i11;
                    }
                    a.layout(i9, i10, measuredWidth, measuredHeight);
                }
                AbstractC27079a aVar = this.av;
                if (aVar != null && aVar.getView() == childAt) {
                    if (!isInEditMode() || !this.f67237I || !mo96235a(this.f67230B)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    View view = this.av.getView();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams2 = aN;
                    }
                    int i12 = marginLayoutParams2.leftMargin;
                    int i13 = marginLayoutParams2.topMargin + this.ao;
                    int measuredWidth2 = view.getMeasuredWidth() + i12;
                    int measuredHeight2 = view.getMeasuredHeight() + i13;
                    if (!z2 && this.av.getSpinnerStyle() == C27099b.f67337a) {
                        int i14 = this.ak;
                        i13 -= i14;
                        measuredHeight2 -= i14;
                    }
                    view.layout(i12, i13, measuredWidth2, measuredHeight2);
                }
                AbstractC27079a aVar2 = this.aw;
                if (aVar2 != null && aVar2.getView() == childAt) {
                    if (!isInEditMode() || !this.f67237I || !mo96235a(this.f67231C)) {
                        z4 = false;
                    }
                    View view2 = this.aw.getView();
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams = aN;
                    }
                    C27099b spinnerStyle = this.aw.getSpinnerStyle();
                    int i15 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (marginLayoutParams.topMargin + getMeasuredHeight()) - this.ap;
                    if (this.f67248T && this.f67249U && this.f67236H && this.ax != null && this.aw.getSpinnerStyle() == C27099b.f67337a && mo96235a(this.f67231C)) {
                        View a2 = this.ax.mo96300a();
                        ViewGroup.LayoutParams layoutParams4 = a2.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i7 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i7 = 0;
                        }
                        measuredHeight3 = a2.getMeasuredHeight() + paddingTop + paddingTop + i7;
                    }
                    if (spinnerStyle == C27099b.f67341e) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.ap;
                    } else {
                        if (z4 || spinnerStyle == C27099b.f67340d || spinnerStyle == C27099b.f67339c) {
                            i5 = this.am;
                        } else if (spinnerStyle.f67345i && this.f67253b < 0) {
                            if (mo96235a(this.f67231C)) {
                                i6 = -this.f67253b;
                            } else {
                                i6 = 0;
                            }
                            i5 = Math.max(i6, 0);
                        }
                        measuredHeight3 -= i5;
                    }
                    view2.layout(i15, measuredHeight3, view2.getMeasuredWidth() + i15, view2.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }
}
