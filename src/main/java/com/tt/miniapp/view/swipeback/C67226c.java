package com.tt.miniapp.view.swipeback;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: com.tt.miniapp.view.swipeback.c */
public class C67226c {

    /* renamed from: w */
    private static final Interpolator f169676w = new Interpolator() {
        /* class com.tt.miniapp.view.swipeback.C67226c.animationInterpolatorC672271 */

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f169677a;

    /* renamed from: b */
    private int f169678b;

    /* renamed from: c */
    private int f169679c = -1;

    /* renamed from: d */
    private float[] f169680d;

    /* renamed from: e */
    private float[] f169681e;

    /* renamed from: f */
    private float[] f169682f;

    /* renamed from: g */
    private float[] f169683g;

    /* renamed from: h */
    private int[] f169684h;

    /* renamed from: i */
    private int[] f169685i;

    /* renamed from: j */
    private int[] f169686j;

    /* renamed from: k */
    private int f169687k;

    /* renamed from: l */
    private VelocityTracker f169688l;

    /* renamed from: m */
    private float f169689m;

    /* renamed from: n */
    private float f169690n;

    /* renamed from: o */
    private int f169691o;

    /* renamed from: p */
    private int f169692p;

    /* renamed from: q */
    private OverScroller f169693q;

    /* renamed from: r */
    private final AbstractC67229a f169694r;

    /* renamed from: s */
    private View f169695s;

    /* renamed from: t */
    private boolean f169696t;

    /* renamed from: u */
    private final ViewGroup f169697u;

    /* renamed from: v */
    private boolean f169698v;

    /* renamed from: x */
    private final Runnable f169699x = new Runnable() {
        /* class com.tt.miniapp.view.swipeback.C67226c.RunnableC672282 */

        public void run() {
            C67226c.this.mo233770d(0);
        }
    };

    /* renamed from: com.tt.miniapp.view.swipeback.c$a */
    public static abstract class AbstractC67229a {
        /* renamed from: a */
        public int mo233739a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo233740a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo233741a(int i) {
        }

        /* renamed from: a */
        public void mo233742a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo233743a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo233744a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo233745a(View view, int i);

        /* renamed from: b */
        public int mo233773b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo233774b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo233775b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo233776b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo233777b(int i) {
            return false;
        }

        /* renamed from: c */
        public int mo233778c(int i) {
            return i;
        }
    }

    /* renamed from: a */
    public int mo233754a() {
        return this.f169677a;
    }

    /* renamed from: b */
    public View mo233761b() {
        return this.f169695s;
    }

    /* renamed from: a */
    public void mo233756a(View view, int i) {
        if (view.getParent() == this.f169697u) {
            this.f169695s = view;
            this.f169679c = i;
            this.f169694r.mo233776b(view, i);
            mo233770d(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f169697u + ")");
    }

    /* renamed from: a */
    public boolean mo233757a(int i, int i2) {
        if (this.f169696t) {
            return m261989a(i, i2, (int) this.f169688l.getXVelocity(this.f169679c), (int) this.f169688l.getYVelocity(this.f169679c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m261989a(int i, int i2, int i3, int i4) {
        int left = this.f169695s.getLeft();
        int top = this.f169695s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f169693q.abortAnimation();
            mo233770d(0);
            return false;
        }
        this.f169693q.startScroll(left, top, i5, i6, m261984a(this.f169695s, i5, i6, i3, i4));
        mo233770d(2);
        return true;
    }

    /* renamed from: a */
    public boolean mo233760a(boolean z) {
        if (this.f169677a == 2) {
            boolean computeScrollOffset = this.f169693q.computeScrollOffset();
            int currX = this.f169693q.getCurrX();
            int currY = this.f169693q.getCurrY();
            int left = currX - this.f169695s.getLeft();
            int top = currY - this.f169695s.getTop();
            if (left != 0) {
                ViewCompat.m4089j(this.f169695s, left);
            }
            if (top != 0) {
                ViewCompat.m4087i(this.f169695s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f169694r.mo233744a(this.f169695s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f169693q.getFinalX() && currY == this.f169693q.getFinalY()) {
                this.f169693q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f169697u.post(this.f169699x);
                } else {
                    mo233770d(0);
                }
            }
        }
        if (this.f169677a == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        if (r13 != r12) goto L_0x0103;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo233758a(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.view.swipeback.C67226c.mo233758a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private boolean m261990a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f169694r.mo233739a(view) > 0;
        boolean z2 = this.f169694r.mo233773b(view) > 0;
        if (z && z2) {
            int i = this.f169678b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f169678b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f169678b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo233759a(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo233766c() {
        this.f169679c = -1;
        m261995d();
        VelocityTracker velocityTracker = this.f169688l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f169688l = null;
        }
    }

    /* renamed from: d */
    private void m261995d() {
        float[] fArr = this.f169680d;
        if (fArr != null) {
            Arrays.fill(fArr, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f169681e, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f169682f, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f169683g, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f169684h, 0);
            Arrays.fill(this.f169685i, 0);
            Arrays.fill(this.f169686j, 0);
            this.f169687k = 0;
            this.f169698v = false;
        }
    }

    /* renamed from: e */
    private void m261997e() {
        this.f169688l.computeCurrentVelocity(1000, this.f169689m);
        m261986a(m261982a(this.f169688l.getXVelocity(this.f169679c), this.f169690n, this.f169689m), m261982a(this.f169688l.getYVelocity(this.f169679c), this.f169690n, this.f169689m));
    }

    /* renamed from: a */
    public void mo233755a(int i) {
        this.f169691o = i;
    }

    /* renamed from: b */
    public void mo233762b(int i) {
        this.f169692p = i;
    }

    /* renamed from: a */
    private float m261981a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: c */
    public boolean mo233767c(int i) {
        if (((1 << i) & this.f169687k) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m261994c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m262000g(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f169682f[pointerId] = x;
                this.f169683g[pointerId] = y;
            }
        }
    }

    /* renamed from: g */
    private boolean m262000g(int i) {
        if (mo233767c(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: f */
    private void m261999f(int i) {
        float[] fArr = this.f169680d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f169681e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f169682f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f169683g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f169684h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f169685i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f169686j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f169680d = fArr2;
            this.f169681e = fArr3;
            this.f169682f = fArr4;
            this.f169683g = fArr5;
            this.f169684h = iArr;
            this.f169685i = iArr2;
            this.f169686j = iArr3;
        }
    }

    /* renamed from: e */
    private void m261998e(int i) {
        if (this.f169680d != null && mo233767c(i)) {
            this.f169680d[i] = 0.0f;
            this.f169681e[i] = 0.0f;
            this.f169682f[i] = 0.0f;
            this.f169683g[i] = 0.0f;
            this.f169684h[i] = 0;
            this.f169685i[i] = 0;
            this.f169686j[i] = 0;
            this.f169687k = (~(1 << i)) & this.f169687k;
        }
    }

    /* renamed from: d */
    public void mo233770d(int i) {
        Log.e("ViewDragHelper", "setDragState: " + i);
        this.f169697u.removeCallbacks(this.f169699x);
        if (this.f169677a != i) {
            this.f169677a = i;
            this.f169694r.mo233741a(i);
            if (this.f169677a == 0) {
                this.f169695s = null;
            }
        }
    }

    /* renamed from: b */
    public void mo233763b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo233766c();
        }
        if (this.f169688l == null) {
            this.f169688l = VelocityTracker.obtain();
        }
        this.f169688l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View d = mo233769d((int) x, (int) y);
            m261987a(x, y, pointerId);
            mo233765b(d, pointerId);
            int i3 = this.f169684h[pointerId];
            int i4 = this.f169692p;
            if ((i3 & i4) != 0) {
                this.f169694r.mo233742a(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f169677a == 1) {
                m261997e();
            }
            mo233766c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f169677a == 1) {
                    m261986a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                mo233766c();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m261987a(x2, y2, pointerId2);
                if (this.f169677a == 0) {
                    mo233765b(mo233769d((int) x2, (int) y2), pointerId2);
                    int i5 = this.f169684h[pointerId2];
                    int i6 = this.f169692p;
                    if ((i5 & i6) != 0) {
                        this.f169694r.mo233742a(i5 & i6, pointerId2);
                    }
                } else if (mo233768c((int) x2, (int) y2)) {
                    mo233765b(this.f169695s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f169677a == 1 && pointerId3 == this.f169679c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f169679c) {
                            View d2 = mo233769d((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f169695s;
                            if (d2 == view && mo233765b(view, pointerId4)) {
                                i = this.f169679c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m261997e();
                    }
                }
                m261998e(pointerId3);
            }
        } else if (this.f169677a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m262000g(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f169680d[pointerId5];
                    float f2 = y3 - this.f169681e[pointerId5];
                    m261992b(f, f2, pointerId5);
                    if (this.f169677a != 1) {
                        View d3 = mo233769d((int) x3, (int) y3);
                        if (m261990a(d3, f, f2) && mo233765b(d3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m261994c(motionEvent);
        } else if (m262000g(this.f169679c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f169679c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f169682f;
            int i7 = this.f169679c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f169683g[i7]);
            m261993b(this.f169695s.getLeft() + i8, this.f169695s.getTop() + i9, i8, i9);
            m261994c(motionEvent);
        }
    }

    /* renamed from: c */
    public boolean mo233768c(int i, int i2) {
        return mo233759a(this.f169695s, i, i2);
    }

    /* renamed from: b */
    public boolean mo233764b(int i, int i2) {
        if (!mo233767c(i2) || (i & this.f169684h[i2]) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C67226c m261985a(ViewGroup viewGroup, AbstractC67229a aVar) {
        return new C67226c(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: e */
    private int m261996e(int i, int i2) {
        int i3;
        if (i < this.f169697u.getLeft() + this.f169691o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f169697u.getTop() + this.f169691o) {
            i3 |= 4;
        }
        if (i > this.f169697u.getRight() - this.f169691o) {
            i3 |= 2;
        }
        if (i2 > this.f169697u.getBottom() - this.f169691o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: d */
    public View mo233769d(int i, int i2) {
        for (int childCount = this.f169697u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f169697u.getChildAt(this.f169694r.mo233778c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo233765b(View view, int i) {
        if (view == this.f169695s && this.f169679c == i) {
            return true;
        }
        if (view == null || !this.f169694r.mo233745a(view, i)) {
            return false;
        }
        this.f169679c = i;
        mo233756a(view, i);
        return true;
    }

    /* renamed from: a */
    private void m261986a(float f, float f2) {
        this.f169696t = true;
        this.f169694r.mo233743a(this.f169695s, f, f2);
        this.f169696t = false;
        if (this.f169677a == 1) {
            mo233770d(0);
        }
    }

    /* renamed from: b */
    private int m261991b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i > 0) {
            return i3;
        }
        return -i3;
    }

    /* renamed from: a */
    private float m261982a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (abs <= f3) {
            return f;
        }
        if (f > BitmapDescriptorFactory.HUE_RED) {
            return f3;
        }
        return -f3;
    }

    /* renamed from: b */
    private void m261992b(float f, float f2, int i) {
        int i2 = 1;
        if (!m261988a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m261988a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m261988a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m261988a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f169685i;
            iArr[i] = iArr[i] | i2;
            this.f169694r.mo233775b(i2, i);
        }
    }

    private C67226c(Context context, ViewGroup viewGroup, AbstractC67229a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f169697u = viewGroup;
            this.f169694r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f169691o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f169678b = viewConfiguration.getScaledTouchSlop();
            this.f169689m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f169690n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f169693q = new OverScroller(context, f169676w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m261983a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f169697u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m261981a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: a */
    private void m261987a(float f, float f2, int i) {
        m261999f(i);
        float[] fArr = this.f169680d;
        this.f169682f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f169681e;
        this.f169683g[i] = f2;
        fArr2[i] = f2;
        this.f169684h[i] = m261996e((int) f, (int) f2);
        this.f169687k |= 1 << i;
    }

    /* renamed from: b */
    private void m261993b(int i, int i2, int i3, int i4) {
        int left = this.f169695s.getLeft();
        int top = this.f169695s.getTop();
        if (i3 != 0) {
            i = this.f169694r.mo233740a(this.f169695s, i, i3);
            ViewCompat.m4089j(this.f169695s, i - left);
        }
        if (i4 != 0) {
            i2 = this.f169694r.mo233774b(this.f169695s, i2, i4);
            ViewCompat.m4087i(this.f169695s, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.f169694r.mo233744a(this.f169695s, i, i2, i - left, i2 - top);
        }
    }

    /* renamed from: a */
    private boolean m261988a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f169684h[i] & i2) != i2 || (this.f169692p & i2) == 0 || (this.f169686j[i] & i2) == i2 || (this.f169685i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f169678b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f169694r.mo233777b(i2)) {
            int[] iArr = this.f169686j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f169685i[i] & i2) != 0 || abs <= ((float) this.f169678b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private int m261984a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m261991b(i3, (int) this.f169690n, (int) this.f169689m);
        int b2 = m261991b(i4, (int) this.f169690n, (int) this.f169689m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (b != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (b2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m261983a(i, b, this.f169694r.mo233739a(view))) * f5) + (((float) m261983a(i2, b2, this.f169694r.mo233773b(view))) * f6));
    }
}
