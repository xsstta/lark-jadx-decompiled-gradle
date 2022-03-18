package com.ss.android.lark.widget.slidingup;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.core.view.C0908j;
import androidx.core.view.C0916r;
import androidx.core.widget.C0946i;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.widget.slidingup.b */
public final class C59140b {

    /* renamed from: v */
    private static final Interpolator f146750v = new Interpolator() {
        /* class com.ss.android.lark.widget.slidingup.C59140b.animationInterpolatorC591411 */

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    private int f146751a;

    /* renamed from: b */
    private int f146752b;

    /* renamed from: c */
    private int f146753c = -1;

    /* renamed from: d */
    private float[] f146754d;

    /* renamed from: e */
    private float[] f146755e;

    /* renamed from: f */
    private float[] f146756f;

    /* renamed from: g */
    private float[] f146757g;

    /* renamed from: h */
    private int[] f146758h;

    /* renamed from: i */
    private int[] f146759i;

    /* renamed from: j */
    private int[] f146760j;

    /* renamed from: k */
    private int f146761k;

    /* renamed from: l */
    private VelocityTracker f146762l;

    /* renamed from: m */
    private final float f146763m;

    /* renamed from: n */
    private float f146764n;

    /* renamed from: o */
    private final int f146765o;

    /* renamed from: p */
    private int f146766p;

    /* renamed from: q */
    private final C0946i f146767q;

    /* renamed from: r */
    private final AbstractC59143a f146768r;

    /* renamed from: s */
    private View f146769s;

    /* renamed from: t */
    private boolean f146770t;

    /* renamed from: u */
    private final ViewGroup f146771u;

    /* renamed from: w */
    private final Runnable f146772w = new Runnable() {
        /* class com.ss.android.lark.widget.slidingup.C59140b.RunnableC591422 */

        public void run() {
            C59140b.this.mo200967a(0);
        }
    };

    /* renamed from: com.ss.android.lark.widget.slidingup.b$a */
    public static abstract class AbstractC59143a {
        /* renamed from: a */
        public int mo200957a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo200958a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo200959a(int i) {
        }

        /* renamed from: a */
        public void mo200984a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo200960a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo200961a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo200962a(View view, int i);

        /* renamed from: b */
        public int mo200985b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo200986b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo200987b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo200963b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo200988b(int i) {
            return false;
        }

        /* renamed from: c */
        public int mo200989c(int i) {
            return i;
        }
    }

    /* renamed from: a */
    public int mo200965a() {
        return this.f146751a;
    }

    /* renamed from: b */
    public int mo200973b() {
        return this.f146752b;
    }

    /* renamed from: a */
    public void mo200968a(View view, int i) {
        if (view.getParent() == this.f146771u) {
            this.f146769s = view;
            this.f146753c = i;
            this.f146768r.mo200963b(view, i);
            mo200967a(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f146771u + ")");
    }

    /* renamed from: a */
    public boolean mo200971a(View view, int i, int i2) {
        this.f146769s = view;
        this.f146753c = -1;
        return m229716a(i, i2, 0, 0);
    }

    /* renamed from: a */
    public boolean mo200969a(int i, int i2) {
        if (this.f146770t) {
            return m229716a(i, i2, (int) C0916r.m4403a(this.f146762l, this.f146753c), (int) C0916r.m4404b(this.f146762l, this.f146753c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    public boolean mo200972a(boolean z) {
        if (this.f146769s == null) {
            return false;
        }
        if (this.f146751a == 2) {
            boolean f = this.f146767q.mo4833f();
            int b = this.f146767q.mo4829b();
            int c = this.f146767q.mo4830c();
            int left = b - this.f146769s.getLeft();
            int top = c - this.f146769s.getTop();
            if (f || top == 0) {
                if (left != 0) {
                    this.f146769s.offsetLeftAndRight(left);
                }
                if (top != 0) {
                    this.f146769s.offsetTopAndBottom(top);
                }
                if (!(left == 0 && top == 0)) {
                    this.f146768r.mo200961a(this.f146769s, b, c, left, top);
                }
                if (f && b == this.f146767q.mo4831d() && c == this.f146767q.mo4832e()) {
                    this.f146767q.mo4834g();
                    f = this.f146767q.mo4828a();
                }
                if (!f) {
                    if (z) {
                        this.f146771u.post(this.f146772w);
                    } else {
                        mo200967a(0);
                    }
                }
            } else {
                this.f146769s.setTop(0);
                return true;
            }
        }
        if (this.f146751a == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo200967a(int i) {
        if (this.f146751a != i) {
            this.f146751a = i;
            this.f146768r.mo200959a(i);
            if (this.f146751a == 0) {
                this.f146769s = null;
            }
        }
    }

    /* renamed from: a */
    public boolean mo200970a(MotionEvent motionEvent) {
        View c;
        int a = C0908j.m4366a(motionEvent);
        int b = C0908j.m4368b(motionEvent);
        if (a == 0) {
            mo200979c();
        }
        if (this.f146762l == null) {
            this.f146762l = VelocityTracker.obtain();
        }
        this.f146762l.addMovement(motionEvent);
        if (a != 0) {
            if (a != 1) {
                if (a == 2) {
                    int c2 = C0908j.m4371c(motionEvent);
                    for (int i = 0; i < c2 && this.f146754d != null && this.f146755e != null; i++) {
                        int b2 = C0908j.m4369b(motionEvent, i);
                        if (b2 < this.f146754d.length && b2 < this.f146755e.length) {
                            float c3 = C0908j.m4370c(motionEvent, i);
                            float d = C0908j.m4372d(motionEvent, i);
                            float f = c3 - this.f146754d[b2];
                            float f2 = d - this.f146755e[b2];
                            m229720b(f, f2, b2);
                            if (this.f146751a == 1) {
                                break;
                            }
                            View c4 = mo200978c((int) this.f146754d[b2], (int) this.f146755e[b2]);
                            if (c4 != null && m229717a(c4, f, f2) && mo200976b(c4, b2)) {
                                break;
                            }
                        }
                    }
                    m229724c(motionEvent);
                } else if (a != 3) {
                    if (a == 5) {
                        int b3 = C0908j.m4369b(motionEvent, b);
                        float c5 = C0908j.m4370c(motionEvent, b);
                        float d2 = C0908j.m4372d(motionEvent, b);
                        m229714a(c5, d2, b3);
                        int i2 = this.f146751a;
                        if (i2 == 0) {
                            int i3 = this.f146758h[b3];
                            int i4 = this.f146766p;
                            if ((i3 & i4) != 0) {
                                this.f146768r.mo200984a(i3 & i4, b3);
                            }
                        } else if (i2 == 2 && (c = mo200978c((int) c5, (int) d2)) == this.f146769s) {
                            mo200976b(c, b3);
                        }
                    } else if (a == 6) {
                        m229721b(C0908j.m4369b(motionEvent, b));
                    }
                }
            }
            mo200979c();
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int b4 = C0908j.m4369b(motionEvent, 0);
            m229714a(x, y, b4);
            View c6 = mo200978c((int) x, (int) y);
            if (c6 == this.f146769s && this.f146751a == 2) {
                mo200976b(c6, b4);
            }
            int i5 = this.f146758h[b4];
            int i6 = this.f146766p;
            if ((i5 & i6) != 0) {
                this.f146768r.mo200984a(i5 & i6, b4);
            }
        }
        if (this.f146751a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m229717a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f146768r.mo200985b(view) > 0;
        boolean z2 = this.f146768r.mo200957a(view) > 0;
        if (z && z2) {
            int i = this.f146752b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f146752b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f146752b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo200981e() {
        if (this.f146751a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo200979c() {
        this.f146753c = -1;
        m229726f();
        VelocityTracker velocityTracker = this.f146762l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f146762l = null;
        }
    }

    /* renamed from: f */
    private void m229726f() {
        float[] fArr = this.f146754d;
        if (fArr != null) {
            Arrays.fill(fArr, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f146755e, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f146756f, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f146757g, (float) BitmapDescriptorFactory.HUE_RED);
            Arrays.fill(this.f146758h, 0);
            Arrays.fill(this.f146759i, 0);
            Arrays.fill(this.f146760j, 0);
            this.f146761k = 0;
        }
    }

    /* renamed from: g */
    private void m229727g() {
        this.f146762l.computeCurrentVelocity(1000, this.f146763m);
        m229713a(m229708a(C0916r.m4403a(this.f146762l, this.f146753c), this.f146764n, this.f146763m), m229708a(C0916r.m4404b(this.f146762l, this.f146753c), this.f146764n, this.f146763m));
    }

    /* renamed from: d */
    public void mo200980d() {
        mo200979c();
        if (this.f146751a == 2) {
            int b = this.f146767q.mo4829b();
            int c = this.f146767q.mo4830c();
            this.f146767q.mo4834g();
            int b2 = this.f146767q.mo4829b();
            int c2 = this.f146767q.mo4830c();
            this.f146768r.mo200961a(this.f146769s, b2, c2, b2 - b, c2 - c);
        }
        mo200967a(0);
    }

    /* renamed from: a */
    public void mo200966a(float f) {
        this.f146764n = f;
    }

    /* renamed from: b */
    private float m229718b(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: c */
    private void m229724c(MotionEvent motionEvent) {
        float[] fArr;
        int c = C0908j.m4371c(motionEvent);
        for (int i = 0; i < c; i++) {
            int b = C0908j.m4369b(motionEvent, i);
            float c2 = C0908j.m4370c(motionEvent, i);
            float d = C0908j.m4372d(motionEvent, i);
            float[] fArr2 = this.f146756f;
            if (fArr2 != null && (fArr = this.f146757g) != null && fArr2.length > b && fArr.length > b) {
                fArr2[b] = c2;
                fArr[b] = d;
            }
        }
    }

    /* renamed from: b */
    private void m229721b(int i) {
        float[] fArr = this.f146754d;
        if (fArr != null && fArr.length > i) {
            fArr[i] = 0.0f;
            this.f146755e[i] = 0.0f;
            this.f146756f[i] = 0.0f;
            this.f146757g[i] = 0.0f;
            this.f146758h[i] = 0;
            this.f146759i[i] = 0;
            this.f146760j[i] = 0;
            this.f146761k = (~(1 << i)) & this.f146761k;
        }
    }

    /* renamed from: c */
    private void m229723c(int i) {
        float[] fArr = this.f146754d;
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
                float[] fArr6 = this.f146755e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f146756f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f146757g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f146758h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f146759i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f146760j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f146754d = fArr2;
            this.f146755e = fArr3;
            this.f146756f = fArr4;
            this.f146757g = fArr5;
            this.f146758h = iArr;
            this.f146759i = iArr2;
            this.f146760j = iArr3;
        }
    }

    /* renamed from: b */
    public void mo200974b(MotionEvent motionEvent) {
        int i;
        int a = C0908j.m4366a(motionEvent);
        int b = C0908j.m4368b(motionEvent);
        if (a == 0) {
            mo200979c();
        }
        if (this.f146762l == null) {
            this.f146762l = VelocityTracker.obtain();
        }
        this.f146762l.addMovement(motionEvent);
        int i2 = 0;
        if (a == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int b2 = C0908j.m4369b(motionEvent, 0);
            View c = mo200978c((int) x, (int) y);
            m229714a(x, y, b2);
            mo200976b(c, b2);
            int i3 = this.f146758h[b2];
            int i4 = this.f146766p;
            if ((i3 & i4) != 0) {
                this.f146768r.mo200984a(i3 & i4, b2);
            }
        } else if (a == 1) {
            if (this.f146751a == 1) {
                m229727g();
            }
            mo200979c();
        } else if (a != 2) {
            if (a == 3) {
                if (this.f146751a == 1) {
                    m229713a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                }
                mo200979c();
            } else if (a == 5) {
                int b3 = C0908j.m4369b(motionEvent, b);
                float c2 = C0908j.m4370c(motionEvent, b);
                float d = C0908j.m4372d(motionEvent, b);
                m229714a(c2, d, b3);
                if (this.f146751a == 0) {
                    mo200976b(mo200978c((int) c2, (int) d), b3);
                    int i5 = this.f146758h[b3];
                    int i6 = this.f146766p;
                    if ((i5 & i6) != 0) {
                        this.f146768r.mo200984a(i5 & i6, b3);
                    }
                } else if (mo200975b((int) c2, (int) d)) {
                    mo200976b(this.f146769s, b3);
                }
            } else if (a == 6) {
                int b4 = C0908j.m4369b(motionEvent, b);
                if (this.f146751a == 1 && b4 == this.f146753c) {
                    int c3 = C0908j.m4371c(motionEvent);
                    while (true) {
                        if (i2 >= c3) {
                            i = -1;
                            break;
                        }
                        int b5 = C0908j.m4369b(motionEvent, i2);
                        if (b5 != this.f146753c) {
                            View c4 = mo200978c((int) C0908j.m4370c(motionEvent, i2), (int) C0908j.m4372d(motionEvent, i2));
                            View view = this.f146769s;
                            if (c4 == view && mo200976b(view, b5)) {
                                i = this.f146753c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m229727g();
                    }
                }
                m229721b(b4);
            }
        } else if (this.f146751a == 1) {
            int a2 = C0908j.m4367a(motionEvent, this.f146753c);
            float c5 = C0908j.m4370c(motionEvent, a2);
            float d2 = C0908j.m4372d(motionEvent, a2);
            float[] fArr = this.f146756f;
            int i7 = this.f146753c;
            int i8 = (int) (c5 - fArr[i7]);
            int i9 = (int) (d2 - this.f146757g[i7]);
            m229722b(this.f146769s.getLeft() + i8, this.f146769s.getTop() + i9, i8, i9);
            m229724c(motionEvent);
        } else {
            int c6 = C0908j.m4371c(motionEvent);
            while (i2 < c6) {
                int b6 = C0908j.m4369b(motionEvent, i2);
                float c7 = C0908j.m4370c(motionEvent, i2);
                float d3 = C0908j.m4372d(motionEvent, i2);
                float f = c7 - this.f146754d[b6];
                float f2 = d3 - this.f146755e[b6];
                m229720b(f, f2, b6);
                if (this.f146751a != 1) {
                    View c8 = mo200978c((int) this.f146754d[b6], (int) this.f146755e[b6]);
                    if (m229717a(c8, f, f2) && mo200976b(c8, b6)) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            m229724c(motionEvent);
        }
    }

    /* renamed from: b */
    public boolean mo200975b(int i, int i2) {
        return mo200977b(this.f146769s, i, i2);
    }

    /* renamed from: d */
    private int m229725d(int i, int i2) {
        int i3;
        if (i < this.f146771u.getLeft() + this.f146765o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f146771u.getTop() + this.f146765o) {
            i3 |= 4;
        }
        if (i > this.f146771u.getRight() - this.f146765o) {
            i3 |= 2;
        }
        if (i2 > this.f146771u.getBottom() - this.f146765o) {
            return i3 | 8;
        }
        return i3;
    }

    /* renamed from: c */
    public View mo200978c(int i, int i2) {
        for (int childCount = this.f146771u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f146771u.getChildAt(this.f146768r.mo200989c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m229713a(float f, float f2) {
        this.f146770t = true;
        this.f146768r.mo200960a(this.f146769s, f, f2);
        this.f146770t = false;
        if (this.f146751a == 1) {
            mo200967a(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo200976b(View view, int i) {
        if (view == this.f146769s && this.f146753c == i) {
            return true;
        }
        if (view == null || !this.f146768r.mo200962a(view, i)) {
            return false;
        }
        this.f146753c = i;
        mo200968a(view, i);
        return true;
    }

    /* renamed from: b */
    private int m229719b(int i, int i2, int i3) {
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
    private float m229708a(float f, float f2, float f3) {
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

    /* renamed from: a */
    public static C59140b m229712a(ViewGroup viewGroup, Interpolator interpolator, AbstractC59143a aVar) {
        return new C59140b(viewGroup.getContext(), viewGroup, interpolator, aVar);
    }

    /* renamed from: b */
    private void m229720b(float f, float f2, int i) {
        int i2 = 1;
        if (!m229715a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m229715a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m229715a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m229715a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f146759i;
            iArr[i] = iArr[i] | i2;
            this.f146768r.mo200987b(i2, i);
        }
    }

    /* renamed from: a */
    private int m229709a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f146771u.getWidth();
        float f = (float) (width / 2);
        float b = f + (m229718b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: a */
    private void m229714a(float f, float f2, int i) {
        m229723c(i);
        float[] fArr = this.f146754d;
        this.f146756f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f146755e;
        this.f146757g[i] = f2;
        fArr2[i] = f2;
        this.f146758h[i] = m229725d((int) f, (int) f2);
        this.f146761k |= 1 << i;
    }

    /* renamed from: b */
    public boolean mo200977b(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C59140b m229711a(ViewGroup viewGroup, float f, Interpolator interpolator, AbstractC59143a aVar) {
        C59140b a = m229712a(viewGroup, interpolator, aVar);
        a.f146752b = (int) (((float) a.f146752b) * (1.0f / f));
        return a;
    }

    private C59140b(Context context, ViewGroup viewGroup, Interpolator interpolator, AbstractC59143a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar != null) {
            this.f146771u = viewGroup;
            this.f146768r = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f146765o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f146752b = viewConfiguration.getScaledTouchSlop();
            this.f146763m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f146764n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f146767q = C0946i.m4562a(context, interpolator == null ? f146750v : interpolator);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: b */
    private void m229722b(int i, int i2, int i3, int i4) {
        int left = this.f146769s.getLeft();
        int top = this.f146769s.getTop();
        if (i3 != 0) {
            i = this.f146768r.mo200986b(this.f146769s, i, i3);
            this.f146769s.offsetLeftAndRight(i - left);
        }
        if (i4 != 0) {
            i2 = this.f146768r.mo200958a(this.f146769s, i2, i4);
            this.f146769s.offsetTopAndBottom(i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.f146768r.mo200961a(this.f146769s, i, i2, i - left, i2 - top);
        }
    }

    /* renamed from: a */
    private boolean m229715a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f146758h[i] & i2) != i2 || (this.f146766p & i2) == 0 || (this.f146760j[i] & i2) == i2 || (this.f146759i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f146752b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f146768r.mo200988b(i2)) {
            int[] iArr = this.f146760j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f146759i[i] & i2) != 0 || abs <= ((float) this.f146752b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private boolean m229716a(int i, int i2, int i3, int i4) {
        int left = this.f146769s.getLeft();
        int top = this.f146769s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f146767q.mo4834g();
            mo200967a(0);
            return false;
        }
        this.f146767q.mo4827a(left, top, i5, i6, m229710a(this.f146769s, i5, i6, i3, i4));
        mo200967a(2);
        return true;
    }

    /* renamed from: a */
    private int m229710a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int b = m229719b(i3, (int) this.f146764n, (int) this.f146763m);
        int b2 = m229719b(i4, (int) this.f146764n, (int) this.f146763m);
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
        return (int) ((((float) m229709a(i, b, this.f146768r.mo200985b(view))) * f5) + (((float) m229709a(i2, b2, this.f146768r.mo200957a(view))) * f6));
    }
}
