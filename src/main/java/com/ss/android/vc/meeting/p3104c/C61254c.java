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
import com.ss.android.vc.irtc.AbstractC61030i;
import com.ss.android.vc.irtc.AbstractC61060l;
import com.ss.android.vc.irtc.utils.C61074b;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.p3104c.C61263g;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.vc.meeting.c.c */
public class C61254c extends FrameLayout {

    /* renamed from: a */
    protected boolean f153451a = true;

    /* renamed from: b */
    protected int f153452b;

    /* renamed from: c */
    protected WeakReference<View.OnClickListener> f153453c = new WeakReference<>(null);

    /* renamed from: d */
    protected WeakReference<View.OnLongClickListener> f153454d = new WeakReference<>(null);

    /* renamed from: e */
    protected WeakReference<AbstractC61259a> f153455e = new WeakReference<>(null);

    /* renamed from: f */
    protected RectF f153456f = new RectF();

    /* renamed from: g */
    protected View f153457g;

    /* renamed from: h */
    protected C61262f f153458h = new C61262f();

    /* renamed from: i */
    protected C61265h f153459i = new C61265h();

    /* renamed from: j */
    protected RectF f153460j = new RectF();

    /* renamed from: k */
    protected boolean f153461k = true;

    /* renamed from: l */
    protected float f153462l;

    /* renamed from: m */
    protected Size f153463m;

    /* renamed from: n */
    protected int f153464n;

    /* renamed from: o */
    protected float f153465o;

    /* renamed from: p */
    protected float f153466p;

    /* renamed from: q */
    protected float f153467q;

    /* renamed from: r */
    protected float f153468r;

    /* renamed from: s */
    protected C61263g f153469s;

    /* renamed from: t */
    protected WeakReference<AbstractC61030i> f153470t = new WeakReference<>(null);

    /* renamed from: u */
    protected GestureDetector f153471u = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
        /* class com.ss.android.vc.meeting.p3104c.C61254c.C612551 */

