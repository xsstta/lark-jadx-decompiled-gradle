package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import androidx.core.view.C0909k;
import androidx.core.view.C0911m;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.constant.DimensionStatus;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.header.BezierRadarHeader;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27122a;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27123b;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27124c;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27125d;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27126e;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27128g;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27129h;
import com.scwang.smartrefresh.layout.p1234a.AbstractC27130i;
import com.scwang.smartrefresh.layout.p1235b.C27131a;
import com.scwang.smartrefresh.layout.p1235b.C27134b;
import com.scwang.smartrefresh.layout.p1235b.C27135c;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27137a;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27138b;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27139c;
import com.scwang.smartrefresh.layout.p1236c.AbstractC27140d;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import com.scwang.smartrefresh.layout.p1237d.RunnableC27143a;
import com.scwang.smartrefresh.layout.p1237d.animationInterpolatorC27146d;
import com.ss.ttm.player.MediaPlayer;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SmartRefreshLayout extends ViewGroup implements NestedScrollingChild, NestedScrollingParent, AbstractC27129h {
    protected static boolean aF;
    protected static AbstractC27122a aG = new AbstractC27122a() {
        /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.C271061 */

        @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27122a
        /* renamed from: a */
        public AbstractC27125d mo96436a(Context context, AbstractC27129h hVar) {
            return new BallPulseFooter(context);
        }
    };
    protected static AbstractC27123b aH = new AbstractC27123b() {
        /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.C271187 */

        @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27123b
        /* renamed from: a */
        public AbstractC27126e mo96455a(Context context, AbstractC27129h hVar) {
            return new BezierRadarHeader(context);
        }
    };

    /* renamed from: A */
    protected boolean f67362A;

    /* renamed from: B */
    protected boolean f67363B;

    /* renamed from: C */
    protected boolean f67364C;

    /* renamed from: D */
    protected boolean f67365D;

    /* renamed from: E */
    protected boolean f67366E;

    /* renamed from: F */
    protected boolean f67367F;

    /* renamed from: G */
    protected boolean f67368G;

    /* renamed from: H */
    protected boolean f67369H;

    /* renamed from: I */
    protected boolean f67370I;

    /* renamed from: J */
    protected boolean f67371J;

    /* renamed from: K */
    protected boolean f67372K;

    /* renamed from: L */
    protected boolean f67373L;

    /* renamed from: M */
    protected boolean f67374M;

    /* renamed from: N */
    protected boolean f67375N;

    /* renamed from: O */
    protected boolean f67376O;

    /* renamed from: P */
    protected boolean f67377P;

    /* renamed from: Q */
    protected boolean f67378Q;

    /* renamed from: R */
    protected AbstractC27139c f67379R;

    /* renamed from: S */
    protected AbstractC27137a f67380S;

    /* renamed from: T */
    protected AbstractC27138b f67381T;

    /* renamed from: U */
    protected AbstractC27130i f67382U;

    /* renamed from: V */
    protected int[] f67383V;

    /* renamed from: W */
    protected int[] f67384W;

    /* renamed from: a */
    protected int f67385a;
    protected int aA;
    protected int aB;
    protected boolean aC;
    protected boolean aD;
    protected boolean aE;
    MotionEvent aI;
    protected ValueAnimator aJ;
    protected Animator.AnimatorListener aK;
    protected ValueAnimator.AnimatorUpdateListener aL;
    protected int aa;
    protected boolean ab;
    protected C0909k ac;
    protected C0911m ad;
    protected int ae;
    protected DimensionStatus af;
    protected int ag;
    protected DimensionStatus ah;

    /* renamed from: ai  reason: collision with root package name */
    protected int f175440ai;
    protected int aj;
    protected float ak;
    protected float al;
    protected float am;
    protected float an;
    protected AbstractC27126e ao;
    protected AbstractC27125d ap;
    protected AbstractC27124c aq;
    protected Paint ar;
    protected Handler as;
    protected AbstractC27128g at;
    protected List<RunnableC27143a> au;
    protected RefreshState av;
    protected RefreshState aw;
    protected boolean ax;
    protected long ay;
    protected long az;

    /* renamed from: b */
    protected int f67386b;

    /* renamed from: c */
    protected int f67387c;

    /* renamed from: d */
    protected int f67388d;

    /* renamed from: e */
    protected int f67389e;

    /* renamed from: f */
    protected int f67390f;

    /* renamed from: g */
    protected int f67391g;

    /* renamed from: h */
    protected float f67392h;

    /* renamed from: i */
    protected float f67393i;

    /* renamed from: j */
    protected float f67394j;

    /* renamed from: k */
    protected float f67395k;

    /* renamed from: l */
    protected float f67396l;

    /* renamed from: m */
    protected boolean f67397m;

    /* renamed from: n */
    protected boolean f67398n;

    /* renamed from: o */
    protected boolean f67399o;

    /* renamed from: p */
    protected boolean f67400p;

    /* renamed from: q */
    protected Interpolator f67401q;

    /* renamed from: r */
    protected int f67402r;

    /* renamed from: s */
    protected int f67403s;

    /* renamed from: t */
    protected int f67404t;

    /* renamed from: u */
    protected int f67405u;

    /* renamed from: v */
    protected Scroller f67406v;

    /* renamed from: w */
    protected VelocityTracker f67407w;

    /* renamed from: x */
    protected int[] f67408x;

    /* renamed from: y */
    protected boolean f67409y;

    /* renamed from: z */
    protected boolean f67410z;

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27129h
    public SmartRefreshLayout getLayout() {
        return this;
    }

    /* renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$a */
    public class C27121a implements AbstractC27128g {
        @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27128g
        /* renamed from: a */
        public AbstractC27129h mo96459a() {
            return SmartRefreshLayout.this;
        }

        @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27128g
        /* renamed from: b */
        public AbstractC27128g mo96460b() {
            if (SmartRefreshLayout.this.av == RefreshState.TwoLevel) {
                SmartRefreshLayout.this.mo96358a(RefreshState.TwoLevelFinish);
                if (SmartRefreshLayout.this.f67386b == 0) {
                    mo96457a(0, true);
                    SmartRefreshLayout.this.mo96358a(RefreshState.None);
                } else {
                    SmartRefreshLayout.this.mo96362b(0).setDuration((long) SmartRefreshLayout.this.f67389e);
                }
            }
            return this;
        }

        public C27121a() {
        }

        @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27128g
        /* renamed from: a */
        public AbstractC27128g mo96456a(int i) {
            if (SmartRefreshLayout.this.ar == null && i != 0) {
                SmartRefreshLayout.this.ar = new Paint();
            }
            SmartRefreshLayout.this.aA = i;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27128g
        /* renamed from: b */
        public AbstractC27128g mo96461b(int i) {
            if (SmartRefreshLayout.this.ar == null && i != 0) {
                SmartRefreshLayout.this.ar = new Paint();
            }
            SmartRefreshLayout.this.aB = i;
            return this;
        }

        @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27128g
        /* renamed from: a */
        public AbstractC27128g mo96458a(RefreshState refreshState) {
            switch (C271176.f67434a[refreshState.ordinal()]) {
                case 1:
                    SmartRefreshLayout.this.mo96409j();
                    return null;
                case 2:
                    SmartRefreshLayout.this.mo96389f();
                    return null;
                case 3:
                    SmartRefreshLayout.this.mo96355a();
                    return null;
                case 4:
                    SmartRefreshLayout.this.mo96381d();
                    return null;
                case 5:
                    SmartRefreshLayout.this.mo96376c();
                    return null;
                case 6:
                    SmartRefreshLayout.this.mo96386e();
                    return null;
                case 7:
                    SmartRefreshLayout.this.mo96370b();
                    return null;
                case 8:
                    if (SmartRefreshLayout.this.av.opening || !SmartRefreshLayout.this.mo96433v()) {
                        SmartRefreshLayout.this.setViceState(RefreshState.ReleaseToTwoLevel);
                        return null;
                    }
                    SmartRefreshLayout.this.mo96358a(RefreshState.ReleaseToTwoLevel);
                    return null;
                case 9:
                    if (SmartRefreshLayout.this.av.opening || !SmartRefreshLayout.this.mo96433v()) {
                        SmartRefreshLayout.this.setViceState(RefreshState.RefreshReleased);
                        return null;
                    }
                    SmartRefreshLayout.this.mo96358a(RefreshState.RefreshReleased);
                    return null;
                case 10:
                    if (SmartRefreshLayout.this.av.opening || !SmartRefreshLayout.this.mo96432u()) {
                        SmartRefreshLayout.this.setViceState(RefreshState.LoadReleased);
                        return null;
                    }
                    SmartRefreshLayout.this.mo96358a(RefreshState.LoadReleased);
                    return null;
                case 11:
                    SmartRefreshLayout.this.mo96406i();
                    return null;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    SmartRefreshLayout.this.mo96402h();
                    return null;
                case 13:
                    if (SmartRefreshLayout.this.av != RefreshState.Refreshing) {
                        return null;
                    }
                    SmartRefreshLayout.this.mo96358a(RefreshState.RefreshFinish);
                    return null;
                case 14:
                    if (SmartRefreshLayout.this.av != RefreshState.Loading) {
                        return null;
                    }
                    SmartRefreshLayout.this.mo96358a(RefreshState.LoadFinish);
                    return null;
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public AbstractC27128g mo96457a(int i, boolean z) {
            SmartRefreshLayout.this.mo96357a(i, z);
            return this;
        }
    }

    public AbstractC27125d getRefreshFooter() {
        return this.ap;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27129h
    public AbstractC27126e getRefreshHeader() {
        return this.ao;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27129h
    public RefreshState getState() {
        return this.av;
    }

    /* access modifiers changed from: protected */
    public RefreshState getViceState() {
        return this.aw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo96361a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            float f = -this.f67407w.getYVelocity();
            if (Math.abs(f) > ((float) this.f67404t) && this.f67386b == 0 && this.f67388d == 0) {
                this.ax = false;
                this.f67406v.fling(0, getScrollY(), 0, (int) f, 0, 0, -2147483647, Integer.MAX_VALUE);
                this.f67406v.computeScrollOffset();
                invalidate();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo96359a(int i) {
        if (this.aJ == null || i != 0 || this.av.finishing) {
            return false;
        }
        if (this.av == RefreshState.PullDownCanceled) {
            mo96389f();
        } else if (this.av == RefreshState.PullUpCanceled) {
            mo96355a();
        }
        this.aJ.cancel();
        this.aJ = null;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96358a(RefreshState refreshState) {
        RefreshState refreshState2 = this.av;
        if (refreshState2 != refreshState) {
            this.av = refreshState;
            this.aw = refreshState;
            AbstractC27125d dVar = this.ap;
            if (dVar != null) {
                dVar.mo30300a(this, refreshState2, refreshState);
            }
            AbstractC27126e eVar = this.ao;
            if (eVar != null) {
                eVar.mo30300a(this, refreshState2, refreshState);
            }
            AbstractC27138b bVar = this.f67381T;
            if (bVar != null) {
                bVar.mo30300a(this, refreshState2, refreshState);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96355a() {
        if (!mo96432u() || this.f67375N || this.av.opening || this.av.finishing) {
            setViceState(RefreshState.PullToUpLoad);
        } else {
            mo96358a(RefreshState.PullToUpLoad);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96356a(float f) {
        if (this.av == RefreshState.TwoLevel && f > BitmapDescriptorFactory.HUE_RED) {
            mo96357a(Math.min((int) f, getMeasuredHeight()), false);
        } else if (this.av != RefreshState.Refreshing || f < BitmapDescriptorFactory.HUE_RED) {
            if (f >= BitmapDescriptorFactory.HUE_RED || (this.av != RefreshState.Loading && ((!this.f67364C || !this.f67375N) && (!this.f67368G || !mo96432u() || this.f67375N)))) {
                if (f >= BitmapDescriptorFactory.HUE_RED) {
                    double max = (double) Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f67396l * f);
                    mo96357a((int) Math.min(((double) (this.f175440ai + this.ae)) * (1.0d - Math.pow(100.0d, (-max) / ((double) Math.max(this.f67391g / 2, getHeight())))), max), false);
                } else {
                    double d = (double) (-Math.min((float) BitmapDescriptorFactory.HUE_RED, this.f67396l * f));
                    mo96357a((int) (-Math.min(((double) (this.aj + this.ag)) * (1.0d - Math.pow(100.0d, (-d) / ((double) Math.max(this.f67391g / 2, getHeight())))), d)), false);
                }
            } else if (f > ((float) (-this.ag))) {
                mo96357a((int) f, false);
            } else {
                int max2 = Math.max((this.f67391g * 4) / 3, getHeight());
                int i = this.ag;
                double d2 = (double) (max2 - i);
                double d3 = (double) (-Math.min((float) BitmapDescriptorFactory.HUE_RED, (((float) i) + f) * this.f67396l));
                mo96357a(((int) (-Math.min(((double) this.aj) * (1.0d - Math.pow(100.0d, (-d3) / d2)), d3))) - this.ag, false);
            }
        } else if (f < ((float) this.ae)) {
            mo96357a((int) f, false);
        } else {
            int max3 = Math.max((this.f67391g * 4) / 3, getHeight());
            int i2 = this.ae;
            double d4 = (double) (max3 - i2);
            double max4 = (double) Math.max((float) BitmapDescriptorFactory.HUE_RED, (f - ((float) i2)) * this.f67396l);
            mo96357a(((int) Math.min(((double) this.f175440ai) * (1.0d - Math.pow(100.0d, (-max4) / d4)), max4)) + this.ae, false);
        }
        if (this.f67368G && mo96432u() && f < BitmapDescriptorFactory.HUE_RED && this.av != RefreshState.Refreshing && this.av != RefreshState.Loading && this.av != RefreshState.LoadFinish && !this.f67375N) {
            mo96391g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96357a(int i, boolean z) {
        AbstractC27138b bVar;
        AbstractC27138b bVar2;
        AbstractC27125d dVar;
        AbstractC27126e eVar;
        AbstractC27126e eVar2;
        AbstractC27125d dVar2;
        if (this.f67386b != i || (((eVar2 = this.ao) != null && eVar2.mo30301a()) || ((dVar2 = this.ap) != null && dVar2.mo30301a()))) {
            int i2 = this.f67386b;
            this.f67386b = i;
            if (!z && getViceState().draging) {
                int i3 = this.f67386b;
                if (((float) i3) > ((float) this.ae) * this.am) {
                    if (this.av != RefreshState.ReleaseToTwoLevel) {
                        mo96386e();
                    }
                } else if (((float) (-i3)) > ((float) this.ag) * this.an && !this.f67375N) {
                    mo96370b();
                } else if (i3 < 0 && !this.f67375N) {
                    mo96355a();
                } else if (i3 > 0) {
                    mo96389f();
                }
            }
            if (this.aq != null) {
                Integer num = null;
                if (i >= 0) {
                    if (this.f67362A || (eVar = this.ao) == null || eVar.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                        num = Integer.valueOf(i);
                    } else if (i2 < 0) {
                        num = 0;
                    }
                }
                if (i <= 0) {
                    if (this.f67363B || (dVar = this.ap) == null || dVar.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                        num = Integer.valueOf(i);
                    } else if (i2 > 0) {
                        num = 0;
                    }
                }
                if (num != null) {
                    this.aq.mo96462a(num.intValue());
                    if ((this.aA != 0 && (num.intValue() >= 0 || i2 > 0)) || (this.aB != 0 && (num.intValue() <= 0 || i2 < 0))) {
                        invalidate();
                    }
                }
            }
            if ((i >= 0 || i2 > 0) && this.ao != null) {
                int max = Math.max(i, 0);
                int i4 = this.ae;
                int i5 = this.f175440ai;
                float f = (((float) max) * 1.0f) / ((float) i4);
                if (mo96433v() || (this.av == RefreshState.RefreshFinish && z)) {
                    if (i2 != this.f67386b) {
                        if (this.ao.getSpinnerStyle() == SpinnerStyle.Translate) {
                            this.ao.getView().setTranslationY((float) this.f67386b);
                        } else if (this.ao.getSpinnerStyle() == SpinnerStyle.Scale) {
                            this.ao.getView().requestLayout();
                        }
                        if (z) {
                            this.ao.b_(f, max, i4, i5);
                        }
                    }
                    if (!z) {
                        if (this.ao.mo30301a()) {
                            int width = getWidth();
                            this.ao.mo30298a(this.f67394j / ((float) width), (int) this.f67394j, width);
                            this.ao.a_(f, max, i4, i5);
                        } else if (i2 != this.f67386b) {
                            this.ao.a_(f, max, i4, i5);
                        }
                    }
                }
                if (!(i2 == this.f67386b || (bVar2 = this.f67381T) == null)) {
                    if (z) {
                        bVar2.mo96497b(this.ao, f, max, i4, i5);
                    } else {
                        bVar2.mo96494a(this.ao, f, max, i4, i5);
                    }
                }
            }
            if ((i <= 0 || i2 < 0) && this.ap != null) {
                int i6 = -Math.min(i, 0);
                int i7 = this.ag;
                int i8 = this.aj;
                float f2 = (((float) i6) * 1.0f) / ((float) i7);
                if (mo96432u() || (this.av == RefreshState.LoadFinish && z)) {
                    if (i2 != this.f67386b) {
                        if (this.ap.getSpinnerStyle() == SpinnerStyle.Translate) {
                            this.ap.getView().setTranslationY((float) this.f67386b);
                        } else if (this.ap.getSpinnerStyle() == SpinnerStyle.Scale) {
                            this.ap.getView().requestLayout();
                        }
                        if (z) {
                            this.ap.mo30336a(f2, i6, i7, i8);
                        }
                    }
                    if (!z) {
                        if (this.ap.mo30301a()) {
                            int width2 = getWidth();
                            this.ap.mo30298a(this.f67394j / ((float) width2), (int) this.f67394j, width2);
                            this.ap.mo30339b(f2, i6, i7, i8);
                        } else if (i2 != this.f67386b) {
                            this.ap.mo30339b(f2, i6, i7, i8);
                        }
                    }
                }
                if (i2 != this.f67386b && (bVar = this.f67381T) != null) {
                    if (z) {
                        bVar.mo96495b(this.ap, f2, i6, i7, i8);
                    } else {
                        bVar.mo96491a(this.ap, f2, i6, i7, i8);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96415m(boolean z) {
        this.f67376O = true;
        this.f67410z = z;
        return this;
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96346a(AbstractC27126e eVar, int i, int i2) {
        if (eVar != null) {
            AbstractC27126e eVar2 = this.ao;
            if (eVar2 != null) {
                removeView(eVar2.getView());
            }
            this.ao = eVar;
            this.af = this.af.unNotify();
            if (eVar.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                addView(this.ao.getView(), 0, new LayoutParams(i, i2));
            } else {
                addView(this.ao.getView(), i, i2);
            }
        }
        return this;
    }

    /* renamed from: a */
    public AbstractC27129h mo96352a(View view) {
        return mo96353a(view, -1, -1);
    }

    /* renamed from: a */
    public AbstractC27129h mo96353a(View view, int i, int i2) {
        if (view != null) {
            AbstractC27124c cVar = this.aq;
            if (cVar != null) {
                removeView(cVar.mo96476e());
            }
            addView(view, 0, new LayoutParams(i, i2));
            AbstractC27126e eVar = this.ao;
            if (eVar == null || eVar.getSpinnerStyle() != SpinnerStyle.FixedBehind) {
                AbstractC27125d dVar = this.ap;
                if (dVar != null && dVar.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                    bringChildToFront(view);
                    AbstractC27126e eVar2 = this.ao;
                    if (eVar2 != null && eVar2.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                        bringChildToFront(this.ao.getView());
                    }
                }
            } else {
                bringChildToFront(view);
                AbstractC27125d dVar2 = this.ap;
                if (!(dVar2 == null || dVar2.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                    bringChildToFront(this.ap.getView());
                }
            }
            this.aq = new C27131a(view);
            if (this.as != null) {
                int i3 = this.f67402r;
                View view2 = null;
                View findViewById = i3 > 0 ? findViewById(i3) : null;
                int i4 = this.f67403s;
                if (i4 > 0) {
                    view2 = findViewById(i4);
                }
                this.aq.mo96467a(this.f67382U);
                this.aq.mo96468a(this.f67372K);
                this.aq.mo96466a(this.at, findViewById, view2);
            }
        }
        return this;
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96369b(AbstractC27139c cVar) {
        this.f67379R = cVar;
        return this;
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96368b(AbstractC27137a aVar) {
        this.f67380S = aVar;
        this.f67410z = this.f67410z || (!this.f67376O && aVar != null);
        return this;
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96350a(AbstractC27140d dVar) {
        this.f67379R = dVar;
        this.f67380S = dVar;
        this.f67410z = this.f67410z || (!this.f67376O && dVar != null);
        return this;
    }

    /* renamed from: a */
    public AbstractC27129h mo96354a(AbstractC27130i iVar) {
        this.f67382U = iVar;
        AbstractC27124c cVar = this.aq;
        if (cVar != null) {
            cVar.mo96467a(iVar);
        }
        return this;
    }

    /* renamed from: a */
    public boolean mo96360a(int i, final int i2, final float f) {
        if (this.av != RefreshState.None || !mo96433v()) {
            return false;
        }
        ValueAnimator valueAnimator = this.aJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        RunnableC271114 r0 = new Runnable() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271114 */

            public void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.aJ = ValueAnimator.ofInt(smartRefreshLayout.f67386b, (int) (((float) SmartRefreshLayout.this.ae) * f));
                SmartRefreshLayout.this.aJ.setDuration((long) i2);
                SmartRefreshLayout.this.aJ.setInterpolator(new DecelerateInterpolator());
                SmartRefreshLayout.this.aJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271114.C271121 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SmartRefreshLayout.this.mo96357a(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
                    }
                });
                SmartRefreshLayout.this.aJ.addListener(new AnimatorListenerAdapter() {
                    /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271114.C271132 */

                    public void onAnimationEnd(Animator animator) {
                        SmartRefreshLayout.this.aJ = null;
                        if (SmartRefreshLayout.this.av != RefreshState.ReleaseToRefresh) {
                            SmartRefreshLayout.this.mo96386e();
                        }
                        SmartRefreshLayout.this.mo96411k();
                    }

                    public void onAnimationStart(Animator animator) {
                        SmartRefreshLayout.this.f67394j = (float) (SmartRefreshLayout.this.getMeasuredWidth() / 2);
                        SmartRefreshLayout.this.mo96389f();
                    }
                });
                SmartRefreshLayout.this.aJ.start();
            }
        };
        if (i > 0) {
            this.aJ = new ValueAnimator();
            postDelayed(r0, (long) i);
            return true;
        }
        r0.run();
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.ad.mo4707a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.ac.mo4703b();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.ac.mo4694a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: p */
    public SmartRefreshLayout mo96434w() {
        mo96401h(false);
        return this;
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.ac.mo4705c();
    }

    /* renamed from: t */
    public boolean mo96431t() {
        return mo96403h(0);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27129h
    /* renamed from: q */
    public boolean mo96426q() {
        if (this.av == RefreshState.Refreshing) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo96427r() {
        if (this.av == RefreshState.Loading) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo96429s() {
        int i;
        if (this.as == null) {
            i = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        } else {
            i = 0;
        }
        return mo96392g(i);
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27129h
    /* renamed from: u */
    public boolean mo96432u() {
        if (!this.f67410z || this.f67369H) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public boolean mo96433v() {
        if (!this.f67409y || this.f67369H) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo96376c() {
        if (!mo96432u() || this.f67375N || this.av.opening) {
            setViceState(RefreshState.PullUpCanceled);
            return;
        }
        mo96358a(RefreshState.PullUpCanceled);
        mo96409j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo96381d() {
        if (this.av.opening || !mo96433v()) {
            setViceState(RefreshState.PullDownCanceled);
            return;
        }
        mo96358a(RefreshState.PullDownCanceled);
        mo96409j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo96386e() {
        if (this.av.opening || !mo96433v()) {
            setViceState(RefreshState.ReleaseToRefresh);
        } else {
            mo96358a(RefreshState.ReleaseToRefresh);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo96389f() {
        if (this.av.opening || !mo96433v()) {
            setViceState(RefreshState.PullDownToRefresh);
        } else {
            mo96358a(RefreshState.PullDownToRefresh);
        }
    }

    /* renamed from: m */
    public SmartRefreshLayout mo96435x() {
        return mo96408j(Math.max(0, 1000 - ((int) (System.currentTimeMillis() - this.az))));
    }

    /* renamed from: n */
    public SmartRefreshLayout mo96416n() {
        return mo96405i(Math.max(0, 1000 - ((int) (System.currentTimeMillis() - this.ay))));
    }

    /* renamed from: o */
    public SmartRefreshLayout mo96417o() {
        return mo96366b(Math.max(0, 1000 - ((int) (System.currentTimeMillis() - this.ay))), true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo96406i() {
        AnonymousClass11 r0 = new AnimatorListenerAdapter() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass11 */

            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout.this.az = System.currentTimeMillis();
                SmartRefreshLayout.this.mo96358a(RefreshState.Refreshing);
                if (SmartRefreshLayout.this.f67379R != null) {
                    SmartRefreshLayout.this.f67379R.onRefresh(SmartRefreshLayout.this);
                }
                if (SmartRefreshLayout.this.ao != null) {
                    AbstractC27126e eVar = SmartRefreshLayout.this.ao;
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    eVar.mo30304b(smartRefreshLayout, smartRefreshLayout.ae, SmartRefreshLayout.this.f175440ai);
                }
                if (SmartRefreshLayout.this.f67381T != null) {
                    SmartRefreshLayout.this.f67381T.onRefresh(SmartRefreshLayout.this);
                    SmartRefreshLayout.this.f67381T.mo33950b(SmartRefreshLayout.this.ao, SmartRefreshLayout.this.ae, SmartRefreshLayout.this.f175440ai);
                }
            }
        };
        mo96358a(RefreshState.RefreshReleased);
        ValueAnimator b = mo96362b(this.ae);
        if (b != null) {
            b.addListener(r0);
        }
        AbstractC27126e eVar = this.ao;
        if (eVar != null) {
            eVar.a_(this, this.ae, this.f175440ai);
        }
        AbstractC27138b bVar = this.f67381T;
        if (bVar != null) {
            bVar.mo33948a(this.ao, this.ae, this.f175440ai);
        }
        if (b == null) {
            r0.onAnimationEnd(null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo96409j() {
        if (this.av != RefreshState.None && this.f67386b == 0) {
            mo96358a(RefreshState.None);
        }
        if (this.f67386b != 0) {
            mo96362b(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo96357a(0, false);
        mo96358a(RefreshState.None);
        this.as.removeCallbacksAndMessages(null);
        this.as = null;
        this.f67376O = true;
        this.f67377P = true;
        ValueAnimator valueAnimator = this.aJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.aJ = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo96391g() {
        if (this.av != RefreshState.Loading) {
            this.ay = System.currentTimeMillis();
            if (this.av != RefreshState.LoadReleased) {
                if (this.av != RefreshState.ReleaseToLoad) {
                    if (this.av != RefreshState.PullToUpLoad) {
                        mo96355a();
                    }
                    mo96370b();
                }
                mo96358a(RefreshState.LoadReleased);
                AbstractC27125d dVar = this.ap;
                if (dVar != null) {
                    dVar.mo30337a(this, this.ag, this.aj);
                }
            }
            mo96358a(RefreshState.Loading);
            this.aE = true;
            AbstractC27125d dVar2 = this.ap;
            if (dVar2 != null) {
                dVar2.mo30304b(this, this.ag, this.aj);
            }
            AbstractC27137a aVar = this.f67380S;
            if (aVar != null) {
                aVar.onLoadmore(this);
            }
            AbstractC27138b bVar = this.f67381T;
            if (bVar != null) {
                bVar.onLoadmore(this);
                this.f67381T.mo96496b(this.ap, this.ag, this.aj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo96402h() {
        AnonymousClass10 r0 = new AnimatorListenerAdapter() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass10 */

            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout.this.mo96391g();
            }
        };
        mo96358a(RefreshState.LoadReleased);
        ValueAnimator b = mo96362b(-this.ag);
        if (b != null) {
            b.addListener(r0);
        }
        AbstractC27125d dVar = this.ap;
        if (dVar != null) {
            dVar.mo30337a(this, this.ag, this.aj);
        }
        AbstractC27138b bVar = this.f67381T;
        if (bVar != null) {
            bVar.mo96492a(this.ap, this.ag, this.aj);
        }
        if (b == null) {
            r0.onAnimationEnd(null);
        }
    }

    /* renamed from: com.scwang.smartrefresh.layout.SmartRefreshLayout$6 */
    static /* synthetic */ class C271176 {

        /* renamed from: a */
        static final /* synthetic */ int[] f67434a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 169
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.SmartRefreshLayout.C271176.<clinit>():void");
        }
    }

    public void computeScroll() {
        int i;
        int currY = this.f67406v.getCurrY();
        if (this.f67406v.computeScrollOffset()) {
            int finalY = this.f67406v.getFinalY();
            if ((finalY <= 0 || !this.aq.mo96472b()) && (finalY >= 0 || !this.aq.mo96469a())) {
                this.ax = true;
                invalidate();
                return;
            }
            if (this.ax) {
                if (Build.VERSION.SDK_INT >= 14) {
                    i = (int) this.f67406v.getCurrVelocity();
                } else {
                    i = (finalY - this.f67406v.getCurrY()) / (this.f67406v.getDuration() - this.f67406v.timePassed());
                }
                AnimationUtils.currentAnimationTimeMillis();
                int abs = (Math.abs(this.f67406v.getCurrY() - currY) * 1000) / i;
                if (finalY > 0) {
                    if (mo96432u() || this.f67367F) {
                        if (this.f67368G && mo96432u() && !this.f67375N) {
                            mo96372c(-((int) (((double) this.ag) * Math.pow((((double) i) * 1.0d) / ((double) this.f67405u), 0.5d))));
                            if (!(this.av.opening || this.av == RefreshState.Loading || this.av == RefreshState.LoadFinish)) {
                                mo96391g();
                            }
                        } else if (this.f67366E) {
                            mo96372c(-((int) (((double) this.ag) * Math.pow((((double) i) * 1.0d) / ((double) this.f67405u), 0.5d))));
                        }
                    }
                } else if ((mo96433v() || this.f67367F) && this.f67366E) {
                    mo96372c((int) (((double) this.ae) * Math.pow((((double) i) * 1.0d) / ((double) this.f67405u), 0.5d)));
                }
                this.ax = false;
            }
            this.f67406v.forceFinished(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo96411k() {
        if (this.av == RefreshState.TwoLevel) {
            if (this.f67407w.getYVelocity() > -1000.0f && this.f67386b > getMeasuredHeight() / 2) {
                ValueAnimator b = mo96362b(getMeasuredHeight());
                if (b != null) {
                    b.setDuration((long) this.f67389e);
                }
            } else if (this.f67397m) {
                this.at.mo96460b();
            }
            return this.f67397m;
        } else if (this.av == RefreshState.Loading || ((this.f67368G && mo96432u() && !this.f67375N && this.f67386b < 0 && this.av != RefreshState.Refreshing) || (this.f67364C && this.f67375N && this.f67386b < 0))) {
            int i = this.f67386b;
            int i2 = this.ag;
            if (i < (-i2)) {
                this.aa = -i2;
                mo96362b(-i2);
                return true;
            } else if (i <= 0) {
                return false;
            } else {
                this.aa = 0;
                mo96362b(0);
                return true;
            }
        } else if (this.av == RefreshState.Refreshing) {
            int i3 = this.f67386b;
            int i4 = this.ae;
            if (i3 > i4) {
                this.aa = i4;
                mo96362b(i4);
                return true;
            } else if (i3 >= 0) {
                return false;
            } else {
                this.aa = 0;
                mo96362b(0);
                return true;
            }
        } else if (this.av == RefreshState.PullDownToRefresh) {
            mo96381d();
            return true;
        } else if (this.av == RefreshState.PullToUpLoad) {
            mo96376c();
            return true;
        } else if (this.av == RefreshState.ReleaseToRefresh) {
            mo96406i();
            return true;
        } else if (this.av == RefreshState.ReleaseToLoad) {
            mo96402h();
            return true;
        } else if (this.av == RefreshState.ReleaseToTwoLevel) {
            mo96358a(RefreshState.TwoLevelReleased);
            return true;
        } else if (this.f67386b == 0) {
            return false;
        } else {
            mo96362b(0);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
        // Method dump skipped, instructions count: 423
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.SmartRefreshLayout.onAttachedToWindow():void");
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        boolean z;
        boolean z2;
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount <= 3) {
            boolean[] zArr = new boolean[childCount];
            int i = 0;
            while (true) {
                boolean z3 = true;
                if (i >= childCount) {
                    break;
                }
                View childAt = getChildAt(i);
                if ((childAt instanceof AbstractC27126e) && this.ao == null) {
                    this.ao = (AbstractC27126e) childAt;
                } else if ((childAt instanceof AbstractC27125d) && this.ap == null) {
                    if (!this.f67410z && this.f67376O) {
                        z3 = false;
                    }
                    this.f67410z = z3;
                    this.ap = (AbstractC27125d) childAt;
                } else if (this.aq != null || (!(childAt instanceof AbsListView) && !(childAt instanceof WebView) && !(childAt instanceof ScrollView) && !(childAt instanceof ScrollingView) && !(childAt instanceof NestedScrollingChild) && !(childAt instanceof NestedScrollingParent) && !(childAt instanceof ViewPager))) {
                    zArr[i] = true;
                } else {
                    this.aq = new C27131a(childAt);
                }
                i++;
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                if (zArr[i2]) {
                    View childAt2 = getChildAt(i2);
                    if (childCount == 1 && this.aq == null) {
                        this.aq = new C27131a(childAt2);
                    } else if (i2 == 0 && this.ao == null) {
                        this.ao = new C27135c(childAt2);
                    } else if (childCount == 2 && this.aq == null) {
                        this.aq = new C27131a(childAt2);
                    } else if (i2 == 2 && this.ap == null) {
                        if (this.f67410z || !this.f67376O) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f67410z = z2;
                        this.ap = new C27134b(childAt2);
                    } else if (this.aq == null) {
                        this.aq = new C27131a(childAt2);
                    } else if (i2 == 1 && childCount == 2 && this.ap == null) {
                        if (this.f67410z || !this.f67376O) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f67410z = z;
                        this.ap = new C27134b(childAt2);
                    }
                }
            }
            if (isInEditMode()) {
                int[] iArr = this.f67408x;
                if (iArr != null) {
                    AbstractC27126e eVar = this.ao;
                    if (eVar != null) {
                        eVar.setPrimaryColors(iArr);
                    }
                    AbstractC27125d dVar = this.ap;
                    if (dVar != null) {
                        dVar.setPrimaryColors(this.f67408x);
                    }
                }
                AbstractC27124c cVar = this.aq;
                if (cVar != null) {
                    bringChildToFront(cVar.mo96476e());
                }
                AbstractC27126e eVar2 = this.ao;
                if (!(eVar2 == null || eVar2.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                    bringChildToFront(this.ao.getView());
                }
                AbstractC27125d dVar2 = this.ap;
                if (!(dVar2 == null || dVar2.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                    bringChildToFront(this.ap.getView());
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("最多只支持3个子View，Most only support three sub view");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo96370b() {
        if (!mo96432u() || this.f67375N || this.av.opening || this.av.finishing) {
            setViceState(RefreshState.ReleaseToLoad);
        } else {
            mo96358a(RefreshState.ReleaseToLoad);
        }
    }

    public static void setDefaultRefreshHeaderCreater(AbstractC27123b bVar) {
        aH = bVar;
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96348a(AbstractC27138b bVar) {
        this.f67381T = bVar;
        return this;
    }

    /* renamed from: b */
    public SmartRefreshLayout mo96413l(boolean z) {
        this.f67409y = z;
        return this;
    }

    /* renamed from: c */
    public SmartRefreshLayout mo96373c(float f) {
        this.f67396l = f;
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public SmartRefreshLayout mo96380d(boolean z) {
        this.f67366E = z;
        return this;
    }

    /* renamed from: f */
    public SmartRefreshLayout mo96388f(boolean z) {
        this.f67367F = z;
        return this;
    }

    @Override // com.scwang.smartrefresh.layout.p1234a.AbstractC27129h
    /* renamed from: g */
    public AbstractC27129h mo96390g(boolean z) {
        setNestedScrollingEnabled(z);
        return this;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f67437a;

        /* renamed from: b */
        public SpinnerStyle f67438b;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_srlBackgroundColor, R.attr.layout_srlSpinnerStyle});
            this.f67437a = obtainStyledAttributes.getColor(0, this.f67437a);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f67438b = SpinnerStyle.values()[obtainStyledAttributes.getInt(1, SpinnerStyle.Translate.ordinal())];
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static void setDefaultRefreshFooterCreater(AbstractC27122a aVar) {
        aG = aVar;
        aF = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ValueAnimator mo96362b(int i) {
        return mo96338a(i, 0);
    }

    /* renamed from: e */
    public SmartRefreshLayout mo96408j(int i) {
        return mo96364b(i, true);
    }

    /* renamed from: f */
    public SmartRefreshLayout mo96405i(int i) {
        return mo96374c(i, true);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.ac.mo4704b(i);
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: b */
    public SmartRefreshLayout mo96363b(float f) {
        return mo96379d(C27144b.m98678a(f));
    }

    /* renamed from: c */
    public SmartRefreshLayout mo96410k(boolean z) {
        this.f67368G = z;
        return this;
    }

    /* renamed from: e */
    public SmartRefreshLayout mo96385e(boolean z) {
        this.f67372K = z;
        AbstractC27124c cVar = this.aq;
        if (cVar != null) {
            cVar.mo96468a(z);
        }
        return this;
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f67377P = true;
        this.ac.mo4693a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: g */
    public boolean mo96392g(int i) {
        int i2 = this.f67390f;
        int i3 = this.ae;
        return mo96360a(i, i2, (((float) ((this.f175440ai / 2) + i3)) * 1.0f) / ((float) i3));
    }

    /* renamed from: h */
    public boolean mo96403h(int i) {
        int i2 = this.f67390f;
        int i3 = this.ag;
        return mo96371b(i, i2, (((float) ((this.aj / 2) + i3)) * 1.0f) / ((float) i3));
    }

    /* renamed from: i */
    public SmartRefreshLayout mo96404i(boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - this.az;
        int i = 0;
        if (z) {
            i = Math.max(0, 1000 - ((int) currentTimeMillis));
        }
        return mo96364b(i, z);
    }

    /* renamed from: j */
    public SmartRefreshLayout mo96407j(boolean z) {
        long currentTimeMillis = System.currentTimeMillis() - this.ay;
        int i = 0;
        if (z) {
            i = Math.max(0, 1000 - ((int) currentTimeMillis));
        }
        return mo96374c(i, z);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        this.ad.mo4708a(view);
        this.ab = false;
        this.aa = 0;
        mo96411k();
        stopNestedScroll();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        View f = this.aq.mo96477f();
        if (Build.VERSION.SDK_INT < 21 && (f instanceof AbsListView)) {
            return;
        }
        if (f == null || ViewCompat.m4010D(f)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: protected */
    public void setViceState(RefreshState refreshState) {
        if (this.av.draging && this.av.isHeader() != refreshState.isHeader()) {
            mo96358a(RefreshState.None);
        }
        if (this.aw != refreshState) {
            this.aw = refreshState;
        }
    }

    /* renamed from: d */
    public SmartRefreshLayout mo96379d(int i) {
        if (this.ah.canReplaceWith(DimensionStatus.CodeExact)) {
            this.ag = i;
            this.aj = (int) Math.max(((float) i) * (this.al - 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
            this.ah = DimensionStatus.CodeExactUnNotify;
            AbstractC27125d dVar = this.ap;
            if (dVar != null) {
                dVar.getView().requestLayout();
            }
        }
        return this;
    }

    /* renamed from: h */
    public SmartRefreshLayout mo96401h(boolean z) {
        this.f67375N = z;
        AbstractC27125d dVar = this.ap;
        if (dVar != null && !dVar.mo30338a(z)) {
            PrintStream printStream = System.out;
            printStream.println("Footer:" + this.ap + "不支持提示完成");
        }
        return this;
    }

    public boolean post(Runnable runnable) {
        Handler handler = this.as;
        if (handler != null) {
            return handler.post(new RunnableC27143a(runnable));
        }
        List<RunnableC27143a> list = this.au;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.au = list;
        list.add(new RunnableC27143a(runnable));
        return false;
    }

    public SmartRefreshLayout(Context context) {
        super(context);
        this.f67389e = 250;
        this.f67390f = 250;
        this.f67396l = 0.5f;
        this.f67409y = true;
        this.f67362A = true;
        this.f67363B = true;
        this.f67365D = true;
        this.f67366E = true;
        this.f67367F = true;
        this.f67368G = true;
        this.f67370I = true;
        this.f67371J = true;
        this.f67372K = true;
        this.f67383V = new int[2];
        this.f67384W = new int[2];
        this.af = DimensionStatus.DefaultUnNotify;
        this.ah = DimensionStatus.DefaultUnNotify;
        this.ak = 2.5f;
        this.al = 2.5f;
        this.am = 1.0f;
        this.an = 1.0f;
        this.av = RefreshState.None;
        this.aw = RefreshState.None;
        this.aK = new AnimatorListenerAdapter() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass12 */

            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout.this.aJ = null;
                if (SmartRefreshLayout.this.f67386b == 0) {
                    if (SmartRefreshLayout.this.av != RefreshState.None && !SmartRefreshLayout.this.av.opening) {
                        SmartRefreshLayout.this.mo96358a(RefreshState.None);
                    }
                } else if (SmartRefreshLayout.this.av != SmartRefreshLayout.this.aw) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.setViceState(smartRefreshLayout.av);
                }
            }
        };
        this.aL = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass13 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout.this.mo96357a(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        };
        m98474a(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        int i3;
        if (!this.f67365D || !isInEditMode()) {
            z = false;
        } else {
            z = true;
        }
        if (mo96433v() && (i2 = this.aA) != 0 && (this.f67386b > 0 || z)) {
            this.ar.setColor(i2);
            float width = (float) getWidth();
            if (z) {
                i3 = this.ae;
            } else {
                i3 = this.f67386b;
            }
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, (float) i3, this.ar);
        } else if (mo96432u() && this.aB != 0 && (this.f67386b < 0 || z)) {
            int height = getHeight();
            this.ar.setColor(this.aB);
            if (z) {
                i = this.ag;
            } else {
                i = -this.f67386b;
            }
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, (float) (height - i), (float) getWidth(), (float) height, this.ar);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96367b(AbstractC27125d dVar) {
        return mo96344a(dVar, -1, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ValueAnimator mo96372c(int i) {
        if (this.aJ == null) {
            final int i2 = (this.f67390f * 2) / 3;
            this.f67394j = (float) (getMeasuredWidth() / 2);
            if ((this.av == RefreshState.Refreshing || this.av == RefreshState.TwoLevel) && i > 0) {
                ValueAnimator ofInt = ValueAnimator.ofInt(this.f67386b, Math.min(i * 2, this.ae));
                this.aJ = ofInt;
                ofInt.addListener(this.aK);
            } else if (i < 0 && (this.av == RefreshState.Loading || ((this.f67364C && this.f67375N) || (this.f67368G && mo96432u() && !this.f67375N && this.av != RefreshState.Refreshing)))) {
                ValueAnimator ofInt2 = ValueAnimator.ofInt(this.f67386b, Math.max((i * 7) / 2, -this.ag));
                this.aJ = ofInt2;
                ofInt2.addListener(this.aK);
            } else if (this.f67386b == 0 && this.f67366E) {
                if (i > 0) {
                    if (this.av != RefreshState.Loading) {
                        mo96389f();
                    }
                    i2 = Math.max(150, (i * 250) / this.ae);
                    this.aJ = ValueAnimator.ofInt(0, Math.min(i, this.ae));
                } else {
                    if (this.av != RefreshState.Refreshing) {
                        mo96355a();
                    }
                    i2 = Math.max(150, ((-i) * 250) / this.ag);
                    this.aJ = ValueAnimator.ofInt(0, Math.max(i, -this.ag));
                }
                this.aJ.addListener(new AnimatorListenerAdapter() {
                    /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass14 */

                    public void onAnimationStart(Animator animator) {
                    }

                    public void onAnimationEnd(Animator animator) {
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.aJ = ValueAnimator.ofInt(smartRefreshLayout.f67386b, 0);
                        SmartRefreshLayout.this.aJ.setDuration((long) i2);
                        SmartRefreshLayout.this.aJ.setInterpolator(new DecelerateInterpolator());
                        SmartRefreshLayout.this.aJ.addUpdateListener(SmartRefreshLayout.this.aL);
                        SmartRefreshLayout.this.aJ.addListener(SmartRefreshLayout.this.aK);
                        SmartRefreshLayout.this.aJ.start();
                    }
                });
            }
            ValueAnimator valueAnimator = this.aJ;
            if (valueAnimator != null) {
                valueAnimator.setDuration((long) i2);
                this.aJ.setInterpolator(new DecelerateInterpolator());
                this.aJ.addUpdateListener(this.aL);
                this.aJ.start();
            }
        }
        return this.aJ;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0150, code lost:
        if (r6 != 3) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r6 != 3) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 939
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smartrefresh.layout.SmartRefreshLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96345a(AbstractC27126e eVar) {
        return mo96346a(eVar, -1, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ValueAnimator mo96338a(int i, int i2) {
        return mo96339a(i, i2, this.f67401q);
    }

    /* renamed from: c */
    public SmartRefreshLayout mo96374c(int i, boolean z) {
        return mo96366b(i, z, false);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.ac.mo4695a(f, f2);
    }

    /* renamed from: b */
    public SmartRefreshLayout mo96364b(int i, final boolean z) {
        long j;
        RunnableC271072 r0 = new Runnable() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271072 */

            public void run() {
                if (SmartRefreshLayout.this.av != RefreshState.Refreshing) {
                    return;
                }
                if (SmartRefreshLayout.this.ao == null || SmartRefreshLayout.this.aq == null) {
                    SmartRefreshLayout.this.mo96409j();
                    return;
                }
                int a = SmartRefreshLayout.this.ao.mo30297a(SmartRefreshLayout.this, z);
                if (a < Integer.MAX_VALUE) {
                    if (SmartRefreshLayout.this.f67397m) {
                        SmartRefreshLayout.this.f67388d = 0;
                        SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                        smartRefreshLayout.f67393i = smartRefreshLayout.f67395k;
                        SmartRefreshLayout.this.f67397m = false;
                        long currentTimeMillis = System.currentTimeMillis();
                        SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                        smartRefreshLayout2.mo96361a(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, smartRefreshLayout2.f67394j, (SmartRefreshLayout.this.f67393i + ((float) SmartRefreshLayout.this.f67386b)) - ((float) (SmartRefreshLayout.this.f67385a * 2)), 0));
                        SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                        smartRefreshLayout3.mo96361a(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, smartRefreshLayout3.f67394j, SmartRefreshLayout.this.f67393i + ((float) SmartRefreshLayout.this.f67386b), 0));
                    }
                    SmartRefreshLayout.this.mo96358a(RefreshState.RefreshFinish);
                }
                if (SmartRefreshLayout.this.f67381T != null) {
                    SmartRefreshLayout.this.f67381T.mo33949a(SmartRefreshLayout.this.ao, z);
                }
                if (a >= Integer.MAX_VALUE) {
                    return;
                }
                if (SmartRefreshLayout.this.f67386b > 0) {
                    ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
                    ValueAnimator a2 = SmartRefreshLayout.this.mo96338a(0, a);
                    if (SmartRefreshLayout.this.f67371J) {
                        animatorUpdateListener = SmartRefreshLayout.this.aq.mo96474c(SmartRefreshLayout.this.f67386b);
                    }
                    if (a2 != null && animatorUpdateListener != null) {
                        a2.addUpdateListener(animatorUpdateListener);
                        return;
                    }
                    return;
                }
                SmartRefreshLayout.this.mo96357a(0, true);
                SmartRefreshLayout.this.mo96409j();
            }
        };
        if (i <= 0) {
            j = 1;
        } else {
            j = (long) i;
        }
        postDelayed(r0, j);
        return this;
    }

    public boolean postDelayed(Runnable runnable, long j) {
        if (j == 0) {
            new RunnableC27143a(runnable).run();
            return true;
        }
        Handler handler = this.as;
        if (handler != null) {
            return handler.postDelayed(new RunnableC27143a(runnable), j);
        }
        List<RunnableC27143a> list = this.au;
        if (list == null) {
            list = new ArrayList<>();
        }
        this.au = list;
        list.add(new RunnableC27143a(runnable, j));
        return false;
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67389e = 250;
        this.f67390f = 250;
        this.f67396l = 0.5f;
        this.f67409y = true;
        this.f67362A = true;
        this.f67363B = true;
        this.f67365D = true;
        this.f67366E = true;
        this.f67367F = true;
        this.f67368G = true;
        this.f67370I = true;
        this.f67371J = true;
        this.f67372K = true;
        this.f67383V = new int[2];
        this.f67384W = new int[2];
        this.af = DimensionStatus.DefaultUnNotify;
        this.ah = DimensionStatus.DefaultUnNotify;
        this.ak = 2.5f;
        this.al = 2.5f;
        this.am = 1.0f;
        this.an = 1.0f;
        this.av = RefreshState.None;
        this.aw = RefreshState.None;
        this.aK = new AnimatorListenerAdapter() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass12 */

            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout.this.aJ = null;
                if (SmartRefreshLayout.this.f67386b == 0) {
                    if (SmartRefreshLayout.this.av != RefreshState.None && !SmartRefreshLayout.this.av.opening) {
                        SmartRefreshLayout.this.mo96358a(RefreshState.None);
                    }
                } else if (SmartRefreshLayout.this.av != SmartRefreshLayout.this.aw) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.setViceState(smartRefreshLayout.av);
                }
            }
        };
        this.aL = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass13 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout.this.mo96357a(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        };
        m98474a(context, attributeSet);
    }

    /* renamed from: a */
    private void m98474a(Context context, AttributeSet attributeSet) {
        DimensionStatus dimensionStatus;
        DimensionStatus dimensionStatus2;
        setClipToPadding(false);
        C27144b bVar = new C27144b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f67406v = new Scroller(context);
        this.at = new C27121a();
        this.f67407w = VelocityTracker.obtain();
        this.f67391g = context.getResources().getDisplayMetrics().heightPixels;
        this.f67401q = new animationInterpolatorC27146d();
        this.f67385a = viewConfiguration.getScaledTouchSlop();
        this.f67404t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f67405u = viewConfiguration.getScaledMaximumFlingVelocity();
        this.ad = new C0911m(this);
        this.ac = new C0909k(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842986, 16842987, R.attr.srlAccentColor, R.attr.srlDisableContentWhenLoading, R.attr.srlDisableContentWhenRefresh, R.attr.srlDragRate, R.attr.srlEnableAutoLoadMore, R.attr.srlEnableAutoLoadmore, R.attr.srlEnableClipFooterWhenFixedBehind, R.attr.srlEnableClipHeaderWhenFixedBehind, R.attr.srlEnableFooterFollowWhenLoadFinished, R.attr.srlEnableFooterFollowWhenNoMoreData, R.attr.srlEnableFooterTranslationContent, R.attr.srlEnableHeaderTranslationContent, R.attr.srlEnableLoadMore, R.attr.srlEnableLoadMoreWhenContentNotFull, R.attr.srlEnableLoadmore, R.attr.srlEnableLoadmoreWhenContentNotFull, R.attr.srlEnableNestedScrolling, R.attr.srlEnableOverScrollBounce, R.attr.srlEnableOverScrollDrag, R.attr.srlEnablePreviewInEditMode, R.attr.srlEnablePureScrollMode, R.attr.srlEnableRefresh, R.attr.srlEnableScrollContentWhenLoaded, R.attr.srlEnableScrollContentWhenRefreshed, R.attr.srlFixedFooterViewId, R.attr.srlFixedHeaderViewId, R.attr.srlFooterHeight, R.attr.srlFooterInsetStart, R.attr.srlFooterMaxDragRate, R.attr.srlFooterTranslationViewId, R.attr.srlFooterTriggerRate, R.attr.srlHeaderHeight, R.attr.srlHeaderInsetStart, R.attr.srlHeaderMaxDragRate, R.attr.srlHeaderTranslationViewId, R.attr.srlHeaderTriggerRate, R.attr.srlPrimaryColor, R.attr.srlReboundDuration});
        ViewCompat.m4066c(this, obtainStyledAttributes.getBoolean(18, false));
        this.f67396l = obtainStyledAttributes.getFloat(5, this.f67396l);
        this.ak = obtainStyledAttributes.getFloat(35, this.ak);
        this.al = obtainStyledAttributes.getFloat(30, this.al);
        this.am = obtainStyledAttributes.getFloat(37, this.am);
        this.an = obtainStyledAttributes.getFloat(32, this.an);
        this.f67409y = obtainStyledAttributes.getBoolean(23, this.f67409y);
        this.f67390f = obtainStyledAttributes.getInt(39, this.f67390f);
        this.f67410z = obtainStyledAttributes.getBoolean(16, this.f67410z);
        this.ae = obtainStyledAttributes.getDimensionPixelOffset(33, bVar.mo96505c(100.0f));
        this.ag = obtainStyledAttributes.getDimensionPixelOffset(28, bVar.mo96505c(60.0f));
        this.f67373L = obtainStyledAttributes.getBoolean(4, this.f67373L);
        this.f67374M = obtainStyledAttributes.getBoolean(3, this.f67374M);
        this.f67362A = obtainStyledAttributes.getBoolean(13, this.f67362A);
        this.f67363B = obtainStyledAttributes.getBoolean(12, this.f67363B);
        this.f67365D = obtainStyledAttributes.getBoolean(21, this.f67365D);
        this.f67368G = obtainStyledAttributes.getBoolean(7, this.f67368G);
        this.f67366E = obtainStyledAttributes.getBoolean(19, this.f67366E);
        this.f67369H = obtainStyledAttributes.getBoolean(22, this.f67369H);
        this.f67370I = obtainStyledAttributes.getBoolean(24, this.f67370I);
        this.f67371J = obtainStyledAttributes.getBoolean(25, this.f67371J);
        this.f67372K = obtainStyledAttributes.getBoolean(17, this.f67372K);
        this.f67364C = obtainStyledAttributes.getBoolean(10, this.f67364C);
        this.f67367F = obtainStyledAttributes.getBoolean(20, this.f67367F);
        this.f67402r = obtainStyledAttributes.getResourceId(27, -1);
        this.f67403s = obtainStyledAttributes.getResourceId(26, -1);
        this.f67376O = obtainStyledAttributes.hasValue(16);
        this.f67377P = obtainStyledAttributes.hasValue(18);
        this.f67378Q = obtainStyledAttributes.hasValue(13);
        if (obtainStyledAttributes.hasValue(33)) {
            dimensionStatus = DimensionStatus.XmlLayoutUnNotify;
        } else {
            dimensionStatus = this.af;
        }
        this.af = dimensionStatus;
        if (obtainStyledAttributes.hasValue(28)) {
            dimensionStatus2 = DimensionStatus.XmlLayoutUnNotify;
        } else {
            dimensionStatus2 = this.ah;
        }
        this.ah = dimensionStatus2;
        this.f175440ai = (int) Math.max(((float) this.ae) * (this.ak - 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
        this.aj = (int) Math.max(((float) this.ag) * (this.al - 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
        int color = obtainStyledAttributes.getColor(2, 0);
        int color2 = obtainStyledAttributes.getColor(38, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.f67408x = new int[]{color2, color};
            } else {
                this.f67408x = new int[]{color2};
            }
        } else if (color != 0) {
            this.f67408x = new int[]{0, color};
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!isInEditMode() || !this.f67365D) {
            z = false;
        } else {
            z = true;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            AbstractC27126e eVar = this.ao;
            if (eVar != null && eVar.getView() == childAt) {
                View view = this.ao.getView();
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                int childMeasureSpec = getChildMeasureSpec(i, layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width);
                if (this.af.gteReplaceWith(DimensionStatus.XmlLayoutUnNotify)) {
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(this.ae - layoutParams.bottomMargin, 0), 1073741824));
                } else if (this.ao.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                    if (!this.af.notifyed) {
                        measureChild(view, childMeasureSpec, i2);
                        i8 = view.getMeasuredHeight();
                    } else {
                        i8 = 0;
                    }
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                    if (i8 > 0 && i8 != view.getMeasuredHeight()) {
                        this.ae = i8 + layoutParams.bottomMargin;
                    }
                } else if (layoutParams.height > 0) {
                    if (this.af.canReplaceWith(DimensionStatus.XmlExactUnNotify)) {
                        this.ae = layoutParams.height + layoutParams.bottomMargin;
                        this.af = DimensionStatus.XmlExactUnNotify;
                    }
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } else if (layoutParams.height == -2) {
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2) - layoutParams.bottomMargin, 0), Integer.MIN_VALUE));
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight > 0 && this.af.canReplaceWith(DimensionStatus.XmlWrapUnNotify)) {
                        this.af = DimensionStatus.XmlWrapUnNotify;
                        this.ae = view.getMeasuredHeight() + layoutParams.bottomMargin;
                    } else if (measuredHeight <= 0) {
                        view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(this.ae - layoutParams.bottomMargin, 0), 1073741824));
                    }
                } else if (layoutParams.height == -1) {
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(this.ae - layoutParams.bottomMargin, 0), 1073741824));
                } else {
                    view.measure(childMeasureSpec, i2);
                }
                if (this.ao.getSpinnerStyle() == SpinnerStyle.Scale && !z) {
                    if (mo96433v()) {
                        i7 = this.f67386b;
                    } else {
                        i7 = 0;
                    }
                    view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(Math.max(0, i7) - layoutParams.bottomMargin, 0), 1073741824));
                }
                if (!this.af.notifyed) {
                    this.af = this.af.notifyed();
                    int max = (int) Math.max(((float) this.ae) * (this.ak - 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
                    this.f175440ai = max;
                    this.ao.mo30299a(this.at, this.ae, max);
                }
                if (z && mo96433v()) {
                    i9 += view.getMeasuredHeight();
                }
            }
            AbstractC27125d dVar = this.ap;
            if (dVar != null && dVar.getView() == childAt) {
                View view2 = this.ap.getView();
                LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                int childMeasureSpec2 = getChildMeasureSpec(i, layoutParams2.leftMargin + layoutParams2.rightMargin, layoutParams2.width);
                if (this.ah.gteReplaceWith(DimensionStatus.XmlLayoutUnNotify)) {
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(this.ag - layoutParams2.topMargin, 0), 1073741824));
                } else if (this.ap.getSpinnerStyle() == SpinnerStyle.MatchLayout) {
                    if (!this.ah.notifyed) {
                        measureChild(view2, childMeasureSpec2, i2);
                        i6 = view2.getMeasuredHeight();
                    } else {
                        i6 = 0;
                    }
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                    if (i6 > 0 && i6 != view2.getMeasuredHeight()) {
                        this.ae = i6 + layoutParams2.bottomMargin;
                    }
                } else if (layoutParams2.height > 0) {
                    if (this.ah.canReplaceWith(DimensionStatus.XmlExactUnNotify)) {
                        this.ag = layoutParams2.height + layoutParams2.topMargin;
                        this.ah = DimensionStatus.XmlExactUnNotify;
                    }
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824));
                } else if (layoutParams2.height == -2) {
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2) - layoutParams2.topMargin, 0), Integer.MIN_VALUE));
                    int measuredHeight2 = view2.getMeasuredHeight();
                    if (measuredHeight2 > 0 && this.ah.canReplaceWith(DimensionStatus.XmlWrapUnNotify)) {
                        this.ah = DimensionStatus.XmlWrapUnNotify;
                        this.ag = view2.getMeasuredHeight() + layoutParams2.topMargin;
                    } else if (measuredHeight2 <= 0) {
                        view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(this.ag - layoutParams2.topMargin, 0), 1073741824));
                    }
                } else if (layoutParams2.height == -1) {
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(this.ag - layoutParams2.topMargin, 0), 1073741824));
                } else {
                    view2.measure(childMeasureSpec2, i2);
                }
                if (this.ap.getSpinnerStyle() == SpinnerStyle.Scale && !z) {
                    if (this.f67410z) {
                        i5 = -this.f67386b;
                    } else {
                        i5 = 0;
                    }
                    view2.measure(childMeasureSpec2, View.MeasureSpec.makeMeasureSpec(Math.max(Math.max(0, i5) - layoutParams2.topMargin, 0), 1073741824));
                }
                if (!this.ah.notifyed) {
                    this.ah = this.ah.notifyed();
                    int max2 = (int) Math.max(((float) this.ag) * (this.al - 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
                    this.aj = max2;
                    this.ap.mo30299a(this.at, this.ag, max2);
                }
                if (z && this.f67410z) {
                    i9 += view2.getMeasuredHeight();
                }
            }
            AbstractC27124c cVar = this.aq;
            if (cVar != null && cVar.mo96476e() == childAt) {
                LayoutParams layoutParams3 = (LayoutParams) this.aq.mo96478g();
                int childMeasureSpec3 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams3.leftMargin + layoutParams3.rightMargin, layoutParams3.width);
                int paddingTop = getPaddingTop() + getPaddingBottom() + layoutParams3.topMargin + layoutParams3.bottomMargin;
                if (!z || !mo96433v() || (!this.f67362A && this.ao.getSpinnerStyle() != SpinnerStyle.FixedBehind)) {
                    i3 = 0;
                } else {
                    i3 = this.ae;
                }
                int i11 = paddingTop + i3;
                if (!z || !mo96432u() || (!this.f67363B && this.ap.getSpinnerStyle() != SpinnerStyle.FixedBehind)) {
                    i4 = 0;
                } else {
                    i4 = this.ag;
                }
                this.aq.mo96463a(childMeasureSpec3, getChildMeasureSpec(i2, i11 + i4, layoutParams3.height));
                this.aq.mo96471b(this.ae, this.ag);
                i9 += this.aq.mo96475d();
            }
        }
        setMeasuredDimension(resolveSize(getSuggestedMinimumWidth(), i), resolveSize(i9, i2));
        this.f67394j = (float) (getMeasuredWidth() / 2);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.ac.mo4696a(f, f2, z);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.ad.mo4710a(view, view2, i);
        startNestedScroll(i & 2);
        this.aa = 0;
        this.f67388d = this.f67386b;
        this.ab = true;
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96366b(int i, final boolean z, final boolean z2) {
        long j;
        RunnableC271083 r0 = new Runnable() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271083 */

            public void run() {
                long j;
                if (SmartRefreshLayout.this.av == RefreshState.Loading) {
                    if (SmartRefreshLayout.this.ap == null || SmartRefreshLayout.this.aq == null) {
                        SmartRefreshLayout.this.mo96409j();
                        return;
                    }
                    int a = SmartRefreshLayout.this.ap.mo30297a(SmartRefreshLayout.this, z);
                    if (a < Integer.MAX_VALUE) {
                        if (SmartRefreshLayout.this.f67397m) {
                            SmartRefreshLayout.this.f67388d = 0;
                            SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                            smartRefreshLayout.f67393i = smartRefreshLayout.f67395k;
                            SmartRefreshLayout.this.f67397m = false;
                            long currentTimeMillis = System.currentTimeMillis();
                            SmartRefreshLayout smartRefreshLayout2 = SmartRefreshLayout.this;
                            smartRefreshLayout2.mo96361a(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 0, smartRefreshLayout2.f67394j, SmartRefreshLayout.this.f67393i + ((float) SmartRefreshLayout.this.f67386b) + ((float) (SmartRefreshLayout.this.f67385a * 2)), 0));
                            SmartRefreshLayout smartRefreshLayout3 = SmartRefreshLayout.this;
                            smartRefreshLayout3.mo96361a(MotionEvent.obtain(currentTimeMillis, currentTimeMillis, 2, smartRefreshLayout3.f67394j, SmartRefreshLayout.this.f67393i + ((float) SmartRefreshLayout.this.f67386b), 0));
                        }
                        SmartRefreshLayout.this.mo96358a(RefreshState.LoadFinish);
                    }
                    if (SmartRefreshLayout.this.f67381T != null) {
                        SmartRefreshLayout.this.f67381T.mo96493a(SmartRefreshLayout.this.ap, z);
                    }
                    if (a < Integer.MAX_VALUE) {
                        SmartRefreshLayout smartRefreshLayout4 = SmartRefreshLayout.this;
                        RunnableC271091 r2 = new Runnable() {
                            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271083.RunnableC271091 */

                            public void run() {
                                ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
                                if (!SmartRefreshLayout.this.f67370I || SmartRefreshLayout.this.f67386b >= 0) {
                                    animatorUpdateListener = null;
                                } else {
                                    animatorUpdateListener = SmartRefreshLayout.this.aq.mo96474c(SmartRefreshLayout.this.f67386b);
                                }
                                if (animatorUpdateListener != null) {
                                    animatorUpdateListener.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
                                }
                                if (animatorUpdateListener != null || SmartRefreshLayout.this.f67386b >= 0) {
                                    if (SmartRefreshLayout.this.aJ != null) {
                                        SmartRefreshLayout.this.aJ.cancel();
                                        SmartRefreshLayout.this.aJ = null;
                                    }
                                    SmartRefreshLayout.this.mo96357a(0, true);
                                    SmartRefreshLayout.this.mo96409j();
                                    if (z2) {
                                        SmartRefreshLayout.this.mo96401h(true);
                                        return;
                                    }
                                    return;
                                }
                                ValueAnimator b = SmartRefreshLayout.this.mo96362b(0);
                                if (b != null && z2) {
                                    b.addListener(new AnimatorListenerAdapter() {
                                        /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271083.RunnableC271091.C271101 */

                                        public void onAnimationEnd(Animator animator) {
                                            SmartRefreshLayout.this.mo96401h(true);
                                        }
                                    });
                                }
                            }
                        };
                        if (SmartRefreshLayout.this.f67386b < 0) {
                            j = (long) a;
                        } else {
                            j = 0;
                        }
                        smartRefreshLayout4.postDelayed(r2, j);
                    }
                } else if (z2) {
                    SmartRefreshLayout.this.mo96401h(true);
                }
            }
        };
        if (i <= 0) {
            j = 1;
        } else {
            j = (long) i;
        }
        postDelayed(r0, j);
        return this;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if (this.f67386b != 0 && this.av.opening) {
            mo96362b(0);
        }
        if (this.aJ != null || this.av == RefreshState.ReleaseToRefresh || this.av == RefreshState.ReleaseToLoad || ((this.av == RefreshState.PullDownToRefresh && this.f67386b > 0) || ((this.av == RefreshState.PullToUpLoad && this.f67386b > 0) || dispatchNestedPreFling(f, f2)))) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        boolean z;
        if (!isEnabled() || !isNestedScrollingEnabled() || (i & 2) == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (!mo96433v() && !mo96432u())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ValueAnimator mo96339a(int i, int i2, Interpolator interpolator) {
        if (this.f67386b == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.aJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.f67386b, i);
        this.aJ = ofInt;
        ofInt.setDuration((long) this.f67390f);
        this.aJ.setInterpolator(interpolator);
        this.aJ.addUpdateListener(this.aL);
        this.aJ.addListener(this.aK);
        this.aJ.setStartDelay((long) i2);
        this.aJ.start();
        return this.aJ;
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67389e = 250;
        this.f67390f = 250;
        this.f67396l = 0.5f;
        this.f67409y = true;
        this.f67362A = true;
        this.f67363B = true;
        this.f67365D = true;
        this.f67366E = true;
        this.f67367F = true;
        this.f67368G = true;
        this.f67370I = true;
        this.f67371J = true;
        this.f67372K = true;
        this.f67383V = new int[2];
        this.f67384W = new int[2];
        this.af = DimensionStatus.DefaultUnNotify;
        this.ah = DimensionStatus.DefaultUnNotify;
        this.ak = 2.5f;
        this.al = 2.5f;
        this.am = 1.0f;
        this.an = 1.0f;
        this.av = RefreshState.None;
        this.aw = RefreshState.None;
        this.aK = new AnimatorListenerAdapter() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass12 */

            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout.this.aJ = null;
                if (SmartRefreshLayout.this.f67386b == 0) {
                    if (SmartRefreshLayout.this.av != RefreshState.None && !SmartRefreshLayout.this.av.opening) {
                        SmartRefreshLayout.this.mo96358a(RefreshState.None);
                    }
                } else if (SmartRefreshLayout.this.av != SmartRefreshLayout.this.aw) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.setViceState(smartRefreshLayout.av);
                }
            }
        };
        this.aL = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass13 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout.this.mo96357a(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        };
        m98474a(context, attributeSet);
    }

    /* renamed from: a */
    public SmartRefreshLayout mo96344a(AbstractC27125d dVar, int i, int i2) {
        boolean z;
        if (dVar != null) {
            AbstractC27125d dVar2 = this.ap;
            if (dVar2 != null) {
                removeView(dVar2.getView());
            }
            this.ap = dVar;
            this.ah = this.ah.unNotify();
            if (!this.f67376O || this.f67410z) {
                z = true;
            } else {
                z = false;
            }
            this.f67410z = z;
            if (this.ap.getSpinnerStyle() == SpinnerStyle.FixedBehind) {
                addView(this.ap.getView(), 0, new LayoutParams(i, i2));
            } else {
                addView(this.ap.getView(), i, i2);
            }
        }
        return this;
    }

    /* renamed from: b */
    public boolean mo96371b(int i, final int i2, final float f) {
        if (this.av != RefreshState.None || !mo96432u() || this.f67375N) {
            return false;
        }
        ValueAnimator valueAnimator = this.aJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        RunnableC271145 r0 = new Runnable() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271145 */

            public void run() {
                SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                smartRefreshLayout.aJ = ValueAnimator.ofInt(smartRefreshLayout.f67386b, -((int) (((float) SmartRefreshLayout.this.ag) * f)));
                SmartRefreshLayout.this.aJ.setDuration((long) i2);
                SmartRefreshLayout.this.aJ.setInterpolator(new DecelerateInterpolator());
                SmartRefreshLayout.this.aJ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271145.C271151 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        SmartRefreshLayout.this.mo96357a(((Integer) valueAnimator.getAnimatedValue()).intValue(), false);
                    }
                });
                SmartRefreshLayout.this.aJ.addListener(new AnimatorListenerAdapter() {
                    /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.RunnableC271145.C271162 */

                    public void onAnimationStart(Animator animator) {
                        SmartRefreshLayout.this.f67394j = (float) (SmartRefreshLayout.this.getMeasuredWidth() / 2);
                        SmartRefreshLayout.this.mo96355a();
                    }

                    public void onAnimationEnd(Animator animator) {
                        SmartRefreshLayout.this.aJ = null;
                        if (SmartRefreshLayout.this.av != RefreshState.ReleaseToLoad) {
                            SmartRefreshLayout.this.mo96370b();
                        }
                        if (SmartRefreshLayout.this.f67368G) {
                            SmartRefreshLayout.this.f67368G = false;
                            SmartRefreshLayout.this.mo96411k();
                            SmartRefreshLayout.this.f67368G = true;
                            return;
                        }
                        SmartRefreshLayout.this.mo96411k();
                    }
                });
                SmartRefreshLayout.this.aJ.start();
            }
        };
        if (i > 0) {
            this.aJ = new ValueAnimator();
            postDelayed(r0, (long) i);
            return true;
        }
        r0.run();
        return true;
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.ac.mo4701a(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.av.opening) {
            int[] iArr2 = this.f67383V;
            if (dispatchNestedPreScroll(i, i2, iArr2, null)) {
                i2 -= iArr2[1];
            }
            if ((this.av == RefreshState.Refreshing || this.av == RefreshState.TwoLevel) && (this.aa * i2 > 0 || this.f67388d > 0)) {
                iArr[1] = 0;
                if (Math.abs(i2) > Math.abs(this.aa)) {
                    iArr[1] = iArr[1] + this.aa;
                    this.aa = 0;
                    i7 = i2 - 0;
                    if (this.f67388d <= 0) {
                        mo96356a(BitmapDescriptorFactory.HUE_RED);
                    }
                } else {
                    int i9 = this.aa - i2;
                    this.aa = i9;
                    iArr[1] = iArr[1] + i2;
                    mo96356a((float) (i9 + this.f67388d));
                    i7 = 0;
                }
                if (i7 > 0 && (i8 = this.f67388d) > 0) {
                    if (i7 > i8) {
                        iArr[1] = iArr[1] + i8;
                        this.f67388d = 0;
                    } else {
                        this.f67388d = i8 - i7;
                        iArr[1] = iArr[1] + i7;
                    }
                    mo96356a((float) this.f67388d);
                }
            } else if (this.av != RefreshState.Loading) {
            } else {
                if (this.aa * i2 > 0 || this.f67388d < 0) {
                    iArr[1] = 0;
                    if (Math.abs(i2) > Math.abs(this.aa)) {
                        iArr[1] = iArr[1] + this.aa;
                        this.aa = 0;
                        i5 = i2 - 0;
                        if (this.f67388d >= 0) {
                            mo96356a(BitmapDescriptorFactory.HUE_RED);
                        }
                    } else {
                        int i10 = this.aa - i2;
                        this.aa = i10;
                        iArr[1] = iArr[1] + i2;
                        mo96356a((float) (i10 + this.f67388d));
                        i5 = 0;
                    }
                    if (i5 < 0 && (i6 = this.f67388d) < 0) {
                        if (i5 < i6) {
                            iArr[1] = iArr[1] + i6;
                            this.f67388d = 0;
                        } else {
                            this.f67388d = i6 - i5;
                            iArr[1] = iArr[1] + i5;
                        }
                        mo96356a((float) this.f67388d);
                    }
                }
            }
        } else {
            if (mo96433v() && i2 > 0 && (i4 = this.aa) > 0) {
                if (i2 > i4) {
                    iArr[1] = i2 - i4;
                    this.aa = 0;
                } else {
                    this.aa = i4 - i2;
                    iArr[1] = i2;
                }
                mo96356a((float) this.aa);
            } else if (mo96432u() && i2 < 0 && (i3 = this.aa) < 0) {
                if (i2 < i3) {
                    iArr[1] = i2 - i3;
                    this.aa = 0;
                } else {
                    this.aa = i3 - i2;
                    iArr[1] = i2;
                }
                mo96356a((float) this.aa);
            }
            int[] iArr3 = this.f67383V;
            if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr3, null)) {
                iArr[0] = iArr[0] + iArr3[0];
                iArr[1] = iArr[1] + iArr3[1];
            }
        }
    }

    public SmartRefreshLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f67389e = 250;
        this.f67390f = 250;
        this.f67396l = 0.5f;
        this.f67409y = true;
        this.f67362A = true;
        this.f67363B = true;
        this.f67365D = true;
        this.f67366E = true;
        this.f67367F = true;
        this.f67368G = true;
        this.f67370I = true;
        this.f67371J = true;
        this.f67372K = true;
        this.f67383V = new int[2];
        this.f67384W = new int[2];
        this.af = DimensionStatus.DefaultUnNotify;
        this.ah = DimensionStatus.DefaultUnNotify;
        this.ak = 2.5f;
        this.al = 2.5f;
        this.am = 1.0f;
        this.an = 1.0f;
        this.av = RefreshState.None;
        this.aw = RefreshState.None;
        this.aK = new AnimatorListenerAdapter() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass12 */

            public void onAnimationEnd(Animator animator) {
                SmartRefreshLayout.this.aJ = null;
                if (SmartRefreshLayout.this.f67386b == 0) {
                    if (SmartRefreshLayout.this.av != RefreshState.None && !SmartRefreshLayout.this.av.opening) {
                        SmartRefreshLayout.this.mo96358a(RefreshState.None);
                    }
                } else if (SmartRefreshLayout.this.av != SmartRefreshLayout.this.aw) {
                    SmartRefreshLayout smartRefreshLayout = SmartRefreshLayout.this;
                    smartRefreshLayout.setViceState(smartRefreshLayout.av);
                }
            }
        };
        this.aL = new ValueAnimator.AnimatorUpdateListener() {
            /* class com.scwang.smartrefresh.layout.SmartRefreshLayout.AnonymousClass13 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                SmartRefreshLayout.this.mo96357a(((Integer) valueAnimator.getAnimatedValue()).intValue(), true);
            }
        };
        m98474a(context, attributeSet);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.ac.mo4699a(i, i2, i3, i4, iArr);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        AbstractC27124c cVar;
        AbstractC27124c cVar2;
        dispatchNestedScroll(i, i2, i3, i4, this.f67384W);
        int i5 = i4 + this.f67384W[1];
        if (this.av.opening) {
            if (mo96433v() && i5 < 0 && ((cVar2 = this.aq) == null || cVar2.mo96469a())) {
                int abs = this.aa + Math.abs(i5);
                this.aa = abs;
                mo96356a((float) (abs + this.f67388d));
            } else if (mo96432u() && i5 > 0) {
                AbstractC27124c cVar3 = this.aq;
                if (cVar3 == null || cVar3.mo96472b()) {
                    int abs2 = this.aa - Math.abs(i5);
                    this.aa = abs2;
                    mo96356a((float) (abs2 + this.f67388d));
                }
            }
        } else if (mo96433v() && i5 < 0 && ((cVar = this.aq) == null || cVar.mo96469a())) {
            if (this.av == RefreshState.None) {
                mo96389f();
            }
            int abs3 = this.aa + Math.abs(i5);
            this.aa = abs3;
            mo96356a((float) abs3);
        } else if (mo96432u() && i5 > 0) {
            AbstractC27124c cVar4 = this.aq;
            if (cVar4 == null || cVar4.mo96472b()) {
                if (this.av == RefreshState.None && !this.f67375N) {
                    mo96355a();
                }
                int abs4 = this.aa - Math.abs(i5);
                this.aa = abs4;
                mo96356a((float) abs4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        int max;
        boolean z3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            AbstractC27124c cVar = this.aq;
            boolean z4 = true;
            if (cVar != null && cVar.mo96476e() == childAt) {
                if (!isInEditMode() || !this.f67365D) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                LayoutParams layoutParams = (LayoutParams) this.aq.mo96478g();
                int i9 = layoutParams.leftMargin + paddingLeft;
                int i10 = layoutParams.topMargin + paddingTop;
                int c = this.aq.mo96473c() + i9;
                int d = this.aq.mo96475d() + i10;
                if (z3 && mo96433v() && (this.f67362A || this.ao.getSpinnerStyle() == SpinnerStyle.FixedBehind)) {
                    int i11 = this.ae;
                    i10 += i11;
                    d += i11;
                }
                this.aq.mo96464a(i9, i10, c, d);
            }
            AbstractC27126e eVar = this.ao;
            if (eVar != null && eVar.getView() == childAt) {
                if (!isInEditMode() || !this.f67365D || !mo96433v()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                View view = this.ao.getView();
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                int i12 = layoutParams2.leftMargin;
                int i13 = layoutParams2.topMargin;
                int measuredWidth = view.getMeasuredWidth() + i12;
                int measuredHeight = view.getMeasuredHeight() + i13;
                if (!z2) {
                    if (this.ao.getSpinnerStyle() == SpinnerStyle.Translate) {
                        i13 -= this.ae;
                        max = view.getMeasuredHeight();
                    } else if (this.ao.getSpinnerStyle() == SpinnerStyle.Scale) {
                        if (mo96433v()) {
                            i7 = this.f67386b;
                        } else {
                            i7 = 0;
                        }
                        max = Math.max(Math.max(0, i7) - layoutParams2.bottomMargin, 0);
                    }
                    measuredHeight = i13 + max;
                }
                view.layout(i12, i13, measuredWidth, measuredHeight);
            }
            AbstractC27125d dVar = this.ap;
            if (dVar != null && dVar.getView() == childAt) {
                if (!isInEditMode() || !this.f67365D || !mo96432u()) {
                    z4 = false;
                }
                View view2 = this.ap.getView();
                LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
                SpinnerStyle spinnerStyle = this.ap.getSpinnerStyle();
                int i14 = layoutParams3.leftMargin;
                int measuredHeight2 = (layoutParams3.topMargin + getMeasuredHeight()) - layoutParams3.bottomMargin;
                if (z4 || spinnerStyle == SpinnerStyle.FixedFront || spinnerStyle == SpinnerStyle.FixedBehind) {
                    i5 = this.ag;
                } else {
                    if (spinnerStyle == SpinnerStyle.Scale) {
                        if (mo96432u()) {
                            i6 = -this.f67386b;
                        } else {
                            i6 = 0;
                        }
                        i5 = Math.max(Math.max(i6, 0) - layoutParams3.topMargin, 0);
                    }
                    view2.layout(i14, measuredHeight2, view2.getMeasuredWidth() + i14, view2.getMeasuredHeight() + measuredHeight2);
                }
                measuredHeight2 -= i5;
                view2.layout(i14, measuredHeight2, view2.getMeasuredWidth() + i14, view2.getMeasuredHeight() + measuredHeight2);
            }
        }
    }
}
