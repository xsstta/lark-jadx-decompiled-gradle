package com.bytedance.ee.bear.drive.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.core.view.C0909k;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

class DriveNestedScrollWebView extends WebView implements NestedScrollingChild {

    /* renamed from: a */
    public boolean f20495a;

    /* renamed from: b */
    private final int[] f20496b;

    /* renamed from: c */
    private final int[] f20497c;

    /* renamed from: d */
    private int f20498d;

    /* renamed from: e */
    private C0909k f20499e;

    /* renamed from: f */
    private boolean f20500f;

    /* renamed from: g */
    private VelocityTracker f20501g;

    /* renamed from: h */
    private int f20502h;

    /* renamed from: i */
    private int f20503i;

    /* renamed from: j */
    private int f20504j;

    /* renamed from: k */
    private OverScroller f20505k;

    /* renamed from: l */
    private int f20506l;

    /* renamed from: m */
    private int f20507m;

    /* renamed from: n */
    private GestureDetector f20508n;

    public int getNestedScrollAxes() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        return computeVerticalScrollRange();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f20499e.mo4703b();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f20499e.mo4694a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f20499e.mo4705c();
    }

    /* renamed from: c */
    private void m30317c() {
        this.f20500f = false;
        m30320f();
        stopNestedScroll();
    }

    /* renamed from: d */
    private void m30318d() {
        VelocityTracker velocityTracker = this.f20501g;
        if (velocityTracker == null) {
            this.f20501g = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: e */
    private void m30319e() {
        if (this.f20501g == null) {
            this.f20501g = VelocityTracker.obtain();
        }
    }

    /* renamed from: f */
    private void m30320f() {
        VelocityTracker velocityTracker = this.f20501g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f20501g = null;
        }
    }

    /* renamed from: a */
    private void mo29640a() {
        setOverScrollMode(2);
        m30315b();
        this.f20499e = new C0909k(this);
        setNestedScrollingEnabled(true);
        this.f20508n = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.drive.view.widget.DriveNestedScrollWebView.C75601 */

            public void onLongPress(MotionEvent motionEvent) {
                DriveNestedScrollWebView.this.f20495a = true;
            }
        });
    }

    /* renamed from: b */
    private void m30315b() {
        this.f20505k = new OverScroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f20502h = viewConfiguration.getScaledTouchSlop();
        this.f20506l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f20507m = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f20499e.mo4693a(z);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.f20499e.mo4704b(i);
    }

    public DriveNestedScrollWebView(Context context) {
        super(context);
        this.f20496b = new int[2];
        this.f20497c = new int[2];
        this.f20503i = -1;
        mo29640a();
    }

    /* renamed from: a */
    private void m30314a(MotionEvent motionEvent) {
        int i;
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f20503i) {
            if (action == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f20498d = (int) motionEvent.getY(i);
            this.f20503i = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f20501g;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: b */
    private void m30316b(int i) {
        boolean z;
        int scrollY = getScrollY();
        if ((scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0)) {
            z = true;
        } else {
            z = false;
        }
        float f = (float) i;
        if (!dispatchNestedPreFling(BitmapDescriptorFactory.HUE_RED, f)) {
            dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f, z);
            if (z) {
                mo29633a(i);
            }
        }
    }

    /* renamed from: a */
    public void mo29633a(int i) {
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.f20505k.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height), 0, height / 2);
            ViewCompat.m4073e(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f20495a || !isNestedScrollingEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.f20500f) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f20503i;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            C13479a.m54758a("NestedWebViewV2", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f20498d) > this.f20502h && (2 & getNestedScrollAxes()) == 0) {
                                this.f20500f = true;
                                this.f20498d = y;
                                m30319e();
                                this.f20501g.addMovement(motionEvent);
                                this.f20504j = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m30314a(motionEvent);
                    }
                }
            }
            this.f20495a = false;
            this.f20500f = false;
            this.f20503i = -1;
            m30320f();
            if (this.f20505k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.m4073e(this);
            }
            stopNestedScroll();
        } else {
            this.f20495a = false;
            this.f20498d = (int) motionEvent.getY();
            this.f20503i = motionEvent.getPointerId(0);
            m30318d();
            this.f20501g.addMovement(motionEvent);
            this.f20505k.computeScrollOffset();
            this.f20500f = !this.f20505k.isFinished();
            startNestedScroll(2);
        }
        return this.f20500f;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ViewParent parent;
        this.f20508n.onTouchEvent(motionEvent);
        if (!isNestedScrollingEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        m30319e();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f20504j = 0;
                this.f20495a = false;
            }
            if (this.f20495a) {
                return super.onTouchEvent(motionEvent);
            }
            obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) this.f20504j);
            if (action == 0) {
                if (!this.f20505k.isFinished()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f20500f = z;
                if (z && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (!this.f20505k.isFinished()) {
                    this.f20505k.abortAnimation();
                }
                this.f20498d = (int) motionEvent.getY();
                this.f20503i = motionEvent.getPointerId(0);
                startNestedScroll(2);
            } else if (action == 1) {
                this.f20495a = false;
                if (this.f20500f) {
                    VelocityTracker velocityTracker = this.f20501g;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f20507m);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.f20503i);
                    if (Math.abs(yVelocity) > this.f20506l) {
                        m30316b(-yVelocity);
                    } else if (this.f20505k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        ViewCompat.m4073e(this);
                    }
                }
                this.f20503i = -1;
                m30317c();
            } else if (action == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f20503i);
                if (findPointerIndex == -1) {
                    C13479a.m54758a("NestedWebViewV2", "Invalid pointerId=" + this.f20503i + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.f20498d - y;
                    if (!this.f20500f && Math.abs(i) > this.f20502h) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f20500f = true;
                        i = i > 0 ? i - this.f20502h : i + this.f20502h;
                    }
                    if (this.f20500f) {
                        if (dispatchNestedPreScroll(0, i, this.f20497c, this.f20496b)) {
                            i -= this.f20497c[1];
                            obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) this.f20496b[1]);
                            this.f20504j += this.f20496b[1];
                        }
                        this.f20498d = y - this.f20496b[1];
                        int scrollY = getScrollY() - getScrollY();
                        if (dispatchNestedScroll(0, scrollY, 0, i - scrollY, this.f20496b)) {
                            int i2 = this.f20498d;
                            int[] iArr = this.f20496b;
                            this.f20498d = i2 - iArr[1];
                            obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) iArr[1]);
                            this.f20504j += this.f20496b[1];
                        }
                    }
                }
            } else if (action == 3) {
                this.f20495a = false;
                if (this.f20500f && getChildCount() > 0 && this.f20505k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m4073e(this);
                }
                this.f20503i = -1;
                m30317c();
            } else if (action == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f20498d = (int) motionEvent.getY(actionIndex);
                this.f20503i = motionEvent.getPointerId(actionIndex);
            } else if (action == 6) {
                m30314a(motionEvent);
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f20503i);
                if (findPointerIndex2 == -1) {
                    C13479a.m54758a("NestedWebViewV2", "Invalid pointerId=" + this.f20503i + " in ACTION_POINTER_UP");
                } else {
                    this.f20498d = (int) motionEvent.getY(findPointerIndex2);
                }
            }
            VelocityTracker velocityTracker2 = this.f20501g;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(obtain);
            }
            obtain.recycle();
            return super.onTouchEvent(motionEvent);
        } finally {
            obtain.recycle();
        }
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f20499e.mo4695a(f, f2);
    }

    public DriveNestedScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20496b = new int[2];
        this.f20497c = new int[2];
        this.f20503i = -1;
        mo29640a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f20499e.mo4696a(f, f2, z);
    }

    public DriveNestedScrollWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20496b = new int[2];
        this.f20497c = new int[2];
        this.f20503i = -1;
        mo29640a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f20499e.mo4701a(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f20499e.mo4699a(i, i2, i3, i4, iArr);
    }
}
