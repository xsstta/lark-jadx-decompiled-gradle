package com.ss.android.lark.slideback;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.C0859a;
import androidx.core.view.C0908j;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.customview.p030a.C0959c;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SlideFrameLayout extends ViewGroup {

    /* renamed from: D */
    private static final AbstractC54915j f135534D;

    /* renamed from: E */
    private static Field f135535E = null;

    /* renamed from: l */
    static GlobalSlideLayoutCallback f135536l = null;

    /* renamed from: m */
    static boolean f135537m = false;

    /* renamed from: r */
    private static final int f135538r = 2131235711;

    /* renamed from: A */
    private boolean f135539A;

    /* renamed from: B */
    private Rect f135540B;

    /* renamed from: C */
    private List<Rect> f135541C;

    /* renamed from: F */
    private boolean f135542F;

    /* renamed from: G */
    private boolean f135543G;

    /* renamed from: H */
    private boolean f135544H;

    /* renamed from: I */
    private float f135545I;

    /* renamed from: a */
    public boolean f135546a;

    /* renamed from: b */
    public View f135547b;

    /* renamed from: c */
    public float f135548c;

    /* renamed from: d */
    public int f135549d;

    /* renamed from: e */
    public boolean f135550e;

    /* renamed from: f */
    public List<AbstractC54913h> f135551f;

    /* renamed from: g */
    public final C0959c f135552g;

    /* renamed from: h */
    public boolean f135553h;

    /* renamed from: i */
    public final C54909d f135554i;

    /* renamed from: j */
    public final ArrayList<RunnableC54907b> f135555j;

    /* renamed from: k */
    public BackgroundArtist f135556k;

    /* renamed from: n */
    public OverScroller f135557n;

    /* renamed from: o */
    public C54911f f135558o;

    /* renamed from: p */
    public Drawable f135559p;

    /* renamed from: q */
    public boolean f135560q;

    /* renamed from: s */
    private Drawable f135561s;

    /* renamed from: t */
    private float f135562t;

    /* renamed from: u */
    private float f135563u;

    /* renamed from: v */
    private float f135564v;

    /* renamed from: w */
    private float f135565w;

    /* renamed from: x */
    private float f135566x;

    /* renamed from: y */
    private boolean f135567y;

    /* renamed from: z */
    private final Rect f135568z;

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$e */
    public interface AbstractC54910e {
        /* renamed from: a */
        void mo187267a();
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$f */
    private static class C54911f {

        /* renamed from: a */
        AbstractC54910e f135592a;

        /* renamed from: b */
        int f135593b;

        /* renamed from: c */
        Interpolator f135594c;
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$g */
    public static class C54912g implements AbstractC54914i {
        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22168a(View view, float f) {
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54914i
        /* renamed from: a */
        public void mo168888a(View view, float f, float f2) {
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22169a(View view, int i) {
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54914i
        /* renamed from: a */
        public void mo168889a(View view, int i, int i2, int i3, int i4) {
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h
        /* renamed from: a */
        public void mo22170a(View view, boolean z) {
        }
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$h */
    public interface AbstractC54913h {
        /* renamed from: a */
        void mo22168a(View view, float f);

        /* renamed from: a */
        void mo22169a(View view, int i);

        /* renamed from: a */
        void mo22170a(View view, boolean z);
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$i */
    public interface AbstractC54914i extends AbstractC54913h {
        /* renamed from: a */
        void mo168888a(View view, float f, float f2);

        /* renamed from: a */
        void mo168889a(View view, int i, int i2, int i3, int i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$j */
    public interface AbstractC54915j {
        /* renamed from: a */
        void mo187268a(SlideFrameLayout slideFrameLayout, View view);
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$k */
    static class C54916k implements AbstractC54915j {
        C54916k() {
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54915j
        /* renamed from: a */
        public void mo187268a(SlideFrameLayout slideFrameLayout, View view) {
            ViewCompat.m4032a(slideFrameLayout, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$m */
    static class C54918m extends C54916k {
        C54918m() {
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54915j, com.ss.android.lark.slideback.SlideFrameLayout.C54916k
        /* renamed from: a */
        public void mo187268a(SlideFrameLayout slideFrameLayout, View view) {
            ViewCompat.m4036a(view, ((LayoutParams) view.getLayoutParams()).f135580d);
        }
    }

    public BackgroundArtist getBackgroundArtist() {
        return this.f135556k;
    }

    public int getSlideRange() {
        return this.f135549d;
    }

    /* renamed from: a */
    public void mo187225a(AbstractC54913h hVar) {
        if (hVar != null) {
            if (this.f135551f == null) {
                this.f135551f = new ArrayList();
            }
            this.f135551f.add(hVar);
        }
    }

    /* renamed from: a */
    public void mo187224a(final AbstractC54910e eVar, int i, Interpolator interpolator) {
        View view;
        if (this.f135546a && this.f135549d > 0 && (view = this.f135547b) != null && this.f135554i != null) {
            this.f135547b.offsetLeftAndRight(((getPaddingLeft() + ((LayoutParams) view.getLayoutParams()).leftMargin) + this.f135549d) - this.f135547b.getLeft());
            this.f135554i.f135587b = false;
            this.f135542F = true;
            if (interpolator != null) {
                OverScroller overScroller = new OverScroller(getContext(), interpolator);
                OverScroller scroller = getScroller();
                this.f135557n = scroller;
                if (scroller != null) {
                    setScroller(overScroller);
                    mo187225a(new C54912g() {
                        /* class com.ss.android.lark.slideback.SlideFrameLayout.C549032 */

                        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h, com.ss.android.lark.slideback.SlideFrameLayout.C54912g
                        /* renamed from: a */
                        public void mo22169a(View view, int i) {
                            if (i == 0) {
                                Log.m165397w("SlideFrameLayout", "slide in animation is over");
                                if (SlideFrameLayout.this.f135551f != null && SlideFrameLayout.this.f135551f.contains(this)) {
                                    SlideFrameLayout.this.mo187229b(this);
                                    if (SlideFrameLayout.this.f135557n != null) {
                                        SlideFrameLayout slideFrameLayout = SlideFrameLayout.this;
                                        slideFrameLayout.setScroller(slideFrameLayout.f135557n);
                                    }
                                }
                            }
                        }
                    });
                }
            }
            m212892a(BitmapDescriptorFactory.HUE_RED, 0, i);
            if (eVar != null) {
                final C549043 r5 = new C54912g() {
                    /* class com.ss.android.lark.slideback.SlideFrameLayout.C549043 */

                    @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54913h, com.ss.android.lark.slideback.SlideFrameLayout.C54912g
                    /* renamed from: a */
                    public void mo22169a(View view, int i) {
                        if (i == 0) {
                            SlideFrameLayout.this.mo187226a(this, eVar);
                        }
                    }
                };
                mo187225a(r5);
                postDelayed(new Runnable() {
                    /* class com.ss.android.lark.slideback.SlideFrameLayout.RunnableC549054 */

                    public void run() {
                        SlideFrameLayout.this.mo187226a(r5, eVar);
                    }
                }, 500);
            }
        }
    }

    /* renamed from: a */
    public void mo187226a(AbstractC54913h hVar, AbstractC54910e eVar) {
        List<AbstractC54913h> list = this.f135551f;
        if (list != null && list.contains(hVar)) {
            mo187229b(hVar);
            this.f135554i.f135587b = true;
            this.f135542F = false;
            eVar.mo187267a();
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f135576e = {16843137};

        /* renamed from: a */
        public float f135577a;

        /* renamed from: b */
        boolean f135578b;

        /* renamed from: c */
        boolean f135579c;

        /* renamed from: d */
        Paint f135580d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f135576e);
            this.f135577a = obtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    private void m212895e() {
        try {
            this.f135552g.mo4885g();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    private void m212897f() {
        try {
            this.f135552g.mo4886h();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$d */
    public class C54909d extends View {

        /* renamed from: a */
        public WeakReference<View> f135586a = new WeakReference<>(null);

        /* renamed from: b */
        public boolean f135587b = true;

        /* renamed from: d */
        private Paint f135589d = new Paint();

        /* renamed from: e */
        private int f135590e = 136;

        /* renamed from: f */
        private boolean f135591f;

        public View getHostView() {
            return this.f135586a.get();
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f135586a.get() != null) {
                this.f135586a.clear();
            }
        }

        /* renamed from: a */
        public void mo187261a(boolean z) {
            this.f135591f = z;
        }

        public void setHostView(View view) {
            if (!this.f135591f && this.f135586a.get() != view) {
                this.f135586a.clear();
                this.f135586a = new WeakReference<>(view);
            }
        }

        public void setHostViewExplicitly(View view) {
            if (this.f135586a.get() != view) {
                this.f135586a.clear();
                this.f135586a = new WeakReference<>(view);
            }
        }

        public void draw(Canvas canvas) {
            if ((SlideFrameLayout.this.f135548c > BitmapDescriptorFactory.HUE_RED && SlideFrameLayout.this.f135546a) || SlideFrameLayout.this.f135560q) {
                try {
                    if (SlideFrameLayout.this.f135556k != null) {
                        SlideFrameLayout.this.f135556k.mo168901a(this, canvas);
                    }
                    View view = this.f135586a.get();
                    if (view != null) {
                        super.draw(canvas);
                        canvas.save();
                        canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (getHeight() - view.getHeight()));
                        view.draw(canvas);
                        canvas.restore();
                    } else if (SlideFrameLayout.this.f135559p != null) {
                        SlideFrameLayout.this.f135559p.draw(canvas);
                    }
                } catch (Throwable unused) {
                }
            } else if (this.f135586a.get() != null) {
                this.f135586a.clear();
            }
        }

        public C54909d(Context context) {
            super(context);
        }
    }

    /* renamed from: g */
    private static boolean m212898g() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo187230c() {
        this.f135552g.mo4868a(this.f135547b, 0, 0);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        GlobalSlideLayoutCallback dVar = f135536l;
        if (dVar != null) {
            dVar.mo187279a(this);
        }
        this.f135567y = true;
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$b */
    private class RunnableC54907b implements Runnable {

        /* renamed from: a */
        final View f135583a;

        /* renamed from: b */
        final /* synthetic */ SlideFrameLayout f135584b;

        public void run() {
            if (this.f135583a.getParent() == this.f135584b) {
                ViewCompat.m4033a(this.f135583a, 0, (Paint) null);
                this.f135584b.mo187228b(this.f135583a);
            }
            this.f135584b.f135555j.remove(this);
        }
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$l */
    static class C54917l extends C54916k {

        /* renamed from: a */
        private Method f135595a;

        /* renamed from: b */
        private Field f135596b;

        C54917l() {
            try {
                this.f135595a = View.class.getDeclaredMethod("getDisplayList", null);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Field declaredField = View.class.getDeclaredField("mRecreateDisplayList");
                this.f135596b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
        }

        @Override // com.ss.android.lark.slideback.SlideFrameLayout.AbstractC54915j, com.ss.android.lark.slideback.SlideFrameLayout.C54916k
        /* renamed from: a */
        public void mo187268a(SlideFrameLayout slideFrameLayout, View view) {
            Field field;
            if (this.f135595a == null || (field = this.f135596b) == null) {
                view.invalidate();
                return;
            }
            try {
                field.setBoolean(view, true);
                this.f135595a.invoke(view, null);
            } catch (Exception unused) {
            }
            super.mo187268a(slideFrameLayout, view);
        }
    }

    private OverScroller getScroller() {
        Field scrollerOfViewDragHelper;
        if (!(this.f135552g == null || (scrollerOfViewDragHelper = getScrollerOfViewDragHelper()) == null)) {
            try {
                Object obj = scrollerOfViewDragHelper.get(this.f135552g);
                if (obj instanceof OverScroller) {
                    return (OverScroller) obj;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo187219a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public void mo187227b() {
        this.f135553h = false;
        this.f135567y = true;
        this.f135548c = BitmapDescriptorFactory.HUE_RED;
        this.f135564v = BitmapDescriptorFactory.HUE_RED;
        this.f135565w = BitmapDescriptorFactory.HUE_RED;
        m212897f();
        requestLayout();
        m212891a(this.f135547b, 0, 0, 0, 0);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f135534D = new C54918m();
        } else if (i >= 16) {
            f135534D = new C54917l();
        } else {
            f135534D = new C54916k();
        }
    }

    /* renamed from: d */
    private void m212894d() {
        View view;
        if (this.f135543G && (view = this.f135547b) != null && view.getLayoutParams() != null && this.f135549d > 0 && this.f135554i != null) {
            this.f135543G = false;
            this.f135547b.offsetLeftAndRight(((getPaddingLeft() + ((LayoutParams) this.f135547b.getLayoutParams()).leftMargin) + this.f135549d) - this.f135547b.getLeft());
            post(new Runnable() {
                /* class com.ss.android.lark.slideback.SlideFrameLayout.RunnableC549021 */

                public void run() {
                    SlideFrameLayout slideFrameLayout = SlideFrameLayout.this;
                    slideFrameLayout.mo187224a(slideFrameLayout.f135558o.f135592a, SlideFrameLayout.this.f135558o.f135593b, SlideFrameLayout.this.f135558o.f135594c);
                    SlideFrameLayout.this.f135558o = null;
                }
            });
        }
    }

    private Field getScrollerOfViewDragHelper() {
        Field field = f135535E;
        if (field != null) {
            return field;
        }
        Field field2 = null;
        try {
            field2 = C0959c.class.getDeclaredField("scroller");
            field2.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        if (field2 == null) {
            try {
                field2 = C0959c.class.getDeclaredField("mScroller");
                field2.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
        }
        if (field2 == null) {
            Log.m165383e("SlideFrameLayout", "no scroller filed found");
        }
        f135535E = field2;
        return field2;
    }

    public void computeScroll() {
        boolean a = this.f135552g.mo4869a(true);
        List<AbstractC54913h> list = this.f135551f;
        if (list != null) {
            for (AbstractC54913h hVar : list) {
                hVar.mo22170a(this, a);
            }
        }
        if (!a) {
            return;
        }
        if (!this.f135546a) {
            m212897f();
        } else {
            ViewCompat.m4073e(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GlobalSlideLayoutCallback dVar = f135536l;
        if (dVar != null) {
            dVar.mo187280b(this);
        }
        this.f135567y = true;
        Iterator it = new ArrayList(this.f135555j).iterator();
        while (it.hasNext()) {
            ((RunnableC54907b) it.next()).run();
        }
        this.f135555j.clear();
    }

    public void setBackgroundArtist(BackgroundArtist cVar) {
        this.f135556k = cVar;
    }

    public void setCustomPreviewDrawable(Drawable drawable) {
        this.f135559p = drawable;
    }

    public void setEdgeSize(int i) {
        this.f135566x = (float) i;
    }

    public void setForceDrawPreview(boolean z) {
        this.f135560q = z;
    }

    public void setNeedClipRect(boolean z) {
        this.f135544H = z;
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$c */
    private class C54908c extends C0959c.AbstractC0962a {
        private C54908c() {
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4889a(View view) {
            return SlideFrameLayout.this.f135549d;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4891a(int i) {
            if (SlideFrameLayout.this.f135552g.mo4870b() == 0) {
                if (SlideFrameLayout.this.f135548c == BitmapDescriptorFactory.HUE_RED) {
                    SlideFrameLayout slideFrameLayout = SlideFrameLayout.this;
                    slideFrameLayout.mo187222a(slideFrameLayout.f135547b);
                    SlideFrameLayout.this.f135553h = false;
                } else {
                    SlideFrameLayout.this.f135553h = true;
                }
            }
            if (SlideFrameLayout.this.f135551f != null) {
                for (AbstractC54913h hVar : new ArrayList(SlideFrameLayout.this.f135551f)) {
                    hVar.mo22169a(SlideFrameLayout.this.f135547b, i);
                }
            }
            WeakReference<View> weakReference = SlideFrameLayout.this.f135554i.f135586a;
            if ((weakReference == null || weakReference.get() == null) && SlideFrameLayout.this.f135556k != null) {
                SlideFrameLayout.this.f135556k.mo168900a(SlideFrameLayout.this.f135554i, i);
            }
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4894a(View view, int i) {
            SlideFrameLayout.this.mo187219a();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public void mo4898b(int i, int i2) {
            SlideFrameLayout.this.f135552g.mo4865a(SlideFrameLayout.this.f135547b, i2);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public boolean mo4900b(View view, int i) {
            if (SlideFrameLayout.this.f135550e) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f135578b;
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: b */
        public int mo4897b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public int mo4890a(View view, int i, int i2) {
            int paddingLeft = SlideFrameLayout.this.getPaddingLeft() + ((LayoutParams) SlideFrameLayout.this.f135547b.getLayoutParams()).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlideFrameLayout.this.f135549d + paddingLeft);
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
            int paddingLeft = SlideFrameLayout.this.getPaddingLeft() + ((LayoutParams) view.getLayoutParams()).leftMargin;
            int i = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (i > 0 || (i == 0 && SlideFrameLayout.this.f135548c > 0.5f)) {
                paddingLeft += SlideFrameLayout.this.f135549d;
            }
            SlideFrameLayout.this.f135552g.mo4866a(paddingLeft, view.getTop());
            SlideFrameLayout.this.invalidate();
        }

        @Override // androidx.customview.p030a.C0959c.AbstractC0962a
        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
            SlideFrameLayout.this.mo187220a(i, i2, i3, i4);
            SlideFrameLayout.this.invalidate();
        }
    }

    public SlideFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    public void mo187228b(View view) {
        f135534D.mo187268a(this, view);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo187221a(canvas);
    }

    /* renamed from: com.ss.android.lark.slideback.SlideFrameLayout$a */
    class C54906a extends C0859a {

        /* renamed from: b */
        private final Rect f135582b = new Rect();

        /* renamed from: c */
        public boolean mo187259c(View view) {
            return false;
        }

        C54906a() {
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: d */
        public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4540d(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlideFrameLayout.class.getName());
        }

        /* renamed from: a */
        private void m212914a(C0864d dVar, C0864d dVar2) {
            Rect rect = this.f135582b;
            dVar2.mo4553a(rect);
            dVar.mo4563b(rect);
            dVar2.mo4572c(rect);
            dVar.mo4578d(rect);
            dVar.mo4583e(dVar2.mo4599j());
            dVar.mo4557a(dVar2.mo4613r());
            dVar.mo4566b(dVar2.mo4614s());
            dVar.mo4582e(dVar2.mo4617u());
            dVar.mo4598j(dVar2.mo4609o());
            dVar.mo4592h(dVar2.mo4605m());
            dVar.mo4576c(dVar2.mo4593h());
            dVar.mo4580d(dVar2.mo4597i());
            dVar.mo4586f(dVar2.mo4601k());
            dVar.mo4589g(dVar2.mo4603l());
            dVar.mo4596i(dVar2.mo4607n());
            dVar.mo4552a(dVar2.mo4577d());
            dVar.mo4562b(dVar2.mo4581e());
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            C0864d a = C0864d.m4172a(dVar);
            super.mo4535a(view, a);
            m212914a(dVar, a);
            a.mo4618v();
            dVar.mo4566b((CharSequence) SlideFrameLayout.class.getName());
            dVar.mo4564b(view);
            ViewParent i = ViewCompat.m4085i(view);
            if (i instanceof View) {
                dVar.mo4579d((View) i);
            }
            int childCount = SlideFrameLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = SlideFrameLayout.this.getChildAt(i2);
                if (!mo187259c(childAt) && childAt.getVisibility() == 0) {
                    ViewCompat.m4069d(childAt, 1);
                    dVar.mo4573c(childAt);
                }
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4537a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo187259c(view)) {
                return super.mo4537a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: a */
    private int m212890a(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public void mo187229b(AbstractC54913h hVar) {
        List<AbstractC54913h> list = this.f135551f;
        if (list != null && hVar != null) {
            list.remove(hVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setShadowResource(int i) {
        this.f135561s = getResources().getDrawable(i);
    }

    public void setSlideable(boolean z) {
        if (this.f135546a != z) {
            this.f135546a = z;
            mo187227b();
        }
    }

    /* renamed from: d */
    public static SlideFrameLayout m212893d(View view) {
        if (view instanceof SlideFrameLayout) {
            return (SlideFrameLayout) view;
        }
        return m212893d((View) view.getParent());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo187231c(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f135546a || !layoutParams.f135579c || this.f135548c <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void setScroller(OverScroller overScroller) {
        Field scrollerOfViewDragHelper;
        if (overScroller != null && this.f135552g != null && (scrollerOfViewDragHelper = getScrollerOfViewDragHelper()) != null) {
            try {
                scrollerOfViewDragHelper.set(this.f135552g, overScroller);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private static boolean m212896e(View view) {
        Drawable background;
        if (ViewCompat.m4090j(view)) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 && (background = view.getBackground()) != null && background.getOpacity() == -1) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f135564v = motionEvent.getX();
        this.f135565w = motionEvent.getY();
        if (this.f135566x > BitmapDescriptorFactory.HUE_RED && motionEvent.getAction() == 0 && motionEvent.getX() > this.f135566x) {
            return false;
        }
        if (!this.f135546a) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.f135552g.mo4872b(motionEvent);
        } catch (Throwable unused) {
        }
        if ((motionEvent.getAction() & 255) == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f135562t = x;
            this.f135563u = y;
        }
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        View childAt;
        this.f135564v = motionEvent.getX();
        this.f135565w = motionEvent.getY();
        if (this.f135566x <= BitmapDescriptorFactory.HUE_RED || motionEvent.getAction() != 0 || motionEvent.getX() <= this.f135566x) {
            int a = C0908j.m4366a(motionEvent);
            if (!this.f135546a && a == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
                this.f135553h = !this.f135552g.mo4875b(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (!this.f135546a || (this.f135550e && a != 0)) {
                m212895e();
                return super.onInterceptTouchEvent(motionEvent);
            } else if (a == 3 || a == 1) {
                m212895e();
                return false;
            } else {
                if (a == 0) {
                    this.f135550e = false;
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.f135562t = x;
                    this.f135563u = y;
                    if (this.f135552g.mo4875b(this.f135547b, (int) x, (int) y) && mo187231c(this.f135547b)) {
                        z = true;
                        z2 = this.f135552g.mo4867a(motionEvent);
                        if (!z2 || z) {
                            return true;
                        }
                        return false;
                    }
                } else if (a == 2) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float abs = Math.abs(x2 - this.f135562t);
                    float abs2 = Math.abs(y2 - this.f135563u);
                    if (abs > ((float) this.f135552g.mo4884f()) && abs2 > abs) {
                        m212895e();
                        this.f135550e = true;
                        return false;
                    }
                }
                z = false;
                try {
                    z2 = this.f135552g.mo4867a(motionEvent);
                } catch (Throwable unused) {
                    z2 = false;
                }
                if (!z2) {
                }
                return true;
            }
        } else {
            int b = this.f135552g.mo4870b();
            if (b == 1 || b == 2) {
                return true;
            }
            m212897f();
            this.f135550e = true;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo187221a(Canvas canvas) {
        View view;
        if (this.f135546a && !this.f135542F && this.f135539A && this.f135561s != null) {
            if (getChildCount() > 1) {
                view = getChildAt(1);
            } else {
                view = null;
            }
            if (view != null) {
                int top = view.getTop();
                int bottom = view.getBottom();
                int intrinsicWidth = this.f135561s.getIntrinsicWidth();
                int left = view.getLeft();
                this.f135561s.setBounds(left - intrinsicWidth, top, left, bottom);
                this.f135561s.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    public void mo187222a(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        int i5;
        View view2 = view;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m212896e(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount && (childAt = getChildAt(i6)) != view2) {
            int max = Math.max(paddingLeft, childAt.getLeft());
            int max2 = Math.max(paddingTop, childAt.getTop());
            int min = Math.min(width, childAt.getRight());
            int min2 = Math.min(height, childAt.getBottom());
            if (max < i4 || max2 < i2 || min > i3 || min2 > i) {
                i5 = 0;
            } else {
                i5 = 4;
            }
            childAt.setVisibility(i5);
            i6++;
            view2 = view;
        }
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f135546a) {
            if (view == this.f135547b) {
                z = true;
            } else {
                z = false;
            }
            this.f135553h = z;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = LocationRequest.PRIORITY_INDOOR;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = LocationRequest.PRIORITY_INDOOR;
            }
        }
        boolean z3 = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.m165383e("SlideFrameLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f135547b = null;
        int i13 = paddingLeft;
        int i14 = 0;
        boolean z4 = false;
        float f = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            i5 = 8;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f135579c = z3;
            } else {
                if (layoutParams.f135577a > BitmapDescriptorFactory.HUE_RED) {
                    f += layoutParams.f135577a;
                    if (layoutParams.width == 0) {
                    }
                }
                int i15 = layoutParams.leftMargin + layoutParams.rightMargin;
                if (layoutParams.width == -2) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i15, Integer.MIN_VALUE);
                } else if (layoutParams.width == -1) {
                    i11 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i15, 1073741824);
                } else {
                    i11 = View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                } else if (layoutParams.height == -1) {
                    i12 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                } else {
                    i12 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                childAt.measure(i11, i12);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i4) {
                    i4 = Math.min(measuredHeight, i3);
                }
                i13 -= measuredWidth;
                if (i13 < 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                layoutParams.f135578b = z2;
                z4 |= z2;
                if (layoutParams.f135578b) {
                    this.f135547b = childAt;
                }
            }
            i14++;
            z3 = false;
        }
        if (z4 || f > BitmapDescriptorFactory.HUE_RED) {
            int i16 = 0;
            while (i16 < childCount) {
                View childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != i5) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        if (layoutParams2.width != 0 || layoutParams2.f135577a <= BitmapDescriptorFactory.HUE_RED) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            i6 = 0;
                        } else {
                            i6 = childAt2.getMeasuredWidth();
                        }
                        if (!z4 || childAt2 == this.f135547b) {
                            if (layoutParams2.f135577a > BitmapDescriptorFactory.HUE_RED) {
                                if (layoutParams2.width != 0) {
                                    i8 = 1073741824;
                                    i7 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                } else if (layoutParams2.height == -2) {
                                    i7 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                    i8 = 1073741824;
                                } else if (layoutParams2.height == -1) {
                                    i8 = 1073741824;
                                    i7 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = 1073741824;
                                    i7 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                                }
                                if (z4) {
                                    int i17 = paddingLeft - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, i8);
                                    if (i6 != i17) {
                                        childAt2.measure(makeMeasureSpec, i7);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i6 + ((int) ((layoutParams2.f135577a * ((float) Math.max(0, i13))) / f)), 1073741824), i7);
                                    i16++;
                                    i5 = 8;
                                }
                            }
                        } else if (layoutParams2.width < 0 && (i6 > paddingLeft || layoutParams2.f135577a > BitmapDescriptorFactory.HUE_RED)) {
                            if (!z) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            } else if (layoutParams2.height == -2) {
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                i9 = 1073741824;
                            } else if (layoutParams2.height == -1) {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                            } else {
                                i9 = 1073741824;
                                i10 = View.MeasureSpec.makeMeasureSpec(layoutParams2.height, 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), i10);
                        }
                    }
                }
                i16++;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i4 + getPaddingTop() + getPaddingBottom());
        this.f135546a &= z4;
        if (this.f135552g.mo4870b() != 0 && !this.f135546a) {
            m212897f();
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f135546a && !layoutParams.f135578b && this.f135547b != null) {
            canvas.getClipBounds(this.f135568z);
            Rect rect = this.f135568z;
            rect.right = Math.min(rect.right, this.f135547b.getLeft());
            if (this.f135544H) {
                canvas.clipRect(this.f135568z);
            }
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    public SlideFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f135546a = true;
        this.f135567y = true;
        this.f135568z = new Rect();
        this.f135555j = new ArrayList<>();
        this.f135539A = false;
        this.f135542F = false;
        this.f135543G = false;
        this.f135544H = true;
        this.f135560q = false;
        this.f135545I = BitmapDescriptorFactory.HUE_RED;
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.m4043a(this, new C54906a());
        ViewCompat.m4069d((View) this, 1);
        C0959c a = C0959c.m4641a(this, 0.5f, new C54908c());
        this.f135552g = a;
        a.mo4863a(f * 400.0f);
        setEdgeSize(getResources().getDisplayMetrics().widthPixels);
        setShadowResource(f135538r);
        C54909d dVar = new C54909d(context);
        this.f135554i = dVar;
        addView(dVar, new LayoutParams(-1, -1));
        if (m212898g() && f135537m) {
            Rect rect = new Rect();
            this.f135540B = rect;
            this.f135541C = Collections.singletonList(rect);
        }
    }

    /* renamed from: a */
    private boolean m212892a(float f, int i, int i2) {
        Field scrollerOfViewDragHelper;
        if (!this.f135546a) {
            return false;
        }
        int paddingLeft = (int) (((float) (getPaddingLeft() + ((LayoutParams) this.f135547b.getLayoutParams()).leftMargin)) + (f * ((float) this.f135549d)));
        int top = this.f135547b.getTop();
        int left = this.f135547b.getLeft();
        int top2 = this.f135547b.getTop();
        int i3 = paddingLeft - left;
        int i4 = top - top2;
        if (!this.f135552g.mo4868a(this.f135547b, paddingLeft, top)) {
            return false;
        }
        if (i2 > 0 && (scrollerOfViewDragHelper = getScrollerOfViewDragHelper()) != null) {
            try {
                Object obj = scrollerOfViewDragHelper.get(this.f135552g);
                if (obj instanceof OverScroller) {
                    ((OverScroller) obj).startScroll(left, top2, i3, i4, i2);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        mo187219a();
        ViewCompat.m4073e(this);
        return true;
    }

    /* renamed from: a */
    public void mo187223a(View view, float f, Drawable drawable) {
        Drawable.ConstantState constantState;
        Resources resources;
        C54909d dVar = this.f135554i;
        if (dVar != null) {
            if (dVar.getHostView() != view) {
                if (drawable != null) {
                    constantState = drawable.getConstantState();
                } else {
                    constantState = null;
                }
                if (constantState != null) {
                    if (view != null) {
                        resources = view.getResources();
                    } else {
                        resources = getResources();
                    }
                    drawable = constantState.newDrawable(resources);
                }
                this.f135554i.setBackgroundDrawable(drawable);
            }
            this.f135554i.setHostView(view);
            this.f135554i.invalidate();
            this.f135554i.setTranslationX(f);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f135567y = true;
        }
    }

    /* renamed from: a */
    public void mo187220a(int i, int i2, int i3, int i4) {
        View view = this.f135547b;
        if (view == null) {
            this.f135548c = BitmapDescriptorFactory.HUE_RED;
            this.f135564v = BitmapDescriptorFactory.HUE_RED;
            this.f135565w = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        this.f135548c = ((float) (i - (getPaddingLeft() + ((LayoutParams) view.getLayoutParams()).leftMargin))) / ((float) this.f135549d);
        m212891a(this.f135547b, i, 0, i3, i4);
    }

    /* renamed from: a */
    private void m212891a(View view, int i, int i2, int i3, int i4) {
        List<AbstractC54913h> list = this.f135551f;
        if (list != null) {
            for (AbstractC54913h hVar : list) {
                hVar.mo22168a(view, this.f135548c);
                if (hVar instanceof AbstractC54914i) {
                    AbstractC54914i iVar = (AbstractC54914i) hVar;
                    iVar.mo168888a(view, this.f135564v, this.f135565w);
                    iVar.mo168889a(view, i, i2, i3, i4);
                }
            }
        }
        float f = this.f135548c;
        if (f <= BitmapDescriptorFactory.HUE_RED || f >= 1.0f) {
            this.f135539A = false;
        } else {
            this.f135539A = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        float f;
        this.f135552g.mo4864a(1);
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f135567y) {
            if (!this.f135546a || !this.f135553h) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = 1.0f;
            }
            this.f135548c = f;
            this.f135564v = BitmapDescriptorFactory.HUE_RED;
            this.f135565w = BitmapDescriptorFactory.HUE_RED;
        }
        int i6 = paddingLeft;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f135578b) {
                    int min = (Math.min(paddingLeft, i5 - paddingRight) - i6) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f135549d = min;
                    int i8 = layoutParams.leftMargin;
                    int i9 = (int) (((float) min) * this.f135548c);
                    i6 += i8 + i9;
                    this.f135548c = ((float) i9) / ((float) this.f135549d);
                    this.f135564v = BitmapDescriptorFactory.HUE_RED;
                    this.f135565w = BitmapDescriptorFactory.HUE_RED;
                } else {
                    i6 = paddingLeft;
                }
                int i10 = i6 + 0;
                childAt.layout(i10, paddingTop, measuredWidth + i10, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
        }
        if (this.f135567y) {
            mo187222a(this.f135547b);
        }
        this.f135567y = false;
        m212894d();
        if (m212898g() && f135537m && (rect = this.f135540B) != null && this.f135541C != null) {
            rect.left = 0;
            this.f135540B.top = 0;
            this.f135540B.right = m212890a(48.0f);
            this.f135540B.bottom = getMeasuredHeight();
            setSystemGestureExclusionRects(this.f135541C);
        }
    }
}
