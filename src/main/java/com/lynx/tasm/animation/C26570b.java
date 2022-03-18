package com.lynx.tasm.animation;

import android.util.SparseArray;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.lynx.tasm.base.LLog;

/* renamed from: com.lynx.tasm.animation.b */
public class C26570b {

    /* renamed from: a */
    private static final SparseArray<BaseInterpolator> f65729a = new SparseArray<BaseInterpolator>() {
        /* class com.lynx.tasm.animation.C26570b.C265711 */

        {
            put(0, new LinearInterpolator());
            put(1, new AccelerateInterpolator());
            put(2, new DecelerateInterpolator());
            put(3, new AccelerateDecelerateInterpolator());
        }
    };

    /* renamed from: com.lynx.tasm.animation.b$a  reason: invalid class name */
    private static class animationInterpolatorC26572a implements Interpolator {

        /* renamed from: a */
        private int f65730a;

        /* renamed from: b */
        private int f65731b;

        public float getInterpolation(float f) {
            int i;
            int i2;
            float f2;
            int i3 = this.f65731b;
            if (i3 == 1) {
                i = this.f65730a;
                i2 = ((int) (f * ((float) i))) + 1;
                if (i2 > i) {
                    i2 = i;
                }
                f2 = (float) i2;
            } else if (i3 == 2) {
                i = this.f65730a;
                i2 = (int) (f * ((float) i));
                if (i2 == i) {
                    i2--;
                }
                f2 = (float) i2;
            } else if (i3 == 3) {
                int i4 = this.f65730a;
                int i5 = (int) (f * ((float) i4));
                if (i5 == i4) {
                    i5--;
                }
                f2 = (float) i5;
                i = i4 - 1;
            } else if (i3 != 4) {
                return BitmapDescriptorFactory.HUE_RED;
            } else {
                int i6 = this.f65730a;
                int i7 = ((int) (f * ((float) i6))) + 1;
                if (i7 > i6) {
                    i7 = i6;
                }
                f2 = (float) i7;
                i = i6 + 1;
            }
            return f2 / ((float) i);
        }

        animationInterpolatorC26572a(int i, int i2) {
            this.f65730a = i;
            this.f65731b = i2;
        }
    }

    /* renamed from: a */
    public static Interpolator m96358a(C26562a aVar) {
        int e = aVar.mo94388e();
        switch (e) {
            case 0:
            case 1:
            case 2:
            case 3:
                return f65729a.get(e);
            case 4:
                return PathInterpolatorCompat.create(aVar.mo94390f(), aVar.mo94392g());
            case 5:
                return PathInterpolatorCompat.create(aVar.mo94390f(), aVar.mo94392g(), aVar.mo94394h(), aVar.mo94395i());
            case 6:
                return new animationInterpolatorC26572a(aVar.mo94401o(), aVar.mo94396j());
            default:
                LLog.m96418a(new RuntimeException("layout animation don't support interpolator:" + e));
                return f65729a.get(0);
        }
    }
}
