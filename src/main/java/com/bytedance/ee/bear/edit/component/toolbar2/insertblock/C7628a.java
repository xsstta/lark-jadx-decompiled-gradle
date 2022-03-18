package com.bytedance.ee.bear.edit.component.toolbar2.insertblock;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.a */
public class C7628a {

    /* renamed from: a */
    public View f20698a;

    /* renamed from: b */
    public boolean f20699b;

    /* renamed from: c */
    private float[] f20700c;

    /* renamed from: d */
    private ValueAnimator f20701d;

    /* renamed from: e */
    private float f20702e;

    /* renamed from: f */
    private AbstractC7630a f20703f;

    /* renamed from: g */
    private int f20704g;

    /* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.a$a */
    public interface AbstractC7630a {
        /* renamed from: a */
        void mo30017a(int i);
    }

    /* renamed from: a */
    public static float m30594a() {
        return ((float) C13749l.m55748b()) * 0.2f;
    }

    /* renamed from: b */
    public static float m30598b() {
        return ((float) C13749l.m55748b()) * 0.9f;
    }

    /* renamed from: c */
    public void mo30014c() {
        mo30008a(this.f20700c[1]);
    }

    /* renamed from: a */
    public void mo30011a(AbstractC7630a aVar) {
        this.f20703f = aVar;
    }

    /* renamed from: a */
    public void mo30009a(int i) {
        AbstractC7630a aVar = this.f20703f;
        if (aVar != null) {
            aVar.mo30017a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30596a(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        mo30008a((float) intValue);
        AbstractC7630a aVar = this.f20703f;
        if (aVar != null && intValue == 0) {
            aVar.mo30017a(intValue);
        }
    }

    /* renamed from: b */
    public void mo30013b(boolean z) {
        int i = this.f20698a.getLayoutParams().height;
        float c = m30599c(z);
        C13479a.m54764b("DragPopupWindow", "targetHeight:" + c);
        int i2 = 0;
        while (true) {
            float[] fArr = this.f20700c;
            if (i2 >= fArr.length) {
                break;
            } else if (c <= fArr[i2]) {
                this.f20704g = i2;
                break;
            } else {
                i2++;
            }
        }
        ValueAnimator valueAnimator = this.f20701d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        m30595a(i, c);
    }

    /* renamed from: c */
    private float m30599c(boolean z) {
        float[] fArr;
        int i = this.f20698a.getLayoutParams().height;
        int i2 = 0;
        while (true) {
            fArr = this.f20700c;
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
    public void mo30008a(float f) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        if (f >= BitmapDescriptorFactory.HUE_RED && (layoutParams = this.f20698a.getLayoutParams()) != null && (i = (int) f) != layoutParams.height) {
            layoutParams.height = i;
            this.f20698a.setLayoutParams(layoutParams);
            mo30009a(i);
        }
    }

    /* renamed from: a */
    public void mo30010a(final View view) {
        view.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.insertblock.C7628a.View$OnTouchListenerC76291 */

            /* renamed from: a */
            float f20705a;

            /* renamed from: b */
            float f20706b;

            /* renamed from: c */
            float f20707c;

            /* renamed from: d */
            float f20708d;

            /* renamed from: e */
            float f20709e;

            /* renamed from: h */
            private final int f20712h = 30;

            public String toString() {
                return "$classname{orgY=" + this.f20705a + ", offsetY=" + this.f20706b + ", orgDeltaY=" + this.f20707c + ", deltaY=" + this.f20708d + '}';
            }

            /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
                if (r4 != 3) goto L_0x0093;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
                /*
                // Method dump skipped, instructions count: 148
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.edit.component.toolbar2.insertblock.C7628a.View$OnTouchListenerC76291.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
    }

    /* renamed from: a */
    public void mo30012a(boolean z) {
        this.f20699b = z;
    }

    /* renamed from: a */
    private void m30595a(int i, float f) {
        float abs = Math.abs(((float) i) - f) / this.f20702e;
        ValueAnimator ofInt = ValueAnimator.ofInt(i, (int) f);
        this.f20701d = ofInt;
        ofInt.setDuration((long) abs);
        this.f20701d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.edit.component.toolbar2.insertblock.$$Lambda$a$Q5rjbjGqii4UguMEtGytBCnzNcM */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7628a.lambda$Q5rjbjGqii4UguMEtGytBCnzNcM(C7628a.this, valueAnimator);
            }
        });
        this.f20701d.start();
    }

    public C7628a(Context context, View view, float f) {
        this(context, view, m30594a(), f, m30598b());
    }

    public C7628a(Context context, View view, float f, float f2, float f3) {
        this.f20704g = 1;
        this.f20699b = true;
        m30597a(context, view, f, f2, f3);
    }

    /* renamed from: a */
    private void m30597a(Context context, View view, float f, float f2, float f3) {
        this.f20698a = view;
        if (f2 > f3 || f2 < f) {
            f2 = f + ((f3 - f) * 0.5f);
        }
        this.f20700c = new float[]{f, f2, f3};
        this.f20702e = ((float) C13749l.m55758d(context, 180)) / ((float) LocationRequest.PRIORITY_HD_ACCURACY);
        mo30008a(f2);
    }
}
