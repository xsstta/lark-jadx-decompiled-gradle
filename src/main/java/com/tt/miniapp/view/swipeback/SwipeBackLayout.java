package com.tt.miniapp.view.swipeback;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.map.AppbrandMapActivity;
import com.tt.miniapp.util.C67043j;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.swipeback.C67226c;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.refer.common.util.C67866g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class SwipeBackLayout extends FrameLayout {

    /* renamed from: a */
    public float f169643a;

    /* renamed from: b */
    public C67226c f169644b;

    /* renamed from: c */
    public float f169645c;

    /* renamed from: d */
    public AbstractC67497e f169646d;

    /* renamed from: e */
    public FragmentActivity f169647e;

    /* renamed from: f */
    public View f169648f;

    /* renamed from: g */
    public C67225b f169649g;

    /* renamed from: h */
    public Fragment f169650h;

    /* renamed from: i */
    public Drawable f169651i;

    /* renamed from: j */
    public Drawable f169652j;

    /* renamed from: k */
    public int f169653k;

    /* renamed from: l */
    public volatile boolean f169654l;

    /* renamed from: m */
    public int f169655m;

    /* renamed from: n */
    public Context f169656n;

    /* renamed from: o */
    public boolean f169657o;

    /* renamed from: p */
    public int f169658p;

    /* renamed from: q */
    public boolean f169659q;

    /* renamed from: r */
    public List<AbstractC67221a> f169660r;

    /* renamed from: s */
    public IAppContext f169661s;

    /* renamed from: t */
    float f169662t;

    /* renamed from: u */
    float f169663u;

    /* renamed from: v */
    private float f169664v;

    /* renamed from: w */
    private Rect f169665w;

    /* renamed from: x */
    private EdgeLevel f169666x;

    /* renamed from: y */
    private boolean f169667y;

    /* renamed from: z */
    private boolean f169668z;

    public enum EdgeLevel {
        MAX,
        MIN,
        MED
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EdgeOrientation {
    }

    /* renamed from: com.tt.miniapp.view.swipeback.SwipeBackLayout$a */
    public interface AbstractC67221a {
        /* renamed from: a */
        void mo233736a(float f);

        /* renamed from: a */
        void mo233737a(int i);

        /* renamed from: b */
        void mo233738b(int i);
    }

    /* renamed from: d */
    public void mo233723d() {
        this.f169658p = 0;
    }

    /* renamed from: c */
    public boolean mo233721c() {
        return this.f169654l;
    }

    public EdgeLevel getEdgeLevel() {
        return this.f169666x;
    }

    /* renamed from: a */
    public void mo233712a() {
        this.f169647e = null;
        this.f169646d = null;
    }

    /* renamed from: e */
    private void m261958e() {
        this.f169644b = C67226c.m261985a(this, new C67222b());
        mo233713a(R.drawable.microapp_m_shadow_left, 1);
        setEdgeOrientation(1);
        setEdgeLevel(EdgeLevel.MIN);
        setBackground(null);
    }

    /* renamed from: f */
    private boolean m261959f() {
        if (!this.f169654l || (this.f169668z && getBackground() == null)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo233719b() {
        Fragment fragment = this.f169650h;
        if (fragment != null && fragment.getView() != null) {
            this.f169650h.getView().setVisibility(8);
        }
    }

    public void computeScroll() {
        float f = 1.0f - this.f169645c;
        this.f169664v = f;
        if (f >= BitmapDescriptorFactory.HUE_RED && this.f169644b.mo233760a(true)) {
            ViewCompat.m4073e(this);
        }
    }

    private void setContentView(View view) {
        this.f169648f = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.view.swipeback.SwipeBackLayout$b */
    public class C67222b extends C67226c.AbstractC67229a {
        C67222b() {
        }

        @Override // com.tt.miniapp.view.swipeback.C67226c.AbstractC67229a
        /* renamed from: a */
        public int mo233739a(View view) {
            if (SwipeBackLayout.this.f169649g != null) {
                return 1;
            }
            if (SwipeBackLayout.this.f169646d == null) {
                return 0;
            }
            if (SwipeBackLayout.this.f169646d.mo232129r()) {
                return 1;
            }
            if (!(SwipeBackLayout.this.f169647e instanceof SwipeBackActivity) || !((SwipeBackActivity) SwipeBackLayout.this.f169647e).cD_()) {
                return 0;
            }
            return 1;
        }

        @Override // com.tt.miniapp.view.swipeback.C67226c.AbstractC67229a
        /* renamed from: a */
        public void mo233741a(int i) {
            super.mo233741a(i);
            if (!(SwipeBackLayout.this.f169660r == null || SwipeBackLayout.this.f169660r.isEmpty())) {
                for (AbstractC67221a aVar : SwipeBackLayout.this.f169660r) {
                    aVar.mo233737a(i);
                }
            }
        }

        @Override // com.tt.miniapp.view.swipeback.C67226c.AbstractC67229a
        /* renamed from: a */
        public void mo233742a(int i, int i2) {
            super.mo233742a(i, i2);
            if ((SwipeBackLayout.this.f169653k & i) != 0) {
                SwipeBackLayout.this.f169655m = i;
            }
        }

        @Override // com.tt.miniapp.view.swipeback.C67226c.AbstractC67229a
        /* renamed from: a */
        public boolean mo233745a(View view, int i) {
            List<Fragment> fragments;
            boolean b = SwipeBackLayout.this.f169644b.mo233764b(SwipeBackLayout.this.f169653k, i);
            if (SwipeBackLayout.this.f169657o && (view instanceof LinearLayout) && SwipeBackLayout.this.f169644b.mo233761b() != null && (SwipeBackLayout.this.f169646d instanceof C66546p) && ((C66546p) SwipeBackLayout.this.f169646d).mo232110B().size() > 1) {
                return false;
            }
            if ((view instanceof FrameLayout) && (SwipeBackLayout.this.f169649g instanceof AppbrandFragment)) {
                AbstractC67434b a = ((AbstractC67433a) SwipeBackLayout.this.f169661s).mo234156a();
                if ((a instanceof C66546p) && ((C66546p) a).mo232110B().size() < 2) {
                    return false;
                }
            }
            if (b) {
                if (SwipeBackLayout.this.f169644b.mo233764b(1, i)) {
                    SwipeBackLayout.this.f169655m = 1;
                } else if (SwipeBackLayout.this.f169644b.mo233764b(2, i)) {
                    SwipeBackLayout.this.f169655m = 2;
                }
                if (SwipeBackLayout.this.f169660r != null && !SwipeBackLayout.this.f169660r.isEmpty()) {
                    for (AbstractC67221a aVar : SwipeBackLayout.this.f169660r) {
                        aVar.mo233738b(SwipeBackLayout.this.f169655m);
                    }
                }
                if (SwipeBackLayout.this.f169650h != null) {
                    View view2 = SwipeBackLayout.this.f169650h.getView();
                    if (view2 != null && view2.getVisibility() != 0) {
                        view2.setVisibility(0);
                    }
                } else if (SwipeBackLayout.this.f169649g != null && (fragments = SwipeBackLayout.this.f169649g.getFragmentManager().getFragments()) != null && fragments.size() > 1) {
                    int indexOf = fragments.indexOf(SwipeBackLayout.this.f169649g) - 1;
                    while (true) {
                        if (indexOf < 0) {
                            break;
                        }
                        Fragment fragment = fragments.get(indexOf);
                        if (!(fragment == null || fragment.getView() == null)) {
                            fragment.getView().setVisibility(0);
                            SwipeBackLayout.this.f169650h = fragment;
                            break;
                        }
                        indexOf--;
                    }
                }
            }
            return b;
        }

        @Override // com.tt.miniapp.view.swipeback.C67226c.AbstractC67229a
        /* renamed from: a */
        public int mo233740a(View view, int i, int i2) {
            if ((SwipeBackLayout.this.f169655m & 1) != 0) {
                return Math.min(view.getWidth(), Math.max(i, 0));
            }
            if ((SwipeBackLayout.this.f169655m & 2) != 0) {
                return Math.min(0, Math.max(i, -view.getWidth()));
            }
            return 0;
        }

        @Override // com.tt.miniapp.view.swipeback.C67226c.AbstractC67229a
        /* renamed from: a */
        public void mo233743a(View view, float f, float f2) {
            int i;
            if (view != null) {
                int width = view.getWidth();
                if ((SwipeBackLayout.this.f169655m & 1) != 0) {
                    int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    if (i2 > 0 || (i2 == 0 && SwipeBackLayout.this.f169645c > SwipeBackLayout.this.f169643a)) {
                        i = width + SwipeBackLayout.this.f169651i.getIntrinsicWidth() + 10;
                        if (i > 0 && SwipeBackLayout.this.f169658p < C67043j.m261275b(SwipeBackLayout.this.f169656n) / 4 && Math.abs(SwipeBackLayout.this.f169663u) > ((float) SwipeBackLayout.this.f169658p)) {
                            i = 0;
                        }
                        SwipeBackLayout.this.f169644b.mo233757a(i, 0);
                        SwipeBackLayout.this.invalidate();
                    }
                } else if ((SwipeBackLayout.this.f169655m & 2) != 0 && (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && SwipeBackLayout.this.f169645c > SwipeBackLayout.this.f169643a))) {
                    i = -(width + SwipeBackLayout.this.f169652j.getIntrinsicWidth() + 10);
                    i = 0;
                    SwipeBackLayout.this.f169644b.mo233757a(i, 0);
                    SwipeBackLayout.this.invalidate();
                }
                i = 0;
                i = 0;
                SwipeBackLayout.this.f169644b.mo233757a(i, 0);
                SwipeBackLayout.this.invalidate();
            }
        }

        @Override // com.tt.miniapp.view.swipeback.C67226c.AbstractC67229a
        /* renamed from: a */
        public void mo233744a(View view, int i, int i2, int i3, int i4) {
            super.mo233744a(view, i, i2, i3, i4);
            if ((SwipeBackLayout.this.f169655m & 1) != 0) {
                SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                swipeBackLayout.f169645c = Math.abs(((float) i) / ((float) (swipeBackLayout.getWidth() + SwipeBackLayout.this.f169651i.getIntrinsicWidth())));
                SwipeBackLayout.this.f169658p = i;
            } else if ((SwipeBackLayout.this.f169655m & 2) != 0) {
                SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                swipeBackLayout2.f169645c = Math.abs(((float) i) / ((float) (swipeBackLayout2.f169648f.getWidth() + SwipeBackLayout.this.f169652j.getIntrinsicWidth())));
            }
            if (((double) SwipeBackLayout.this.f169645c) >= 1.0d) {
                SwipeBackLayout.this.f169659q = false;
            } else if (((double) SwipeBackLayout.this.f169645c) == 0.0d) {
                SwipeBackLayout.this.f169659q = false;
            } else {
                SwipeBackLayout.this.f169659q = true;
            }
            AppBrandLogger.m52828d("SwipeBackLayout", "mScrollPercent:", Float.valueOf(SwipeBackLayout.this.f169645c));
            SwipeBackLayout.this.invalidate();
            if (SwipeBackLayout.this.f169660r != null && !SwipeBackLayout.this.f169660r.isEmpty() && SwipeBackLayout.this.f169644b.mo233754a() == 1 && SwipeBackLayout.this.f169645c <= 1.0f && SwipeBackLayout.this.f169645c > BitmapDescriptorFactory.HUE_RED) {
                for (AbstractC67221a aVar : SwipeBackLayout.this.f169660r) {
                    aVar.mo233736a(SwipeBackLayout.this.f169645c);
                }
            }
            if (SwipeBackLayout.this.f169645c > 1.0f) {
                if (DebugUtil.debug()) {
                    if ((SwipeBackLayout.this.f169655m & 1) != 0) {
                        AppBrandLogger.m52828d("SwipeBackLayout", "left:", Integer.valueOf(i), "getWidth():", Integer.valueOf(SwipeBackLayout.this.getWidth()), "mShadowLeft.getIntrinsicWidth():", Integer.valueOf(SwipeBackLayout.this.f169651i.getIntrinsicWidth()));
                    } else if ((SwipeBackLayout.this.f169655m & 2) != 0) {
                        AppBrandLogger.m52828d("SwipeBackLayout", "left:", Integer.valueOf(i), "mContentView.getWidth() :", Integer.valueOf(SwipeBackLayout.this.f169648f.getWidth()), "mShadowLeft.getIntrinsicWidth():", Integer.valueOf(SwipeBackLayout.this.f169651i.getIntrinsicWidth()));
                    }
                }
                if (SwipeBackLayout.this.f169649g != null) {
                    if (SwipeBackLayout.this.f169650h instanceof C67225b) {
                        ((C67225b) SwipeBackLayout.this.f169650h).mLocking = true;
                    }
                    if (!SwipeBackLayout.this.f169649g.isDetached()) {
                        SwipeBackLayout.this.f169649g.mLocking = true;
                        SwipeBackLayout.this.mo233723d();
                        AbstractC67434b a = ((AbstractC67433a) SwipeBackLayout.this.f169661s).mo234156a();
                        if (a instanceof AbstractC67497e) {
                            ((AbstractC67497e) a).mo232136y();
                        }
                        SwipeBackLayout.this.f169649g.mLocking = false;
                    }
                    if (SwipeBackLayout.this.f169650h instanceof C67225b) {
                        ((C67225b) SwipeBackLayout.this.f169650h).mLocking = false;
                    }
                    SwipeBackLayout.this.f169657o = false;
                } else if (SwipeBackLayout.this.f169644b.mo233754a() != 0) {
                    SwipeBackLayout.this.f169644b.mo233770d(0);
                    if (!SwipeBackLayout.this.f169647e.isFinishing()) {
                        C67224a.f169674a = "slide";
                        C67224a.f169675b = false;
                        C67070z.m261391a(SwipeBackLayout.this.f169647e, 10, SwipeBackLayout.this.f169661s);
                        if (SwipeBackLayout.this.f169647e instanceof MiniappHostBase) {
                            SwipeBackLayout.this.f169657o = true;
                            C67866g.m264027a(new Runnable() {
                                /* class com.tt.miniapp.view.swipeback.SwipeBackLayout.C67222b.RunnableC672231 */

                                public void run() {
                                    AppBrandLogger.m52830i("SwipeBackLayout", "resetSwipeViewAfterSwipeBack");
                                    View childAt = SwipeBackLayout.this.getChildAt(0);
                                    if (childAt != null) {
                                        childAt.setVisibility(4);
                                        if (childAt.getX() > BitmapDescriptorFactory.HUE_RED) {
                                            childAt.layout(0, childAt.getTop(), childAt.getRight() - childAt.getLeft(), childAt.getBottom());
                                        }
                                    }
                                    SwipeBackLayout.this.mo233723d();
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    public void setEdgeLevel(int i) {
        m261955a(i, (EdgeLevel) null);
    }

    public void setEdgeLevel(EdgeLevel edgeLevel) {
        this.f169666x = edgeLevel;
        m261955a(0, edgeLevel);
    }

    public void setEdgeOrientation(int i) {
        this.f169653k = i;
        this.f169644b.mo233762b(i);
        if (i == 2 || i == 3) {
            mo233713a(R.drawable.microapp_m_shadow_right, 2);
        }
    }

    public void setScrollThresHold(float f) {
        if (f >= 1.0f || f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Threshold value should be between 0 and 1.0");
        }
        this.f169643a = f;
    }

    /* renamed from: a */
    public void mo233715a(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable == null || !this.f169654l) {
            AppBrandLogger.m52828d("SwipeBackLayout", "clearBackground");
            mo233723d();
            setBackground(null);
            return;
        }
        AppBrandLogger.m52828d("SwipeBackLayout", "updateBackground");
        setBackground(bitmapDrawable);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!m261959f()) {
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 1) {
                this.f169663u = motionEvent.getY() - this.f169662t;
            }
            this.f169644b.mo233763b(motionEvent);
            return true;
        } catch (IllegalArgumentException unused) {
        }
    }

    public void setEnableGesture(boolean z) {
        if (this.f169654l != z) {
            AppBrandLogger.m52828d("SwipeBackLayout", "setEnableGesture", Boolean.valueOf(z));
            this.f169654l = z;
            if (z) {
                FragmentActivity fragmentActivity = this.f169647e;
                if (fragmentActivity instanceof MiniappHostBase) {
                    ((MiniappHostBase) fragmentActivity).notifyUpdateSnapShot();
                    return;
                }
                return;
            }
            mo233723d();
            if (getBackground() != null) {
                C67866g.m264028a(new Runnable() {
                    /* class com.tt.miniapp.view.swipeback.SwipeBackLayout.RunnableC672202 */

                    public void run() {
                        SwipeBackLayout.this.setBackground(null);
                    }
                }, 300);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!m261959f()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        boolean a = this.f169644b.mo233758a(motionEvent);
        boolean b = this.f169644b.mo233764b(1, motionEvent.getPointerId(0));
        if (motionEvent.getAction() == 0) {
            this.f169662t = motionEvent.getY();
        }
        if (this.f169647e instanceof AppbrandMapActivity) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && this.f169667y) {
                    this.f169667y = false;
                    return false;
                }
            } else if (!b) {
                this.f169667y = true;
            }
            if (this.f169667y) {
                return false;
            }
            boolean a2 = ((AppbrandMapActivity) this.f169647e).mo232013a(motionEvent.getX(), motionEvent.getY());
            if (!b || a2) {
                return a;
            }
            return true;
        }
        return a;
    }

    public SwipeBackLayout(Context context, IAppContext iAppContext) {
        this(context, null, iAppContext);
        this.f169661s = iAppContext;
    }

    /* renamed from: a */
    public void mo233718a(C67225b bVar, View view) {
        this.f169649g = bVar;
        this.f169648f = view;
    }

    /* renamed from: a */
    public void mo233713a(int i, int i2) {
        mo233716a(AppbrandContext.getInst().getApplicationContext().getResources().getDrawable(i), i2);
    }

    /* renamed from: b */
    private void m261957b(Canvas canvas, View view) {
        int i = ((int) (this.f169664v * 153.0f)) << 24;
        int i2 = this.f169655m;
        if ((i2 & 1) != 0) {
            canvas.clipRect(0, 0, view.getLeft(), getHeight());
        } else if ((i2 & 2) != 0) {
            canvas.clipRect(view.getRight(), 0, getRight(), getHeight());
        }
        canvas.drawColor(i);
    }

    /* renamed from: a */
    private void m261955a(int i, EdgeLevel edgeLevel) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f169656n.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (i != 0) {
            this.f169644b.mo233755a(i);
        } else if (edgeLevel == EdgeLevel.MAX) {
            this.f169644b.mo233755a(displayMetrics.widthPixels);
        } else if (edgeLevel == EdgeLevel.MED) {
            this.f169644b.mo233755a(displayMetrics.widthPixels / 2);
        } else if (edgeLevel == EdgeLevel.MIN) {
            this.f169644b.mo233755a((int) ((displayMetrics.density * 60.0f) + 0.5f));
        }
    }

    /* renamed from: b */
    public void mo233720b(final C67225b bVar, View view) {
        if (this.f169654l) {
            bVar.setSwipeBackEnable(false);
            AppbrandContext.getMainHandler().postDelayed(new Runnable() {
                /* class com.tt.miniapp.view.swipeback.SwipeBackLayout.RunnableC672191 */

                public void run() {
                    bVar.setSwipeBackEnable(SwipeBackLayout.this.f169654l);
                }
            }, 300);
        }
        addView(view);
        mo233718a(bVar, view);
    }

    /* renamed from: a */
    private void m261956a(Canvas canvas, View view) {
        Rect rect = this.f169665w;
        view.getHitRect(rect);
        int i = this.f169655m;
        if ((i & 1) != 0) {
            this.f169651i.setBounds(rect.left - this.f169651i.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            this.f169651i.setAlpha((int) (this.f169664v * 255.0f));
            this.f169651i.draw(canvas);
        } else if ((i & 2) != 0) {
            this.f169652j.setBounds(rect.right, rect.top, rect.right + this.f169652j.getIntrinsicWidth(), rect.bottom);
            this.f169652j.setAlpha((int) (this.f169664v * 255.0f));
            this.f169652j.draw(canvas);
        }
    }

    /* renamed from: a */
    public void mo233716a(Drawable drawable, int i) {
        if ((i & 1) != 0) {
            this.f169651i = drawable;
        } else if ((i & 2) != 0) {
            this.f169652j = drawable;
        }
        invalidate();
    }

    /* renamed from: a */
    public void mo233717a(FragmentActivity fragmentActivity, AbstractC67497e eVar) {
        this.f169646d = eVar;
        this.f169647e = fragmentActivity;
        this.f169668z = fragmentActivity instanceof MiniappHostBase;
        TypedArray obtainStyledAttributes = fragmentActivity.getTheme().obtainStyledAttributes(new int[]{16842836});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        ViewGroup viewGroup = (ViewGroup) fragmentActivity.getWindow().getDecorView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(0);
        viewGroup2.setBackgroundResource(resourceId);
        viewGroup.removeView(viewGroup2);
        addView(viewGroup2);
        setContentView(viewGroup2);
        viewGroup.addView(this);
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, IAppContext iAppContext) {
        this(context, attributeSet, 0, iAppContext);
        this.f169661s = iAppContext;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (view == this.f169648f) {
            z = true;
        } else {
            z = false;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (z && this.f169664v > BitmapDescriptorFactory.HUE_RED && this.f169644b.mo233754a() != 0) {
            m261956a(canvas, view);
            m261957b(canvas, view);
        }
        return drawChild;
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet, int i, IAppContext iAppContext) {
        super(context, attributeSet, i);
        this.f169643a = 0.25f;
        this.f169665w = new Rect();
        this.f169654l = true;
        this.f169668z = false;
        this.f169657o = false;
        this.f169658p = 0;
        this.f169659q = false;
        this.f169662t = BitmapDescriptorFactory.HUE_RED;
        this.f169663u = BitmapDescriptorFactory.HUE_RED;
        this.f169661s = iAppContext;
        this.f169656n = context;
        m261958e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo233714a(i, i2, i3, i4, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo233714a(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int childCount = getChildCount();
        int i11 = i3 - i;
        int i12 = i4 - i2;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = layoutParams.gravity;
                if (i14 == -1) {
                    i14 = 8388659;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i14, getLayoutDirection());
                int i15 = i14 & SmEvents.EVENT_NE_RR;
                int i16 = absoluteGravity & 7;
                if (i16 == 1) {
                    i5 = (((((i11 + 0) - measuredWidth) / 2) + 0) + layoutParams.leftMargin) - layoutParams.rightMargin;
                    i6 = this.f169658p;
                } else if (i16 == 5 && !z) {
                    i5 = (i11 - measuredWidth) - layoutParams.rightMargin;
                    i6 = this.f169658p;
                } else {
                    i5 = layoutParams.leftMargin + 0;
                    i6 = this.f169658p;
                }
                int i17 = i5 + i6;
                if (i15 != 16) {
                    if (i15 == 48) {
                        i10 = layoutParams.topMargin;
                    } else if (i15 != 80) {
                        i10 = layoutParams.topMargin;
                    } else {
                        i8 = i12 - measuredHeight;
                        i9 = layoutParams.bottomMargin;
                    }
                    i7 = i10 + 0;
                    childAt.layout(i17, i7, measuredWidth + i17, measuredHeight + i7);
                } else {
                    i8 = (((i12 + 0) - measuredHeight) / 2) + 0 + layoutParams.topMargin;
                    i9 = layoutParams.bottomMargin;
                }
                i7 = i8 - i9;
                childAt.layout(i17, i7, measuredWidth + i17, measuredHeight + i7);
            }
        }
    }
}
