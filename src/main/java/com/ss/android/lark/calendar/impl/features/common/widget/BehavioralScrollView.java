package com.ss.android.lark.calendar.impl.features.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AbstractC0910l;
import androidx.core.view.C0909k;
import androidx.core.view.C0911m;
import androidx.core.view.NestedScrollingChild3;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.calendar.impl.features.common.widget.NestedScrollBehavior;
import com.ss.android.lark.log.Log;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public class BehavioralScrollView extends ConstraintLayout implements NestedScrollingChild3, AbstractC0910l, NestedScrollBehavior {

    /* renamed from: a */
    private int f78699a;

    /* renamed from: b */
    private int f78700b;

    /* renamed from: c */
    private int f78701c;

    /* renamed from: d */
    private int f78702d;

    /* renamed from: e */
    private int f78703e;

    /* renamed from: f */
    private final HashSet<BehavioralScrollListener> f78704f;

    /* renamed from: g */
    private View f78705g;

    /* renamed from: h */
    private View f78706h;

    /* renamed from: i */
    private boolean f78707i;

    /* renamed from: j */
    private final int f78708j;

    /* renamed from: k */
    private final float f78709k;

    /* renamed from: l */
    private final float f78710l;

    /* renamed from: m */
    private final Scroller f78711m;

    /* renamed from: n */
    private Function1<? super BehavioralScrollView, Unit> f78712n;

    /* renamed from: o */
    private final Lazy f78713o;

    /* renamed from: p */
    private final Lazy f78714p;

    /* renamed from: q */
    private float f78715q;

    /* renamed from: r */
    private float f78716r;

    /* renamed from: s */
    private long f78717s;

    /* renamed from: t */
    private int f78718t;

    /* renamed from: u */
    private int f78719u;

    /* renamed from: v */
    private long f78720v;

    /* renamed from: w */
    private float f78721w;

    /* renamed from: x */
    private float f78722x;

    /* renamed from: y */
    private int f78723y;

    public BehavioralScrollView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BehavioralScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C0909k getChildHelper() {
        return (C0909k) this.f78714p.getValue();
    }

    private final C0911m getParentHelper() {
        return (C0911m) this.f78713o.getValue();
    }

    public final boolean getEnableLog() {
        return this.f78707i;
    }

    public final int getLastScrollDir() {
        return this.f78702d;
    }

    public final HashSet<BehavioralScrollListener> getListeners() {
        return this.f78704f;
    }

    public final int getMaxScroll() {
        return this.f78701c;
    }

    public final int getMinScroll() {
        return this.f78700b;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f78699a;
    }

    public final View getNestedScrollChild() {
        return this.f78705g;
    }

    public final View getNestedScrollTarget() {
        return this.f78706h;
    }

    public final int getScrollAxis() {
        return this.f78699a;
    }

    public final int getState() {
        return this.f78703e;
    }

    /* renamed from: a */
    public Boolean mo112825a(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "e");
        return NestedScrollBehavior.C31163a.m116334a(this, motionEvent);
    }

    /* renamed from: a */
    public final void mo112828a(int i, int i2, Function1<? super BehavioralScrollView, Unit> function1) {
        m116293a("smoothScrollSelf " + i);
        m116292a(this, false, 1, (Object) null);
        setState(2);
        this.f78715q = BitmapDescriptorFactory.HUE_RED;
        this.f78716r = BitmapDescriptorFactory.HUE_RED;
        this.f78712n = function1;
        this.f78711m.startScroll((int) BitmapDescriptorFactory.HUE_RED, (int) BitmapDescriptorFactory.HUE_RED, i - getScrollX(), i - getScrollY(), i2);
        invalidate();
    }

    /* renamed from: a */
    public final void mo112827a(float f, Function1<? super BehavioralScrollView, Unit> function1) {
        m116293a("fling " + f);
        m116292a(this, false, 1, (Object) null);
        setState(3);
        this.f78715q = BitmapDescriptorFactory.HUE_RED;
        this.f78716r = BitmapDescriptorFactory.HUE_RED;
        this.f78712n = function1;
        int i = (int) f;
        this.f78711m.fling((int) BitmapDescriptorFactory.HUE_RED, (int) BitmapDescriptorFactory.HUE_RED, i, i, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        startNestedScroll(getNestedScrollAxes(), 1);
        invalidate();
    }

    /* renamed from: a */
    public final void mo112829a(boolean z) {
        View view;
        this.f78711m.forceFinished(true);
        if (z && (view = this.f78705g) != null) {
            C31167c.m116350c(view);
        }
    }

    /* renamed from: a */
    public void mo112826a() {
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            Intrinsics.checkExpressionValueIsNotNull(childAt, C60375c.f150914a);
            if (childAt.getLeft() < i) {
                i = childAt.getLeft();
            }
            if (childAt.getRight() > i2) {
                i2 = childAt.getRight();
            }
            if (childAt.getTop() < i3) {
                i3 = childAt.getTop();
            }
            if (childAt.getBottom() > i4) {
                i4 = childAt.getBottom();
            }
        }
        int nestedScrollAxes = getNestedScrollAxes();
        if (nestedScrollAxes == 1) {
            this.f78700b = i;
            this.f78701c = i2 - getWidth();
        } else if (nestedScrollAxes != 2) {
            this.f78700b = 0;
            this.f78701c = 0;
        } else {
            this.f78700b = i3;
            this.f78701c = i4 - getHeight();
        }
    }

    @Override // androidx.core.view.AbstractC0910l
    /* renamed from: a */
    public void mo1702a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        Intrinsics.checkParameterIsNotNull(iArr, "consumed");
        m116286a(i, i2, i3, i4, i5, iArr);
    }

    /* renamed from: a */
    public boolean mo112830a(float f, float f2) {
        int nestedScrollAxes = getNestedScrollAxes();
        boolean z = false;
        if (nestedScrollAxes != 1) {
            if (nestedScrollAxes == 2 && Math.abs(f2) > this.f78709k) {
                m116288a(this, C31167c.m116344a(Float.valueOf(f2), Float.valueOf(-this.f78710l), Float.valueOf(this.f78710l)).floatValue(), null, 2, null);
            }
            dispatchNestedFling(f, f2, z);
            return z;
        }
        if (Math.abs(f) > this.f78709k) {
            m116288a(this, C31167c.m116344a(Float.valueOf(f), Float.valueOf(-this.f78710l), Float.valueOf(this.f78710l)).floatValue(), null, 2, null);
        }
        dispatchNestedFling(f, f2, z);
        return z;
        z = true;
        dispatchNestedFling(f, f2, z);
        return z;
    }

    /* renamed from: a */
    private final boolean m116294a(int i) {
        int nestedScrollAxes = getNestedScrollAxes();
        if (nestedScrollAxes == 1) {
            return canScrollHorizontally(i);
        }
        if (nestedScrollAxes != 2) {
            return false;
        }
        return canScrollVertically(i);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        getChildHelper().mo4705c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView$a */
    public static final class C31154a extends Lambda implements Function0<C0909k> {
        final /* synthetic */ BehavioralScrollView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31154a(BehavioralScrollView behavioralScrollView) {
            super(0);
            this.this$0 = behavioralScrollView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C0909k invoke() {
            return new C0909k(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView$b */
    public static final class C31155b extends Lambda implements Function0<C0911m> {
        final /* synthetic */ BehavioralScrollView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31155b(BehavioralScrollView behavioralScrollView) {
            super(0);
            this.this$0 = behavioralScrollView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C0911m invoke() {
            return new C0911m(this.this$0);
        }
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return getChildHelper().mo4703b();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return getChildHelper().mo4694a();
    }

    public void computeScroll() {
        if (this.f78711m.computeScrollOffset()) {
            int currX = (int) (((float) this.f78711m.getCurrX()) - this.f78715q);
            int currY = (int) (((float) this.f78711m.getCurrY()) - this.f78716r);
            this.f78715q = (float) this.f78711m.getCurrX();
            this.f78716r = (float) this.f78711m.getCurrY();
            if (this.f78703e == 2) {
                scrollBy(currX, currY);
            } else {
                m116285a(currX, currY, 1);
            }
            invalidate();
            return;
        }
        int i = this.f78703e;
        if (i == 2) {
            setState(0);
            Function1<? super BehavioralScrollView, Unit> function1 = this.f78712n;
            if (function1 != null) {
                function1.invoke(this);
            }
            this.f78712n = null;
        } else if (i == 3) {
            setState(0);
            stopNestedScroll(1);
            Function1<? super BehavioralScrollView, Unit> function12 = this.f78712n;
            if (function12 != null) {
                function12.invoke(this);
            }
            this.f78712n = null;
        }
    }

    public final void setEnableLog(boolean z) {
        this.f78707i = z;
    }

    public final void setMaxScroll(int i) {
        this.f78701c = i;
    }

    public final void setMinScroll(int i) {
        this.f78700b = i;
    }

    public final void setScrollAxis(int i) {
        this.f78699a = i;
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        getChildHelper().mo4693a(z);
    }

    /* renamed from: a */
    private final void m116293a(String str) {
        if (this.f78707i) {
            Log.m165393v(getClass().getSimpleName(), str);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        onStopNestedScroll(view, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return getChildHelper().mo4704b(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i) {
        getChildHelper().mo4706c(i);
    }

    private final void setState(int i) {
        int i2 = this.f78703e;
        if (i2 != i) {
            this.f78703e = i;
            Iterator<T> it = this.f78704f.iterator();
            while (it.hasNext()) {
                it.next().mo109265b(this, i2, i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canScrollHorizontally(int r4) {
        /*
            r3 = this;
            int r0 = r3.getNestedScrollAxes()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            if (r4 <= 0) goto L_0x0014
            int r4 = r3.getScrollX()
            int r0 = r3.f78701c
            if (r4 >= r0) goto L_0x001f
            goto L_0x001e
        L_0x0014:
            if (r4 >= 0) goto L_0x001e
            int r4 = r3.getScrollX()
            int r0 = r3.f78700b
            if (r4 <= r0) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView.canScrollHorizontally(int):boolean");
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i) {
        return getChildHelper().mo4697a(i);
    }

    public boolean canScrollVertically(int i) {
        if (getNestedScrollAxes() == 2) {
            if (i > 0) {
                if (getScrollY() < this.f78701c) {
                    return true;
                }
            } else if (i >= 0 || getScrollY() > this.f78700b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final int m116295b(int i) {
        int i2;
        int scrollX = getScrollX() + i;
        if (getNestedScrollAxes() != 1) {
            i2 = getScrollX();
        } else if (getScrollX() > 0) {
            i2 = C31167c.m116344a(Integer.valueOf(scrollX), (Number) 0, Integer.valueOf(this.f78701c)).intValue();
        } else if (getScrollX() < 0) {
            i2 = C31167c.m116344a(Integer.valueOf(scrollX), Integer.valueOf(this.f78700b), (Number) 0).intValue();
        } else {
            i2 = C31167c.m116344a(Integer.valueOf(scrollX), Integer.valueOf(this.f78700b), Integer.valueOf(this.f78701c)).intValue();
        }
        return i2 - getScrollX();
    }

    /* renamed from: c */
    private final int m116296c(int i) {
        int i2;
        int scrollY = getScrollY() + i;
        if (getNestedScrollAxes() != 2) {
            i2 = getScrollY();
        } else if (getScrollY() > 0) {
            i2 = C31167c.m116344a(Integer.valueOf(scrollY), (Number) 0, Integer.valueOf(this.f78701c)).intValue();
        } else if (getScrollY() < 0) {
            i2 = C31167c.m116344a(Integer.valueOf(scrollY), Integer.valueOf(this.f78700b), (Number) 0).intValue();
        } else {
            i2 = C31167c.m116344a(Integer.valueOf(scrollY), Integer.valueOf(this.f78700b), Integer.valueOf(this.f78701c)).intValue();
        }
        return i2 - getScrollY();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        r9 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View view;
        Intrinsics.checkParameterIsNotNull(motionEvent, "e");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f78715q = motionEvent.getRawX();
            this.f78716r = motionEvent.getRawY();
            this.f78721w = motionEvent.getRawX();
            this.f78722x = motionEvent.getRawY();
            this.f78723y = this.f78703e;
            View view2 = this.f78705g;
            if (view2 == null || C31167c.m116346a(view2, motionEvent.getRawX(), motionEvent.getRawY())) {
                z = false;
            } else {
                z = true;
            }
            mo112829a(z);
            setState(0);
            this.f78702d = 0;
            this.f78705g = C31167c.m116342a((ViewGroup) this, motionEvent.getRawX(), motionEvent.getRawY());
            int nestedScrollAxes = getNestedScrollAxes();
            if (nestedScrollAxes == 1) {
                view = C31167c.m116347b(this, motionEvent.getRawX(), motionEvent.getRawY());
            } else if (nestedScrollAxes != 2) {
                view = null;
            } else {
                view = C31167c.m116349c(this, motionEvent.getRawX(), motionEvent.getRawY());
            }
            this.f78706h = view;
        } else if (action != 1) {
            if (action != 2) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int nestedScrollAxes2 = getNestedScrollAxes();
            if (nestedScrollAxes2 != 1) {
                if (nestedScrollAxes2 == 2 && Math.abs(motionEvent.getRawY() - this.f78716r) > ((float) this.f78708j) && Math.abs(motionEvent.getRawY() - this.f78716r) > Math.abs(motionEvent.getRawX() - this.f78715q) && this.f78706h == null) {
                    this.f78716r = motionEvent.getRawY();
                    return true;
                }
            } else if (Math.abs(motionEvent.getRawX() - this.f78715q) > ((float) this.f78708j) && Math.abs(motionEvent.getRawX() - this.f78715q) > Math.abs(motionEvent.getRawY() - this.f78716r) && this.f78706h == null) {
                this.f78715q = motionEvent.getRawX();
                return true;
            }
        } else if (this.f78723y == 0 || Math.abs(this.f78715q - this.f78721w) >= ((float) this.f78708j) || Math.abs(this.f78716r - this.f78722x) >= ((float) this.f78708j)) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Boolean mo109277a(int i, int i2) {
        return NestedScrollBehavior.C31163a.m116333a(this, i, i2);
    }

    /* renamed from: b */
    public Boolean mo109278b(int i, int i2) {
        return NestedScrollBehavior.C31163a.m116335b(this, i, i2);
    }

    /* renamed from: c */
    public Boolean mo112831c(int i, int i2) {
        return NestedScrollBehavior.C31163a.m116336c(this, i, i2);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getChildHelper().mo4695a(f, f2);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        getParentHelper().mo4709a(view, i);
        stopNestedScroll(i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i, int i2) {
        return getChildHelper().mo4698a(i, i2);
    }

    public void scrollBy(int i, int i2) {
        int b = m116295b(i);
        int c = m116296c(i2);
        super.scrollBy(b, c);
        m116293a("scrollBy " + i + " -> " + b + ", " + i2 + " -> " + c);
    }

    /* renamed from: d */
    private final int m116297d(int i, int i2) {
        int i3 = 0;
        if (i == 0) {
            return 0;
        }
        Boolean c = mo112831c(i, i2);
        if (!Intrinsics.areEqual((Object) c, (Object) true)) {
            if (!Intrinsics.areEqual((Object) c, (Object) false) && m116294a(i)) {
                m116293a("canScrollSelf");
                scrollBy(i, i);
            }
            m116293a("handleScrollSelf: type=" + i2 + ", " + c + ' ' + i + " -> " + i3);
            return i3;
        }
        i3 = i;
        m116293a("handleScrollSelf: type=" + i2 + ", " + c + ' ' + i + " -> " + i3);
        return i3;
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getChildHelper().mo4696a(f, f2, z);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        return dispatchNestedPreFling(f, f2);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        return onStartNestedScroll(view, view2, i, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BehavioralScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f78699a = 2;
        this.f78704f = new HashSet<>();
        this.f78711m = new Scroller(context);
        this.f78713o = LazyKt.lazy(new C31155b(this));
        this.f78714p = LazyKt.lazy(new C31154a(this));
        setNestedScrollingEnabled(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "vc");
        this.f78708j = viewConfiguration.getScaledTouchSlop();
        this.f78709k = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f78710l = (float) viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    private final void m116285a(int i, int i2, int i3) {
        m116293a("dispatchScrollInternal: type=" + i3 + ", x=" + i + ", y=" + i2);
        int[] iArr = new int[2];
        int nestedScrollAxes = getNestedScrollAxes();
        if (nestedScrollAxes == 1) {
            m116287a(i, i2, iArr, i3);
            int i4 = iArr[0] + 0;
            int d = i4 + m116297d(i - i4, i3);
            int i5 = iArr[1];
            iArr[0] = 0;
            iArr[1] = 0;
            m116286a(d, i5, i - d, i2 - i5, i3, iArr);
        } else if (nestedScrollAxes != 2) {
            m116287a(i, i2, iArr, i3);
            int i6 = iArr[0];
            int i7 = iArr[1];
            iArr[0] = 0;
            iArr[1] = 0;
            m116286a(i6, i7, i - i6, i2 - i7, i3, iArr);
        } else {
            m116287a(i, i2, iArr, i3);
            int i8 = iArr[1] + 0;
            int d2 = i8 + m116297d(i2 - i8, i3);
            int i9 = iArr[0];
            iArr[0] = 0;
            iArr[1] = 0;
            m116286a(i9, d2, i - i9, i2 - d2, i3, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getChildHelper().mo4701a(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        if (z || !mo112830a(f, f2)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        Intrinsics.checkParameterIsNotNull(iArr, "consumed");
        m116291a(this, i, i2, iArr, 0, 8, (Object) null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        getParentHelper().mo4711a(view, view2, i, i2);
        startNestedScroll(i, i2);
        this.f78705g = view;
        this.f78706h = view2;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "child");
        Intrinsics.checkParameterIsNotNull(view2, "target");
        if ((getNestedScrollAxes() & i) != 0) {
            return true;
        }
        return false;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        int nestedScrollAxes = getNestedScrollAxes();
        if (nestedScrollAxes == 1) {
            this.f78702d = i - i3;
            Iterator<T> it = this.f78704f.iterator();
            while (it.hasNext()) {
                it.next().mo109263a(this, i3, i);
            }
        } else if (nestedScrollAxes != 2) {
            this.f78702d = 0;
        } else {
            this.f78702d = i2 - i4;
            Iterator<T> it2 = this.f78704f.iterator();
            while (it2.hasNext()) {
                it2.next().mo109263a(this, i4, i2);
            }
        }
    }

    /* renamed from: a */
    private final void m116287a(int i, int i2, int[] iArr, int i3) {
        m116293a("dispatchNestedPreScrollInternal: type=" + i3 + ", x=" + i + ", y=" + i2);
        int nestedScrollAxes = getNestedScrollAxes();
        if (nestedScrollAxes == 1) {
            Boolean a = mo109277a(i, i3);
            m116293a("handleNestedPreScrollFirst = " + a);
            if (Intrinsics.areEqual((Object) a, (Object) true)) {
                int d = m116297d(i, i3);
                dispatchNestedPreScroll(i - d, i2, iArr, null, i3);
                iArr[0] = iArr[0] + d;
            } else if (Intrinsics.areEqual((Object) a, (Object) false)) {
                dispatchNestedPreScroll(i, i2, iArr, null, i3);
                iArr[0] = iArr[0] + m116297d(i - iArr[0], i3);
            } else if (a == null) {
                dispatchNestedPreScroll(i, i2, iArr, null, i3);
            }
        } else if (nestedScrollAxes != 2) {
            dispatchNestedPreScroll(i, i2, iArr, null, i3);
        } else {
            Boolean a2 = mo109277a(i2, i3);
            m116293a("handleNestedPreScrollFirst = " + a2);
            if (Intrinsics.areEqual((Object) a2, (Object) true)) {
                int d2 = m116297d(i2, i3);
                dispatchNestedPreScroll(i, i2 - d2, iArr, null, i3);
                iArr[1] = iArr[1] + d2;
            } else if (Intrinsics.areEqual((Object) a2, (Object) false)) {
                dispatchNestedPreScroll(i, i2, iArr, null, i3);
                iArr[1] = iArr[1] + m116297d(i2 - iArr[1], i3);
            } else if (a2 == null) {
                dispatchNestedPreScroll(i, i2, iArr, null, i3);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m116292a(BehavioralScrollView behavioralScrollView, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            behavioralScrollView.mo112829a(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopScroll");
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getChildHelper().mo4699a(i, i2, i3, i4, iArr);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo112826a();
        scrollBy(0, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        Intrinsics.checkParameterIsNotNull(iArr, "consumed");
        m116287a(i, i2, iArr, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m116288a(BehavioralScrollView behavioralScrollView, float f, Function1 function1, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            behavioralScrollView.mo112827a(f, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fling");
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getChildHelper().mo4702a(i, i2, iArr, iArr2, i3);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        m116289a(this, i, i2, i3, i4, 0, null, 48, null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BehavioralScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getChildHelper().mo4700a(i, i2, i3, i4, iArr, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkParameterIsNotNull(view, "target");
        m116289a(this, i, i2, i3, i4, i5, null, 32, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.calendar.impl.features.common.widget.BehavioralScrollView */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m116290a(BehavioralScrollView behavioralScrollView, int i, int i2, Function1 function1, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = LocationRequest.PRIORITY_INDOOR;
            }
            if ((i3 & 4) != 0) {
                function1 = null;
            }
            behavioralScrollView.mo112828a(i, i2, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: smoothScrollTo");
    }

    /* renamed from: a */
    private final void m116286a(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m116293a("dispatchNestedScrollInternal: type=" + i5 + ", x=" + i3 + ", y=" + i4);
        int nestedScrollAxes = getNestedScrollAxes();
        if (nestedScrollAxes == 1) {
            Boolean b = mo109278b(i3, i5);
            m116293a("handleNestedScrollFirst = " + b);
            if (Intrinsics.areEqual((Object) b, (Object) true)) {
                int d = m116297d(i3, i5);
                dispatchNestedScroll(i + d, i2, i3 - d, i4, null, i5, iArr);
                iArr[0] = iArr[0] + d;
            } else if (Intrinsics.areEqual((Object) b, (Object) false)) {
                dispatchNestedScroll(i, i2, i3, i4, null, i5, iArr);
                iArr[0] = iArr[0] + m116297d(i3 - iArr[0], i5);
            } else if (b == null) {
                dispatchNestedScroll(i, i2, i3, i4, null, i5, iArr);
            }
        } else if (nestedScrollAxes != 2) {
            dispatchNestedScroll(i, i2, i3, i4, null, i5, iArr);
        } else {
            Boolean b2 = mo109278b(i4, i5);
            m116293a("handleNestedScrollFirst = " + b2);
            if (Intrinsics.areEqual((Object) b2, (Object) true)) {
                int d2 = m116297d(i4, i5);
                dispatchNestedScroll(i, i2 + d2, i3, i4 - d2, null, i5, iArr);
                iArr[1] = iArr[1] + d2;
            } else if (Intrinsics.areEqual((Object) b2, (Object) false)) {
                dispatchNestedScroll(i, i2, i3, i4, null, i5, iArr);
                iArr[1] = iArr[1] + m116297d(i4 - iArr[1], i5);
            } else if (b2 == null) {
                dispatchNestedScroll(i, i2, i3, i4, null, i5, iArr);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        Intrinsics.checkParameterIsNotNull(iArr2, "consumed");
        getChildHelper().mo4692a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    static /* synthetic */ void m116291a(BehavioralScrollView behavioralScrollView, int i, int i2, int[] iArr, int i3, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 8) != 0) {
                i3 = 0;
            }
            behavioralScrollView.m116287a(i, i2, iArr, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchNestedPreScrollInternal");
    }

    /* renamed from: a */
    static /* synthetic */ void m116289a(BehavioralScrollView behavioralScrollView, int i, int i2, int i3, int i4, int i5, int[] iArr, int i6, Object obj) {
        int i7;
        if (obj == null) {
            if ((i6 & 16) != 0) {
                i7 = 0;
            } else {
                i7 = i5;
            }
            if ((i6 & 32) != 0) {
                iArr = new int[]{0, 0};
            }
            behavioralScrollView.m116286a(i, i2, i3, i4, i7, iArr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchNestedScrollInternal");
    }
}
