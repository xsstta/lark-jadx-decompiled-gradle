package com.google.android.material.transition;

/* renamed from: com.google.android.material.transition.b */
class C22514b {

    /* renamed from: a */
    private static final AbstractC22513a f55467a = new AbstractC22513a() {
        /* class com.google.android.material.transition.C22514b.C225151 */

        @Override // com.google.android.material.transition.AbstractC22513a
        /* renamed from: a */
        public C22519c mo78613a(float f, float f2, float f3) {
            return C22519c.m81746b(255, C22529k.m81775a(0, 255, f2, f3, f));
        }
    };

    /* renamed from: b */
    private static final AbstractC22513a f55468b = new AbstractC22513a() {
        /* class com.google.android.material.transition.C22514b.C225162 */

        @Override // com.google.android.material.transition.AbstractC22513a
        /* renamed from: a */
        public C22519c mo78613a(float f, float f2, float f3) {
            return C22519c.m81745a(C22529k.m81775a(255, 0, f2, f3, f), 255);
        }
    };

    /* renamed from: c */
    private static final AbstractC22513a f55469c = new AbstractC22513a() {
        /* class com.google.android.material.transition.C22514b.C225173 */

        @Override // com.google.android.material.transition.AbstractC22513a
        /* renamed from: a */
        public C22519c mo78613a(float f, float f2, float f3) {
            return C22519c.m81745a(C22529k.m81775a(255, 0, f2, f3, f), C22529k.m81775a(0, 255, f2, f3, f));
        }
    };

    /* renamed from: d */
    private static final AbstractC22513a f55470d = new AbstractC22513a() {
        /* class com.google.android.material.transition.C22514b.C225184 */

        @Override // com.google.android.material.transition.AbstractC22513a
        /* renamed from: a */
        public C22519c mo78613a(float f, float f2, float f3) {
            float f4 = ((f3 - f2) * 0.35f) + f2;
            return C22519c.m81745a(C22529k.m81775a(255, 0, f2, f4, f), C22529k.m81775a(0, 255, f4, f3, f));
        }
    };

    /* renamed from: a */
    static AbstractC22513a m81740a(int i, boolean z) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return f55469c;
                }
                if (i == 3) {
                    return f55470d;
                }
                throw new IllegalArgumentException("Invalid fade mode: " + i);
            } else if (z) {
                return f55468b;
            } else {
                return f55467a;
            }
        } else if (z) {
            return f55467a;
        } else {
            return f55468b;
        }
    }
}
