package com.lynx.tasm.behavior.ui.scroll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.huawei.hms.location.LocationRequest;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.AbstractC26746a;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.utils.BorderRadius;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.lynx.tasm.behavior.ui.scroll.a */
public class C26806a extends ScrollView implements AbstractC26746a.AbstractC26747a {

    /* renamed from: a */
    public HorizontalScrollView f66519a;

    /* renamed from: b */
    public int f66520b;

    /* renamed from: c */
    boolean f66521c;

    /* renamed from: d */
    public int f66522d;

    /* renamed from: e */
    public int f66523e;

    /* renamed from: f */
    public boolean f66524f;

    /* renamed from: g */
    public boolean f66525g;

    /* renamed from: h */
    public AbstractC26746a f66526h;

    /* renamed from: i */
    public int f66527i;

    /* renamed from: j */
    public int f66528j;

    /* renamed from: k */
    public int f66529k = LocationRequest.PRIORITY_INDOOR;

    /* renamed from: l */
    public int f66530l;

    /* renamed from: m */
    private LinearLayout f66531m;

    /* renamed from: n */
    private boolean f66532n;

    /* renamed from: o */
    private int f66533o;

    /* renamed from: p */
    private ArrayList<AbstractC26811a> f66534p;

    /* renamed from: q */
    private Runnable f66535q;

    /* renamed from: r */
    private Rect f66536r;

    /* renamed from: com.lynx.tasm.behavior.ui.scroll.a$a */
    public interface AbstractC26811a {
        /* renamed from: a */
        void mo95352a(int i, int i2, int i3, int i4);

        void al_();

        void b_(int i);

        /* renamed from: c */
        void mo95357c();

        /* renamed from: d */
        void mo53300d();
    }

    public int getContentHeight() {
        return this.f66523e;
    }

    public int getContentWidth() {
        return this.f66522d;
    }

    public HorizontalScrollView getHScrollView() {
        return this.f66519a;
    }

    public LinearLayout getLinearLayout() {
        return this.f66531m;
    }

    /* renamed from: e */
    private void m97343e() {
        this.f66535q = new RunnableC26812b(this);
    }

