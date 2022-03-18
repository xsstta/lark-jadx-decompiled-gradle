package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
/* renamed from: androidx.constraintlayout.motion.widget.t */
public class C0620t {

    /* renamed from: p */
    private static final float[][] f2362p = {new float[]{0.5f, BitmapDescriptorFactory.HUE_RED}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: q */
    private static final float[][] f2363q = {new float[]{BitmapDescriptorFactory.HUE_RED, -1.0f}, new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{-1.0f, BitmapDescriptorFactory.HUE_RED}, new float[]{1.0f, BitmapDescriptorFactory.HUE_RED}};

    /* renamed from: a */
    private int f2364a;

    /* renamed from: b */
    private int f2365b;

    /* renamed from: c */
    private int f2366c;

    /* renamed from: d */
    private int f2367d = -1;

    /* renamed from: e */
    private int f2368e = -1;

    /* renamed from: f */
    private int f2369f = -1;

    /* renamed from: g */
    private float f2370g = 0.5f;

    /* renamed from: h */
    private float f2371h = 0.5f;

    /* renamed from: i */
    private float f2372i;

    /* renamed from: j */
    private float f2373j = 1.0f;

    /* renamed from: k */
    private boolean f2374k;

    /* renamed from: l */
    private float[] f2375l = new float[2];

    /* renamed from: m */
    private float f2376m;

    /* renamed from: n */
    private float f2377n;

    /* renamed from: o */
    private final MotionLayout f2378o;

    /* renamed from: r */
    private float f2379r = 4.0f;

    /* renamed from: s */
    private float f2380s = 1.2f;

    /* renamed from: t */
    private boolean f2381t = true;

    /* renamed from: u */
    private float f2382u = 1.0f;

    /* renamed from: v */
    private int f2383v;

    /* renamed from: w */
    private float f2384w = 10.0f;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo3374b() {
        return this.f2380s;
    }

    /* renamed from: c */
    public float mo3377c() {
        return this.f2379r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3380d() {
        return this.f2381t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo3381e() {
        return this.f2368e;
    }

    /* renamed from: f */
    public int mo3384f() {
        return this.f2383v;
    }

    public String toString() {
        return this.f2372i + " , " + this.f2373j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3370a() {
        View view;
        int i = this.f2367d;
        if (i != -1) {
            view = this.f2378o.findViewById(i);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + C0547a.m2558a(this.f2378o.getContext(), this.f2367d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() {
                /* class androidx.constraintlayout.motion.widget.C0620t.View$OnTouchListenerC06211 */

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new NestedScrollView.AbstractC0934b() {
                /* class androidx.constraintlayout.motion.widget.C0620t.C06222 */

                @Override // androidx.core.widget.NestedScrollView.AbstractC0934b
                /* renamed from: a */
                public void mo742a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                }
            });
        }
    }

    /* renamed from: a */
    private void m2791a(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 9) {
                this.f2367d = typedArray.getResourceId(index, this.f2367d);
            } else if (index == 10) {
                int i2 = typedArray.getInt(index, this.f2364a);
                this.f2364a = i2;
                float[][] fArr = f2362p;
                this.f2371h = fArr[i2][0];
                this.f2370g = fArr[i2][1];
            } else if (index == 0) {
                int i3 = typedArray.getInt(index, this.f2365b);
                this.f2365b = i3;
                float[][] fArr2 = f2363q;
                this.f2372i = fArr2[i3][0];
                this.f2373j = fArr2[i3][1];
            } else if (index == 5) {
                this.f2379r = typedArray.getFloat(index, this.f2379r);
            } else if (index == 4) {
                this.f2380s = typedArray.getFloat(index, this.f2380s);
            } else if (index == 6) {
                this.f2381t = typedArray.getBoolean(index, this.f2381t);
            } else if (index == 1) {
                this.f2382u = typedArray.getFloat(index, this.f2382u);
            } else if (index == 2) {
                this.f2384w = typedArray.getFloat(index, this.f2384w);
            } else if (index == 11) {
                this.f2368e = typedArray.getResourceId(index, this.f2368e);
            } else if (index == 8) {
                this.f2366c = typedArray.getInt(index, this.f2366c);
            } else if (index == 7) {
                this.f2383v = typedArray.getInteger(index, 0);
            } else if (index == 3) {
                this.f2369f = typedArray.getResourceId(index, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo3373a(boolean z) {
        if (z) {
            float[][] fArr = f2363q;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f2362p;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f2363q;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f2362p;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = f2362p;
        int i = this.f2364a;
        this.f2371h = fArr5[i][0];
        this.f2370g = fArr5[i][1];
        float[][] fArr6 = f2363q;
        int i2 = this.f2365b;
        this.f2372i = fArr6[i2][0];
        this.f2373j = fArr6[i2][1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3371a(float f, float f2) {
        this.f2376m = f;
        this.f2377n = f2;
        this.f2374k = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3376b(float f, float f2) {
        this.f2376m = f;
        this.f2377n = f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo3383f(float f, float f2) {
        return (f * this.f2372i) + (f2 * this.f2373j);
    }

    /* renamed from: a */
    private void m2790a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.dragDirection, R.attr.dragScale, R.attr.dragThreshold, R.attr.limitBoundsTo, R.attr.maxAcceleration, R.attr.maxVelocity, R.attr.moveWhenScrollAtTop, R.attr.nestedScrollFlags, R.attr.onTouchUp, R.attr.touchAnchorId, R.attr.touchAnchorSide, R.attr.touchRegionId});
        m2791a(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public RectF mo3375b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2369f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RectF mo3369a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2368e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo3378c(float f, float f2) {
        this.f2378o.mo3151a(this.f2367d, this.f2378o.getProgress(), this.f2371h, this.f2370g, this.f2375l);
        float f3 = this.f2372i;
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            float[] fArr = this.f2375l;
            if (fArr[0] == BitmapDescriptorFactory.HUE_RED) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f2375l;
        if (fArr2[1] == BitmapDescriptorFactory.HUE_RED) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f2373j) / fArr2[1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3379d(float f, float f2) {
        float f3;
        boolean z;
        boolean z2 = false;
        this.f2374k = false;
        float progress = this.f2378o.getProgress();
        this.f2378o.mo3151a(this.f2367d, progress, this.f2371h, this.f2370g, this.f2375l);
        float f4 = this.f2372i;
        float[] fArr = this.f2375l;
        float f5 = fArr[0];
        float f6 = this.f2373j;
        float f7 = fArr[1];
        float f8 = BitmapDescriptorFactory.HUE_RED;
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            f3 = (f * f4) / fArr[0];
        } else {
            f3 = (f2 * f6) / fArr[1];
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != BitmapDescriptorFactory.HUE_RED) {
            if (progress != 1.0f) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f2366c;
            if (i != 3) {
                z2 = true;
            }
            if (z2 && z) {
                MotionLayout motionLayout = this.f2378o;
                if (((double) progress) >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.mo3150a(i, f8, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3382e(float f, float f2) {
        float f3;
        float progress = this.f2378o.getProgress();
        if (!this.f2374k) {
            this.f2374k = true;
            this.f2378o.setProgress(progress);
        }
        this.f2378o.mo3151a(this.f2367d, progress, this.f2371h, this.f2370g, this.f2375l);
        float f4 = this.f2372i;
        float[] fArr = this.f2375l;
        if (((double) Math.abs((f4 * fArr[0]) + (this.f2373j * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f2375l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f2372i;
        if (f5 != BitmapDescriptorFactory.HUE_RED) {
            f3 = (f * f5) / this.f2375l[0];
        } else {
            f3 = (f2 * this.f2373j) / this.f2375l[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
        if (max != this.f2378o.getProgress()) {
            this.f2378o.setProgress(max);
        }
    }

    C0620t(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2378o = motionLayout;
        m2790a(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3372a(MotionEvent motionEvent, MotionLayout.AbstractC0542d dVar, int i, C0584q qVar) {
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        dVar.mo3221a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2376m = motionEvent.getRawX();
            this.f2377n = motionEvent.getRawY();
            this.f2374k = false;
        } else if (action == 1) {
            this.f2374k = false;
            dVar.mo3220a(1000);
            float b = dVar.mo3222b();
            float c = dVar.mo3223c();
            float progress = this.f2378o.getProgress();
            int i3 = this.f2367d;
            if (i3 != -1) {
                this.f2378o.mo3151a(i3, progress, this.f2371h, this.f2370g, this.f2375l);
            } else {
                float min = (float) Math.min(this.f2378o.getWidth(), this.f2378o.getHeight());
                float[] fArr = this.f2375l;
                fArr[1] = this.f2373j * min;
                fArr[0] = min * this.f2372i;
            }
            float f6 = this.f2372i;
            float[] fArr2 = this.f2375l;
            float f7 = fArr2[0];
            float f8 = fArr2[1];
            if (f6 != BitmapDescriptorFactory.HUE_RED) {
                f = b / fArr2[0];
            } else {
                f = c / fArr2[1];
            }
            if (!Float.isNaN(f)) {
                f2 = (f / 3.0f) + progress;
            } else {
                f2 = progress;
            }
            if (f2 != BitmapDescriptorFactory.HUE_RED && f2 != 1.0f && (i2 = this.f2366c) != 3) {
                MotionLayout motionLayout = this.f2378o;
                if (((double) f2) < 0.5d) {
                    f3 = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f3 = 1.0f;
                }
                motionLayout.mo3150a(i2, f3, f);
                if (BitmapDescriptorFactory.HUE_RED >= progress || 1.0f <= progress) {
                    this.f2378o.setState(MotionLayout.EnumC0546h.FINISHED);
                }
            } else if (BitmapDescriptorFactory.HUE_RED >= f2 || 1.0f <= f2) {
                this.f2378o.setState(MotionLayout.EnumC0546h.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f2377n;
            float rawX = motionEvent.getRawX() - this.f2376m;
            if (Math.abs((this.f2372i * rawX) + (this.f2373j * rawY)) > this.f2384w || this.f2374k) {
                float progress2 = this.f2378o.getProgress();
                if (!this.f2374k) {
                    this.f2374k = true;
                    this.f2378o.setProgress(progress2);
                }
                int i4 = this.f2367d;
                if (i4 != -1) {
                    this.f2378o.mo3151a(i4, progress2, this.f2371h, this.f2370g, this.f2375l);
                } else {
                    float min2 = (float) Math.min(this.f2378o.getWidth(), this.f2378o.getHeight());
                    float[] fArr3 = this.f2375l;
                    fArr3[1] = this.f2373j * min2;
                    fArr3[0] = min2 * this.f2372i;
                }
                float f9 = this.f2372i;
                float[] fArr4 = this.f2375l;
                if (((double) Math.abs(((f9 * fArr4[0]) + (this.f2373j * fArr4[1])) * this.f2382u)) < 0.01d) {
                    float[] fArr5 = this.f2375l;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f2372i != BitmapDescriptorFactory.HUE_RED) {
                    f4 = rawX / this.f2375l[0];
                } else {
                    f4 = rawY / this.f2375l[1];
                }
                float max = Math.max(Math.min(progress2 + f4, 1.0f), (float) BitmapDescriptorFactory.HUE_RED);
                if (max != this.f2378o.getProgress()) {
                    this.f2378o.setProgress(max);
                    dVar.mo3220a(1000);
                    float b2 = dVar.mo3222b();
                    float c2 = dVar.mo3223c();
                    if (this.f2372i != BitmapDescriptorFactory.HUE_RED) {
                        f5 = b2 / this.f2375l[0];
                    } else {
                        f5 = c2 / this.f2375l[1];
                    }
                    this.f2378o.f2020d = f5;
                } else {
                    this.f2378o.f2020d = BitmapDescriptorFactory.HUE_RED;
                }
                this.f2376m = motionEvent.getRawX();
                this.f2377n = motionEvent.getRawY();
            }
        }
    }
}