        public boolean onDoubleTap(MotionEvent motionEvent) {
            AbstractC61259a aVar = C61254c.this.f153455e.get();
            if (aVar == null || C61254c.this.f153457g == null) {
                return true;
            }
            aVar.onDoubleTap(C61254c.this.f153457g);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View.OnLongClickListener onLongClickListener = C61254c.this.f153454d.get();
            if (onLongClickListener != null && C61254c.this.f153457g != null) {
                onLongClickListener.onLongClick(C61254c.this.f153457g);
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            View.OnClickListener onClickListener = C61254c.this.f153453c.get();
            if (onClickListener == null || C61254c.this.f153457g == null) {
                C60700b.m235851b("GestureWrapper", "[onSingleTapConfirmed]", "Click listener is null");
                return true;
            }
            onClickListener.onClick(C61254c.this.f153457g);
            return true;
        }
    });

    /* renamed from: com.ss.android.vc.meeting.c.c$a */
    public interface AbstractC61259a {
        void onDoubleTap(View view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211848a(RectF rectF) {
        if (rectF == null) {
            C60700b.m235864f("GestureWrapper", "[saveContentBound]", "Content rect is null.");
        } else {
            mo211849a(rectF, this.f153456f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211849a(RectF rectF, RectF rectF2) {
        if (rectF == null || rectF2 == null) {
            C60700b.m235864f("GestureWrapper", "[convertRtcRect]", "Sdk or content rect is null.");
        } else if (this.f153463m != null) {
            rectF2.left = rectF.left * ((float) this.f153463m.getWidth());
            rectF2.right = rectF.right * ((float) this.f153463m.getWidth());
            rectF2.top = rectF.top * ((float) this.f153463m.getHeight());
            rectF2.bottom = rectF.bottom * ((float) this.f153463m.getHeight());
        }
    }

    /* renamed from: h */
    private void m238289h() {
        this.f153464n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: c */
    public void mo211854c() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.p3104c.$$Lambda$c$T5ECUbif6wQo3e8agna3DRr_iU */

            public final void run() {
                C61254c.m271174lambda$T5ECUbif6wQo3e8agna3DRr_iU(C61254c.this);
            }
        });
    }

    /* renamed from: e */
    public void mo211858e() {
        C61263g gVar = this.f153469s;
        if (gVar != null && gVar.isRunning()) {
            this.f153469s.end();
        }
    }

    /* access modifiers changed from: protected */
    public RectF getRenderContentBound() {
        if (this.f153457g == null) {
            return null;
        }
        return this.f153456f;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m238290i() {
        this.f153463m = null;
        mo211859f();
        C61261e.m238322b(this.f153460j);
        C61261e.m238322b(this.f153456f);
    }

    /* renamed from: b */
    public void mo211850b() {
        this.f153470t = new WeakReference<>(null);
        if (this.f153457g != null) {
            C61237h.m238223a().mo210501a(this.f153457g, (AbstractC61030i) null);
            C61237h.m238223a().mo210502a(this.f153457g, (AbstractC61060l) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo211860g() {
        View view = this.f153457g;
        if (view == null || !C61261e.m238321a(C61074b.m237516d(view))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo211859f() {
        C61074b.m237515c(this.f153457g);
        this.f153456f.left = this.f153460j.left;
        this.f153456f.top = this.f153460j.top;
        this.f153456f.right = this.f153460j.right;
        this.f153456f.bottom = this.f153460j.bottom;
    }

    /* renamed from: a */
    public void mo211840a() {
        if (this.f153461k || (!C61261e.m238321a(this.f153460j) && this.f153463m != null)) {
            RectF d = C61074b.m237516d(this.f153457g);
            mo211849a(d, this.f153460j);
            mo211849a(d, this.f153456f);
            C60700b.m235851b("GestureWrapper", "[initOpContext]", "originRectF = " + this.f153460j);
            this.f153462l = 5.0f;
            C61074b.m237514b(this.f153457g, 10.0f);
            this.f153461k = false;
        }
    }

    public String toString() {
        return "GestureWrapper{mContentBound=" + this.f153456f + ", mOriginRectF=" + this.f153460j + ", mMaxScale=" + this.f153462l + ", mViewSize=" + this.f153463m + ", mTouchSlopSquare=" + this.f153464n + '}';
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo211857d() {
        /*
        // Method dump skipped, instructions count: 350
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.p3104c.C61254c.mo211857d():void");
    }

    public void setGestureEnable(boolean z) {
        this.f153451a = z;
    }

    public void setCornerRadius(float f) {
        View view = this.f153457g;
        if (view != null) {
            C61074b.m237510a(view, f);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f153453c = new WeakReference<>(onClickListener);
    }

    public void setOnDoubleTapListener(AbstractC61259a aVar) {
        this.f153455e = new WeakReference<>(aVar);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f153454d = new WeakReference<>(onLongClickListener);
    }

    public void setRtcEglRenderListener(AbstractC61030i iVar) {
        this.f153470t = new WeakReference<>(iVar);
    }

    public void setAutoRenderMode(boolean z) {
        if (this.f153457g != null) {
            C61237h.m238223a().mo210505a(this.f153457g, z);
        }
    }

    public void setRenderMode(int i) {
        if (this.f153457g != null) {
            C61237h.m238223a().mo210500a(this.f153457g, 0);
        }
    }

    /* renamed from: a */
    public C61254c mo211839a(View view) {
        this.f153457g = view;
        C61237h.m238223a().mo210501a(this.f153457g, new AbstractC61030i() {
            /* class com.ss.android.vc.meeting.p3104c.C61254c.C612562 */

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: d */
            public void mo210661d() {
            }

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: b */
            public void mo210659b() {
                AbstractC61030i iVar = C61254c.this.f153470t.get();
                if (iVar != null) {
                    iVar.mo210659b();
                }
            }

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: a */
            public void mo210658a() {
                AbstractC61030i iVar = C61254c.this.f153470t.get();
                if (iVar != null) {
                    C60700b.m235851b("GestureWrapper", "[onBeginRender]", "callback");
                    iVar.mo210658a();
                }
                C60700b.m235851b("GestureWrapper", "[onBeginRender2]", "onBeginRender");
            }

            @Override // com.ss.android.vc.irtc.AbstractC61030i
            /* renamed from: c */
            public void mo210660c() {
                C61254c.this.mo211854c();
                AbstractC61030i iVar = C61254c.this.f153470t.get();
                if (iVar != null) {
                    iVar.mo210660c();
                }
            }
        });
        C61237h.m238223a().mo210502a(this.f153457g, new AbstractC61060l() {
            /* class com.ss.android.vc.meeting.p3104c.C61254c.C612573 */

            @Override // com.ss.android.vc.irtc.AbstractC61060l
            /* renamed from: a */
            public void mo211279a(RectF rectF) {
            }

            @Override // com.ss.android.vc.irtc.AbstractC61060l
            /* renamed from: a */
            public void mo211278a() {
                C61254c.this.f153457g.post(new Runnable() {
                    /* class com.ss.android.vc.meeting.p3104c.C61254c.C612573.RunnableC612581 */

                    public void run() {
                        RectF d = C61074b.m237516d(C61254c.this.f153457g);
                        if (!(C61254c.this.f153463m != null && C61254c.this.f153463m.getWidth() == C61254c.this.f153457g.getWidth() && C61254c.this.f153463m.getHeight() == C61254c.this.f153457g.getHeight())) {
                            C61254c.this.f153463m = new Size(C61254c.this.f153457g.getWidth(), C61254c.this.f153457g.getHeight());
                        }
                        C61254c.this.mo211849a(d, C61254c.this.f153460j);
                        C61254c.this.f153461k = true;
                        C60700b.m235851b("GestureWrapper", "[onBaseFrameRecal]", "originRectF = " + C61254c.this.f153460j);
                        C61254c.this.mo211848a(d);
                    }
                });
            }
        });
        removeAllViews();
        addView(view, 0, new FrameLayout.LayoutParams(-1, -1));
        invalidate();
        this.f153463m = null;
        return this;
    }

    public boolean canScrollHorizontally(int i) {
        if (!isShown()) {
            return false;
        }
        if (this.f153452b == 2) {
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
        if (this.f153452b == 2) {
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

    public C61254c(Context context) {
        super(context);
        m238289h();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (!mo211860g() || !this.f153451a) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f153467q = motionEvent.getX();
            this.f153468r = motionEvent.getY();
            if (this.f153463m == null) {
                this.f153463m = new Size(this.f153457g.getWidth(), this.f153457g.getHeight());
            }
            mo211858e();
            this.f153452b = 1;
            this.f153459i.mo211885a(motionEvent.getX(), motionEvent.getY());
        } else if (actionMasked == 5) {
            this.f153452b = 2;
            mo211846a(this.f153459i.mo211886b().x, this.f153459i.mo211886b().y, true, true);
            mo211842a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        } else if (actionMasked == 1 || actionMasked == 3) {
            if (this.f153463m != null) {
                if (this.f153452b == 2) {
                    mo211847a(this.f153458h.mo211881c() * this.f153458h.mo211880b(), true);
                } else {
                    mo211846a(this.f153459i.mo211886b().x, this.f153459i.mo211886b().y, true, true);
                }
                mo211857d();
            } else {
                mo211854c();
            }
            this.f153452b = 0;
        } else if (actionMasked == 6) {
            if (this.f153452b == 2 && motionEvent.getPointerCount() > 2) {
                mo211847a(this.f153458h.mo211881c() * this.f153458h.mo211880b(), true);
                if ((motionEvent.getAction() >> 8) == 0) {
                    mo211842a(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    mo211842a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (actionMasked == 2) {
            int i = this.f153452b;
            if (i == 1) {
                mo211845a(motionEvent.getX(), motionEvent.getY(), false);
            } else if (i == 2 && motionEvent.getPointerCount() > 1) {
                mo211847a(C61260d.m238317a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1)), false);
            }
        }
        this.f153465o = motionEvent.getX();
        this.f153466p = motionEvent.getY();
        this.f153471u.onTouchEvent(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211847a(float f, boolean z) {
        if (mo211860g() && this.f153463m != null) {
            mo211840a();
            PointF a = this.f153458h.mo211877a();
            C61262f fVar = this.f153458h;
            fVar.mo211878a(f / fVar.mo211880b());
            mo211848a(C61074b.m237507a(this.f153457g, a.x / ((float) this.f153463m.getWidth()), a.y / ((float) this.f153463m.getHeight()), this.f153458h.mo211881c(), z));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211841a(float f, float f2, float f3) {
        mo211852b(f, f2, f3, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo211851b(float f, float f2, float f3) {
        mo211844a(this.f153456f.left, this.f153456f.top, f, false);
        mo211844a(this.f153456f.left, this.f153456f.top, f, true);
        mo211853b(f2, f3, false);
        mo211853b(f2, f3, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo211853b(float f, float f2, boolean z) {
        if (mo211860g() && this.f153463m != null) {
            mo211840a();
            if (!C61260d.m238318a(f, BitmapDescriptorFactory.HUE_RED) || !C61260d.m238318a(f2, BitmapDescriptorFactory.HUE_RED)) {
                mo211848a(C61074b.m237508a(this.f153457g, f / ((float) this.f153463m.getWidth()), f2 / ((float) this.f153463m.getHeight()), z));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211845a(float f, float f2, boolean z) {
        mo211846a(f, f2, z, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211842a(float f, float f2, float f3, float f4) {
        this.f153458h.mo211879a(f, f2, f3, f4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo211852b(float f, float f2, float f3, C61245a aVar) {
        mo211858e();
        C61263g gVar = new C61263g(f, f2, f3, aVar, new C61263g.AbstractC61264a(aVar) {
            /* class com.ss.android.vc.meeting.p3104c.$$Lambda$c$u1SL8QijjuGJZOA46Gc8TyrJqew */
            public final /* synthetic */ C61245a f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.meeting.p3104c.C61263g.AbstractC61264a
            public final void onUpdate(float f, float f2, float f3, C61245a aVar, boolean z) {
                C61254c.lambda$u1SL8QijjuGJZOA46Gc8TyrJqew(C61254c.this, this.f$1, f, f2, f3, aVar, z);
            }
        });
        this.f153469s = gVar;
        gVar.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211844a(float f, float f2, float f3, boolean z) {
        Size size;
        if (!C61260d.m238318a(f3, 1.0f) && (size = this.f153463m) != null) {
            mo211848a(C61074b.m237507a(this.f153457g, f / ((float) size.getWidth()), f2 / ((float) this.f153463m.getHeight()), f3, z));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211843a(float f, float f2, float f3, C61245a aVar) {
        if (this.f153463m != null) {
            mo211858e();
            if (C61260d.m238320c(f, this.f153456f.left)) {
                f = this.f153456f.left;
            } else if (C61260d.m238319b(f, this.f153456f.right)) {
                f = this.f153456f.right;
            }
            if (C61260d.m238320c(f2, this.f153456f.top)) {
                f2 = this.f153456f.top;
            } else if (C61260d.m238319b(f2, this.f153456f.bottom)) {
                f2 = this.f153456f.bottom;
            }
            float f4 = f - ((f - this.f153456f.left) * f3);
            float f5 = f2 - ((f2 - this.f153456f.top) * f3);
            float f6 = f + ((this.f153456f.right - f) * f3);
            float f7 = f2 + ((this.f153456f.bottom - f2) * f3);
            RectF rectF = new RectF(f4, f5, f6, f7);
            if (rectF.width() < ((float) this.f153463m.getWidth())) {
                rectF.offset(((((float) this.f153463m.getWidth()) - rectF.width()) / 2.0f) - f4, BitmapDescriptorFactory.HUE_RED);
            } else {
                if (C61260d.m238319b(f4, BitmapDescriptorFactory.HUE_RED)) {
                    rectF.offset(BitmapDescriptorFactory.HUE_RED - f4, BitmapDescriptorFactory.HUE_RED);
                }
                if (C61260d.m238320c(f6, (float) this.f153463m.getWidth())) {
                    rectF.offset(((float) this.f153463m.getWidth()) - f6, BitmapDescriptorFactory.HUE_RED);
                }
            }
            if (rectF.height() < ((float) this.f153463m.getHeight())) {
                rectF.offset(BitmapDescriptorFactory.HUE_RED, ((((float) this.f153463m.getHeight()) - rectF.height()) / 2.0f) - f5);
            } else {
                if (C61260d.m238319b(f5, BitmapDescriptorFactory.HUE_RED)) {
                    rectF.offset(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED - f5);
                }
                if (C61260d.m238320c(f7, (float) this.f153463m.getHeight())) {
                    rectF.offset(BitmapDescriptorFactory.HUE_RED, ((float) this.f153463m.getHeight()) - f7);
                }
            }
            mo211852b(f3, rectF.left - this.f153456f.left, rectF.top - this.f153456f.top, aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo211846a(float f, float f2, boolean z, boolean z2) {
        if (mo211860g() && this.f153463m != null) {
            mo211840a();
            if (!z && !z2 && C61260d.m238320c(C61260d.m238317a(f, f2, this.f153459i.mo211886b().x, this.f153459i.mo211886b().y), (float) this.f153464n)) {
                return;
            }
            if (z2 || (this.f153456f.left <= BitmapDescriptorFactory.HUE_RED && ((double) this.f153456f.right) + 0.001d >= ((double) this.f153463m.getWidth()))) {
                this.f153459i.mo211887b(f, f2);
                mo211848a(C61074b.m237508a(this.f153457g, (f - this.f153459i.mo211884a().x) / ((float) this.f153463m.getWidth()), (f2 - this.f153459i.mo211884a().y) / ((float) this.f153463m.getHeight()), z));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m238288a(C61245a aVar, float f, float f2, float f3, C61245a aVar2, boolean z) {
        mo211851b(f, f2, f3);
        if (z && aVar != null && aVar.mo211802a()) {
            mo211859f();
        }
    }
}
