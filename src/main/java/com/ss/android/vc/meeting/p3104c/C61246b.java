package com.ss.android.vc.meeting.p3104c;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.AbstractC61060l;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.sketch.SketchControl;
import com.ss.android.vc.meeting.module.sketch.SketchView;
import com.ss.android.vc.meeting.module.sketch.dto.Coord;
import com.ss.android.vc.meeting.module.sketch.utils.CoordinateUtil;
import com.ss.android.vc.meeting.p3104c.C61263g;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* renamed from: com.ss.android.vc.meeting.c.b */
public class C61246b extends FrameLayout {

    /* renamed from: a */
    public int f153419a;

    /* renamed from: b */
    public WeakReference<View.OnClickListener> f153420b = new WeakReference<>(null);

    /* renamed from: c */
    public WeakReference<View.OnLongClickListener> f153421c = new WeakReference<>(null);

    /* renamed from: d */
    public WeakReference<AbstractC61253a> f153422d = new WeakReference<>(null);

    /* renamed from: e */
    public View f153423e;

    /* renamed from: f */
    public SketchView f153424f;

    /* renamed from: g */
    public RectF f153425g = new RectF();

    /* renamed from: h */
    public boolean f153426h = true;

    /* renamed from: i */
    public Size f153427i;

    /* renamed from: j */
    public WeakReference<AbstractC61030i> f153428j = new WeakReference<>(null);

    /* renamed from: k */
    public C61303k f153429k;

    /* renamed from: l */
    public boolean f153430l = false;

    /* renamed from: m */
    private boolean f153431m = true;

    /* renamed from: n */
    private RectF f153432n = new RectF();

    /* renamed from: o */
    private C61262f f153433o = new C61262f();

    /* renamed from: p */
    private C61265h f153434p = new C61265h();

    /* renamed from: q */
    private float f153435q;

    /* renamed from: r */
    private int f153436r;

    /* renamed from: s */
    private C61263g f153437s;

    /* renamed from: t */
    private float f153438t;

    /* renamed from: u */
    private float f153439u;

    /* renamed from: v */
    private float f153440v;

    /* renamed from: w */
    private float f153441w;

    /* renamed from: x */
    private boolean f153442x = false;

    /* renamed from: y */
    private int f153443y = ViewConfiguration.get(ar.m236694a()).getScaledTouchSlop();

    /* renamed from: z */
    private GestureDetector f153444z = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
        /* class com.ss.android.vc.meeting.p3104c.C61246b.C612471 */

