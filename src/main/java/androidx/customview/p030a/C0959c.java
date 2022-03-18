package androidx.customview.p030a;

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

/* renamed from: androidx.customview.a.c */
public class C0959c {

    /* renamed from: w */
    private static final Interpolator f3589w = new Interpolator() {
        /* class androidx.customview.p030a.C0959c.animationInterpolatorC09601 */

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f3590a;

    /* renamed from: b */
    private int f3591b;

    /* renamed from: c */
    private int f3592c = -1;

    /* renamed from: d */
    private float[] f3593d;

    /* renamed from: e */
    private float[] f3594e;

    /* renamed from: f */
    private float[] f3595f;

    /* renamed from: g */
    private float[] f3596g;

    /* renamed from: h */
    private int[] f3597h;

    /* renamed from: i */
    private int[] f3598i;

    /* renamed from: j */
    private int[] f3599j;

    /* renamed from: k */
    private int f3600k;

    /* renamed from: l */
    private VelocityTracker f3601l;

    /* renamed from: m */
    private float f3602m;

    /* renamed from: n */
    private float f3603n;

    /* renamed from: o */
    private int f3604o;

    /* renamed from: p */
    private final int f3605p;

    /* renamed from: q */
    private int f3606q;

    /* renamed from: r */
    private OverScroller f3607r;

    /* renamed from: s */
    private final AbstractC0962a f3608s;

    /* renamed from: t */
    private View f3609t;

    /* renamed from: u */
    private boolean f3610u;

    /* renamed from: v */
    private final ViewGroup f3611v;

    /* renamed from: x */
    private final Runnable f3612x = new Runnable() {
        /* class androidx.customview.p030a.C0959c.RunnableC09612 */

        public void run() {
            C0959c.this.mo4881d(0);
        }
    };

    /* renamed from: androidx.customview.a.c$a */
    public static abstract class AbstractC0962a {
        /* renamed from: a */
        public int mo4889a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo4890a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo4891a(int i) {
        }

        /* renamed from: a */
        public void mo4892a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4893a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo4894a(View view, int i) {
        }

        /* renamed from: a */
        public void mo4895a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: b */
        public int mo4896b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo4897b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo4898b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo4899b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo4900b(View view, int i);

        /* renamed from: c */
        public int mo4901c(int i) {
            return i;
        }
    }

    /* renamed from: a */
    public float mo4862a() {
        return this.f3603n;
    }

    /* renamed from: b */
    public int mo4870b() {
        return this.f3590a;
    }

    /* renamed from: c */
    public int mo4876c() {
        return this.f3604o;
    }

    /* renamed from: d */
    public int mo4879d() {
        return this.f3605p;
    }

    /* renamed from: e */
    public View mo4882e() {
        return this.f3609t;
    }

    /* renamed from: f */
    public int mo4884f() {
        return this.f3591b;
    }

    /* renamed from: a */
    public void mo4864a(int i) {
        this.f3606q = i;
    }

    /* renamed from: a */
    public void mo4865a(View view, int i) {
        if (view.getParent() == this.f3611v) {
            this.f3609t = view;
            this.f3592c = i;
            this.f3608s.mo4894a(view, i);
            mo4881d(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3611v + ")");
    }

    /* renamed from: a */
    public boolean mo4868a(View view, int i, int i2) {
        this.f3609t = view;
        this.f3592c = -1;
        boolean a = m4646a(i, i2, 0, 0);
        if (!a && this.f3590a == 0 && this.f3609t != null) {
            this.f3609t = null;
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo4866a(int i, int i2) {
        if (this.f3610u) {
            return m4646a(i, i2, (int) this.f3601l.getXVelocity(this.f3592c), (int) this.f3601l.getYVelocity(this.f3592c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    private boolean m4646a(int i, int i2, int i3, int i4) {
        int left = this.f3609t.getLeft();
        int top = this.f3609t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3607r.abortAnimation();
            mo4881d(0);
            return false;
        }
        this.f3607r.startScroll(left, top, i5, i6, m4640a(this.f3609t, i5, i6, i3, i4));
        mo4881d(2);
        return true;
    }

    /* renamed from: a */
    public boolean mo4869a(boolean z) {
        if (this.f3590a == 2) {
            boolean computeScrollOffset = this.f3607r.computeScrollOffset();
            int currX = this.f3607r.getCurrX();
            int currY = this.f3607r.getCurrY();
            int left = currX - this.f3609t.getLeft();
            int top = currY - this.f3609t.getTop();
            if (left != 0) {
                ViewCompat.m4089j(this.f3609t, left);
            }
            if (top != 0) {
                ViewCompat.m4087i(this.f3609t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3608s.mo4895a(this.f3609t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3607r.getFinalX() && currY == this.f3607r.getFinalY()) {
                this.f3607r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f3611v.post(this.f3612x);
                } else {
                    mo4881d(0);
                }
            }
        }
        if (this.f3590a == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4867a(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p030a.C0959c.mo4867a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private boolean m4647a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3608s.mo4889a(view) > 0;
        boolean z2 = this.f3608s.mo4896b(view) > 0;
        if (z && z2) {
            int i = this.f3591b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f3591b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f3591b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    public void mo4885g() {
        this.f3592c = -1;
        m4657i();
        VelocityTracker velocityTracker = this.f3601l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3601l = null;
        }
    }

    /* renamed from: i */
    private void m4657i() {
        float[] fArr = this.f3593d;
        if (fArr != null) {
            Arrays.fill(fArr, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f3594e, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f3595f, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f3596g, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f3597h, 0);
            Arrays.fill(this.f3598i, 0);
            Arrays.fill(this.f3599j, 0);
            this.f3600k = 0;
        }
    }

    /* renamed from: j */
    private void m4658j() {
        this.f3601l.computeCurrentVelocity(1000, this.f3602m);
        m4643a(m4638a(this.f3601l.getXVelocity(this.f3592c), this.f3603n, this.f3602m), m4638a(this.f3601l.getYVelocity(this.f3592c), this.f3603n, this.f3602m));
    }

    /* renamed from: h */
    public void mo4886h() {
        mo4885g();
        if (this.f3590a == 2) {
            int currX = this.f3607r.getCurrX();
            int currY = this.f3607r.getCurrY();
            this.f3607r.abortAnimation();
            int currX2 = this.f3607r.getCurrX();
            int currY2 = this.f3607r.getCurrY();
            this.f3608s.mo4895a(this.f3609t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo4881d(0);
    }

    /* renamed from: a */
    public void mo4863a(float f) {
        this.f3603n = f;
    }

    /* renamed from: b */
    public void mo4871b(int i) {
        this.f3604o = i;
    }

    /* renamed from: b */
    private float m4648b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: c */
    public boolean mo4877c(int i) {
        if (((1 << i) & this.f3600k) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4881d(int i) {
        this.f3611v.removeCallbacks(this.f3612x);
        if (this.f3590a != i) {
            this.f3590a = i;
            this.f3608s.mo4891a(i);
            if (this.f3590a == 0) {
                this.f3609t = null;
            }
        }
    }

    /* renamed from: e */
    public boolean mo4883e(int i) {
        int length = this.f3593d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo4873b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m4652c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m4656h(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3595f[pointerId] = x;
                this.f3596g[pointerId] = y;
            }
        }
    }

    /* renamed from: f */
    private void m4654f(int i) {
        if (this.f3593d != null && mo4877c(i)) {
            this.f3593d[i] = 0.0f;
            this.f3594e[i] = 0.0f;
            this.f3595f[i] = 0.0f;
            this.f3596g[i] = 0.0f;
            this.f3597h[i] = 0;
            this.f3598i[i] = 0;
            this.f3599j[i] = 0;
            this.f3600k = (~(1 << i)) & this.f3600k;
        }
    }

    /* renamed from: h */
    private boolean m4656h(int i) {
        if (mo4877c(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: g */
    private void m4655g(int i) {
        float[] fArr = this.f3593d;
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
                float[] fArr6 = this.f3594e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3595f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3596g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3597h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3598i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3599j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3593d = fArr2;
            this.f3594e = fArr3;
            this.f3595f = fArr4;
            this.f3596g = fArr5;
            this.f3597h = iArr;
            this.f3598i = iArr2;
            this.f3599j = iArr3;
        }
    }

    /* renamed from: b */
    public void mo4872b(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo4885g();
        }
        if (this.f3601l == null) {
            this.f3601l = VelocityTracker.obtain();
        }
        this.f3601l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View d = mo4880d((int) x, (int) y);
            m4644a(x, y, pointerId);
            mo4874b(d, pointerId);
            int i3 = this.f3597h[pointerId];
            int i4 = this.f3606q;
            if ((i3 & i4) != 0) {
                this.f3608s.mo4892a(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f3590a == 1) {
                m4658j();
            }
            mo4885g();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3590a == 1) {
                    m4643a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                mo4885g();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m4644a(x2, y2, pointerId2);
                if (this.f3590a == 0) {
                    mo4874b(mo4880d((int) x2, (int) y2), pointerId2);
                    int i5 = this.f3597h[pointerId2];
                    int i6 = this.f3606q;
                    if ((i5 & i6) != 0) {
                        this.f3608s.mo4892a(i5 & i6, pointerId2);
                    }
                } else if (mo4878c((int) x2, (int) y2)) {
                    mo4874b(this.f3609t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f3590a == 1 && pointerId3 == this.f3592c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f3592c) {
                            View d2 = mo4880d((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f3609t;
                            if (d2 == view && mo4874b(view, pointerId4)) {
                                i = this.f3592c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m4658j();
                    }
                }
                m4654f(pointerId3);
            }
        } else if (this.f3590a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m4656h(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f3593d[pointerId5];
                    float f2 = y3 - this.f3594e[pointerId5];
                    m4650b(f, f2, pointerId5);
                    if (this.f3590a != 1) {
                        View d3 = mo4880d((int) x3, (int) y3);
                        if (m4647a(d3, f, f2) && mo4874b(d3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m4652c(motionEvent);
        } else if (m4656h(this.f3592c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3592c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f3595f;
            int i7 = this.f3592c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f3596g[i7]);
            m4651b(this.f3609t.getLeft() + i8, this.f3609t.getTop() + i9, i8, i9);
            m4652c(motionEvent);
        }
    }

    /* renamed from: c */
    public boolean mo4878c(int i, int i2) {
        return mo4875b(this.f3609t, i, i2);
    }

    /* renamed from: a */
    public static C0959c m4642a(ViewGroup viewGroup, AbstractC0962a aVar) {
        return new C0959c(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: e */
    private int m4653e(int i, int i2) {
        int i3;
        if (i < this.f3611v.getLeft() + this.f3604o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f3611v.getTop() + this.f3604o) {
            i3 |= 4;
        }
        if (i > this.f3611v.getRight() - this.f3604o) {
            i3 |= 2;
        }
        if (i2 > this.f3611v.getBottom() - this.f3604o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: d */
    public View mo4880d(int i, int i2) {
        for (int childCount = this.f3611v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3611v.getChildAt(this.f3608s.mo4901c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo4873b(int i, int i2) {
        boolean z;
        boolean z2;
        if (!mo4877c(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f3595f[i2] - this.f3593d[i2];
        float f2 = this.f3596g[i2] - this.f3594e[i2];
        if (z && z2) {
            int i3 = this.f3591b;
            if ((f * f) + (f2 * f2) > ((float) (i3 * i3))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f3591b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f3591b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private void m4643a(float f, float f2) {
        this.f3610u = true;
        this.f3608s.mo4893a(this.f3609t, f, f2);
        this.f3610u = false;
        if (this.f3590a == 1) {
            mo4881d(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4874b(View view, int i) {
        if (view == this.f3609t && this.f3592c == i) {
            return true;
        }
        if (view == null || !this.f3608s.mo4900b(view, i)) {
            return false;
        }
        this.f3592c = i;
        mo4865a(view, i);
        return true;
    }

    /* renamed from: a */
    public static C0959c m4641a(ViewGroup viewGroup, float f, AbstractC0962a aVar) {
        C0959c a = m4642a(viewGroup, aVar);
        a.f3591b = (int) (((float) a.f3591b) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    private float m4638a(float f, float f2, float f3) {
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
    private int m4649b(int i, int i2, int i3) {
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

    /* renamed from: b */
    private void m4650b(float f, float f2, int i) {
        int i2 = 1;
        if (!m4645a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m4645a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m4645a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m4645a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f3598i;
            iArr[i] = iArr[i] | i2;
            this.f3608s.mo4898b(i2, i);
        }
    }

    private C0959c(Context context, ViewGroup viewGroup, AbstractC0962a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f3611v = viewGroup;
            this.f3608s = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3605p = i;
            this.f3604o = i;
            this.f3591b = viewConfiguration.getScaledTouchSlop();
            this.f3602m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3603n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3607r = new OverScroller(context, f3589w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private int m4639a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f3611v.getWidth();
        float f = (float) (width / 2);
        float b = f + (m4648b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: a */
    private void m4644a(float f, float f2, int i) {
        m4655g(i);
        float[] fArr = this.f3593d;
        this.f3595f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f3594e;
        this.f3596g[i] = f2;
        fArr2[i] = f2;
        this.f3597h[i] = m4653e((int) f, (int) f2);
        this.f3600k |= 1 << i;
    }

    /* renamed from: b */
    public boolean mo4875b(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m4651b(int i, int i2, int i3, int i4) {
        int left = this.f3609t.getLeft();
        int top = this.f3609t.getTop();
        if (i3 != 0) {
            i = this.f3608s.mo4890a(this.f3609t, i, i3);
            ViewCompat.m4089j(this.f3609t, i - left);
        }
        if (i4 != 0) {
            i2 = this.f3608s.mo4897b(this.f3609t, i2, i4);
            ViewCompat.m4087i(this.f3609t, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.f3608s.mo4895a(this.f3609t, i, i2, i - left, i2 - top);
        }
    }

    /* renamed from: a */
    private boolean m4645a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3597h[i] & i2) != i2 || (this.f3606q & i2) == 0 || (this.f3599j[i] & i2) == i2 || (this.f3598i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f3591b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f3608s.mo4899b(i2)) {
            int[] iArr = this.f3599j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f3598i[i] & i2) != 0 || abs <= ((float) this.f3591b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private int m4640a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m4649b(i3, (int) this.f3603n, (int) this.f3602m);
        int b2 = m4649b(i4, (int) this.f3603n, (int) this.f3602m);
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
        return (int) ((((float) m4639a(i, b, this.f3608s.mo4889a(view))) * f5) + (((float) m4639a(i2, b2, this.f3608s.mo4896b(view))) * f6));
    }
}
