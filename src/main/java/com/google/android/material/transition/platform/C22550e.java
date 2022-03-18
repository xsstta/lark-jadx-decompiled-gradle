package com.google.android.material.transition.platform;

import android.graphics.RectF;

/* renamed from: com.google.android.material.transition.platform.e */
class C22550e {

    /* renamed from: a */
    private static final AbstractC22549d f55587a = new AbstractC22549d() {
        /* class com.google.android.material.transition.platform.C22550e.C225511 */

        @Override // com.google.android.material.transition.platform.AbstractC22549d
        /* renamed from: a */
        public boolean mo78644a(C22553f fVar) {
            if (fVar.f55592d > fVar.f55594f) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.platform.AbstractC22549d
        /* renamed from: a */
        public void mo78643a(RectF rectF, float f, C22553f fVar) {
            rectF.bottom -= Math.abs(fVar.f55594f - fVar.f55592d) * f;
        }

        @Override // com.google.android.material.transition.platform.AbstractC22549d
        /* renamed from: a */
        public C22553f mo78642a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float a = C22558k.m81854a(f4, f6, f2, f3, f);
            float f8 = a / f4;
            float f9 = a / f6;
            return new C22553f(f8, f9, a, f5 * f8, a, f7 * f9);
        }
    };

    /* renamed from: b */
    private static final AbstractC22549d f55588b = new AbstractC22549d() {
        /* class com.google.android.material.transition.platform.C22550e.C225522 */

        @Override // com.google.android.material.transition.platform.AbstractC22549d
        /* renamed from: a */
        public boolean mo78644a(C22553f fVar) {
            if (fVar.f55591c > fVar.f55593e) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.platform.AbstractC22549d
        /* renamed from: a */
        public void mo78643a(RectF rectF, float f, C22553f fVar) {
            float abs = (Math.abs(fVar.f55593e - fVar.f55591c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.platform.AbstractC22549d
        /* renamed from: a */
        public C22553f mo78642a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float a = C22558k.m81854a(f5, f7, f2, f3, f);
            float f8 = a / f5;
            float f9 = a / f7;
            return new C22553f(f8, f9, f4 * f8, a, f6 * f9, a);
        }
    };

    /* renamed from: a */
    private static boolean m81840a(boolean z, RectF rectF, RectF rectF2) {
        float width = rectF.width();
        float height = rectF.height();
        float width2 = rectF2.width();
        float height2 = rectF2.height();
        float f = (height2 * width) / width2;
        float f2 = (width2 * height) / width;
        if (z) {
            if (f >= height) {
                return true;
            }
        } else if (f2 >= height2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static AbstractC22549d m81839a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i == 1) {
                return f55587a;
            }
            if (i == 2) {
                return f55588b;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i);
        } else if (m81840a(z, rectF, rectF2)) {
            return f55587a;
        } else {
            return f55588b;
        }
    }
}
