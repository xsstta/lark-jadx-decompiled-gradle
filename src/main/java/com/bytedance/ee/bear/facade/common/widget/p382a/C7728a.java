package com.bytedance.ee.bear.facade.common.widget.p382a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.facade.common.widget.a.a */
public class C7728a {

    /* renamed from: a */
    public View f20893a;

    /* renamed from: b */
    public boolean f20894b;

    /* renamed from: c */
    private float[] f20895c;

    /* renamed from: d */
    private ValueAnimator f20896d;

    /* renamed from: e */
    private float f20897e;

    /* renamed from: f */
    private AbstractC7730a f20898f;

    /* renamed from: g */
    private int f20899g;

    /* renamed from: h */
    private AbstractC7731b f20900h;

    /* renamed from: com.bytedance.ee.bear.facade.common.widget.a.a$a */
    public interface AbstractC7730a {
        void onHeightChange(int i);
    }

    /* renamed from: com.bytedance.ee.bear.facade.common.widget.a.a$b */
    public interface AbstractC7731b {
        void onStartDismiss();
    }

    /* renamed from: g */
    public void mo30261g() {
        this.f20899g = 1;
    }

    /* renamed from: j */
    public int mo30264j() {
        return this.f20893a.getHeight();
    }

    /* renamed from: a */
    public static float m30902a() {
        return ((float) C13749l.m55748b()) * 0.2f;
    }

    /* renamed from: b */
    public static float m30905b() {
        return ((float) C13749l.m55748b()) * 0.9f;
    }

    /* renamed from: c */
    public static float m30906c() {
        return ((float) C13749l.m55748b()) * 0.6928f;
    }

    /* renamed from: e */
    public void mo30259e() {
        mo30249a(this.f20895c[1]);
    }

