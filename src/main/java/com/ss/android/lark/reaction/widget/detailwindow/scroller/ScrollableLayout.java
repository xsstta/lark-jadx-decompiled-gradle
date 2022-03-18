package com.ss.android.lark.reaction.widget.detailwindow.scroller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class ScrollableLayout extends FrameLayout {

    /* renamed from: A */
    private float f130982A;

    /* renamed from: B */
    private boolean f130983B;

    /* renamed from: C */
    private ViewTreeObserver.OnGlobalLayoutListener f130984C;

    /* renamed from: D */
    private int f130985D;

    /* renamed from: E */
    private int f130986E;

    /* renamed from: F */
    private View f130987F;

    /* renamed from: G */
    private final Runnable f130988G = new Runnable() {
        /* class com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.RunnableC530201 */

        public void run() {
            boolean d = ScrollableLayout.this.f130991a.mo181153d();
            ScrollableLayout.this.f130998h = d;
            if (d) {
                int a = ScrollableLayout.this.f130991a.mo181146a();
                if (a - ScrollableLayout.this.getScrollY() != 0) {
                    ScrollableLayout.this.scrollTo(0, a);
                }
                ScrollableLayout.this.post(this);
            }
        }
    };

    /* renamed from: H */
    private final Runnable f130989H = new Runnable() {
        /* class com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.RunnableC530212 */

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r0 = r6.f131018a.getScrollY();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 216
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.RunnableC530212.run():void");
        }
    };

    /* renamed from: I */
    private ValueAnimator f130990I;

    /* renamed from: a */
    public C53042l f130991a;

    /* renamed from: b */
    public AbstractC53031a f130992b;

    /* renamed from: c */
    public int f130993c;

    /* renamed from: d */
    public AbstractC53032b f130994d;

    /* renamed from: e */
    public ValueAnimator f130995e;

    /* renamed from: f */
    public ValueAnimator.AnimatorUpdateListener f130996f;

    /* renamed from: g */
    public boolean f130997g;

    /* renamed from: h */
    public boolean f130998h;

    /* renamed from: i */
    public AbstractC53034d f130999i;

    /* renamed from: j */
    public AbstractC53033c f131000j;

    /* renamed from: k */
    public boolean f131001k;

    /* renamed from: l */
    public AbstractC53039i f131002l;

    /* renamed from: m */
    public boolean f131003m;

    /* renamed from: n */
    public AbstractC53041k f131004n;

    /* renamed from: o */
    private final Rect f131005o = new Rect();

    /* renamed from: p */
    private final List<AbstractC53040j> f131006p = new ArrayList(3);

    /* renamed from: q */
    private GestureDetector f131007q;

    /* renamed from: r */
    private GestureDetector f131008r;

    /* renamed from: s */
    private boolean f131009s;

    /* renamed from: t */
    private boolean f131010t;

    /* renamed from: u */
    private C53027b f131011u;

    /* renamed from: v */
    private boolean f131012v;

    /* renamed from: w */
    private View f131013w;

    /* renamed from: x */
    private long f131014x;

    /* renamed from: y */
    private boolean f131015y;

    /* renamed from: z */
    private float f131016z;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout$c */
    public interface AbstractC53028c {
        /* renamed from: a */
        void mo181123a(MotionEvent motionEvent);
    }

    public boolean canScrollHorizontally(int i) {
        return false;
    }

    /* access modifiers changed from: protected */
    public int computeVerticalScrollRange() {
        return this.f130993c;
    }

    public long getConsiderIdleMillis() {
        return this.f131014x;
    }

    public int getMaxScrollY() {
        return this.f130993c;
    }

    /* renamed from: a */
    private void m205337a() {
        AbstractC53041k kVar = this.f131004n;
        if (kVar != null && this.f131003m) {
            kVar.mo181143a(this);
        }
        this.f131003m = false;
    }

    public Parcelable onSaveInstanceState() {
        ScrollableLayoutSavedState scrollableLayoutSavedState = new ScrollableLayoutSavedState(super.onSaveInstanceState());
        scrollableLayoutSavedState.f131025a = getScrollY();
        scrollableLayoutSavedState.f131026b = this.f130983B;
        return scrollableLayoutSavedState;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f130990I;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f130990I.cancel();
        }
        ValueAnimator valueAnimator2 = this.f130995e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f130995e.cancel();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        View view;
        super.onFinishInflate();
        if (this.f130983B) {
            mo181092a(true);
        }
        int i = this.f130986E;
        if (i != 0) {
            view = findViewById(i);
        } else if (getChildCount() > 0) {
            view = getChildAt(0);
        } else {
            view = null;
        }
        this.f130987F = view;
    }

    /* access modifiers changed from: private */
    public static class ScrollableLayoutSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<ScrollableLayoutSavedState> CREATOR = new Parcelable.Creator<ScrollableLayoutSavedState>() {
            /* class com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.ScrollableLayoutSavedState.C530251 */

            /* renamed from: a */
            public ScrollableLayoutSavedState[] newArray(int i) {
                return new ScrollableLayoutSavedState[i];
            }

            /* renamed from: a */
            public ScrollableLayoutSavedState createFromParcel(Parcel parcel) {
                return new ScrollableLayoutSavedState(parcel);
            }
        };

        /* renamed from: a */
        int f131025a;

        /* renamed from: b */
        boolean f131026b;

        ScrollableLayoutSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        ScrollableLayoutSavedState(Parcel parcel) {
            super(parcel);
            this.f131025a = parcel.readInt();
            this.f131026b = parcel.readByte() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f131025a);
            parcel.writeByte(this.f131026b ? (byte) 1 : 0);
        }
    }

    public void setCanScrollVerticallyDelegate(AbstractC53031a aVar) {
        this.f130992b = aVar;
    }

    public void setCloseAnimatorConfigurator(AbstractC53033c cVar) {
        this.f131000j = cVar;
    }

    public void setCloseUpAlgorithm(AbstractC53032b bVar) {
        this.f130994d = bVar;
    }

    public void setCloseUpIdleAnimationTime(AbstractC53034d dVar) {
        this.f130999i = dVar;
    }

    public void setConsiderIdleMillis(long j) {
        this.f131014x = j;
    }

    public void setDraggableView(View view) {
        this.f131013w = view;
    }

    public void setOnFlingOverListener(AbstractC53039i iVar) {
        this.f131002l = iVar;
    }

    public void setOverScrollListener(AbstractC53041k kVar) {
        this.f131004n = kVar;
    }

    public void setSelfUpdateScroll(boolean z) {
        this.f130997g = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout$b */
    public static class C53027b {

        /* renamed from: a */
        final AbstractC53028c f131030a;

        C53027b(AbstractC53028c cVar) {
            this.f131030a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo181131a(MotionEvent motionEvent, int i) {
            int action = motionEvent.getAction();
            motionEvent.setAction(i);
            this.f131030a.mo181123a(motionEvent);
            motionEvent.setAction(action);
        }
    }

    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout$e */
    private class C53030e extends AnimatorListenerAdapter {

        /* renamed from: b */
        private boolean f131034b;

        private C53030e() {
        }

        public void onAnimationCancel(Animator animator) {
            ScrollableLayout.this.f130997g = this.f131034b;
        }

        public void onAnimationEnd(Animator animator) {
            ScrollableLayout.this.f130997g = this.f131034b;
        }

        public void onAnimationStart(Animator animator) {
            this.f131034b = ScrollableLayout.this.f130997g;
            ScrollableLayout.this.f130997g = true;
        }
    }

    public void setAutoMaxScroll(boolean z) {
        this.f130983B = z;
        mo181092a(z);
    }

    public void setFriction(float f) {
        this.f130991a.mo181147a(f);
    }

    public void setMaxScrollY(int i) {
        this.f130993c = i;
        mo181092a(false);
    }

    /* renamed from: b */
    private boolean m205340b(int i) {
        View view = this.f130987F;
        if (view == null || !view.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    public void setOnScrollChangedListener(AbstractC53040j jVar) {
        this.f131006p.clear();
        mo181091a(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout$d */
    public class C53029d extends AbstractGestureDetector$OnGestureListenerC53037g {

        /* renamed from: b */
        private final int f131032b;

        private C53029d() {
            this.f131032b = ViewConfiguration.get(ScrollableLayout.this.getContext()).getScaledTouchSlop();
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[RETURN] */
        @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractGestureDetector$OnGestureListenerC53037g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onScroll(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
            /*
            // Method dump skipped, instructions count: 153
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.C53029d.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    }

    /* renamed from: b */
    public void mo181093b(boolean z) {
        if (z) {
            removeCallbacks(this.f130989H);
        }
        ValueAnimator valueAnimator = this.f130995e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f130996f;
            if (animatorUpdateListener != null) {
                this.f130995e.removeUpdateListener(animatorUpdateListener);
            }
            this.f130995e.end();
        }
    }

    public boolean canScrollVertically(int i) {
        if ((i >= 0 || getScrollY() <= 0) && (i <= 0 || !this.f130992b.canScrollVertically(i))) {
            return false;
        }
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ScrollableLayoutSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ScrollableLayoutSavedState scrollableLayoutSavedState = (ScrollableLayoutSavedState) parcelable;
        super.onRestoreInstanceState(scrollableLayoutSavedState.getSuperState());
        setScrollY(scrollableLayoutSavedState.f131025a);
        boolean z = scrollableLayoutSavedState.f131026b;
        this.f130983B = z;
        mo181092a(z);
    }

    public ScrollableLayout(Context context) {
        super(context);
        m205338a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo181091a(AbstractC53040j jVar) {
        if (jVar != null) {
            this.f131006p.add(jVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo181089a(int i) {
        boolean z;
        int scrollY = getScrollY();
        if (scrollY == i) {
            return -1;
        }
        int i2 = i - scrollY;
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC53031a aVar = this.f130992b;
        if (aVar != null) {
            if (z) {
                if (!this.f131001k && !this.f130997g && aVar.canScrollVertically(i2)) {
                    return -1;
                }
            } else if ((!this.f131001k && !this.f130997g && m205340b(i2)) || (scrollY == this.f130993c && !this.f130992b.canScrollVertically(i2))) {
                return -1;
            }
        }
        if (i < 0) {
            return 0;
        }
        int i3 = this.f130993c;
        return i > i3 ? i3 : i;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f130997g) {
            this.f131012v = false;
            this.f131001k = false;
            this.f131009s = false;
            this.f131010t = false;
            this.f131003m = false;
            removeCallbacks(this.f130989H);
            removeCallbacks(this.f130988G);
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f131012v = true;
            this.f130991a.mo181154e();
            View view = this.f131013w;
            if (view == null || !view.getGlobalVisibleRect(this.f131005o)) {
                this.f131001k = false;
            } else {
                int rawY = (int) (motionEvent.getRawY() + 0.5f);
                this.f131001k = this.f131005o.contains((int) (motionEvent.getRawX() + 0.5f), rawY);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f131012v = false;
            if (this.f130994d != null) {
                removeCallbacks(this.f130989H);
                postDelayed(this.f130989H, this.f131014x);
            }
            if (this.f131015y) {
                if (actionMasked == 1 && Float.compare(Math.abs(motionEvent.getRawY() - this.f131016z), this.f130982A) < 0) {
                    motionEvent.setAction(3);
                }
                this.f131015y = false;
            }
            m205337a();
        }
        boolean z4 = this.f131009s;
        boolean z5 = this.f131010t;
        this.f131010t = this.f131008r.onTouchEvent(motionEvent);
        this.f131009s = this.f131007q.onTouchEvent(motionEvent);
        removeCallbacks(this.f130988G);
        post(this.f130988G);
        if (this.f131009s || this.f131010t) {
            z = true;
        } else {
            z = false;
        }
        if (z4 || z5) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (actionMasked != 2 || z || !z2 || getScrollY() != this.f130993c) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z || z2) {
            this.f131011u.mo181131a(motionEvent, 3);
            if (!z2) {
                return true;
            }
        }
        if (z3) {
            this.f131011u.mo181131a(motionEvent, 0);
            this.f131016z = motionEvent.getRawY();
            this.f131015y = true;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo181092a(boolean z) {
        final View view;
        if (getChildCount() != 0) {
            int i = this.f130985D;
            if (i != 0) {
                view = findViewById(i);
            } else {
                view = getChildAt(0);
            }
            if (view != null) {
                if (!z) {
                    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f130984C;
                    if (onGlobalLayoutListener != null) {
                        C53045n.m205378a(view, onGlobalLayoutListener);
                        this.f130984C = null;
                    }
                } else if (this.f130984C == null) {
                    this.f130984C = new ViewTreeObserver.OnGlobalLayoutListener() {
                        /* class com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.ViewTreeObserver$OnGlobalLayoutListenerC530244 */

                        public void onGlobalLayout() {
                            ScrollableLayout.this.f130993c = view.getMeasuredHeight();
                        }
                    };
                    view.getViewTreeObserver().addOnGlobalLayoutListener(this.f130984C);
                }
            }
        }
    }

    public void scrollTo(int i, int i2) {
        int a = mo181089a(i2);
        if (a >= 0) {
            super.scrollTo(0, a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout$a */
    public class C53026a extends AbstractGestureDetector$OnGestureListenerC53037g {

        /* renamed from: b */
        private final int f131028b;

        /* renamed from: c */
        private final float f131029c;

        C53026a(Context context) {
            this.f131028b = C53036f.m205357a(context, 12);
            this.f131029c = (float) ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }

        @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.AbstractGestureDetector$OnGestureListenerC53037g
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            int scrollY;
            boolean z;
            if (Math.abs(f2) < this.f131029c || Math.abs(f) > Math.abs(f2) || (scrollY = ScrollableLayout.this.getScrollY()) < 0 || scrollY > ScrollableLayout.this.f130993c) {
                return false;
            }
            int i = -((int) (0.5f + f2));
            if (!ScrollableLayout.this.f131001k && ScrollableLayout.this.f131002l != null && ScrollableLayout.this.f130993c != ScrollableLayout.this.getScrollY() && i > 0 && ScrollableLayout.this.f130992b.canScrollVertically(1)) {
                ScrollableLayout.this.f130991a.mo181149a(0, scrollY, 0, i, 0, 0, 0, Integer.MAX_VALUE);
                ScrollableLayout.this.f131002l.onFlingOver(ScrollableLayout.this.f130991a.mo181152c() - ScrollableLayout.this.f130993c, (long) ScrollableLayout.this.f130991a.mo181151b(f2));
                ScrollableLayout.this.f130991a.mo181154e();
            }
            ScrollableLayout.this.f130991a.mo181149a(0, scrollY, 0, i, 0, 0, 0, ScrollableLayout.this.f130993c);
            if (!ScrollableLayout.this.f130991a.mo181153d()) {
                return false;
            }
            int c = ScrollableLayout.this.f130991a.mo181152c();
            if (Math.abs(scrollY - c) < this.f131028b) {
                ScrollableLayout.this.f130991a.mo181154e();
                return false;
            }
            if (!(c == scrollY || ScrollableLayout.this.f130994d == null)) {
                AbstractC53032b bVar = ScrollableLayout.this.f130994d;
                ScrollableLayout scrollableLayout = ScrollableLayout.this;
                if (c - scrollY < 0) {
                    z = true;
                } else {
                    z = false;
                }
                c = bVar.mo181088a(scrollableLayout, z, scrollY, c, scrollableLayout.f130993c);
                ScrollableLayout.this.f130991a.mo181148a(c);
            }
            int a = ScrollableLayout.this.mo181089a(c);
            if (c == scrollY || a < 0) {
                return false;
            }
            return true;
        }
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m205338a(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m205338a(Context context, AttributeSet attributeSet) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.scrollable_autoMaxScroll, R.attr.scrollable_autoMaxScrollViewId, R.attr.scrollable_closeUpAnimationMillis, R.attr.scrollable_closeUpAnimatorInterpolator, R.attr.scrollable_considerIdleMillis, R.attr.scrollable_defaultCloseUp, R.attr.scrollable_friction, R.attr.scrollable_maxScroll, R.attr.scrollable_scrollerFlywheel, R.attr.scrollable_scrollingHeaderId});
        try {
            this.f130991a = mo181090a(context, null, obtainStyledAttributes.getBoolean(8, false));
            setFriction(obtainStyledAttributes.getFloat(6, 0.0565f));
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.f130993c = dimensionPixelSize;
            if (dimensionPixelSize == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f130983B = obtainStyledAttributes.getBoolean(0, z);
            this.f130985D = obtainStyledAttributes.getResourceId(1, 0);
            setConsiderIdleMillis((long) obtainStyledAttributes.getInteger(4, 100));
            if (obtainStyledAttributes.getBoolean(5, false)) {
                setCloseUpAlgorithm(new C53035e());
            }
            int integer = obtainStyledAttributes.getInteger(2, -1);
            if (integer != -1) {
                setCloseUpIdleAnimationTime(new C53044m((long) integer));
            }
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setCloseAnimatorConfigurator(new C53038h(AnimationUtils.loadInterpolator(context, resourceId)));
            }
            this.f130986E = obtainStyledAttributes.getResourceId(9, 0);
            obtainStyledAttributes.recycle();
            this.f131007q = new GestureDetector(context, new C53029d());
            this.f131008r = new GestureDetector(context, new C53026a(context));
            this.f131011u = new C53027b(new AbstractC53028c() {
                /* class com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.C530233 */

                @Override // com.ss.android.lark.reaction.widget.detailwindow.scroller.ScrollableLayout.AbstractC53028c
                /* renamed from: a */
                public void mo181123a(MotionEvent motionEvent) {
                    ScrollableLayout.super.dispatchTouchEvent(motionEvent);
                }
            });
            this.f130982A = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C53042l mo181090a(Context context, Interpolator interpolator, boolean z) {
        return new C53042l(context, interpolator, z);
    }

    public ScrollableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m205338a(context, attributeSet);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        if (i2 != i4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i5 = this.f131006p.size();
        } else {
            i5 = 0;
        }
        if (i5 > 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                this.f131006p.get(i6).onScrollChanged(i2, i4, this.f130993c);
            }
        }
        if (this.f130994d != null) {
            removeCallbacks(this.f130989H);
            if (!this.f130997g && z && !this.f131012v) {
                postDelayed(this.f130989H, this.f131014x);
            }
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount > 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                childAt.layout(i, i5, i3, childAt.getMeasuredHeight() + i5);
                i5 += childAt.getMeasuredHeight();
            }
        }
    }
}