        public void onLongPress(MotionEvent motionEvent) {
            View.OnLongClickListener onLongClickListener = C61246b.this.f153421c.get();
            if (onLongClickListener != null && C61246b.this.f153423e != null) {
                onLongClickListener.onLongClick(C61246b.this.f153423e);
            }
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (C61246b.this.f153419a == 1) {
                C61246b.this.mo211805a(motionEvent.getX(), motionEvent.getY());
            }
            AbstractC61253a aVar = C61246b.this.f153422d.get();
            if (!(aVar == null || C61246b.this.f153423e == null)) {
                aVar.mo211838a(C61246b.this.f153423e);
            }
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            View.OnClickListener onClickListener = C61246b.this.f153420b.get();
            if (onClickListener == null || C61246b.this.f153423e == null) {
                C60700b.m235851b("GestureSurfaceViewWrapper", "[onSingleTapConfirmed]", "Click listener is null");
            } else {
                onClickListener.onClick(C61246b.this.f153423e);
            }
            if (C61246b.this.f153429k == null || C61246b.this.f153430l) {
                return true;
            }
            C61246b.this.f153429k.ag().switchVisible();
            return true;
        }
    });

    /* renamed from: com.ss.android.vc.meeting.c.b$a */
    public interface AbstractC61253a {
        /* renamed from: a */
        void mo211838a(View view);
    }

    /* renamed from: g */
    public void mo211816g() {
        mo211815f();
    }

    public View getRenderer() {
        return this.f153423e;
    }

    public SketchView getSketchView() {
        return this.f153424f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211806a(float f, float f2, float f3) {
        m238252a(this.f153432n.left, this.f153432n.top, f, false);
        m238252a(this.f153432n.left, this.f153432n.top, f, true);
        m238259b(f2, f3, false);
        m238259b(f2, f3, true);
    }

    /* renamed from: a */
    public void mo211807a(RectF rectF) {
        if (rectF == null) {
            C60700b.m235864f("GestureSurfaceViewWrapper", "[saveContentBound]", "Content rect is null.");
            return;
        }
        mo211808a(rectF, this.f153432n);
        SketchView sketchView = this.f153424f;
        if (sketchView != null) {
            sketchView.onContentBoundChanged(this.f153432n);
        }
    }

    /* renamed from: a */
    public void mo211808a(RectF rectF, RectF rectF2) {
        if (rectF == null || rectF2 == null) {
            C60700b.m235864f("GestureSurfaceViewWrapper", "[convertRtcRect]", "Sdk or content rect is null.");
        } else if (this.f153427i != null) {
            rectF2.left = rectF.left * ((float) this.f153427i.getWidth());
            rectF2.right = rectF.right * ((float) this.f153427i.getWidth());
            rectF2.top = rectF.top * ((float) this.f153427i.getHeight());
            rectF2.bottom = rectF.bottom * ((float) this.f153427i.getHeight());
        }
    }

    private RectF getRenderContentBound() {
        if (this.f153423e == null) {
            return null;
        }
        return this.f153432n;
    }

    /* renamed from: j */
    private void m238260j() {
        this.f153436r = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: m */
    private void m238263m() {
        C61263g gVar = this.f153437s;
        if (gVar != null && gVar.isRunning()) {
            this.f153437s.end();
        }
    }

    /* renamed from: f */
    public void mo211815f() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.p3104c.$$Lambda$b$vFdc8XZcvhvKeq29xjIszo5MuBc */

            public final void run() {
                C61246b.this.m238266p();
            }
        });
    }

    /* renamed from: n */
    private boolean m238264n() {
        View view = this.f153423e;
        if (view == null || !C61261e.m238321a(C61074b.m237516d(view))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo211810c() {
        if (SketchControl.isSeeSketchFG()) {
            this.f153423e.post(new Runnable() {
                /* class com.ss.android.vc.meeting.p3104c.C61246b.RunnableC612514 */

                public void run() {
                    C61246b.this.mo211813d();
                    if (C61246b.this.f153429k.ag().isInSketch() && C61246b.this.f153424f != null) {
                        C60700b.m235851b("GestureSurfaceViewWrapper", "[invalidateSketchView]", "sketchView visible");
                        C61246b.this.f153424f.setVisibility(0);
                    } else if (C61246b.this.f153424f != null) {
                        C60700b.m235851b("GestureSurfaceViewWrapper", "[invalidateSketchView2]", "sketchView gone");
                        C61246b.this.f153424f.setVisibility(8);
                    }
                    C61246b.this.invalidate();
                    C61246b.this.f153423e.postDelayed(new Runnable() {
                        /* class com.ss.android.vc.meeting.p3104c.C61246b.RunnableC612514.RunnableC612521 */

                        public void run() {
                            if (C61246b.this.f153424f != null) {
                                C61246b.this.f153424f.getRenderModel().invalidate();
                            }
                        }
                    }, 16);
                    C60700b.m235851b("[Sketch] GestureSurfaceViewWrapper", "[invalidateSketchView3]", "origin = " + C61246b.this.f153425g);
                }
            });
        }
    }

    /* renamed from: e */
    public void mo211814e() {
        this.f153428j = new WeakReference<>(null);
        if (this.f153423e != null) {
            C61237h.m238223a().mo210501a(this.f153423e, (AbstractC61030i) null);
            C61237h.m238223a().mo210502a(this.f153423e, (AbstractC61060l) null);
        }
    }

    /* renamed from: i */
    public void mo211820i() {
        C60700b.m235851b("GestureSurfaceViewWrapper", "[destroy]", "destroy");
        this.f153423e.post(new Runnable() {
            /* class com.ss.android.vc.meeting.p3104c.$$Lambda$b$j4b3ljC4gpamZflb_GHz1Ae1OXw */

            public final void run() {
                C61246b.this.m238265o();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m238265o() {
        m238263m();
        SketchView sketchView = this.f153424f;
        if (sketchView != null) {
            sketchView.destroy();
            this.f153424f.setVisibility(8);
            this.f153424f.detach();
            this.f153424f = null;
            this.f153429k.ag().setSketchView(null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m238266p() {
        this.f153427i = null;
        mo211819h();
        C61261e.m238322b(this.f153425g);
        C61261e.m238322b(this.f153432n);
        SketchView sketchView = this.f153424f;
        if (sketchView != null) {
            sketchView.getRenderModel().setContentBoundary(this.f153432n);
            this.f153424f.getRenderModel().setOriginContentBoundary(this.f153425g);
            this.f153424f.setVisibility(8);
        }
    }

    /* renamed from: h */
    public void mo211819h() {
        C61074b.m237515c(this.f153423e);
        this.f153432n.left = this.f153425g.left;
        this.f153432n.top = this.f153425g.top;
        this.f153432n.right = this.f153425g.right;
        this.f153432n.bottom = this.f153425g.bottom;
    }

    /* renamed from: k */
    private void m238261k() {
        if (this.f153426h || (!C61261e.m238321a(this.f153425g) && this.f153427i != null)) {
            RectF d = C61074b.m237516d(this.f153423e);
            mo211808a(d, this.f153425g);
            this.f153429k.ag().getRenderModel().setOriginContentBoundary(this.f153425g);
            mo211808a(d, this.f153432n);
            mo211810c();
            C60700b.m235851b("[Sketch] GestureSurfaceViewWrapper", "[initOpContext]", "originRectF = " + this.f153425g);
            this.f153435q = 5.0f;
            C61074b.m237514b(this.f153423e, 10.0f);
            this.f153426h = false;
        }
    }

    /* renamed from: b */
    public void mo211809b() {
        if (this.f153429k.ag().isInSketch()) {
            this.f153424f = this.f153429k.ag().getSketchView();
        }
    }

    /* renamed from: d */
    public void mo211813d() {
        int i;
        int i2;
        int i3;
        int i4;
        SketchView sketchView = this.f153424f;
        if (sketchView == null) {
            C60700b.m235864f("GestureSurfaceViewWrapper", "[addSketchView]", "sketch view is null");
            return;
        }
        if (!sketchView.isGL()) {
            i4 = (int) this.f153425g.width();
            i3 = (int) this.f153425g.height();
            i2 = (int) this.f153425g.top;
            i = (int) this.f153425g.left;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = 0;
            i = 0;
        }
        if (indexOfChild(this.f153424f.getImplView()) == -1) {
            this.f153424f.detach();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i3);
            layoutParams.topMargin = i2;
            layoutParams.leftMargin = i;
            this.f153424f.attach(this, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f153424f.getImplView().getLayoutParams();
        layoutParams2.width = i4;
        layoutParams2.height = i3;
        layoutParams2.topMargin = i2;
        layoutParams2.leftMargin = i;
        this.f153424f.setLayoutParams(layoutParams2);
    }

    public String toString() {
        return "GestureSurfaceViewWrapper{mContentBound=" + this.f153432n + ", mOriginRectF=" + this.f153425g + ", mMaxScale=" + this.f153435q + ", mViewSize=" + this.f153427i + ", mTouchSlopSquare=" + this.f153436r + '}';
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m238262l() {
        /*
        // Method dump skipped, instructions count: 350
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.p3104c.C61246b.m238262l():void");
    }

    /* renamed from: a */
    public void mo211804a() {
        C60700b.m235851b("GestureSurfaceViewWrapper", "[createSketchView]", "");
        if (this.f153429k.ag().getSketchView() == null) {
            this.f153429k.ag().setSketchView(new SketchView(getContext(), this.f153429k));
        }
        SketchView sketchView = this.f153429k.ag().getSketchView();
        this.f153424f = sketchView;
        if (sketchView != null) {
            sketchView.detach();
            this.f153424f.getRenderModel().setContentBoundary(this.f153432n);
            this.f153424f.getRenderModel().setOriginContentBoundary(this.f153425g);
        }
    }

    public void setGestureEnable(boolean z) {
        this.f153431m = z;
    }

    public void setCornerRadius(float f) {
        View view = this.f153423e;
        if (view != null) {
            C61074b.m237510a(view, f);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f153420b = new WeakReference<>(onClickListener);
    }

    public void setOnDoubleTapListener(AbstractC61253a aVar) {
        this.f153422d = new WeakReference<>(aVar);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f153421c = new WeakReference<>(onLongClickListener);
    }

    public void setRtcEglRenderListener(AbstractC61030i iVar) {
        this.f153428j = new WeakReference<>(iVar);
    }

    public void setAutoRenderMode(boolean z) {
        if (this.f153423e != null) {
            C61237h.m238223a().mo210505a(this.f153423e, z);
        }
    }

    public void setRenderMode(int i) {
        if (this.f153423e != null) {
            C61237h.m238223a().mo210500a(this.f153423e, 0);
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (!isShown()) {
            return false;
        }
        if (this.f153419a == 2) {
            return true;
        }
        RectF renderContentBound = getRenderContentBound();
        if (!C61261e.m238321a(renderContentBound)) {
            return false;
        }
        if (i > 0) {
            return C61260d.m238319b(renderContentBound.right, (float) getWidth());
        }
        return C61260d.m238320c(renderContentBound.left, BitmapDescriptorFactory.HUE_RED);
    }

    public boolean canScrollVertically(int i) {
        if (!isShown()) {
            return false;
        }
        if (this.f153419a == 2) {
            return true;
        }
        RectF renderContentBound = getRenderContentBound();
        if (!C61261e.m238321a(renderContentBound)) {
            return false;
        }
        if (((float) i) > BitmapDescriptorFactory.HUE_RED) {
            return C61260d.m238319b(renderContentBound.bottom, (float) getHeight());
        }
        return C61260d.m238320c(renderContentBound.top, BitmapDescriptorFactory.HUE_RED);
    }

    public void setOnVisible(boolean z) {
        SketchView sketchView;
        SketchView sketchView2;
        if (this.f153429k.mo212092J().mo212511H()) {
            if (z) {
                if (this.f153427i == null) {
                    this.f153427i = new Size(this.f153423e.getWidth(), this.f153423e.getHeight());
                }
                if (!C61261e.m238321a(this.f153425g)) {
                    RectF d = C61074b.m237516d(this.f153423e);
                    if (C61261e.m238321a(d)) {
                        mo211808a(d, this.f153425g);
                    }
                }
                if (C61261e.m238321a(this.f153425g) && (sketchView2 = this.f153424f) != null) {
                    sketchView2.getRenderModel().setOriginContentBoundary(this.f153425g);
                }
                if (!C61261e.m238321a(this.f153432n)) {
                    RectF d2 = C61074b.m237516d(this.f153423e);
                    if (C61261e.m238321a(d2)) {
                        mo211808a(d2, this.f153432n);
                    }
                }
                if (C61261e.m238321a(this.f153432n) && (sketchView = this.f153424f) != null) {
                    sketchView.onContentBoundChanged(this.f153432n);
                }
                SketchView sketchView3 = this.f153424f;
                if (sketchView3 != null) {
                    sketchView3.startRender();
                    return;
                }
                return;
            }
            SketchView sketchView4 = this.f153424f;
            if (sketchView4 != null) {
                sketchView4.endRender();
            }
        }
    }

    /* renamed from: a */
    public C61246b mo211803a(View view) {
        C60700b.m235851b("GestureSurfaceViewWrapper", "[wrap]", "" + view.hashCode());
        this.f153423e = view;
        C61237h.m238223a().mo210501a(this.f153423e, new AbstractC61030i() {
            /* class com.ss.android.vc.meeting.p3104c.C61246b.C612482 */

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: d */
            public void mo210661d() {
            }

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: a */
            public void mo210658a() {
                AbstractC61030i iVar = C61246b.this.f153428j.get();
                if (iVar != null) {
                    C60700b.m235851b("GestureSurfaceViewWrapper", "[onBeginRender]", "Callback");
                    iVar.mo210658a();
                }
            }

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: b */
            public void mo210659b() {
                AbstractC61030i iVar = C61246b.this.f153428j.get();
                if (iVar != null) {
                    C60700b.m235851b("GestureSurfaceViewWrapper", "[onEndRender]", "Callback");
                    iVar.mo210659b();
                }
            }

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: c */
            public void mo210660c() {
                C61246b.this.mo211815f();
                AbstractC61030i iVar = C61246b.this.f153428j.get();
                if (iVar != null) {
                    iVar.mo210660c();
                }
            }
        });
        C61237h.m238223a().mo210502a(this.f153423e, new AbstractC61060l() {
            /* class com.ss.android.vc.meeting.p3104c.C61246b.C612493 */

            @Override // com.ss.android.vc.irtc.AbstractC61060l
            /* renamed from: a */
            public void mo211279a(RectF rectF) {
            }

            @Override // com.ss.android.vc.irtc.AbstractC61060l
            /* renamed from: a */
            public void mo211278a() {
                C61246b.this.f153423e.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.p3104c.C61246b.C612493.RunnableC612501 */

                    public void run() {
                        if (!C61246b.this.isAttachedToWindow()) {
                            C60700b.m235851b("GestureSurfaceViewWrapper", "[onBaseFrameRecal]", "View detached");
                            return;
                        }
                        RectF d = C61074b.m237516d(C61246b.this.f153423e);
                        if (!(C61246b.this.f153427i != null && C61246b.this.f153427i.getWidth() == C61246b.this.f153423e.getWidth() && C61246b.this.f153427i.getHeight() == C61246b.this.f153423e.getHeight())) {
                            C61246b.this.f153427i = new Size(C61246b.this.f153423e.getWidth(), C61246b.this.f153423e.getHeight());
                        }
                        C61246b.this.mo211808a(d, C61246b.this.f153425g);
                        C61246b.this.f153429k.ag().getRenderModel().setOriginContentBoundary(C61246b.this.f153425g);
                        C61246b.this.mo211810c();
                        C61246b.this.f153426h = true;
                        C60700b.m235851b("GestureSurfaceViewWrapper", "[onBaseFrameRecal2]", "originRectF = " + C61246b.this.f153425g);
                        C61246b.this.mo211807a(d);
                    }
                });
            }
        });
        removeAllViews();
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        invalidate();
        this.f153427i = null;
        return this;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SketchView sketchView;
        SketchView sketchView2;
        SketchView sketchView3;
        super.onTouchEvent(motionEvent);
        if (!m238264n() || !this.f153431m) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f153440v = motionEvent.getX();
            this.f153441w = motionEvent.getY();
            this.f153430l = false;
            if (this.f153427i == null) {
                this.f153427i = new Size(this.f153423e.getWidth(), this.f153423e.getHeight());
            }
            m238263m();
            if (this.f153429k.mo212105W().mo212831j().isSketchOn()) {
                this.f153419a = 3;
            } else if (Math.abs(this.f153432n.width() - this.f153425g.width()) > 1.0f || Math.abs(this.f153432n.height() - this.f153425g.height()) > 1.0f) {
                this.f153419a = 1;
            }
            this.f153434p.mo211885a(motionEvent.getX(), motionEvent.getY());
            if (this.f153419a == 3) {
                Coord pointToPercent = CoordinateUtil.pointToPercent(motionEvent.getX(), motionEvent.getY(), this.f153432n);
                if (CoordinateUtil.isInContent(motionEvent.getX(), motionEvent.getY(), this.f153432n) && (sketchView3 = this.f153424f) != null) {
                    sketchView3.touchDown(pointToPercent, CoordinateUtil.getContentScale(this.f153432n, this.f153425g));
                }
            }
        } else if (actionMasked == 5) {
            this.f153419a = 2;
            m238254a(this.f153434p.mo211886b().x, this.f153434p.mo211886b().y, true, true);
            m238250a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            if (this.f153419a == 3 && (sketchView2 = this.f153424f) != null) {
                sketchView2.enterScaleMode();
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            if (this.f153419a == 3) {
                if (this.f153442x) {
                    this.f153429k.ag().setVisible(true);
                    this.f153442x = false;
                }
                Coord pointToPercent2 = CoordinateUtil.pointToPercent(motionEvent.getX(), motionEvent.getY(), this.f153432n);
                if (CoordinateUtil.isInContent(motionEvent.getX(), motionEvent.getY(), this.f153432n) && (sketchView = this.f153424f) != null && (sketchView.getCurrentTouchAction() == SketchView.TouchAction.ACTION_MOVE || this.f153424f.getCurrentTouchAction() == SketchView.TouchAction.ACTION_DOWN)) {
                    this.f153424f.touchUp(pointToPercent2, CoordinateUtil.getContentScale(this.f153432n, this.f153425g));
                }
            }
            if (this.f153427i != null) {
                if (this.f153419a == 2) {
                    m238255a(this.f153433o.mo211881c() * this.f153433o.mo211880b(), true);
                } else {
                    m238254a(this.f153434p.mo211886b().x, this.f153434p.mo211886b().y, true, true);
                }
                m238262l();
            } else {
                mo211815f();
            }
            this.f153419a = 0;
        } else if (actionMasked == 6) {
            if (this.f153419a == 2 && motionEvent.getPointerCount() > 2) {
                m238255a(this.f153433o.mo211881c() * this.f153433o.mo211880b(), true);
                if ((motionEvent.getAction() >> 8) == 0) {
                    m238250a(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    m238250a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (actionMasked == 2) {
            int i = this.f153419a;
            if (i == 1) {
                m238253a(motionEvent.getX(), motionEvent.getY(), false);
            } else if (i == 2 && motionEvent.getPointerCount() > 1) {
                m238255a(C61260d.m238317a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1)), false);
            } else if (this.f153419a == 3) {
                if (this.f153429k != null && (Math.abs(motionEvent.getX() - this.f153440v) > ((float) this.f153443y) || Math.abs(motionEvent.getY() - this.f153441w) > ((float) this.f153443y))) {
                    this.f153442x = true;
                    this.f153430l = true;
                    this.f153429k.ag().setVisible(false);
                }
                Pair<Float, Float> calcuCrossPoint = CoordinateUtil.calcuCrossPoint(this.f153438t, this.f153439u, motionEvent, this.f153432n);
                Coord pointToPercent3 = CoordinateUtil.pointToPercent(calcuCrossPoint.getFirst().floatValue(), calcuCrossPoint.getSecond().floatValue(), this.f153432n);
                Coord pointToPercent4 = CoordinateUtil.pointToPercent(motionEvent.getX(), motionEvent.getY(), this.f153432n);
                SketchView sketchView4 = this.f153424f;
                if (sketchView4 != null) {
                    SketchView.TouchAction currentTouchAction = sketchView4.getCurrentTouchAction();
                    if (CoordinateUtil.isInContent(motionEvent.getX(), motionEvent.getY(), this.f153432n)) {
                        if (currentTouchAction == SketchView.TouchAction.NO_ACTION) {
                            this.f153424f.touchDown(pointToPercent3, CoordinateUtil.getContentScale(this.f153432n, this.f153425g));
                            this.f153424f.touchMove(pointToPercent4, CoordinateUtil.getContentScale(this.f153432n, this.f153425g));
                        } else if (currentTouchAction == SketchView.TouchAction.ACTION_DOWN || currentTouchAction == SketchView.TouchAction.ACTION_MOVE) {
                            this.f153424f.touchMove(pointToPercent4, CoordinateUtil.getContentScale(this.f153432n, this.f153425g));
                        }
                    } else if (currentTouchAction == SketchView.TouchAction.ACTION_MOVE) {
                        this.f153424f.touchUp(pointToPercent3, CoordinateUtil.getContentScale(this.f153432n, this.f153425g));
                    }
                }
            }
        }
        this.f153438t = motionEvent.getX();
        this.f153439u = motionEvent.getY();
        this.f153444z.onTouchEvent(motionEvent);
        return true;
    }

    public C61246b(Context context, C61303k kVar) {
        super(context);
        this.f153429k = kVar;
        if (kVar.ag().isInSketch()) {
            mo211804a();
        }
        m238260j();
    }

    /* renamed from: a */
    private void m238255a(float f, boolean z) {
        if (m238264n() && this.f153427i != null) {
            m238261k();
            PointF a = this.f153433o.mo211877a();
            C61262f fVar = this.f153433o;
            fVar.mo211878a(f / fVar.mo211880b());
            mo211807a(C61074b.m237507a(this.f153423e, a.x / ((float) this.f153427i.getWidth()), a.y / ((float) this.f153427i.getHeight()), this.f153433o.mo211881c(), z));
        }
    }

    /* renamed from: a */
    public void mo211805a(float f, float f2) {
        C61245a aVar;
        float f3;
        if (m238264n()) {
            m238261k();
            if (C61260d.m238319b(this.f153432n.width(), this.f153425g.width())) {
                f3 = this.f153425g.width() / this.f153432n.width();
                aVar = new C61245a();
                aVar.mo211801a(true);
            } else {
                aVar = null;
                f3 = this.f153435q;
            }
            m238251a(f, f2, f3, aVar);
        }
    }

    /* renamed from: b */
    private void m238257b(float f, float f2, float f3) {
        m238258b(f, f2, f3, null);
    }

    /* renamed from: a */
    private void m238253a(float f, float f2, boolean z) {
        m238254a(f, f2, z, false);
    }

    /* renamed from: b */
    private void m238259b(float f, float f2, boolean z) {
        if (m238264n() && this.f153427i != null) {
            m238261k();
            if (!C61260d.m238318a(f, BitmapDescriptorFactory.HUE_RED) || !C61260d.m238318a(f2, BitmapDescriptorFactory.HUE_RED)) {
                mo211807a(C61074b.m237508a(this.f153423e, f / ((float) this.f153427i.getWidth()), f2 / ((float) this.f153427i.getHeight()), z));
            }
        }
    }

    /* renamed from: a */
    private void m238250a(float f, float f2, float f3, float f4) {
        this.f153433o.mo211879a(f, f2, f3, f4);
    }

    /* renamed from: b */
    private void m238258b(float f, float f2, float f3, C61245a aVar) {
        m238263m();
        C61263g gVar = new C61263g(f, f2, f3, aVar, new C61263g.AbstractC61264a(aVar) {
            /* class com.ss.android.vc.meeting.p3104c.$$Lambda$b$mmfGNFjdg_uEN8LVbgIDy5cPFQ */
            public final /* synthetic */ C61245a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.meeting.p3104c.C61263g.AbstractC61264a
            public final void onUpdate(float f, float f2, float f3, C61245a aVar, boolean z) {
                C61246b.this.m238256a(this.f$1, f, f2, f3, aVar, z);
            }
        });
        this.f153437s = gVar;
        gVar.start();
    }

    /* renamed from: a */
    private void m238252a(float f, float f2, float f3, boolean z) {
        Size size;
        if (!C61260d.m238318a(f3, 1.0f) && (size = this.f153427i) != null) {
            mo211807a(C61074b.m237507a(this.f153423e, f / ((float) size.getWidth()), f2 / ((float) this.f153427i.getHeight()), f3, z));
        }
    }

    /* renamed from: a */
    private void m238254a(float f, float f2, boolean z, boolean z2) {
        if (m238264n() && this.f153427i != null) {
            m238261k();
            if (!z && !z2 && C61260d.m238320c(C61260d.m238317a(f, f2, this.f153434p.mo211886b().x, this.f153434p.mo211886b().y), (float) this.f153436r)) {
                return;
            }
            if (z2 || (this.f153432n.left <= BitmapDescriptorFactory.HUE_RED && ((double) this.f153432n.right) + 0.001d >= ((double) this.f153427i.getWidth()))) {
                this.f153434p.mo211887b(f, f2);
                mo211807a(C61074b.m237508a(this.f153423e, (f - this.f153434p.mo211884a().x) / ((float) this.f153427i.getWidth()), (f2 - this.f153434p.mo211884a().y) / ((float) this.f153427i.getHeight()), z));
            }
        }
    }

    /* renamed from: a */
    private void m238251a(float f, float f2, float f3, C61245a aVar) {
        if (this.f153427i != null) {
            m238263m();
            if (C61260d.m238320c(f, this.f153432n.left)) {
                f = this.f153432n.left;
            } else if (C61260d.m238319b(f, this.f153432n.right)) {
                f = this.f153432n.right;
            }
            if (C61260d.m238320c(f2, this.f153432n.top)) {
                f2 = this.f153432n.top;
            } else if (C61260d.m238319b(f2, this.f153432n.bottom)) {
                f2 = this.f153432n.bottom;
            }
            float f4 = f - ((f - this.f153432n.left) * f3);
            float f5 = f2 - ((f2 - this.f153432n.top) * f3);
            float f6 = f + ((this.f153432n.right - f) * f3);
            float f7 = f2 + ((this.f153432n.bottom - f2) * f3);
            RectF rectF = new RectF(f4, f5, f6, f7);
            if (rectF.width() < ((float) this.f153427i.getWidth())) {
                rectF.offset(((((float) this.f153427i.getWidth()) - rectF.width()) / 2.0f) - f4, BitmapDescriptorFactory.HUE_RED);
            } else {
                if (C61260d.m238319b(f4, BitmapDescriptorFactory.HUE_RED)) {
                    rectF.offset(BitmapDescriptorFactory.HUE_RED - f4, BitmapDescriptorFactory.HUE_RED);
                }
                if (C61260d.m238320c(f6, (float) this.f153427i.getWidth())) {
                    rectF.offset(((float) this.f153427i.getWidth()) - f6, BitmapDescriptorFactory.HUE_RED);
                }
            }
            if (rectF.height() < ((float) this.f153427i.getHeight())) {
                rectF.offset(BitmapDescriptorFactory.HUE_RED, ((((float) this.f153427i.getHeight()) - rectF.height()) / 2.0f) - f5);
            } else {
                if (C61260d.m238319b(f5, BitmapDescriptorFactory.HUE_RED)) {
                    rectF.offset(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED - f5);
                }
                if (C61260d.m238320c(f7, (float) this.f153427i.getHeight())) {
                    rectF.offset(BitmapDescriptorFactory.HUE_RED, ((float) this.f153427i.getHeight()) - f7);
                }
            }
            m238258b(f3, rectF.left - this.f153432n.left, rectF.top - this.f153432n.top, aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238256a(C61245a aVar, float f, float f2, float f3, C61245a aVar2, boolean z) {
        mo211806a(f, f2, f3);
        if (z && aVar != null && aVar.mo211802a()) {
            mo211819h();
        }
    }
}