    public int getOrientation() {
        return this.f66531m.getOrientation();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() throws Throwable {
        removeCallbacks(this.f66535q);
        super.finalize();
    }

    public int getRealScrollX() {
        if (this.f66521c) {
            return this.f66519a.getScrollX();
        }
        return getScrollX();
    }

    public int getRealScrollY() {
        if (this.f66521c) {
            return this.f66519a.getScrollY();
        }
        return getScrollY();
    }

    /* renamed from: f */
    private void m97344f() {
        C268093 r0 = new LinearLayout(getContext()) {
            /* class com.lynx.tasm.behavior.ui.scroll.C26806a.C268093 */

            /* access modifiers changed from: protected */
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            }

            /* access modifiers changed from: protected */
            public void dispatchDraw(Canvas canvas) {
                if (C26806a.this.f66526h != null) {
                    C26806a.this.f66526h.mo95123a(canvas);
                }
                super.dispatchDraw(canvas);
                if (C26806a.this.f66526h != null) {
                    C26806a.this.f66526h.mo95128b(canvas);
                }
            }

            /* access modifiers changed from: protected */
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(C26806a.this.f66522d, C26806a.this.f66523e);
            }

            /* access modifiers changed from: protected */
            public boolean drawChild(Canvas canvas, View view, long j) {
                Rect rect;
                boolean z;
                if (C26806a.this.f66526h != null) {
                    rect = C26806a.this.f66526h.mo95120a(canvas, view, j);
                } else {
                    rect = null;
                }
                if (rect != null) {
                    canvas.save();
                    canvas.clipRect(rect);
                    z = super.drawChild(canvas, view, j);
                    canvas.restore();
                } else {
                    z = super.drawChild(canvas, view, j);
                }
                if (C26806a.this.f66526h != null) {
                    C26806a.this.f66526h.mo95129b(canvas, view, j);
                }
                return z;
            }
        };
        this.f66531m = r0;
        r0.setOrientation(1);
        this.f66531m.setWillNotDraw(true);
        this.f66531m.setFocusableInTouchMode(true);
    }

    /* renamed from: i */
    private void m97347i() {
        mo95361a(2);
        Iterator<AbstractC26811a> it = this.f66534p.iterator();
        while (it.hasNext()) {
            it.next().mo53300d();
        }
    }

    /* renamed from: a */
    public void mo95360a() {
        this.f66527i = getScrollY();
        this.f66528j = this.f66519a.getScrollX();
        postDelayed(this.f66535q, (long) this.f66529k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo95372b() {
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setFadingEdgeLength(0);
        setScrollContainer(false);
        this.f66534p = new ArrayList<>();
        this.f66536r = new Rect();
    }

    /* renamed from: c */
    public void mo95373c() {
        mo95361a(1);
        Iterator<AbstractC26811a> it = this.f66534p.iterator();
        while (it.hasNext()) {
            it.next().mo95357c();
        }
    }

    /* renamed from: d */
    public void mo95374d() {
        mo95361a(0);
        Iterator<AbstractC26811a> it = this.f66534p.iterator();
        while (it.hasNext()) {
            it.next().al_();
        }
    }

    public void removeAllViews() {
        if (this.f66532n) {
            this.f66531m.removeAllViews();
            return;
        }
        super.removeAllViews();
        this.f66532n = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.scroll.a$b */
    public static class RunnableC26812b implements Runnable {

        /* renamed from: a */
        private WeakReference<C26806a> f66543a;

        public void run() {
            if (this.f66543a.get() != null) {
                C26806a aVar = this.f66543a.get();
                int scrollY = aVar.getScrollY();
                int scrollX = aVar.f66519a.getScrollX();
                if ((!aVar.f66521c || aVar.f66528j - scrollX != 0) && (aVar.f66521c || aVar.f66527i - scrollY != 0)) {
                    aVar.f66527i = scrollY;
                    aVar.f66528j = scrollX;
                    aVar.postDelayed(this, (long) aVar.f66529k);
                    return;
                }
                aVar.mo95374d();
            }
        }

        public RunnableC26812b(C26806a aVar) {
            this.f66543a = new WeakReference<>(aVar);
        }
    }

    /* renamed from: g */
    private void m97345g() {
        C268104 r0 = new HorizontalScrollView(getContext()) {
            /* class com.lynx.tasm.behavior.ui.scroll.C26806a.C268104 */

            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (C26806a.this.f66521c) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            }

            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (!C26806a.this.f66521c) {
                    return false;
                }
                C26806a.this.mo95365a(motionEvent);
                if (motionEvent.getAction() == 0) {
                    C26806a aVar = C26806a.this;
                    aVar.mo95361a(aVar.f66530l);
                }
                if (motionEvent.getAction() == 1) {
                    C26806a.this.mo95360a();
                }
                return super.onTouchEvent(motionEvent);
            }

            /* access modifiers changed from: protected */
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
            }

            /* access modifiers changed from: protected */
            public void onScrollChanged(int i, int i2, int i3, int i4) {
                super.onScrollChanged(i, i2, i3, i4);
                if (i != C26806a.this.f66520b) {
                    if (!C26806a.this.f66524f || C26806a.this.f66525g) {
                        C26806a.this.mo95363a(i, i2, i3, i4);
                    } else {
                        C26806a.this.f66525g = true;
                        C26806a.this.mo95373c();
                    }
                    if (C26806a.this.f66520b != getScrollX()) {
                        C26806a.this.f66520b = getScrollX();
                    }
                }
            }
        };
        this.f66519a = r0;
        r0.setHorizontalScrollBarEnabled(false);
        this.f66519a.setOverScrollMode(2);
        this.f66519a.setFadingEdgeLength(0);
        this.f66519a.setWillNotDraw(true);
    }

    /* renamed from: h */
    private void m97346h() {
        if (this.f66531m == null) {
            m97344f();
            m97345g();
            this.f66519a.addView(this.f66531m, new FrameLayout.LayoutParams(-1, -1));
            addView(this.f66519a, new FrameLayout.LayoutParams(-2, -2));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.AbstractC26746a.AbstractC26747a
    public void bindDrawChildHook(AbstractC26746a aVar) {
        this.f66526h = aVar;
    }

    public void setOnScrollListener(AbstractC26811a aVar) {
        this.f66534p.add(aVar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f66521c) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void setScrollBarEnable(boolean z) {
        setVerticalScrollBarEnabled(z);
        this.f66519a.setHorizontalScrollBarEnabled(z);
    }

    public C26806a(Context context) {
        super(context);
        mo95372b();
        m97346h();
        m97343e();
    }

    public void addView(View view) {
        if (this.f66532n) {
            this.f66531m.addView(view);
            return;
        }
        super.addView(view);
        this.f66532n = true;
    }

    public void removeView(View view) {
        if (this.f66532n) {
            this.f66531m.removeView(view);
            return;
        }
        super.removeView(view);
        this.f66532n = true;
    }

    public void removeViewAt(int i) {
        if (this.f66532n) {
            this.f66531m.removeViewAt(i);
            return;
        }
        super.removeViewAt(i);
        this.f66532n = true;
    }

    public void setEnableScroll(final boolean z) {
        if (this.f66521c) {
            this.f66519a.setOnTouchListener(new View.OnTouchListener() {
                /* class com.lynx.tasm.behavior.ui.scroll.C26806a.View$OnTouchListenerC268071 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z;
                }
            });
        } else {
            setOnTouchListener(new View.OnTouchListener() {
                /* class com.lynx.tasm.behavior.ui.scroll.C26806a.View$OnTouchListenerC268082 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return !z;
                }
            });
        }
    }

    public void setOrientation(int i) {
        if (i == 0) {
            this.f66531m.setOrientation(0);
            this.f66521c = true;
        } else if (i == 1) {
            this.f66531m.setOrientation(1);
            this.f66521c = false;
        }
    }

    /* renamed from: a */
    public void mo95361a(int i) {
        this.f66530l = i;
        Iterator<AbstractC26811a> it = this.f66534p.iterator();
        while (it.hasNext()) {
            it.next().b_(i);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f66521c) {
            return false;
        }
        mo95365a(motionEvent);
        if (motionEvent.getAction() == 0) {
            mo95361a(this.f66530l);
        }
        if (motionEvent.getAction() == 1) {
            mo95360a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background instanceof BackgroundDrawable) {
            BackgroundDrawable backgroundDrawable = (BackgroundDrawable) background;
            RectF c = backgroundDrawable.mo95487c();
            BorderRadius a = backgroundDrawable.mo95473a();
            Rect bounds = background.getBounds();
            Path path = new Path();
            RectF rectF = new RectF(((float) bounds.left) + c.left, ((float) bounds.top) + c.top + ((float) this.f66533o), ((float) bounds.right) - c.right, (((float) bounds.bottom) - c.bottom) + ((float) this.f66533o));
            if (a == null) {
                path.addRect(rectF, Path.Direction.CW);
            } else {
                path.addRoundRect(rectF, BackgroundDrawable.C26824a.m97486a(a.mo95508b(), c, 1.0f), Path.Direction.CW);
            }
            int save = canvas.save();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (Build.VERSION.SDK_INT < 18) {
                this.f66536r.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
                canvas.clipRect(this.f66536r);
            } else if (!viewGroup.getClipChildren() && getClipBounds() == null) {
                this.f66536r.set(getScrollX(), getScrollY(), getScrollX() + getWidth(), getScrollY() + getHeight());
                canvas.clipRect(this.f66536r);
            }
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    public void mo95365a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            this.f66524f = true;
        } else if (motionEvent.getAction() == 1) {
            if (this.f66525g) {
                m97347i();
            }
            this.f66525g = false;
            this.f66524f = false;
        }
    }

    /* renamed from: a */
    public void mo95366a(View view) {
        Field field = null;
        try {
            if (view instanceof HorizontalScrollView) {
                field = HorizontalScrollView.class.getDeclaredField("mScroller");
            } else if (view instanceof ScrollView) {
                field = ScrollView.class.getDeclaredField("mScroller");
            }
            if (field == null) {
                LLog.m96427d("AndroidScrollView", "did not find mScroller in " + view.getClass().getName());
                return;
            }
            field.setAccessible(true);
            OverScroller overScroller = (OverScroller) field.get(view);
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
        } catch (Throwable th) {
            LLog.m96427d("AndroidScrollView", th.getMessage());
        }
    }

    /* renamed from: a */
    public void mo95362a(int i, int i2) {
        this.f66523e = i2;
        this.f66522d = i;
        LinearLayout linearLayout = this.f66531m;
        if (linearLayout != null) {
            linearLayout.requestLayout();
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        if (this.f66532n) {
            this.f66531m.addView(view, i);
            return;
        }
        super.addView(view, i);
        this.f66532n = true;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.f66532n) {
            this.f66531m.addView(view, layoutParams);
            return;
        }
        super.addView(view, layoutParams);
        this.f66532n = true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        if (this.f66532n) {
            this.f66531m.addView(view, i, i2);
            return;
        }
        super.addView(view, i, i2);
        this.f66532n = true;
    }

    /* renamed from: a */
    public void mo95364a(int i, int i2, boolean z) {
        if (this.f66520b != i || this.f66533o != i2) {
            if (z) {
                if (this.f66521c) {
                    this.f66519a.smoothScrollTo(i, i2);
                } else {
                    smoothScrollTo(i, i2);
                }
            } else if (this.f66521c) {
                mo95366a(this.f66519a);
                this.f66519a.scrollTo(i, i2);
            } else {
                mo95366a(this);
                scrollTo(i, i2);
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f66532n) {
            this.f66531m.addView(view, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
        this.f66532n = true;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f66531m.setPadding(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 != this.f66533o) {
            if (!this.f66524f || this.f66525g) {
                mo95363a(i, i2, i3, i4);
            } else {
                this.f66525g = true;
                mo95373c();
            }
            if (this.f66533o != getScrollY()) {
                this.f66533o = getScrollY();
            }
        }
    }

    /* renamed from: a */
    public void mo95363a(int i, int i2, int i3, int i4) {
        mo95361a(this.f66530l);
        Iterator<AbstractC26811a> it = this.f66534p.iterator();
        while (it.hasNext()) {
            it.next().mo95352a(i, i2, i3, i4);
        }
    }
}