    /* renamed from: f */
    public void mo30260f() {
        ViewGroup.LayoutParams layoutParams = this.f20893a.getLayoutParams();
        layoutParams.height = -1;
        this.f20893a.setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public void mo30262h() {
        mo30249a(this.f20895c[this.f20899g]);
    }

    /* renamed from: i */
    public void mo30263i() {
        AbstractC7730a aVar = this.f20898f;
        if (aVar != null) {
            aVar.onHeightChange(this.f20893a.getHeight());
        }
    }

    /* renamed from: d */
    public void mo30258d() {
        this.f20895c = new float[]{m30902a(), m30906c(), m30905b()};
    }

    /* renamed from: k */
    public void mo30265k() {
        float f = this.f20895c[2];
        if (f > ((float) this.f20893a.getLayoutParams().height)) {
            mo30256b(f);
        }
    }

    /* renamed from: l */
    public void mo30266l() {
        float f = this.f20895c[1];
        if (((float) this.f20893a.getLayoutParams().height) > f) {
            mo30256b(f);
        }
    }

    /* renamed from: m */
    public boolean mo30267m() {
        if (this.f20893a.getLayoutParams().height >= ((int) this.f20895c[2])) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo30253a(AbstractC7730a aVar) {
        this.f20898f = aVar;
    }

    /* renamed from: a */
    public void mo30251a(int i) {
        AbstractC7730a aVar = this.f20898f;
        if (aVar != null) {
            aVar.onHeightChange(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30903a(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        mo30249a((float) intValue);
        AbstractC7730a aVar = this.f20898f;
        if (aVar != null && intValue == 0) {
            aVar.onHeightChange(intValue);
        }
    }

    /* renamed from: b */
    public void mo30257b(boolean z) {
        float c = m30907c(z);
        C13479a.m54764b("DragPopupWindow", "targetHeight:" + c);
        int i = 0;
        while (true) {
            float[] fArr = this.f20895c;
            if (i >= fArr.length) {
                break;
            } else if (c <= fArr[i]) {
                this.f20899g = i;
                break;
            } else {
                i++;
            }
        }
        ValueAnimator valueAnimator = this.f20896d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        mo30256b(c);
    }

    /* renamed from: c */
    private float m30907c(boolean z) {
        float[] fArr;
        int i = this.f20893a.getLayoutParams().height;
        int i2 = 0;
        while (true) {
            fArr = this.f20895c;
            if (i2 >= fArr.length) {
                i2 = -1;
                break;
            } else if (((float) i) < fArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        if (i2 == -1) {
            f = (float) ((int) fArr[fArr.length - 1]);
        } else if (i2 != 0) {
            float f2 = fArr[i2];
            float f3 = fArr[i2 - 1];
            float f4 = f2 - f3;
            if (((float) i) < (0.1f * f4) + f3 || (((double) i) <= ((double) f3) + (((double) f4) * 0.9d) && z)) {
                f2 = f3;
            }
            if (f2 > fArr[0]) {
                f = f2;
            }
        }
        C13479a.m54764b("DragPopupWindow", "position:" + i2);
        return f;
    }

    /* renamed from: a */
    public void mo30249a(float f) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        if (f >= BitmapDescriptorFactory.HUE_RED && (layoutParams = this.f20893a.getLayoutParams()) != null && (i = (int) f) != layoutParams.height) {
            layoutParams.height = i;
            this.f20893a.setLayoutParams(layoutParams);
            mo30251a(i);
        }
    }

    /* renamed from: b */
    public void mo30256b(float f) {
        AbstractC7731b bVar;
        int i = this.f20893a.getLayoutParams().height;
        float f2 = (float) i;
        float abs = Math.abs(f2 - f) / this.f20897e;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, (int) f);
        this.f20896d = ofInt;
        ofInt.setDuration((long) abs);
        this.f20896d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.facade.common.widget.p382a.$$Lambda$a$UzfgOQMIfNKCl99qNkAJFHY2zQ */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7728a.this.m30903a((C7728a) valueAnimator);
            }
        });
        this.f20896d.start();
        if (f2 > f && f == BitmapDescriptorFactory.HUE_RED && (bVar = this.f20900h) != null) {
            bVar.onStartDismiss();
        }
    }

    /* renamed from: a */
    public void mo30252a(final View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.View$OnTouchListenerC77291 */

            /* renamed from: a */
            float f20901a;

            /* renamed from: b */
            float f20902b;

            /* renamed from: c */
            float f20903c;

            /* renamed from: d */
            float f20904d;

            /* renamed from: e */
            float f20905e;

            /* renamed from: h */
            private final int f20908h = 30;

            public String toString() {
                return "$classname{orgY=" + this.f20901a + ", offsetY=" + this.f20902b + ", orgDeltaY=" + this.f20903c + ", deltaY=" + this.f20904d + '}';
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
                if (r4 != 3) goto L_0x00ac;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
                /*
                // Method dump skipped, instructions count: 173
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.facade.common.widget.p382a.C7728a.View$OnTouchListenerC77291.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
    }

    /* renamed from: a */
    public void mo30254a(AbstractC7731b bVar) {
        this.f20900h = bVar;
    }

    /* renamed from: a */
    public void mo30255a(boolean z) {
        this.f20894b = z;
    }

    public C7728a(Context context, View view) {
        this(context, view, ((float) C13749l.m55762f(context)) * 0.6928f);
    }

    public C7728a(Context context, View view, float f) {
        this(context, view, m30902a(), f, m30905b());
    }

    /* renamed from: a */
    public void mo30250a(float f, float f2, float f3) {
        if (f2 > f3 || f2 < f) {
            f2 = ((f3 - f) * 0.5f) + f;
        }
        this.f20895c = new float[]{f, f2, f3};
    }

    public C7728a(Context context, View view, float f, float f2, float f3) {
        this.f20899g = 1;
        this.f20894b = true;
        m30904a(context, view, f, f2, f3);
    }

    /* renamed from: a */
    private void m30904a(Context context, View view, float f, float f2, float f3) {
        this.f20893a = view;
        if (f2 > f3 || f2 < f) {
            f2 = f + ((f3 - f) * 0.5f);
        }
        this.f20895c = new float[]{f, f2, f3};
        this.f20897e = ((float) C13749l.m55758d(context, 180)) / ((float) LocationRequest.PRIORITY_HD_ACCURACY);
        mo30249a(f2);
    }
}
