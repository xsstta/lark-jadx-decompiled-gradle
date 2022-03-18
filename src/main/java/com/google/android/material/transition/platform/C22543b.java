package com.google.android.material.transition.platform;

/* renamed from: com.google.android.material.transition.platform.b */
class C22543b {

    /* renamed from: a */
    private static final AbstractC22542a f55580a = new AbstractC22542a() {
        /* class com.google.android.material.transition.platform.C22543b.C225441 */

        @Override // com.google.android.material.transition.platform.AbstractC22542a
        /* renamed from: a */
        public C22548c mo78641a(float f, float f2, float f3) {
            return C22548c.m81835b(255, C22558k.m81856a(0, 255, f2, f3, f));
        }
    };

    /* renamed from: b */
    private static final AbstractC22542a f55581b = new AbstractC22542a() {
        /* class com.google.android.material.transition.platform.C22543b.C225452 */

        @Override // com.google.android.material.transition.platform.AbstractC22542a
        /* renamed from: a */
        public C22548c mo78641a(float f, float f2, float f3) {
            return C22548c.m81834a(C22558k.m81856a(255, 0, f2, f3, f), 255);
        }
    };

    /* renamed from: c */
    private static final AbstractC22542a f55582c = new AbstractC22542a() {
        /* class com.google.android.material.transition.platform.C22543b.C225463 */

        @Override // com.google.android.material.transition.platform.AbstractC22542a
        /* renamed from: a */
        public C22548c mo78641a(float f, float f2, float f3) {
            return C22548c.m81834a(C22558k.m81856a(255, 0, f2, f3, f), C22558k.m81856a(0, 255, f2, f3, f));
        }
    };

    /* renamed from: d */
    private static final AbstractC22542a f55583d = new AbstractC22542a() {
        /* class com.google.android.material.transition.platform.C22543b.C225474 */

        @Override // com.google.android.material.transition.platform.AbstractC22542a
        /* renamed from: a */
        public C22548c mo78641a(float f, float f2, float f3) {
            float f4 = ((f3 - f2) * 0.35f) + f2;
            return C22548c.m81834a(C22558k.m81856a(255, 0, f2, f4, f), C22558k.m81856a(0, 255, f4, f3, f));
        }
    };

    /* renamed from: a */
    static AbstractC22542a m81829a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f55582c;
                }
                if (i == 3) {
                    return f55583d;
                }
                throw new IllegalArgumentException("Invalid fade mode: " + i);
            } else if (z) {
                return f55581b;
            } else {
                return f55580a;
            }
        } else if (z) {
            return f55580a;
        } else {
            return f55581b;
        }
    }
}
