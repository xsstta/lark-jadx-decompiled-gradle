package okio;

import javax.annotation.Nullable;

/* access modifiers changed from: package-private */
/* renamed from: okio.r */
public final class C69720r {
    @Nullable

    /* renamed from: a */
    static C69719q f174174a;

    /* renamed from: b */
    static long f174175b;

    private C69720r() {
    }

    /* renamed from: a */
    static C69719q m267638a() {
        synchronized (C69720r.class) {
            C69719q qVar = f174174a;
            if (qVar == null) {
                return new C69719q();
            }
            f174174a = qVar.f174172f;
            qVar.f174172f = null;
            f174175b -= 8192;
            return qVar;
        }
    }

    /* renamed from: a */
    static void m267639a(C69719q qVar) {
        if (qVar.f174172f != null || qVar.f174173g != null) {
            throw new IllegalArgumentException();
        } else if (!qVar.f174170d) {
            synchronized (C69720r.class) {
                long j = f174175b;
                if (j + 8192 <= 65536) {
                    f174175b = j + 8192;
                    qVar.f174172f = f174174a;
                    qVar.f174169c = 0;
                    qVar.f174168b = 0;
                    f174174a = qVar;
                }
            }
        }
    }
}
