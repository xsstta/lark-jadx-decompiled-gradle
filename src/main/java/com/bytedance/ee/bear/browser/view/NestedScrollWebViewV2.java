package com.bytedance.ee.bear.browser.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.view.C0909k;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import com.bytedance.ee.bear.jsbridge.BridgeWebViewV2;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class NestedScrollWebViewV2 extends BridgeWebViewV2 implements NestedScrollingChild {

    /* renamed from: a */
    public boolean f14556a;

    /* renamed from: b */
    private final int[] f14557b;

    /* renamed from: c */
    private final int[] f14558c;

    /* renamed from: d */
    private int f14559d;

    /* renamed from: e */
    private C0909k f14560e;

    /* renamed from: f */
    private boolean f14561f;

    /* renamed from: g */
    private VelocityTracker f14562g;

    /* renamed from: h */
    private int f14563h;

    /* renamed from: i */
    private int f14564i;

    /* renamed from: j */
    private int f14565j;

    /* renamed from: k */
    private OverScroller f14566k;

    /* renamed from: l */
    private int f14567l;

    /* renamed from: n */
    private int f14568n;

    /* renamed from: o */
    private GestureDetector f14569o;

    public int getNestedScrollAxes() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        return computeVerticalScrollRange();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f14560e.mo4703b();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f14560e.mo4694a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f14560e.mo4705c();
    }

    /* renamed from: c */
    private void mo22342c() {
        this.f14561f = false;
        mo22349f();
        stopNestedScroll();
    }

    /* renamed from: d */
    private void mo22344d() {
        VelocityTracker velocityTracker = this.f14562g;
        if (velocityTracker == null) {
            this.f14562g = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: e */
    private void mo22348e() {
        if (this.f14562g == null) {
            this.f14562g = VelocityTracker.obtain();
        }
    }

    /* renamed from: f */
    private void mo22349f() {
        VelocityTracker velocityTracker = this.f14562g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f14562g = null;
        }
    }

    /* renamed from: a */
    private void mo19616a() {
        setOverScrollMode(2);
        mo22336b();
        this.f14560e = new C0909k(this);
        setNestedScrollingEnabled(true);
        this.f14569o = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.browser.view.NestedScrollWebViewV2.C49621 */

            public void onLongPress(MotionEvent motionEvent) {
                NestedScrollWebViewV2.this.f14556a = true;
            }
        });
    }

    /* renamed from: b */
    private void mo22336b() {
        this.f14566k = new OverScroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f14563h = viewConfiguration.getScaledTouchSlop();
        this.f14567l = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f14568n = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z) {
        this.f14560e.mo4693a(z);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i) {
        return this.f14560e.mo4704b(i);
    }

    public NestedScrollWebViewV2(Context context) {
        super(context);
        this.f14557b = new int[2];
        this.f14558c = new int[2];
        this.f14564i = -1;
        mo19616a();
    }

    /* renamed from: a */
    private void m20560a(MotionEvent motionEvent) {
        int i;
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.f14564i) {
            if (action == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f14559d = (int) motionEvent.getY(i);
            this.f14564i = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f14562g;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: b */
    private void m20562b(int i) {
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
                mo19633a(i);
            }
        }
    }

    /* renamed from: a */
    public void mo19633a(int i) {
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            this.f14566k.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height), 0, height / 2);
            ViewCompat.m4073e(this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f14556a || !isNestedScrollingEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 2 && this.f14561f) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f14564i;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            C13479a.m54758a("NestedWebViewV2", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f14559d) > this.f14563h && (2 & getNestedScrollAxes()) == 0) {
                                this.f14561f = true;
                                this.f14559d = y;
                                mo22348e();
                                this.f14562g.addMovement(motionEvent);
                                this.f14565j = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m20560a(motionEvent);
                    }
                }
            }
            this.f14556a = false;
            this.f14561f = false;
            this.f14564i = -1;
            mo22349f();
            if (this.f14566k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.m4073e(this);
            }
            stopNestedScroll();
        } else {
            this.f14556a = false;
            this.f14559d = (int) motionEvent.getY();
            this.f14564i = motionEvent.getPointerId(0);
            mo22344d();
            this.f14562g.addMovement(motionEvent);
            this.f14566k.computeScrollOffset();
            this.f14561f = !this.f14566k.isFinished();
            startNestedScroll(2);
        }
        return this.f14561f;
    }

    @Override // com.bytedance.ee.bear.jsbridge.BridgeWebViewV2
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ViewParent parent;
        this.f14569o.onTouchEvent(motionEvent);
        if (!isNestedScrollingEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        mo22348e();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f14565j = 0;
                this.f14556a = false;
            }
            if (this.f14556a) {
                return super.onTouchEvent(motionEvent);
            }
            obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) this.f14565j);
            if (action == 0) {
                if (!this.f14566k.isFinished()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f14561f = z;
                if (z && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (!this.f14566k.isFinished()) {
                    this.f14566k.abortAnimation();
                }
                this.f14559d = (int) motionEvent.getY();
                this.f14564i = motionEvent.getPointerId(0);
                startNestedScroll(2);
            } else if (action == 1) {
                this.f14556a = false;
                if (this.f14561f) {
                    VelocityTracker velocityTracker = this.f14562g;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f14568n);
                    int yVelocity = (int) velocityTracker.getYVelocity(this.f14564i);
                    if (Math.abs(yVelocity) > this.f14567l) {
                        m20562b(-yVelocity);
                    } else if (this.f14566k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        ViewCompat.m4073e(this);
                    }
                }
                this.f14564i = -1;
                mo22342c();
            } else if (action == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f14564i);
                if (findPointerIndex == -1) {
                    C13479a.m54758a("NestedWebViewV2", "Invalid pointerId=" + this.f14564i + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.f14559d - y;
                    if (!this.f14561f && Math.abs(i) > this.f14563h) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f14561f = true;
                        i = i > 0 ? i - this.f14563h : i + this.f14563h;
                    }
                    if (this.f14561f) {
                        if (dispatchNestedPreScroll(0, i, this.f14558c, this.f14557b)) {
                            i -= this.f14558c[1];
                            obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) this.f14557b[1]);
                            this.f14565j += this.f14557b[1];
                        }
                        this.f14559d = y - this.f14557b[1];
                        int scrollY = getScrollY() - getScrollY();
                        if (dispatchNestedScroll(0, scrollY, 0, i - scrollY, this.f14557b)) {
                            int i2 = this.f14559d;
                            int[] iArr = this.f14557b;
                            this.f14559d = i2 - iArr[1];
                            obtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, (float) iArr[1]);
                            this.f14565j += this.f14557b[1];
                        }
                    }
                }
            } else if (action == 3) {
                this.f14556a = false;
                if (this.f14561f && getChildCount() > 0 && this.f14566k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m4073e(this);
                }
                this.f14564i = -1;
                mo22342c();
            } else if (action == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f14559d = (int) motionEvent.getY(actionIndex);
                this.f14564i = motionEvent.getPointerId(actionIndex);
            } else if (action == 6) {
                m20560a(motionEvent);
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f14564i);
                if (findPointerIndex2 == -1) {
                    C13479a.m54758a("NestedWebViewV2", "Invalid pointerId=" + this.f14564i + " in ACTION_POINTER_UP");
                } else {
                    this.f14559d = (int) motionEvent.getY(findPointerIndex2);
                }
            }
            VelocityTracker velocityTracker2 = this.f14562g;
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
        return this.f14560e.mo4695a(f, f2);
    }

    public NestedScrollWebViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14557b = new int[2];
        this.f14558c = new int[2];
        this.f14564i = -1;
        mo19616a();
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f14560e.mo4696a(f, f2, z);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f14560e.mo4701a(i, i2, iArr, iArr2);
    }

    @Override // androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f14560e.mo4699a(i, i2, i3, i4, iArr);
    }
}
