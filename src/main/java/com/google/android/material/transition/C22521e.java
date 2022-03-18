package com.google.android.material.transition;

import android.graphics.RectF;

/* renamed from: com.google.android.material.transition.e */
class C22521e {

    /* renamed from: a */
    private static final AbstractC22520d f55474a = new AbstractC22520d() {
        /* class com.google.android.material.transition.C22521e.C225221 */

        @Override // com.google.android.material.transition.AbstractC22520d
        /* renamed from: a */
        public boolean mo78616a(C22524f fVar) {
            if (fVar.f55479d > fVar.f55481f) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.AbstractC22520d
        /* renamed from: a */
        public void mo78615a(RectF rectF, float f, C22524f fVar) {
            rectF.bottom -= Math.abs(fVar.f55481f - fVar.f55479d) * f;
        }

        @Override // com.google.android.material.transition.AbstractC22520d
        /* renamed from: a */
        public C22524f mo78614a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float a = C22529k.m81773a(f4, f6, f2, f3, f);
            float f8 = a / f4;
            float f9 = a / f6;
            return new C22524f(f8, f9, a, f5 * f8, a, f7 * f9);
        }
    };

    /* renamed from: b */
    private static final AbstractC22520d f55475b = new AbstractC22520d() {
        /* class com.google.android.material.transition.C22521e.C225232 */

        @Override // com.google.android.material.transition.AbstractC22520d
        /* renamed from: a */
        public boolean mo78616a(C22524f fVar) {
            if (fVar.f55478c > fVar.f55480e) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.transition.AbstractC22520d
        /* renamed from: a */
        public void mo78615a(RectF rectF, float f, C22524f fVar) {
            float abs = (Math.abs(fVar.f55480e - fVar.f55478c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }

        @Override // com.google.android.material.transition.AbstractC22520d
        /* renamed from: a */
        public C22524f mo78614a(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float a = C22529k.m81773a(f5, f7, f2, f3, f);
            float f8 = a / f5;
            float f9 = a / f7;
            return new C22524f(f8, f9, f4 * f8, a, f6 * f9, a);
        }
    };

    /* renamed from: a */
    private static boolean m81751a(boolean z, RectF rectF, RectF rectF2) {
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
    static AbstractC22520d m81750a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i != 0) {
            if (i == 1) {
                return f55474a;
            }
            if (i == 2) {
                return f55475b;
            }
            throw new IllegalArgumentException("Invalid fit mode: " + i);
        } else if (m81751a(z, rectF, rectF2)) {
            return f55474a;
        } else {
            return f55475b;
        }
    }
}
