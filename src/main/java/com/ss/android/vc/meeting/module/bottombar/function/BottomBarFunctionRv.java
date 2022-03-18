package com.ss.android.vc.meeting.module.bottombar.function;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.android.HwBuildEx;

public class BottomBarFunctionRv extends RecyclerView {

    /* renamed from: a */
    protected boolean f154232a;

    /* renamed from: b */
    private boolean f154233b;

    /* renamed from: c */
    private int f154234c;

    /* renamed from: d */
    private int f154235d;

    /* renamed from: e */
    private int f154236e;

    /* renamed from: f */
    private int f154237f;

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public BottomBarFunctionRv(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m240039a(int i) {
        if (i > 0) {
            return Math.min(i, (int) HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        }
        return Math.max(i, -10000);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0) {
            this.f154237f = viewConfiguration.getScaledTouchSlop();
        } else if (i == 1) {
            this.f154237f = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        int actionIndex = motionEvent.getActionIndex();
        if (action == 0) {
            this.f154234c = motionEvent.getPointerId(0);
            this.f154235d = (int) (motionEvent.getX() + 0.5f);
            this.f154236e = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (action != 2) {
            if (action != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f154234c = motionEvent.getPointerId(actionIndex);
            this.f154235d = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f154236e = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        } else if (this.f154232a) {
            return true;
        } else {
            int findPointerIndex = motionEvent.findPointerIndex(this.f154234c);
            if (findPointerIndex < 0) {
                return false;
            }
            int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (getScrollState() == 1) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i = x - this.f154235d;
            int i2 = y - this.f154236e;
            boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
            boolean canScrollVertically = getLayoutManager().canScrollVertically();
            if (!canScrollHorizontally || Math.abs(i) <= this.f154237f || (Math.abs(i) < Math.abs(i2) && !canScrollVertically)) {
                z = false;
            } else {
                z = true;
            }
            if (canScrollVertically && Math.abs(i2) > this.f154237f && (Math.abs(i2) >= Math.abs(i) || canScrollHorizontally)) {
                z = true;
            }
            if (!z || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    public BottomBarFunctionRv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (this.f154233b) {
            i = m240039a(i);
            i2 = m240039a(i2);
        }
        return super.fling(i, i2);
    }

    public BottomBarFunctionRv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f154234c = -1;
        this.f154237f = ViewConfiguration.get(getContext()).getScaledTouchSlop() / 7;
    }
}
