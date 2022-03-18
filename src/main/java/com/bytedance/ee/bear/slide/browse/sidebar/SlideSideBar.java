package com.bytedance.ee.bear.slide.browse.sidebar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class SlideSideBar extends FrameLayout {

    /* renamed from: a */
    public View f30561a;

    /* renamed from: b */
    public ObjectAnimator f30562b;

    /* renamed from: c */
    private float f30563c;

    /* renamed from: d */
    private float f30564d;

    /* renamed from: e */
    private RectF f30565e;

    /* renamed from: f */
    private boolean f30566f;

    /* renamed from: g */
    private AbstractC11384c f30567g;

    /* renamed from: h */
    private int[] f30568h;

    /* renamed from: i */
    private final Runnable f30569i;

    /* renamed from: f */
    private float m47217f() {
        return this.f30561a.getY() / ((float) getDragHandleMaxY());
    }

    public int getDragHandleMaxY() {
        return getHeight() - this.f30561a.getHeight();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13742g.m55710c(this.f30569i);
    }

    /* renamed from: c */
    public void mo43547c() {
        if (!this.f30566f) {
            C13742g.m55710c(this.f30569i);
            C13742g.m55706a(this.f30569i, 1400);
        }
    }

    /* renamed from: d */
    public void mo43549d() {
        View view = this.f30561a;
        if (view != null && view.getVisibility() == 0) {
            this.f30561a.setVisibility(4);
        }
    }

    /* renamed from: e */
    private void m47216e() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.slide_side_bar_layout, (ViewGroup) this, false);
        this.f30561a = inflate;
        addView(inflate);
        this.f30561a.setVisibility(4);
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.slide.browse.sidebar.$$Lambda$SlideSideBar$X7u5qzM_C04W4ulVTO0vSjm1uI8 */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SlideSideBar.lambda$X7u5qzM_C04W4ulVTO0vSjm1uI8(SlideSideBar.this, view, motionEvent);
            }
        });
    }

    /* renamed from: g */
    private int m47218g() {
        this.f30561a.getLocationOnScreen(this.f30568h);
        return C13749l.m55749b((this.f30568h[1] - C13746i.m55722a(getContext())) + (this.f30561a.getHeight() / 2));
    }

    /* renamed from: a */
    public void mo43541a() {
        if (this.f30561a.getVisibility() != 0) {
            this.f30561a.setVisibility(0);
            ObjectAnimator.ofFloat(this.f30561a, "x", (float) getRight(), (float) (getRight() - this.f30561a.getWidth())).setDuration(200L).start();
            mo43547c();
        }
    }

    /* renamed from: b */
    public void mo43545b() {
        C13742g.m55710c(this.f30569i);
        if (this.f30561a.getVisibility() == 0 && this.f30562b == null) {
            View view = this.f30561a;
            ObjectAnimator duration = ObjectAnimator.ofFloat(view, "x", view.getX(), (float) getRight()).setDuration(250L);
            this.f30562b = duration;
            duration.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.ee.bear.slide.browse.sidebar.SlideSideBar.C113791 */

                public void onAnimationEnd(Animator animator) {
                    SlideSideBar.this.f30562b = null;
                    SlideSideBar.this.f30561a.setVisibility(4);
                }
            });
            this.f30562b.start();
        }
    }

    /* renamed from: b */
    public void mo43546b(float f) {
        m47214d(f);
    }

    public void setSlideSideBarListener(AbstractC11384c cVar) {
        this.f30567g = cVar;
    }

    /* renamed from: d */
    private void m47214d(float f) {
        this.f30561a.setY((float) m47215e(f));
    }

    /* renamed from: e */
    private int m47215e(float f) {
        int round = Math.round(f);
        int dragHandleMaxY = getDragHandleMaxY();
        if (round < 0) {
            return 0;
        }
        return round > dragHandleMaxY ? dragHandleMaxY : round;
    }

    /* renamed from: a */
    public void mo43542a(float f) {
        m47214d(this.f30564d + (f - this.f30563c));
    }

    public SlideSideBar(Context context) {
        super(context);
        this.f30568h = new int[2];
        this.f30569i = new Runnable() {
            /* class com.bytedance.ee.bear.slide.browse.sidebar.$$Lambda$PmsZLfmfCezrZonTUeSXSneetqc */

            public final void run() {
                SlideSideBar.this.mo43545b();
            }
        };
        m47216e();
    }

    /* renamed from: c */
    public void mo43548c(float f) {
        mo43542a(f);
        this.f30566f = false;
        this.f30567g.mo43566b(m47217f(), m47218g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 != 3) goto L_0x0065;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo43544a(android.view.MotionEvent r4) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.slide.browse.sidebar.SlideSideBar.mo43544a(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m47213a(View view, MotionEvent motionEvent) {
        return mo43544a(motionEvent);
    }

    public SlideSideBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30568h = new int[2];
        this.f30569i = new Runnable() {
            /* class com.bytedance.ee.bear.slide.browse.sidebar.$$Lambda$PmsZLfmfCezrZonTUeSXSneetqc */

            public final void run() {
                SlideSideBar.this.mo43545b();
            }
        };
        m47216e();
    }

    /* renamed from: a */
    public boolean mo43543a(float f, float f2) {
        if (this.f30561a.getVisibility() != 0) {
            return false;
        }
        if (this.f30565e == null) {
            this.f30565e = new RectF();
        }
        this.f30565e.set((float) (getRight() - this.f30561a.getWidth()), BitmapDescriptorFactory.HUE_RED, (float) getRight(), (float) this.f30561a.getHeight());
        this.f30565e.offset(BitmapDescriptorFactory.HUE_RED, this.f30561a.getY());
        return this.f30565e.contains(f, f2);
    }

    public SlideSideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30568h = new int[2];
        this.f30569i = new Runnable() {
            /* class com.bytedance.ee.bear.slide.browse.sidebar.$$Lambda$PmsZLfmfCezrZonTUeSXSneetqc */

            public final void run() {
                SlideSideBar.this.mo43545b();
            }
        };
        m47216e();
    }
}
