package com.bytedance.ee.bear.drive.view.preview.block;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13737d;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

public class DriveMainRootLayout extends FrameLayout {

    /* renamed from: a */
    private static int f19446a = 100;

    /* renamed from: d */
    private static final int f19447d = C57582a.m223600a(20);

    /* renamed from: b */
    private int f19448b;

    /* renamed from: c */
    private int f19449c;

    /* renamed from: e */
    private long f19450e;

    /* renamed from: f */
    private View.OnClickListener f19451f;

    /* renamed from: g */
    private boolean f19452g;

    /* renamed from: h */
    private View f19453h;

    /* renamed from: i */
    private float f19454i;

    /* renamed from: j */
    private float f19455j;

    /* renamed from: k */
    private AbstractC7255a f19456k;

    /* renamed from: l */
    private boolean f19457l;

    /* renamed from: m */
    private boolean f19458m;

    /* renamed from: n */
    private boolean f19459n;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.block.DriveMainRootLayout$a */
    public interface AbstractC7255a {
        /* renamed from: a */
        boolean mo26157a(int i);
    }

    /* renamed from: a */
    public boolean mo28350a() {
        return this.f19458m;
    }

    /* renamed from: b */
    private void m29021b() {
        this.f19448b = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13479a.m54764b("DriveMainRootLayout", "onDetachedFromWindow()");
    }

    public void setIgnoreClick(boolean z) {
        this.f19459n = z;
    }

    public void setInBlock(boolean z) {
        this.f19458m = z;
    }

    public void setInterceptClickListener(View.OnClickListener onClickListener) {
        this.f19451f = onClickListener;
    }

    public void setSlideListener(AbstractC7255a aVar) {
        this.f19456k = aVar;
    }

    public DriveMainRootLayout(Context context) {
        super(context);
        m29021b();
    }

    /* renamed from: a */
    private boolean m29020a(MotionEvent motionEvent) {
        if (SystemClock.uptimeMillis() - this.f19450e >= 500 || !m29019a(this.f19454i, motionEvent.getRawX(), this.f19455j, motionEvent.getRawY())) {
            return false;
        }
        if (this.f19452g || this.f19451f == null) {
            C13479a.m54764b("DriveMainRootLayout", "pointInBlockFunc()");
            return false;
        } else if (C13737d.m55693a(800)) {
            this.f19451f.onClick(this);
            return true;
        } else {
            C13479a.m54775e("DriveMainRootLayout", "dispatchClickEvent() isValidClick=false");
            return true;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int pointerId = motionEvent.getPointerId(0);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.f19452g = false;
                    }
                }
            } else if (this.f19458m) {
                if (this.f19452g) {
                    this.f19452g = false;
                    return super.dispatchTouchEvent(motionEvent);
                } else if (!m29020a(motionEvent)) {
                    return false;
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    return super.dispatchTouchEvent(obtain);
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f19454i = motionEvent.getRawX();
        this.f19455j = motionEvent.getRawY();
        C13479a.m54764b("DriveMainRootLayout", "dispatchTouchEvent() ACTION_DOWN x=" + this.f19454i + " y=" + this.f19455j);
        this.f19450e = SystemClock.uptimeMillis();
        if (this.f19458m) {
            if (pointerId != 0) {
                C13479a.m54764b("DriveMainRootLayout", "dispatchTouchEvent() inBlock pointId != 0");
                return false;
            }
            m29018a((ViewGroup) this, motionEvent.getRawX(), motionEvent.getRawY());
            if (!this.f19452g) {
                return true;
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            Log.d("DriveMainRootLayout", "dispatchTouchEvent() ret=" + dispatchTouchEvent);
            return dispatchTouchEvent;
        }
        if (this.f19458m && !this.f19452g) {
            getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0096 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.view.preview.block.DriveMainRootLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public DriveMainRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29021b();
    }

    /* renamed from: a */
    private void m29018a(ViewGroup viewGroup, float f, float f2) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            m29017a(childAt, f, f2);
            if (childAt instanceof ViewGroup) {
                m29018a((ViewGroup) childAt, f, f2);
            }
        }
    }

    /* renamed from: a */
    private void m29017a(View view, float f, float f2) {
        if (view.getTag(R.id.drive_preview_block_fun_location_tag) != null && view.getVisibility() == 0) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (f >= ((float) iArr[0]) && f <= ((float) (iArr[0] + view.getWidth())) && f2 >= ((float) iArr[1]) && f2 <= ((float) (iArr[1] + view.getHeight()))) {
                this.f19452g = true;
                this.f19453h = view;
            }
        }
    }

    /* renamed from: a */
    private boolean m29019a(float f, float f2, float f3, float f4) {
        float abs = Math.abs(f - f2);
        float abs2 = Math.abs(f3 - f4);
        int i = f19446a;
        if (abs > ((float) i) || abs2 > ((float) i)) {
            return false;
        }
        return true;
    }
}
