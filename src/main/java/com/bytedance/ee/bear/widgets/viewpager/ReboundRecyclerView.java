package com.bytedance.ee.bear.widgets.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.location.LocationRequest;

public class ReboundRecyclerView extends FrameLayout {

    /* renamed from: a */
    private OverScroller f32104a;

    /* renamed from: b */
    private VelocityTracker f32105b;

    /* renamed from: c */
    private int f32106c;

    /* renamed from: d */
    private int f32107d;

    /* renamed from: e */
    private int f32108e;

    /* renamed from: f */
    private int f32109f = LocationRequest.PRIORITY_INDOOR;

    /* renamed from: g */
    private float f32110g = 0.55f;

    /* renamed from: h */
    private RecyclerView f32111h;

    /* renamed from: i */
    private float f32112i;

    /* renamed from: j */
    private boolean f32113j;

    public int getMaxReboundAnimDuration() {
        return this.f32109f;
    }

    public RecyclerView getRecyclerView() {
        return this.f32111h;
    }

    public float getScrollRatio() {
        return this.f32110g;
    }

    /* renamed from: c */
    private void m49289c() {
        VelocityTracker velocityTracker = this.f32105b;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f32105b = null;
        }
    }

    /* renamed from: a */
    private void m49285a() {
        if (getScrollY() != 0) {
            this.f32104a.startScroll(0, getScrollY(), 0, -getScrollY(), m49288b());
            invalidate();
        }
    }

    /* renamed from: b */
    private int m49288b() {
        return Math.min(Math.max(Math.abs(getScrollY()) * 2, (int) LocationRequest.PRIORITY_INDOOR), this.f32109f);
    }

    private int getYVelocity() {
        VelocityTracker velocityTracker = this.f32105b;
        if (velocityTracker == null) {
            return 0;
        }
        velocityTracker.computeCurrentVelocity(600, (float) this.f32107d);
        return (int) this.f32105b.getYVelocity();
    }

    public void computeScroll() {
        if (this.f32104a.computeScrollOffset()) {
            scrollTo(this.f32104a.getCurrX(), this.f32104a.getCurrY());
            invalidate();
        }
    }

    public void setMaxReboundAnimDuration(int i) {
        this.f32109f = i;
    }

    public void setScrollRatio(float f) {
        this.f32110g = f;
    }

    /* renamed from: a */
    private void m49287a(MotionEvent motionEvent) {
        if (this.f32105b == null) {
            this.f32105b = VelocityTracker.obtain();
        }
        this.f32105b.addMovement(motionEvent);
    }

    public ReboundRecyclerView(Context context) {
        super(context);
        mo45563a(context, null, 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f32111h = recyclerView;
        recyclerView.setVerticalScrollBarEnabled(false);
        this.f32111h.setNestedScrollingEnabled(false);
        addView(this.f32111h, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    private void m49286a(int i) {
        int computeVerticalScrollOffset = this.f32111h.computeVerticalScrollOffset();
        int computeVerticalScrollRange = (this.f32111h.computeVerticalScrollRange() - computeVerticalScrollOffset) - this.f32111h.getMeasuredHeight();
        int i2 = -getScrollY();
        if (i < 0) {
            if (i2 < 0) {
                int max = Math.max(i, i2);
                scrollBy(0, (int) (((float) max) * this.f32110g));
                i -= max;
                if (i >= 0) {
                    return;
                }
            }
            int max2 = Math.max(i, -computeVerticalScrollOffset);
            this.f32111h.scrollBy(0, max2);
            int i3 = i - max2;
            if (i3 < 0) {
                scrollBy(0, (int) (((float) i3) * this.f32110g));
            }
        } else if (i > 0) {
            if (i2 > 0) {
                int min = Math.min(i, i2);
                scrollBy(0, (int) (((float) min) * this.f32110g));
                i -= min;
                if (i <= 0) {
                    return;
                }
            }
            int min2 = Math.min(i, computeVerticalScrollRange);
            this.f32111h.scrollBy(0, min2);
            int i4 = i - min2;
            if (i4 > 0) {
                scrollBy(0, (int) (((float) i4) * this.f32110g));
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.f32113j) {
                this.f32113j = true;
            }
            if (!this.f32104a.isFinished()) {
                this.f32104a.forceFinished(true);
            }
            this.f32111h.stopScroll();
            this.f32112i = motionEvent.getY();
        } else if (action == 1) {
            this.f32113j = false;
        } else if (action == 2) {
            float y = motionEvent.getY();
            this.f32112i = y;
            if (Math.abs(this.f32112i - y) >= ((float) this.f32108e)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        m49287a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f32112i = motionEvent.getY();
        } else if (action == 1) {
            int yVelocity = getYVelocity();
            if (Math.abs(yVelocity) > this.f32106c) {
                int computeVerticalScrollOffset = this.f32111h.computeVerticalScrollOffset();
                int computeVerticalScrollRange = (this.f32111h.computeVerticalScrollRange() - computeVerticalScrollOffset) - this.f32111h.getMeasuredHeight();
                if ((yVelocity > 0 && computeVerticalScrollOffset > 0) || (yVelocity < 0 && computeVerticalScrollRange > 0)) {
                    this.f32111h.fling(0, -yVelocity);
                }
            }
            m49285a();
            m49289c();
        } else if (action == 2) {
            float y = motionEvent.getY();
            this.f32112i = y;
            m49286a((int) (this.f32112i - y));
        }
        return true;
    }

    public ReboundRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo45563a(context, attributeSet, 0);
    }

    public ReboundRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo45563a(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo45563a(Context context, AttributeSet attributeSet, int i) {
        this.f32104a = new OverScroller(context);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f32106c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f32107d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f32108e = viewConfiguration.getScaledTouchSlop();
    }
}
