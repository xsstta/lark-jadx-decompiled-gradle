package com.google.android.gms.internal.p979b;

/* renamed from: com.google.android.gms.internal.b.k */
public final class C21894k {

    /* renamed from: a */
    private static final AbstractC21898n f53304a;

    /* renamed from: b */
    private static final int f53305b;

    /* renamed from: com.google.android.gms.internal.b.k$a */
    static final class C21895a extends AbstractC21898n {
        @Override // com.google.android.gms.internal.p979b.AbstractC21898n
        /* renamed from: a */
        public final void mo74006a(Throwable th, Throwable th2) {
        }

        C21895a() {
        }
    }

    /* renamed from: a */
    private static Integer m79203a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p979b.C21894k.<clinit>():void");
    }

    /* renamed from: a */
    public static void m79204a(Throwable th, Throwable th2) {
        f53304a.mo74006a(th, th2);
    }
}
